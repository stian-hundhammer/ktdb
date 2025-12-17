package no.knowledge.ktdb.model

// should probably look like a map
// interface Table : Map<String, String> {
interface Table {
    val name: String
    val columns: Set<Column>
}

// how to map back and forth
interface TableItem<T> {
    fun toTableItem(data: T): TableItem<T>
    fun toData(item: TableItem<T>): T
}


// just testing map interface
private class X : Map<String, String> {
    override val entries: Set<Map.Entry<String, String>>
        get() = TODO("Not yet implemented")
    override val keys: Set<String>
        get() = TODO("Not yet implemented")
    override val size: Int
        get() = TODO("Not yet implemented")
    override val values: Collection<String>
        get() = TODO("Not yet implemented")

    override fun containsKey(key: String): Boolean {
        TODO("Not yet implemented")
    }

    override fun containsValue(value: String): Boolean {
        TODO("Not yet implemented")
    }

    override fun get(key: String): String? {
        TODO("Not yet implemented")
    }

    override fun isEmpty(): Boolean {
        TODO("Not yet implemented")
    }

}

data class Column(
    val name: String,
    val type: ColumnType
)

enum class ColumnType {
    PRIMARY, SECONDARY, DATA
}

data class TableConfig(
    val name: String,
    val columns: Set<Column>,
)