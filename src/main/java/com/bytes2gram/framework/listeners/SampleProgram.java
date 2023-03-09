package com.bytes2gram.framework.listeners;

public class SampleProgram {

  public static int testSum(int A, int B) {
    if (B == 0) {
      return A;
    } else {
      return testSum(B, A % B);
    }
  }

  public static int fib(int n) {
    if (n <= 1) {
      return n;
    } else {
      return fib(n - 1) + fib(n - 2);
    }
  }

  public static void main(String[] args) {
//    System.err.println(fib(6));
//    int n = 6;
//    for (int i = 1; i < n; i++) {
//      System.err.print(printTribc(i) + " ");
//    }
    System.err.println(testSum(100, 2000));
  }

  public static int printTribc(int n) {
    if (n == 0 || n == 1 || n == 2) {
      return 0;
    } else if (n == 3) {
      return 1;
    } else {
      return printTribc(n - 1) + printTribc(n - 2);
    }
  }
}
