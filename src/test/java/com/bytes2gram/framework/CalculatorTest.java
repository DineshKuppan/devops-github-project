package com.bytes2gram.framework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

  @Test
  public void testSum() {
    System.out.println(
        "----- START OF Verify function testSum in CalculatorTestSuccessful class -------------");
    int result = Calculator.sum(3, 9);
    Assert.assertEquals(7, result);
    System.out.println(
        "----- END OF Verify function testSum in CalculatorTestSuccessful class -------------");
  }

  @Test
  public void testDivison() {
    System.out
        .println("----- START OF Verify function testDivison in testDivison class -------------");
    try {
      int result = Calculator.divison(10, 2);
      Assert.assertEquals(5, result);
    } catch (Exception e) {
      e.printStackTrace(System.err);
    }
    System.out
        .println("----- END OF Verify function testDivison in testDivison class -------------");
  }

  @Test(expectedExceptions = Exception.class)
  public void testDivisionException() throws Exception {
    System.out.println(
        "----- START OF Verify function testDivisionException in testDivisionException class -------------");
    Calculator.divison(10, 0);
    System.out.println(
        "----- END OF Verify function testDivisionException in testDivisionException class -------------");
  }

  @Test
  public void testSubstraction() {
    int result = 10 - 3;
    Assert.assertEquals(result, 9);
  }
}