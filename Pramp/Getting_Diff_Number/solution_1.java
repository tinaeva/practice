import java.io.*;
import java.util.*;

class Solution {

  static int getDifferentNumber(int[] arr) {
    if(arr == null || arr.length == 0) return 0;
    int len = arr.length;
    
    boolean[] check = new boolean[len];
    for(int i : arr) {
      if(i < len) check[i] = true;
    }
    for(int i = 0; i < len; ++i) {
      if(!check[i]) return i;
    }
    
    return len;
  }

  public static void main(String[] args) {
    int[] arr = {0,1,2,4};
    System.out.println(getDifferentNumber(arr));
  }
}
