package Q8PalindromeArrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"karan", "madam", "tom",
				"civic", "radar", "jimmy", "kayak", "john", "refer", "billy", "did"};
		
		ArrayList<String> nameList = new ArrayList<String>();
		ArrayList<String> palendromeList = new ArrayList<String>();
		for(String i : names) {
			nameList.add(i);
			if(isPalendrome(i))
				palendromeList.add(i);
		}
		System.out.println(Arrays.toString(nameList.toArray()));
		System.out.println(Arrays.toString(palendromeList.toArray()));
		
	}
	
	public static boolean isPalendrome(String str) {
		int forward = 0;
		int backward = str.length() - 1;
		while(backward > forward) {
			char forwardChar = str.charAt(forward++);
			char backwardChar = str.charAt(backward--);
			if(forwardChar != backwardChar)
				return false;
		
		}
		return true;
	}

}
