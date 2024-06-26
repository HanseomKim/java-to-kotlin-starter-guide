package com.lannstark.lec05;

public class Lec05Main {

  public static void main(String[] args) {
  }

  private void validateScoreIsNotNegative(int score) {
    if (score < 0) {
      throw new IllegalArgumentException(String.format("%s는 0보다 작을 수 없습니다.", score));
    }
  }

  private String getPassOrFail(int score) {
    if (score >= 50) {
      return "P";
    } else {
      return "F";
    }
  }

  private String getGrade(int score) {
    if (score >= 90) {
      return "A";
    } else if (score >= 80) {
      return "B";
    } else {
      return "C";
    }
  }

  private String getGradeWithSwitch(int score) {
    switch (score / 10) {
      case 9:
        return "A";
      case 8:
        return "B";
      default:
        return "C";
    }
  }

  private boolean startsWithA(Object obj) {
    if (obj instanceof String) {
      return ((String) obj).startsWith("A");
    } else {
      return false;
    }
  }

  private void judgeNumber(int number) {
    if (number == 1 || number == 0) {
      System.out.println("0 또는 1입니다.");
    } else {
      System.out.println("0 또는 1이 아닙니다.");
    }
  }

  private void judgeNumber2(int number) {
    if (number == 0) {
      System.out.println("주어진 숫자는 0입니다.");
      return;
    }

    if (number % 2 == 0) {
      System.out.println("주어진 숫자는 짝수입니다.");
      return;
    }

    System.out.println("주어진 숫자는 홀수입니다.");
  }
}
