object Q4a {

    def wage(hours:Int):Double=hours*250;

    def ot(hours:Int):Double=hours*85;

    def income(h1:Int,h2:Int):Double=wage(h1)+ot(h2);

    def tax(income:Double):Double=income*.12;

    def takeHome(h1:Int,h2:Int):Double= income(h1,h2)-tax(income(h1,h2));

    def main(args: Array[String]) = {
        println(takeHome(40,30));
    }  

}