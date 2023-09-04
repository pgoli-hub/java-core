package com.goli.strings;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String value = "Hi ";
        String output = value.trim();
        int index = output.lastIndexOf(" ");
        if (index > 0) {
            output = output.substring(index+1, output.length());
        }
        System.out.println("last word: "+"\'"+output+"\'"+ " and length is: "+output.length());
    }
}
