package com.goli.strings;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String[] testCases = {"Hi ", "my name is", "  my name", "", "my name is   "};
        for (String testCase :
                testCases) {
            String output = getLengthOfLastWord(testCase);
            System.out.println("last word: " + "\'" + output + "\'" + " and length is: " + output.length());
        }

    }

    private static String getLengthOfLastWord(String value) {
        String output = value.trim();
        int index = output.lastIndexOf(" ");
        if (index > 0) {
            output = output.substring(index + 1, output.length());
        }
        return output;
    }
}
