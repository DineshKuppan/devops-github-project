package com.bytes2gram.framework.listeners;

// Java program To calculate
// The Value Of nCr

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class GFG {


  static int nCr(int n, int r) {
    return fact(n) / (fact(r) *
        fact(n - r));
  }

  // Returns factorial of n
  static int fact(int n) {
    if (n == 0) {
      return 1;
    }
    int res = 1;
    for (int i = 2; i <= n; i++) {
      res = res * i;
    }
    return res;
  }

  // Driver code
  public static void main(String[] args) {
    int n = 5, r = 3;
    int[] testdata = {1, 5, 3, 9, 2, 4, 6, 7, 8};
    //System.out.println(nCr(n, r));
    //Map<String, Boolean> testMap = new ConcurrentHashMap<>();
    String cars[] = {"Volvo", "BMW", "Ford", "Mazda"};
    System.err.println(cars);
  }
}