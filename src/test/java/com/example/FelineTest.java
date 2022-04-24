package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.List;

public class FelineTest {

  private Feline feline;

  @Before
  public void setUp() { feline = new Feline(); }

  @Test
  public void eatMeatHappyPassTest() throws Exception {
    List<String> actual = feline.eatMeat();
    List<String> expected = List.of("Животные", "Птицы", "Рыба");
    Assert.assertEquals("Возвращено ошибочное значение пищи хищника", expected, actual);
  }

  @Test
  public void getFamilyHappyPassTest() {
    String actual = feline.getFamily();
    String expected = "Кошачьи";
    Assert.assertEquals("Возвращено ошибочное значение семейства животного", expected, actual);
  }

  @Test
  public void getKittensHappyPassTest() {
    int actual = feline.getKittens();
    int expected = 1;
    Assert.assertEquals("Возвращено ошибочное значение количества котят", expected, actual);
  }

  @Test
  public void getKittensArgumentedHappyPassTest() {
    int actual = feline.getKittens(5);
    int expected = 5;
    Assert.assertEquals("Возвращено ошибочное значение количества котят", expected, actual);
  }
}