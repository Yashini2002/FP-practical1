object First{
   def main(args:Array[String]):Unit=
    {
       
       println(s"Area is: ${area()}")
      
       }
   def area():Double={
      var Pi=3.14;
      var r=5;
      var area=Pi*r*r;
      return area;
    }
}