package org.example;

public class App {
    public String getGreeting() {
        return "Hello World! Welcome to TDD.";
    }

    public String getReverseGreeting() {
        return new StringBuilder(getGreeting()).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}