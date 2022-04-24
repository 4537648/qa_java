package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class AnimalTest {

  private Animal animal;

  @Before
  public void setUp() {
    animal = new Animal();
  }

  @Test
  public void getFamilyHappyPassTest() {
    String actual = animal.getFamily();
    String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
    Assert.assertEquals("Возвращен некорректный перечень семейства", expected, actual);
  }
}