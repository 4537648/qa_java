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
public class LionTest {

  private Lion lion;

  @Mock
  Feline feline;

  @Before
  public void setUp() throws GenderException {
    lion = new Lion(feline, "Самец");
  }

  @Test
  public void getKittensParenMethodCall() {
    int expected = 100500;
    Mockito.when(feline.getKittens()).thenReturn(expected);
    Assert.assertEquals("Возвращено ошибочное значение количества котят", expected, lion.getKittens());
    Mockito.verify(feline).getKittens();
  }

  @Test
  public void getFoodParentMethodCall() throws Exception {
    List<String> expected = List.of("Мир", "Труд", "Май");
    Mockito.when(feline.getFood("Хищник")).thenReturn(expected);
    Assert.assertEquals("Возвращено ошибочное значение пищи льва", expected, lion.getFood());
    Mockito.verify(feline).getFood("Хищник");
  }
}