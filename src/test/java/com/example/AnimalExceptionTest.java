package com.example;

import org.junit.Test;

public class AnimalExceptionTest {

  @Test(expected = Exception.class)
  public void getFoodExceptionTest() throws Exception {
    Animal animal = new Animal();
    animal.getFood("Рептилоид");
  }
}