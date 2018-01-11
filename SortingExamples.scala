/**
 * Sorting will create another list
 * 1) sorted , sorted(Ordering.Int.reverse)
 * 
 * 		invoke the sorted function. With no arguments, this returns a List containing the same elements, but sorted in ascending order (from low to high)
 * 		We use Ordering.Int.reverse to supply "sorted" with an Ordering argument. This affects the sort order (to be descending).
 * 
 * 2) sortWith
 * 
 * 		we must pass another function (called "lt"). The argument function, specified as a lambda, must return true if the first argument is less than the second
 * 
 * 3) sortBy
 * 
 * 		With this function, we specify a lambda to create a special sorting key (like a tuple). Here we build a two-element tuple based on each string in the list.
 *    Our sort key uses the second char (at index 1) before the first char (at index 0). So the following digit is the primary sort.
 */

object ScalaSortingExample {

  def main(args: Array[String]): Unit = {
    
    var l : List[Int] = List(2,1,7,4,8,4,9)
    
	
    //sorted
    sortListUsing_Sorted(l);
    
    
    //sortWith
    sortListUsing_SortWith(l);
   
    
    //sortBy
    sortListUsing_SortBy();
        
  }
  
  
  
  
  def sortListUsing_Sorted(l: List[Int] )={
    // unsorted list
     println("****** SORTED*******\nunsorted list \t\t\t"+l)
     
     // sorted list by ascending
     var l1 = l.sorted
     println("sorted list by ascending\t"+l1)
    
    //sorted list by descending 
    //scala.math.Ordering.Int.reverse
    var l2 = l.sorted(Ordering.Int.reverse)
    println("sorted list by descending \t"+l2)
    
  }
  
  
  def sortListUsing_SortWith(l:List[Int]) ={
    
    // unsorted list
     println("\n\n*******SORTWITH*******\nunsorted list \t\t\t"+l)
     
     // sort function  for ascending
     var sortAsc = (i:Int,j:Int) => i< j 
     
     // sort function  for descending
     var sortDesc = (i:Int,j:Int) => i > j 
     
     val sortedListAsc = l.sortWith(sortAsc)
     println("sorted list by ascending\t"+sortedListAsc)
     
      val sortedListDesc = l.sortWith(sortDesc)
     println("sorted list by descending\t"+sortedListDesc)
    
  }
  
  
  
  def sortListUsing_SortBy()={
    // These ids all have a start char and an ending digit.
    val ids = List("a5", "b0", "z0", "c9", "d9", "d0", "d5")
    // val ids1 = List((1,33), (3,22), (2,11))
    
    println("\n\n****** SORTBY******\nunsorted list \t\t\t"+ids)
    
    var sortFunAsc = (s:String) => (s.charAt(1),s.charAt(0))
    // var sortFunAsc1 = (s:(Int,Int)) => (s._1,s._2)
    
    var sortedListASC = ids.sortBy(sortFunAsc)
    
   //  var sortedListASC1= ids.sortBy(sortFunAsc)
    
    println("sorted list by ascending\t"+sortedListASC)
    
   // println("sorted list by ascending\t"+sortedListASC1)
    
    
    
  }

}
