fun main(args: Array<String>) {
    println("Hello, World")

    var p = Person("Ibou")
    //p.name = "Ibou"

    println("Name is ${p.name}")

    //Change Name
    p.name = "Ahmad"
    println("Modified Name is ${p.name}")

    //Using function in class
    p.display()

    //Using lambda
    p.displayWithLambda(::printName)
}

fun printName(name: String) {
    println(name)
}