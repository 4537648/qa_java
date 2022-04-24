package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

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
    lion.getKittens();
    Mockito.verify(feline).getKittens();
  }

  @Test
  public void getFoodParentMethodCall() throws Exception {
    lion.getFood();
    Mockito.verify(feline).getFood("Хищник");
  }
}