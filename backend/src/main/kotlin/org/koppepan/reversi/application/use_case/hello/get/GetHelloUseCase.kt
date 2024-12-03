package org.koppepan.reversi.application.use_case.hello.get

interface GetHelloUseCase {
    data class Output(
        val message: String,
    )

    suspend fun execute(): Output
}