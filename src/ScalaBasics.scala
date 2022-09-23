object ScalaBasics{

  val mytuple = (1, 2, "hello", true);
  val mytuple2 = new Tuple3(1, 2, "hellox");
  val mytuple3 = new Tuple3(1, "hello", (2,3));

  def main (args: Array[String]): Unit ={
    println("This is basic scala.");

    println(mytuple._1);
    println(mytuple._2);
    println(mytuple._3);
    println(mytuple._4);
    println(mytuple2._3);

    mytuple.productIterator.foreach{
      i => println(i);
    }

    println(1 -> "Tom" -> true);
    println(mytuple3._3._2);

    val lst = List(1, 2, 3);
    val map = Map(1 -> "Tom", 2 -> "Maggi", 3 -> "John");

    println(lst.find(_ > 6));
    println(lst.find(_ > 2));

    println(map.get(1));

    //And now how to extract the value
    //use : .get

    println(map.get(1).get)


  }

}