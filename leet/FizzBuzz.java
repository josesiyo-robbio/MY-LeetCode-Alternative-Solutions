package leet;
/*
    This is an enhanced version of the classic FizzBuzz exercise. It stores the numbers 
    from 1 to 100 in an ArrayList and then iterates through the list, replacing the values 
    based on FizzBuzz rules. Unlike the basic version, it maintains the data types—integers 
    remain as integers, while "Fizz", "Buzz", and "FizzBuzz" replace the corresponding numbers 
    as strings. This approach ensures the integrity of data types throughout the process while 
    achieving the desired output.
 */


import java.util.ArrayList;

public class FizzBuzz 
{
    public static void main(String[] args) 
    {
        ArrayList<Object> result = new ArrayList<>();


        for( int i=1; i<=100; i++)
        {
            result.add(i);

        }

        for(int i = 0; i<result.size(); i++)
        {
            int number = (int) result.get(i);  
            if (number % 3 == 0 && number % 5 == 0) 
            {
                result.set(i, "FizzBuzz");
            }
            else if (number % 3 == 0) 
            {
                result.set(i, "Fizz");  
            } 
            else if (number % 5 == 0) 
            {
                result.set(i, "Buzz");  
            }
        }

        for(Object item : result)
        {
            System.err.println(item);
        }
    }
    
}
