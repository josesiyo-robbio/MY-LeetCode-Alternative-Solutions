/*
    Write a function to find the longest common prefix string amongst an array of strings.
    If there is no common prefix, return an empty string "".
 */



package leet;

public class LongestCommonPrefix 
{
    public static void main(String[] args) 
    {
        String[] words = {"flower", "flow", "flight"};
        // String[] words  = {"gdfgd", "fltow", "t"};

        int minLength = Integer.MAX_VALUE;


        for (String word : words) 
        {
            minLength = Math.min(minLength, word.length());
        }

        StringBuilder commonPrefix = new StringBuilder();

        for (int i = 0; i < minLength; i++) 
        {
            char currentChar = words[0].charAt(i);

            for (int j = 1; j < words.length; j++) 
            {
                if (words[j].charAt(i) != currentChar) 
                {
                    if (commonPrefix.length() == 0) 
                    {
                        System.out.println("\"\"");
                    } 
                    else 
                    {
                        System.out.println(commonPrefix.toString());
                    }
                    return;
                }
            }
            commonPrefix.append(currentChar);
        }

        if (commonPrefix.length() == 0) 
        {
            System.out.println("\"\"");
        } 
        else 
        {
            System.out.println(commonPrefix.toString());
        }
    }
}
