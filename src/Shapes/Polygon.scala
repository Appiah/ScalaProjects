class Polygon{
    def area: Double = 0.0;
}

object Polygon {
    def main(args: Array[String]){
        var poly = new Polygon;
        //printArea(poly);

        var rect = new Rectangle(11, 55);
        printArea(rect);

    }

    def printArea(p: Polygon){
        println(p.area);
    }
}