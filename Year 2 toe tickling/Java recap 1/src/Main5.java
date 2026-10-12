/*
this one needs me to make a method that checks whether at least one character in a given string is a vowel (a, e, i, o, u) (THE LA LI LU LE LO)
and return true or false.

@Author David/Rofleemo
@Version 1.0
 */

import java.util.Scanner;

class Main5 {
    public static void main(String[] args) { //main program
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine(); //where user input is stored

        boolean result = containsVowel(input); //calls the result out of the vowels method

        System.out.println("Contains vowel: " + result);

        sc.close();
    }

    public static boolean containsVowel(String input) { //we use a boolean method since all we need is a simple true or false here tbh
        for (int i = 0; i < input.length(); i++) { // i is the possition in the input text, and it starts at 0, and then i++ just adds the number of how many positions there are
            char character = input.charAt(i);

            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') { //this defines all the vouels and use ||, which means or
                return true;
            }
        }
        return false;

    }

}

