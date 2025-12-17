package no.knowledge.ktdb.impl

import no.knowledge.ktdb.model.Column
import no.knowledge.ktdb.model.Table
import no.knowledge.ktdb.model.TableConfig

fun memoryHashmapTable(config: TableConfig): Table =
    MemoryHashmapTableImpl(
        name = config.name,
        columns = config.columns,
    )

class MemoryHashmapTableImpl(
    override val name: String,
    override val columns: Set<Column>,
) : Table