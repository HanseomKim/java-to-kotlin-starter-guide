package com.lannstark.lec13;

public class JavaHouse {

  private final String address;
  private final LivingRoom livingRoom;

  public JavaHouse(String address) {
    this.address = address;
    this.livingRoom = new LivingRoom(10);
  }

  public LivingRoom getLivingRoom() {
    return livingRoom;
  }

  public class LivingRoom {

    private final double area;

    public LivingRoom(double area) {
      this.area = area;
    }

    public String getAddress() {
      return JavaHouse.this.address;
    }
  }

}