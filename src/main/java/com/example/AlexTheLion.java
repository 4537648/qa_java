package com.example;

import java.util.List;

public class AlexTheLion extends Lion {

  public final String NAME = "Alex";

  private String placeOfLiving;
  private List<String> friends;

  public AlexTheLion(Feline feline) throws GenderException {
    super(feline, "Самец");
    placeOfLiving = "Нью-Йоркский зоопарк";
    friends = List.of("Марти", "Глория", "Мелман");
  }

  public String getPlaceOfLiving() {
    return placeOfLiving;
  }

  public List<String> getFriends() {
    return friends;
  }

  @Override
  public int getKittens() {
    return 0;
  }
}