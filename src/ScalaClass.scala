//Scala - Class

class User(var name : String, var age : Int);

object Demo{
    def main(args : Array[String]): Unit ={
        var user = new User("Manuel", 28);
        println("Name : "+user.name);
        println("Age : "+user.age);
    }
}