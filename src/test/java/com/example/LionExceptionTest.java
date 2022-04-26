package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionExceptionTest {

  @Mock
  Feline feline;

  @Test(expected = GenderException.class)
  public void doesHaveManeExceptionTest() throws GenderException {
    new Lion(feline, "Нексус-9");
  }
}