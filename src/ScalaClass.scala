//Scala - Class

class User(var name : String, var age : Int){
    def printName{println(name)}
}

//val : should be considered as a constant and cannot be changed
//has getter only

//var : not a constant nor final  and can be changed
//getter and setter are available

//default : no getter , no setter

//private prevents a variable from being used outside the class

object Demo{
    def main(args : Array[String]): Unit ={
        var user = new User("Manuel", 28);
        println("Name : "+user.name);
        println("Age : "+user.age);
    }
}