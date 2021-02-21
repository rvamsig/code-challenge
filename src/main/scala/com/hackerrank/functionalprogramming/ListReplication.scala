package com.hackerrank.functionalprogramming

object ListReplication extends App {
  def f(num:Int, arr:List[Int]): List[Int] = {
    arr.flatMap(List.fill(num)(_))
  }

  val output= f(3,List(1,2,3,4))
  println(s"The output for the function call is : $output")

}
