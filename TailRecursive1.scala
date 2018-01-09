object TailRecursive1{ 
  def main(args:Array[String]) : Unit = {
    println("This is  my first scala example by codingground")
    println(fib(1))
   } 
   
   def fib(n: Int): Int = {
    @annotation.tailrec
    def loop(n: Int, prev: Int, cur: Int): Int = 
      if (n <= 0) prev 
      else loop(n - 1, cur, prev + cur)
      
     loop(n, 0, 1)    }
 }
