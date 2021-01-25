package com.hackerrank.problemsolving

import java.io.PrintWriter

/*
* Given an array of integers, find the sum of its elements.
For example, if the array , , so return .

* Function Description
Complete the simpleArraySum function in the editor below. It must return the sum of the array elements as an integer.

simpleArraySum has the following parameter(s):
ar: an array of integers

* Input Format
The first line contains an integer, , denoting the size of the array.
The second line contains  space-separated integers representing the array's elements.

Constraints

Output Format
Print the sum of the array's elements as a single integer.

Sample Input
6
1 2 3 4 10 11
*
Sample Output
31
Explanation

We print the sum of the array's elements:
* */
object SimpleArraySum {
  /*
   * Complete the simpleArraySum function below.
   */
  def simpleArraySum(ar: Array[Int]): Int = {
    /*
     * Write your code here.
     */
    ar.sum
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    //    val OUTPUT_PATH= "D:\\Raghu\\Learning\\output"

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val arCount = stdin.readLine.trim.toInt

    val ar = stdin.readLine.split(" ").map(_.trim.toInt)
    val result = simpleArraySum(ar)

    printWriter.println(result)

    printWriter.close()
  }
}
