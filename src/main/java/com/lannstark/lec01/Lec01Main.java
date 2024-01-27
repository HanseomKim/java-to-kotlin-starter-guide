package com.lannstark.lec01;

public class Lec01Main {

  public static void main(String[] args) {
    long number1 = 10L; // (1) 가변, primitive type

    final long number2 = 10L; // (2) 불변

    Long number3 = 1_000L; // (3) reference type

    Person person = new Person("Kotlin"); // (4) 객체 인스턴스화
  }
}
