package com.testPack.one;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClassOne {
  @Test
  public void atTestOne() {
	  System.out.println("At Test 1");
  }
  @Test
  public void atTestTwo() {
	  System.out.println("At Test 2");
  }
  @BeforeClass
  public void atBeofreClassOne() {
	  System.out.println("At Before class 1");
  }
  @AfterClass
  public void atAfterClassOne() {
	  System.out.println("At After class 1");
  }
  @BeforeMethod
  public void atBeofreMethodOne() {
	  System.out.println("At Before Method 1");
  }
  @AfterMethod
  public void atAfterMethodOne() {
	  System.out.println("At After Method 1");
  }
  
}
