fun main(args: Array<String>) {
    println("Hello World!")
    saySomething()
    // Try adding program arguments at Run/Debug configuration
    println("Program arguments: ${args.joinToString()}")
}

fun saySomething() {
    println("bonjour")
}