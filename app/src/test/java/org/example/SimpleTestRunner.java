package org.example;

public class SimpleTestRunner {
    public static void main(String[] args) {
        System.out.println("Running Unit Tests...\n");
        
        App app = new App();
        int passed = 0;
        int total = 0;
        
        // Test 1: App has a greeting
        total++;
        if (app.getGreeting() != null) {
            System.out.println("✓ Test 1 PASSED: App has a greeting");
            passed++;
        } else {
            System.out.println("✗ Test 1 FAILED: App should have a greeting");
        }
        
        // Test 2: Greeting contains "Hello"
        total++;
        if (app.getGreeting().contains("Hello")) {
            System.out.println("✓ Test 2 PASSED: Greeting contains 'Hello'");
            passed++;
        } else {
            System.out.println("✗ Test 2 FAILED: Greeting should contain 'Hello'");
        }
        
        // Test 3: Reverse greeting works
        total++;
        String expected = "!spOveD ,olleH";
        String actual = app.getReverseGreeting();
        if (expected.equals(actual)) {
            System.out.println("✓ Test 3 PASSED: Reverse greeting works");
            passed++;
        } else {
            System.out.println("✗ Test 3 FAILED: Expected '" + expected + "' but got '" + actual + "'");
        }
        
        System.out.println("\nTest Results: " + passed + "/" + total + " tests passed");
        
        if (passed == total) {
            System.out.println("🎉 All tests passed!");
        } else {
            System.out.println("❌ Some tests failed!");
        }
    }
}