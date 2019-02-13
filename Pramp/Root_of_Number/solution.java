import java.io.*;
import java.util.*;

class Solution {

  static double root(double x, int n) {
    if(n == 0) return 0;
    double eps = 0.001;
    double lower = 0.0;
    double upper = x;
    while(lower <= upper) {
      double mid = (lower + upper) / 2;
      if(Math.abs(Math.pow(mid, n) - x) <= eps) return mid;
      else if (Math.pow(mid, n) - x > eps) {
        upper = mid;
      } else lower = mid;
    }
    
    return lower;
  }

  public static void main(String[] args) {
    double x = 9;
    int n = 2;
    System.out.println("N'th root: " + root(x, n));
  }
}
