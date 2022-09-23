object ScalaLazyEvaluationObj{

    def method1(n: Int){
        println("Method 1");
        println(n);
    }

    def method2(n: => Int) {/*basically until the 'n' value has been evaluated
        // we dont get to see the 'println(n)' executed
        //basically Lazy Evaluation in Scala this way
        //affords us the ability to check the output type or check inputs before
        //proceeding to evaluate them. We might be able to use this for some
        //async processes in scala based on execution of code on confirmation of
        //output type or output outcome.
        */
        println("Method 2");
        println(n);
    }

    def main(args: Array[String]){
        val add = (a: Int, b: Int) => {
            println("add");// about to be called ... "+addCounter);
            a + b
        }
        var n: Int = add(2, 8);

        method1(n);
        //method1(add(2, 8));

        //var n2: Int = add(7, 2);
        //method2(n2);

        method2(add(7, 2))

        //var n3: Int = add(8, 20);
        //method2(n3);

        method2(add(8, 20));
    }

}