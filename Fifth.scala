object Fifth{
   def main(args:Array[String])=
   {
     println(s"Total time is: ${totaltime(4,3)}")
   }
   def easy(d:Int):Int=
   {
    d*8
   }
   def Tempo(d:Int):Int=
   {
    d*7
   }
   def totaltime(easyD:Int,TempoD:Int):Int=
   {
    easy(easyD)+Tempo(TempoD)
   }
}