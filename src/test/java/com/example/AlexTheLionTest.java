package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class AlexTheLionTest {

  private AlexTheLion alexTheLion;

  @Mock
  Feline feline;

  @Before
  public void setUp() throws GenderException {
    alexTheLion = new AlexTheLion(feline);
  }

  @Test
  public void getPlaceOfLivingHappyPassTest() {
    String actual = alexTheLion.getPlaceOfLiving();
    String expected = "Нью-Йоркский зоопарк";
    Assert.assertEquals("Возвращено ошибочное значение места жительства льва Алекса", expected, actual);
  }

  @Test
  public void getFriendsHappyPassTest() {
    List<String> actual = alexTheLion.getFriends();
    List<String> expected = List.of("Марти", "Глория", "Мелман");
    Assert.assertEquals("Возвращен ошибочный перечень друзей льва Алекса", expected, actual);
  }

  @Test
  public void getKittensHappyPassTest() {
    int actual = alexTheLion.getKittens();
    int expected = 0;
    Assert.assertEquals("Возвращено ошибочное значение количества котят льва Алекса", expected, actual);
  }
}