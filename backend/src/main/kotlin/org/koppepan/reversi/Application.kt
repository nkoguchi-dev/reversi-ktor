package org.koppepan.reversi

import io.ktor.server.application.*
import io.ktor.server.netty.*
import org.koppepan.reversi.application.use_case.hello.get.GetHelloUseCaseImpl
import org.koppepan.reversi.presentation.route.configureRouting

fun main(args: Array<String>) {
    EngineMain.main(args)
}

fun Application.module() {
    val getHelloUseCase = GetHelloUseCaseImpl()
    configureSerialization()
    configureRouting(
        getHelloUseCase,
    )
}
