object ScalaLazyEvaluationObj{

    def method1(n: Int){
        println("Method 1");
        println(n);
    }

    def method2(n: => Int) {
        println("Method 2");
        println(n);
    }

    //var addCounter = 0;//4. now moved outside of the method
    //var addCounter: Int = 0;
    def main(args: Array[String]){
        //var addCounter = 0; //3. we then comment this one out and instantiate
        //it outside of the function or method
        val add = (a: Int, b: Int) => {
            println("add");// about to be called ... "+addCounter);
            a + b
        }
        method1(add(2, 8));

        method2(add(7, 2))
    }

}