package no.knowledge.ktdb.model

import no.knowledge.ktdb.impl.memoryHashmapTable
import org.junit.jupiter.api.Test
import java.util.UUID

class TestApi {

    data class Person(
        val id: String,
        val name: String,
        val yearOfBirth: Int,
        val nationality: String,
        val hobbies: List<String>,
    )

    val table = memoryHashmapTable(
        TableConfig(
            name = "testTable",
            columns =
                setOf(
                    Column(
                        name = "id",
                        type = ColumnType.PRIMARY
                    ),
                    Column(
                        name = "name",
                        type = ColumnType.SECONDARY
                    ),
                    Column(
                        name = "person",
                        type = ColumnType.DATA
                    )
                )
        )
    )

    @Test
    fun `test create table`() {
        // change to builder later

        // check dependencies
        // assertThat(table).isNotNull

    }

    @Test
    fun `test insert data`() {
        val person = Person(
            id = UUID.randomUUID().toString(),
            name = "stian",
            yearOfBirth = 1990,
            nationality = "Norway",
            hobbies = listOf("Swimming", "Running")
        )

        table.put(person)
    }
}