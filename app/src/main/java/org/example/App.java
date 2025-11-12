package org.example;

public class App {
    public String getGreeting() {
        return "Hello, DevOps!";
    }

    public String getReverseGreeting() {
        return new StringBuilder(getGreeting()).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}