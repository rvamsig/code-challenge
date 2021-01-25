package com.hackerrank.problemsolving

/*
* Complete the function solveMeFirst to compute the sum of two integers.
Function prototype:
int solveMeFirst(int x, int y);
where,
x is the first integer input.
y is the second integer input
Return values
sum of the above two integers
Sample Input
x = 2
y = 3
Sample Output
5
Explanation
The sum of the two integers and is computed as: 2+3=5
* */

object SumOfTwoIntegers {
  def main(args: Array[String]) {
    println(io.Source.stdin.getLines().take(2).map(_.toInt).sum)
  }
}
