package com.interview.leetcode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UniqueSubstringInWrapAround {

	public static void main(String[] args) {
		System.out.println("---------------Test Case 1---------------");
		String p = "aca";
		int len = findSubstringInWraproundString(p);
		System.out.println("\nsNumber of Unique Substring in Wrap Around String For String "+p+" is "+len);
		System.out.println();
		
		System.out.println("---------------Test Case 2---------------");
		p = "zab";
		len = findSubstringInWraproundString(p);
		System.out.println("\nNumber of Unique Substring in Wrap Around String For String "+p+" is "+len);
		System.out.println();
		
		System.out.println("---------------Test Case 3---------------");
		p = "zabce";
		len = findSubstringInWraproundString(p);
		System.out.println("\nNumber of Unique Substring in Wrap Around String For String "+p+" is "+len);
		System.out.println();
		
		System.out.println("---------------Test Case 3---------------");
		p = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
		len = findSubstringInWraproundString(p);
		System.out.println("\nNumber of Unique Substring in Wrap Around String For is "+len);
		System.out.println();

	}
	
	public static int findSubstringInWraproundString2(String p) {
		String s = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
		Set<String> set = new HashSet<String>();
		int subStr = 1;
		while (subStr <= p.length()) {
			for (int j = 0; j <= p.length()-subStr; j++) {
				String str = p.substring(j, subStr+j);
				if(s.contains(str))
					set.add(str);
			}
			subStr++;
		}

		System.out.println("SubStrings :");
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
		return set.size();
	}
	
	
	public static int findSubstringInWraproundString(String p) {
        if (p == null || p.length() == 0) return 0;
        int[] dp = new int[p.length()]; // length of substring ended at each position in p
        int[] count = new int[26]; // Longest length of substring ened at every char
        int res = 0;
        for (int i = 0; i < p.length(); i++) {
            if (i >= 1 && (p.charAt(i) == 'a' && p.charAt(i - 1) == 'z' || ((int) p.charAt(i)) == ((int) p.charAt(i - 1) + 1))) {
                dp[i] = dp[i - 1] + 1;
            } else {
                dp[i] = 1;
            }
            
            // Eleminates duplicates, we only need to add newly extra length
            if (dp[i] > count[p.charAt(i) - 'a']) {
                res += dp[i] - count[p.charAt(i) - 'a'];
                count[p.charAt(i) - 'a'] = dp[i];
            }
        }
        return res;
    }

}
/*
 * 
 * ---------------Test Case 1---------------

sNumber of Unique Substring in Wrap Around String For String aca is 2

---------------Test Case 2---------------

Number of Unique Substring in Wrap Around String For String zab is 6

---------------Test Case 3---------------

Number of Unique Substring in Wrap Around String For String zabce is 11

---------------Test Case 3---------------

Number of Unique Substring in Wrap Around String For is 33475


 */
 