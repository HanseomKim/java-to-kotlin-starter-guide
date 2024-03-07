package com.lannstark.lec12;

public class Lec12Main {

  public static void main(String[] args) {
    moveSomething(new Movable() {
      @Override
      public void move() {
        System.out.println("Move!!");
      }

      @Override
      public void fly() {
        System.out.println("Fly!!");
      }
    });
  }

  private static void moveSomething(Movable movable) {
    movable.move();
    movable.fly();
  }

}
