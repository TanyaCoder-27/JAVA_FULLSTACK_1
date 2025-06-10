//  Find all distinct characters in a string

import java.util.*;
class DistinctChars{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string:");
		String str =sc.nextLine();
		

		HashSet<Character> hs = new HashSet<>();
		char[] charr = str.toCharArray();
		
		for(int i=0;i<charr.length;i++){

			hs.add(charr[i]);


		}

		System.out.println(hs);
	}
}


/*
Enter string:
That Elephant is cute
[ , a, c, E, e, h, i, l, n, p, s, T, t, u]

*/