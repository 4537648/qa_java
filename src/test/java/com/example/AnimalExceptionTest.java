package com.example;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AnimalExceptionTest {

  @Rule
  public ExpectedException exception = ExpectedException.none();

  @Test
  public void getFoodExceptionTest() throws Exception {
    Animal animal = new Animal();
    exception.expect(Exception.class);
    exception.expectMessage("Неизвестный вид животного, используйте значение Травоядное или Хищник");
    animal.getFood("Рептилоид");
  }
}