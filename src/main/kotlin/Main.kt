fun main(){
var person1 = Human("Purity",20,54)
   person1.eat(5)
    println(person1.weight)
    person1.speak("woop!")
    person1.birthday()
    println(person1.age)
    val assistant = User("Purity","Wanjiku","wan@gmail.com",+62783,1332)
    println(assistant.password)
    println(assistant.firstname)
}

class Human(var name:String,var age:Int,var weight:Int){

    fun eat(foodWeight:Int){
        println("I am eating $foodWeight kgs of food" )
        weight += foodWeight
    }
    fun speak(speech:String){
        println(speech)
    }
    fun birthday():Int{
        age += 1
        return age
    }
}
data class User(var firstname:String, var lastname:String, var email:String, var phoneNumber:Int,var password:Int)

