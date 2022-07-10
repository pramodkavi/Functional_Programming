object Q1_Q2 extends App{

        
        var j:Int= 2;  //j=2

        var i:Int= j;  //i=j

        var k:Int= i;  //k=i
        
        var n:Int= 5;  //n=5

        var m:Int= n;  //m=n

        var f : Float = 12.0f;  //f=12.0f
        var g : Float = 4.0f;   //g = 4.0f;


        var c : Char= 'X';  //c = ‘X’;
        
        //a)
        println(k + 12 * m);

        //b)
        println(m / j); 

        //c)
        println(n % j);

        //d)
        println(m / j * j); 

        //e)
        println(f + 10*5 +g); 

        //f)
        println( (i+1) * n); 

        /* Scala is not support prefix operator */
        // println( (++i) * n); 
    
}