package com.example;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionExceptionTest {

  @Mock
  Feline feline;

  @Rule
  public ExpectedException exception = ExpectedException.none();

  @Test
  public void doesHaveManeExceptionTest() throws GenderException {
    exception.expect(GenderException.class);
    exception.expectMessage("Используйте допустимые значения пола животного - Самец или Самка");
    new Lion(feline, "Нексус-9");
  }
}