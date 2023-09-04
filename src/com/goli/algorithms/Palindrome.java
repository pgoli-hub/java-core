package com.goli.algorithms;

public class Palindrome {

    public static void main(String[] args) {
        int[] testCases = {121,456,111,-101,0};
        for (int testCase :
                testCases) {

            System.out.println(testCase + " isPalindrome: " + isPalindrome(testCase));
        }
    }

    private static boolean isPalindrome(int value) {
        if (value <= 0) {
            return false;
        }
        int reverse = 0;
        for (int i = value; i >= 1; i = i / 10) {
            reverse = reverse * 10 + (i % 10);
        }
        return reverse == value;
    }
}
