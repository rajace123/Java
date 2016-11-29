package ArrayStringPkg;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;
import java.lang.*;
public class ArrayStringAlgo {
	 public static List<Integer> findAnagrams(String s, String p) {
		 // populate hash table for input p
		 char[] pattern= new char[256];
		 char[] text= new char[256];
		 ArrayList<Integer> list = new ArrayList<Integer>();
		 if (s==null || s.isEmpty() || p==null ||p.isEmpty() || p.length()>s.length()) return list;
		 for (int i=0;i<p.length();i++)
		 {
			 char pkey=p.charAt(i);
			 char tkey=s.charAt(i);
			 pattern[pkey]++;
			 text[tkey]++;
		 }
		 
		 for (int i=p.length();i<s.length();i++)
		 {
			 if (compareArray(pattern, text))
			 {
				 list.add(i-p.length());
				 System.out.println("Anagram found at-"+ (i - p.length()));
			 }
				 
			 
			 text[s.charAt(i)]++;
			 System.out.println("next index-"+i);
			 text[s.charAt(i-p.length())]--;
			 System.out.println("remove next index-" + (i -p.length()));
			 
		 }
		 if (compareArray(pattern, text))
		 {
			 list.add(s.length()-p.length());
			 System.out.println("Anagram found at-"+ (s.length()-p.length()));
		 }
		
		
		 
		 
		 
		 
	        return list;
	    }
	 private static boolean compareArray(char[] a,char []b)
	 {
		 //return a.equals(b);
		 
		 for (int i=0; i<a.length;i++)
		 {
			 if (a[i]!=b[i]) 
			 {
				 System.out.println(a[i] +"-Not-same as -" +b[i] +"- at index-"+ i);
				 return false;
			 }		 
		 }
		 return true;
		 
	 }
		/*
		 * 459. Repeated Substring Pattern   Add to List QuestionEditorial Solution  My Submissions
		Given a non-empty string check if it can be constructed by taking a substring of it and appending multiple copies of the substring together. You may assume the given string consists of lowercase English letters only and its length will not exceed 10000.
		
		Example 1:
		Input: "abab"
		
		Output: True
		
		Explanation: It's the substring "ab" twice.
		Example 2:
		Input: "aba"
		
		Output: False
		Example 3:
		Input: "abcabcabcabc"
		
		Output: True
		
		Explanation: It's the substring "abc" four times. (And the substring "abcabc" twice.)
		 * 
		 * */
	 public static boolean repeatSubstring(String input)
	 {
		 //find matchi string firt
		 int startPos=0; int endPos=input.length()-1;
		 int charLength=1;
		 String repeatString=null;
		 boolean loop=true;
		 //find pattern
		 boolean ignoreFirstChar=input.length()==2;
		 if ( input==null || input.length()==1) return false;
		 if (input.length()<3 && input.charAt(0)==input.charAt(1)) return true;
	
		 while (loop)
		 {
			 if (endPos<=startPos)return false;
			if (input.charAt(startPos)!=input.charAt(endPos)  )
			{
				endPos--;
				charLength++;
			}
			else
			{
				System.out.println(startPos);
				System.out.println(endPos);
				System.out.println(input.substring(startPos, charLength));
						System.out.println(input.substring(endPos));

				if (ignoreFirstChar==false && input.substring(startPos, charLength).equalsIgnoreCase(input.substring(endPos)))
				{
					//string found
					repeatString=(input.substring(startPos, charLength));
					break;
				}
				endPos--;
				charLength++;
				
			}
			ignoreFirstChar=false;
		 }
		 //check length
		 if (input.length()%charLength!=0 || repeatString==null) return false;
		 //prepare new string to compare
		 StringBuilder sb= new StringBuilder();
		 int counter=0;
		while (counter<input.length())
		 {
			 sb.append(repeatString);
			 counter=counter+charLength;
			 
		 }
		 return input.equalsIgnoreCase(sb.toString());
	 }
/*
 * 387. First Unique Character in a String   Add to List QuestionEditorial Solution 
Difficulty: Easy
Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
Examples:
s = "leetcode"
return 0.
s = "loveleetcode",
return 2.
Note: You may assume the string contain only lowercase letters.
 * */
	 public static int firstUniqueCharacter(String input)
	 {
		 /*
		  * Get the frequency of each character.
			Get the first character that has a frequency of one.
		  */
		 int[] freq=new int[26];
		 for (int i=0;i<input.length();i++)
		 {
			 freq[input.charAt(i)-'a']++;
		 }
		 for (int i=0;i<input.length();i++)
		 {
			 if (freq[input.charAt(i)-'a']==1) return i;
		 }
		 return -1;
	 }
/*
 * Product of Array Except Self   Add to List QuestionEditorial Solution  My Submissions
Given an array of n integers where n > 1, nums, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
Solve it without division and in O(n).
For example, given [1,2,3,4], return [24,12,8,6].
Follow up:
Could you solve it with constant space complexity? (Note: The output array does not count as extra space for the purpose of space complexity analysis.)
 * 
 * */
public static int[] productOfArrayExceptItself(int[]items)
{
	if (items==null || items.length==1) return items;
	
	int[] left=new int[items.length];
	int[] right=new int[items.length];
	int[] prod=new int[items.length];
	
	left[0]=1;
	right[items.length-1]=1;
	int length=items.length;
	
	for (int i=1;i<length;i++)
	{
		left[i]=left[i-1]*items[i-1];
		System.out.println("left item at-"+ i+" -"+ left[i]);
		
	}
	
	for (int j=length-2;j>=0;j--)
	{
		right[j]=right[j+1]*items[j+1];
		System.out.println("Right item at-"+ j +" -"+ right[j]);
		
	}

	for (int k=0;k<items.length;k++)
	{
		prod[k]=left[k]*right[k];
		System.out.println("Prod item at-"+ k +" -"+ prod[k]);
		
	}
	
return prod;
}
public static int[] productOfArrayExceptItselfSaveSpace(int[]items)
{
	//technique
	//in stead of three loop, initialize prod loop to 1 , use temp variable
	//
	if (items==null || items.length==1) return items;
	
	int[] prod=new int[items.length];
	int temp=1;
	
	int length=items.length;
	//Initialize prod to 1	
	for (int i=0;i<length;i++)
	{
		//initialize to 1
		prod[i]=1;
	}
	
	for (int i=0;i<length;i++)
	{
		prod[i]=temp;
		temp=temp*items[i];
		System.out.println("prod item at-"+ i +" -"+ prod[i]);
		
	}
	temp=1;
	for (int k=length-1;k>=0;k--)
	{
		prod[k]=prod[k]* temp;
		temp=items[k]*temp;
		System.out.println("Prod item at-"+ k +" -"+ prod[k]);
		
	}
	
return prod;
}
/*
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.

Stack,String
 * */
public static boolean validParentheses(String input)
{
	if (input==null || input.isEmpty())return false;
	
	//Prepare key/val of paranthesis open/close
	HashMap<Character,Character> openPrnth =new HashMap<Character, Character>();
	openPrnth.put('(', ')');
	openPrnth.put('[', ']');
	openPrnth.put('{', '}');

		//prepare hashset of all those char
		//Can be moved to isParanthesis new function 
		HashSet<Character> allPrnths= new HashSet<Character>();
		allPrnths.add('(');
		allPrnths.add(')');
		allPrnths.add('{');
		allPrnths.add('}');
		allPrnths.add('[');
		allPrnths.add(']');	
	//Stack to keep brackets sequencially 
	Stack<Character> prntsStack= new Stack<Character>();
	
	for (int charIndex=0;charIndex<input.length();charIndex++ )
	{
		char currchar=input.charAt(charIndex);
		if (openPrnth.containsKey(currchar))
		{
			prntsStack.push(openPrnth.get(currchar));
		}
		else if(allPrnths.contains(currchar))
		{
			if (prntsStack.isEmpty() || prntsStack.peek()!=currchar) return false;
			prntsStack.pop();
		}
	}	
	if (prntsStack.isEmpty())
		return true;
	
	return false;
}
	
}
