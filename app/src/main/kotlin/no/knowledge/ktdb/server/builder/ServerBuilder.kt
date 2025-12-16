package no.knowledge.ktdb.server.builder

import no.knowledge.ktdb.server.KTDBServer
import no.knowledge.ktdb.server.ServerConfig

fun KTDBServer(config: ServerConfig.() -> Unit) : KTDBServer {
    return KTDBServer()
}