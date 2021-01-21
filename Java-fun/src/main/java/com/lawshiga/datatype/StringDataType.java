package com.lawshiga.datatype;

public class StringDataType {
    public static void main(String[] args) {
        String input = "My birthday is 10 January 1984 and my favorite number is 42";
        String output = "";

        for(int i=0;i<input.length();i++){

//if the character at index i on the string is a letter or a space, move on to the next index
            if(Character.isLetter(input.charAt(i)) || input.charAt(i)==' '){

                continue;
            }

            output = output + input.charAt(i); //the number is added onto the output

        }

        System.out.println(output);
    }
}
