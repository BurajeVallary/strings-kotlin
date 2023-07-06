fun main(){
word()

greet("Vallary",29)

 stringLength("I can do it")

    string()

 statement("Jane")

}
//Given a string “akirachix”. Write a function that prints out a string composed
//of the first, third and fourth characters of the string

fun word(){
    val words="akirachix"
    println(words[0])
    println(words[2])
    println(words[3])

    val word="${words[0]}${words[2]}${words[3]}"
}
//Write a function that takes in 2 parameters, name and age and returns a
//String with this structure “Hi, my name is x and I am y years old.” Where x and
//y are the provided name and age respectively.

fun greet(name:String,age:Int):String{
    val greeting=("Hi my name is  $name and I am $age years old")
    return greeting
}
//Write a function that takes in a String and returns its length

fun stringLength(hope:String): Int {
    val hope="I can do it because I believe in God"
    return  hope.length

}
//Write a function that takes in a String and prints its length
fun string(){
    val hopes="I can do it,God is in charge"
    println(hopes)
}

//Write a function that takes in a name and prints out “That’s me!” when your
//name is passed to it, otherwise it prints out “I don’t know who that is”

fun statement(name: String){
    val state="butterfly"
    if (state.equals(name))
        println("That is me")

    else
        (println("I do not know who that is"))

}