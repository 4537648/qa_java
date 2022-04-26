package com.example;

import java.util.List;

public class AlexTheLion extends Lion {

  public final String NAME = "Alex";

  public AlexTheLion(Feline feline) throws GenderException {
    super(feline, "Самец");
  }

  public String getPlaceOfLiving() {
    return "Нью-Йоркский зоопарк";
  }

  public List<String> getFriends() {
    return List.of("Марти", "Глория", "Мелман");
  }

  @Override
  public int getKittens() {
    return 0;
  }
}