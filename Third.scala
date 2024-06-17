object Third{
   def main(args:Array[String])=
    {
    println(s"Volume of sphere is: ${spherevolume(5)}")
    }
   def spherevolume(r:Double):Double={
      var Pi=3.14
      
      var vol=4/3*Pi*r*r*r
      return vol
   }
}