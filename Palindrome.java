/* THIS CODE IS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING A 
 * TUTOR OR CODE WRITTEN BY OTHER STUDENTS. Milap Naik */

import java.util.Scanner;

public class Palindrome
{
	public static boolean isPalindrome(String word)
	{
		if ( word.length() == 1 || word.length() == 0) /* The base cases */
			return true;     
      
        if (word.charAt(0) == word.charAt(word.length()-1)) 
        	return isPalindrome(word.substring(1, word.length()-1));
              
        return false; 
	}
      
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word to test: ");
    	String word = input.nextLine();
    
    	if(isPalindrome(word))
    		System.out.println("It is a palindrome!");
    	else    
    		System.out.println("It's not a palindrome, loser!");
      
    	input.close(); /*Close leak*/
	}
}
    