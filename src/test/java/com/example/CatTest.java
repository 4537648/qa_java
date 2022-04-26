package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

  private Cat cat;

  @Mock
  Feline feline;

  @Before
  public void setUp() {
    cat = new Cat(feline);
  }

  @Test
  public void getSoundHappyPassTest() {
    String expected = "Мяу";
    String actual = cat.getSound();
    Assert.assertEquals("Возвращено ошибочное значение звука животного", expected, actual);
  }

  @Test
  public void getFoodParentCall() throws Exception {
    List<String> expected = List.of("Животные", "Птицы", "Рыба");
    Mockito.when(feline.eatMeat()).thenReturn(expected);
    Assert.assertEquals("Возвращено ошибочное значение пищи кошачьего", expected, cat.getFood());
    Mockito.verify(feline).eatMeat();
  }
}