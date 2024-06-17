object Second{
    def main(arrgs:Array[String])=
     {
      println(s"Farenheit: ${farenheit()}")
      }
     def farenheit():Double={
        var c=32
        var f=(c*1.8)+32
        return f
     }
}