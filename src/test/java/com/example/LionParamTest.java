package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(Parameterized.class)
public class LionParamTest {

  private Lion lion;

  @Mock
  Feline feline;

  private final String sex;
  private final boolean expected;

  public LionParamTest(String sex, boolean expected) {
    this.sex = sex;
    this.expected = expected;
  }

  @Parameterized.Parameters
  public static Object[][] lionTestParams() {
    return new Object[][]{
            {"Самец", true},
            {"Самка", false},
    };
  }

  @Before
  public void setUp() throws GenderException{
    MockitoAnnotations.initMocks(this);
    lion = new Lion(feline, sex);
  }

  @Test
  public void doesHaveManeParameterizedHappyPassTests() {
    boolean actual = lion.doesHaveMane();
    Assert.assertEquals(expected, actual);
  }
}