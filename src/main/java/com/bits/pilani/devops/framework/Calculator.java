package com.bits.pilani.devops.framework;

public final class Calculator {

  public static int sum(int a, int b) {
    return a + b;
  }

  public static int subtraction(int a, int b) {
    return a - b;
  }

  public static int multiplication(int a, int b) {
    return a * b;
  }

  public static int divison(int a, int b) throws Exception {
    if (b == 0) {
      throw new Exception("Divider can't be zero");
    }
    return a / b;
  }
}
