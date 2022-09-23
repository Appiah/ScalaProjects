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

    //how to handle a not present key
    println(map.get(5).getOrElse("No such key exist"))

    //Map and filter
    val ulst = List (1,2,3,5,7,11,13);
    val vmap = Map(1 -> "Tommy", 2 -> "Marian", 3 -> "Jayden");

    println(ulst.map(x => x * 2));

    println(ulst.map(x => x / 0.02));

    println(ulst.map(x => "hi" + x));

    println(ulst.map(x => "hi" * x));

    println(vmap.map(x => "hi" + x));

    println(vmap.mapValues(x => "hi " + x));

    println(List(List(1,2,3), List(3,4,5)));

    println(List(List(1,2,3), List(3,4,5)).flatten);

    println(ulst.flatMap( x => List(x, x+1)));

    //Predicate : returning a boolean value
    println(ulst.filter(x => x%2!=0));

  }

}