/*Given an integer x, return true if x is a 
palindrome
, and false otherwise.
 */



package leet;

import java.util.ArrayList;

public class PalindromeNumber 
{
    public static void main(String[] args) 
    {
        int number = 12345;
        ArrayList<Integer> digits = new ArrayList<>();
        boolean palindrome = true;


        while (number > 0) 
        {
            digits.add(0, number % 10);
            number = number / 10;
        }

        System.out.println(digits);

        for (int i = 0; i < digits.size() ; i++) 
        {
            int j = digits.size() - 1 - i; 

            System.out.println("Value of i: " + digits.get(i) + " iteration:" +i);
            System.out.println("Value of j: " + digits.get(j) +  " iteration:" +i);

            if (digits.get(i) != digits.get(j)) 
            {
                palindrome = false; 
                break;
            }
        }
        System.out.println(palindrome);
    }

    
}
