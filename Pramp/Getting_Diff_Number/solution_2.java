import java.io.*;
import java.util.*;

class Solution {

  static int getDifferentNumber(int[] arr) {
    if(arr == null || arr.length == 0) return 0;
    int len = arr.length;
    
   for(int i = 0; i < len; ++i) {
      int value = arr[i];
      while(value < len && value != arr[value]) {
        int temp = arr[value];
        arr[value] = value;
        value = temp;
      }
    }
    
    for(int i = 0; i < len; ++i) {
      if(arr[i] != i) return i;
    }
    
    return len;
  }

  public static void main(String[] args) {
    int[] arr = {0,1,2,4};
    System.out.println(getDifferentNumber(arr));
    int[] arr2 = {0,5,4,1,3,6,2};
    System.out.println(getDifferentNumber(arr2));
    int[] arr3 = {100};
    System.out.println(getDifferentNumber(arr3));
  }
}
