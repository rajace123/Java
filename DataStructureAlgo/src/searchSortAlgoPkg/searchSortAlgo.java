package searchSortAlgoPkg;

import java.util.LinkedList;
import java.util.Set;

public class searchSortAlgo {
	/*
	 * 240. Search a 2D Matrix II   Add to List QuestionEditorial Solution  My Submissions
Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
Integers in each row are sorted in ascending from left to right.
Integers in each column are sorted in ascending from top to bottom.
For example,
Consider the following matrix:

[
  [1,   4,  7, 11, 15],
  [2,   5,  8, 12, 19],
  [3,   6,  9, 16, 22],
  [10, 13, 14, 17, 24],
  [18, 21, 23, 26, 30]
]
Given target = 5, return true.
Given target = 20, return false.
	 * */
	public static boolean searchMatrix(int[][] matrix, int target) {
        //find nearest column and row
		//search those row and column
		if (matrix==null|| matrix.length<1) return false;
		int startIndex=0; int endIndex=(matrix.length*matrix[0].length)-1;
		if ((endIndex-startIndex)==0) return matrix[startIndex][endIndex]==target;
		while (endIndex-startIndex>=0)
		{
			int midIndex=startIndex+(endIndex-startIndex)/2;
			System.out.println("Start-"+ startIndex +" EndIndex-"+ endIndex+" midIndex-"+midIndex);
			int curValue= getElement(matrix, midIndex);
			System.out.println("Current Value-"+curValue);
			
			
			if (curValue==target) return true;
			if (curValue<target)
			{
				startIndex=midIndex+1;
			}
			else
			{
				endIndex=midIndex-1;
			}
			
		}
		return false;
		
		
    }
	
	public static int getElement(int[][] matrix, int midIndex)
	{
		//base case to exit
		//######################
		int row=midIndex/matrix[0].length;
		int col=midIndex%matrix[0].length;
		
		return matrix[row][col];
		
	}
	
		 
	public static String longestPalindromeSimple(String s) {
	if (s==null) return null;
	if (s.length()==1) return s;
	
	String longest=s.substring(0, 1);
	int n=s.length();
	
	for (int i=0 ;i<n;i++)
	{
		System.out.println("Start around index"+i );
		String subStr=expandAroundCenter(s, i, i);
		if (subStr.length()>longest.length())
			longest=subStr;
		System.out.println("Now check around index-"+i +" and one ahead-"+ (i+1));
		subStr=expandAroundCenter(s, i, i+1);
		if (subStr.length()>longest.length())
			longest=subStr;
		
	}
	return longest;
	
	}
	public static String expandAroundCenter(String s, int c1, int c2) {
		int l=c1;int r=c2;
		while (l>=0&&r<=s.length()-1&& s.charAt(l)==s.charAt(r))
		{
			System.out.println("Character matched till left-"+l+" right-"+r);
			l--;
			r++;
		}
		System.out.println("Returning character from left -"+(l+1)+" right-"+ (r-1));
		
		return s.substring(l+1, r);
	}
/*
 * Given two words (beginWord and endWord), and a dictionary's word list, find the length of shortest transformation sequence from beginWord to endWord, such that:
Only one letter can be changed at a time
Each intermediate word must exist in the word list
For example,

Given:
beginWord = "hit"
endWord = "cog"
wordList = ["hot","dot","dog","lot","log"]
As one shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog",
return its length 5.

Note:
Return 0 if there is no such transformation sequence.
All words have the same length.
All words contain only lowercase alphabetic characters.
 * 
 * */
	  public static int ladderLength(String beginWord, String endWord, Set<String> wordList) {
	      if (beginWord==null || endWord==null || wordList==null || wordList.size()<1 ) return 0;
		  LinkedList<WordSearch> queue=new LinkedList<WordSearch>();
	      queue.add(new WordSearch(beginWord,1));
	      wordList.add(endWord);
	      
	      while(!queue.isEmpty())
	      {
	    	  WordSearch currWord=queue.pop();
	    	  if (currWord.word.equals(endWord))
	    		  return currWord.counter;
	    	  //create all possible combination for begin word and must exist in Set
	    	  char[]chars= currWord.word.toCharArray();
	    	char temp;
	    	  for (int i=0; i<chars.length;i++)
	    	 {
	    	  for (char c='a';c<='z';c++)
	    	  {
	    		  temp=chars[i];
	    		  if (temp!=c)
	    		  {
	    			  chars[i]=c;
	    			  String newWord= new String(chars);
	    			  if (wordList.contains(newWord))
	    			  {
	    				  System.out.println("Found-"+newWord);
	    				  queue.add(new WordSearch(newWord, currWord.counter+1));
	    				  wordList.remove(newWord);
	    			  }
	    		  }
	    		  chars[i]=temp;
	    		
	    		  
	    	  }
	    	 }
	    	  
	      }
	      
		  
		  
		  return 0;
	    }
}
