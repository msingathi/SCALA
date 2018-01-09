object Currying {
  def main(args: Array[String]) {
    println("Currying :  \n Methods may define multiple parameter lists. When a method is called with a fewer number of parameter lists, then this will yield a function taking the missing parameter lists as its arguments.\n\n")
    
    var list : List[Int] = List(1,2,3,4,5,6,7,8,9)
    
    println( filter (list, modN(2)) )   
    
  }

  def filter(l : List[Int], funct : Int => Boolean) : List[Int] = {  
     if(l.isEmpty) l
     else if(funct(l.head)) l.head :: filter(l.tail, funct)
     else filter(l.tail, funct)
  }

  def modN (n:Int) (x:Int) = ( (x%n) ==0)
  
}
