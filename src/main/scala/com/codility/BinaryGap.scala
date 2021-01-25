package com.codility

object BinaryGap extends App{
  def getBinaryGap(num: Int): Int = {
    /*
      1.Create RegEx for 0s surrounded by 1 on both ends
      2.Convert the number to Binary
      3.Apply Binary String to RegEx and make a list of all occurrences
      4.If list is empty return 0
      5.Else, filter whose length is maximum and return the length
     */

    val list = "(?<=1)0+(?=1)".r.findAllIn(num.toBinaryString).toList

    if (list.isEmpty) 0
    else
      list.maxBy(_.length).length
  }

  println("6=>" + 6.toBinaryString + "=>" + getBinaryGap(6))
  println("2789=>" + 2789.toBinaryString + "=>" + getBinaryGap(2789))
  println("3549=>" + 3549.toBinaryString + "=>" + getBinaryGap(3549))
  println("7289=>" + 7289.toBinaryString + "=>" + getBinaryGap(7289))
  println("952379=>" + 952379.toBinaryString + "=>" + getBinaryGap(952379))

}
