package com.bits.pilani.devops.framework.listeners;

// Java program to demonstrate working of ConcurrentHashMap

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

  public static void main(String[] args) {
    ConcurrentHashMap<Integer, String> hashMap = new ConcurrentHashMap<>();

    // Insert mappings using
    // put method
    hashMap.put(100, "Hello");
    hashMap.put(101, "Geek");
    hashMap.put(102, "Geeks");

    Map<String, Boolean> mTest = new HashMap<>();
    Boolean tempData = mTest.remove("Geek");
    System.err.println(tempData);
  }
}