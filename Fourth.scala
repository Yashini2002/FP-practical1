object Fourth{
   def main(args:Array[String])=
   {
    println(s"Final price is: ${finalprice(60)}")
   }
   def bookP(n:Int):Double=
   {
     24.5*n
   }
   def discount(d:Double):Double=
   {
     d*0.4
   }
   def price(n:Int):Double=
   {
     val bookprice=bookP(n)
      bookprice-discount(bookprice)
   }
   def shipping(n:Int):Double=
   {
     
     if(n<50) 
        n*3
     else
        0.75*(n-50)+(n*3)
    }
    def finalprice(n:Int):Double=
    {
      price(n)+shipping(n)
      
    }
}