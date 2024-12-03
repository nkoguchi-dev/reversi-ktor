package org.koppepan.reversi.presentation.route

import io.ktor.server.application.*
import io.ktor.server.routing.*
import org.koppepan.reversi.application.use_case.hello.get.GetHelloUseCase
import org.koppepan.reversi.presentation.route.hello.helloRoute

fun Application.configureRouting(
    getHelloUseCase: GetHelloUseCase,
) {
    routing {
        route("/hello") {
            helloRoute(getHelloUseCase)
        }
    }
}
