package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

@RunWith(Parameterized.class)
public class AnimalParamTest {

  private Animal animal;

  private final String food;
  private final List<String> expected;

  public AnimalParamTest(String food, List<String> expected) {
    this.food = food;
    this.expected = expected;
  }

  @Parameterized.Parameters
  public static Object[][] animalTestParams() {
    return new Object[][]{
            {"Травоядное", List.of("Трава", "Различные растения")},
            {"Хищник", List.of("Животные", "Птицы", "Рыба")},
    };
  }

  @Before
  public void setUp() {
    animal = new Animal();
  }

  @Test
  public void getFoodParameterizedHappyPassTests() throws Exception {
    List<String> actual = animal.getFood(food);
    Assert.assertEquals("Возвращено ошибочное значение пищи травоядного", expected, actual);
  }
}
