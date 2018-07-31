package SelfStudy.App;

import java.util.Scanner;

public class Player {

    public static void main(String[] args) {
        System.out.println("Your name: ");
        System.out.println("Hello " + getName());
        System.out.println("Your age:");
        System.out.println("Player 1 name: " + getName());
        System.out.println("Player 1 age: " + getAge());
    }

    public static Scanner getName() {
        Person player1 = new Person();
        Scanner name = new Scanner(System.in);
        player1.name = name.next();
        return name;
    }

    public static Scanner getAge() {
        Person player1 = new Person();
        Scanner age = new Scanner(System.in);
        player1.age = age.nextInt();
        return age;
    }

    public static class Person {
        String name;
        int age;
    }
}




