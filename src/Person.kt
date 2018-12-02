class Person(var name: String) {
    //var name: String = ""

    fun display() {
        println("Display: $name")
    }

    //Using lambdas
    fun displayWithLambda(func: (s:String) -> Unit) {
        func(name)
    }
}