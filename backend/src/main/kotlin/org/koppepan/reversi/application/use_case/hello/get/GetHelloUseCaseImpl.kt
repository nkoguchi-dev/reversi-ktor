package org.koppepan.reversi.application.use_case.hello.get

class GetHelloUseCaseImpl : GetHelloUseCase {
    override suspend fun execute(): GetHelloUseCase.Output {
        return GetHelloUseCase.Output(
            "Hello World!",
        )
    }
}