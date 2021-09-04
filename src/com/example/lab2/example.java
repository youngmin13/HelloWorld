package com.example.lab2;

import java.util.Scanner;

class example {
  public static void main(String[] args) {
    example stepB = new example();
    stepB.b01();
  }
  void b01(){

    int birth_year = 0;
    int age = 0;

    Scanner s = new Scanner(System.in);
    System.out.print("Enter a birth year > ");
    birth_year = s.nextInt();

    age = 2021 - birth_year + 1;

    if(age < 20)
      System.out.println("You are not adult");
    else
      System.out.println("You are adult");
  }
}