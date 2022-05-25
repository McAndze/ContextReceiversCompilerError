fun main() {
    with(Context) {
        contextualFunction()
    }
}

context(Context)
fun contextualFunction() {
    val contextualLambda: context(Context).() -> Unit = ::functionWithSomeContext
    contextualLambda(this@Context)
}

context(Context)
fun functionWithSomeContext() {}

object Context