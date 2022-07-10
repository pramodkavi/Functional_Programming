object Code extends App{

        var a:Int = 2;  //a=2
        var b:Int = 3;  //b=3
        var c:Int = 4;  //c=4
        var d:Int = 5;  //d=5

        var k : Float = 4.3f;  //k=4.3f
        
        //a)println( - -b * a + c *d - -);
        b=b-1;
        d=d-1;
        println( b * a + c * d); 

        //b)println(a++);
        println(a);
        a=a+1;

        //c)println (–2 * ( g – k ) +c);
        //g is not declared. Let g be 0

        println ( (-2) * (0- k) +c);

        //d)println (c=c++);
        println (c);
        c=c+1; 

        //e)println (c=++c*a++);       
        c=c+1;
        println (c*a);
        a=a+1;

}