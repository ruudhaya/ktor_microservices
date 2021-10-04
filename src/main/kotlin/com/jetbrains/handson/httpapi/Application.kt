package com.jetbrains.handson.httpapi

import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*


fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0"){
        configureRouting()
    }.start(wait = true)
}

private fun Application.configureRouting() {
    routing {
        get ("/") {
            call.respondText { "How are you?" }
        }
    }
}

