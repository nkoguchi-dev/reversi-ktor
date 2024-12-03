package org.koppepan.reversi.presentation.route.hello

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koppepan.reversi.application.use_case.hello.get.GetHelloUseCase

fun Application.helloRoute(
    getHelloUseCase: GetHelloUseCase,
) {
    routing {
        get("/hello") {
            val useCaseOutput = getHelloUseCase.execute()
            call.respondText(
                useCaseOutput.message,
            )
        }
    }
}
