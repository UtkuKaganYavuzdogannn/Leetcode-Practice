package com.utku;

public class isPolindrome {



    public boolean isPalindrome(int x) {
        String num = String.valueOf(x);

        StringBuilder newNum = new StringBuilder(num);

        if (num.equals(newNum.reverse().toString())) {
            return true;
        }

        return false;
    }



    public static void main(String[] args) {
        isPolindrome solution = new isPolindrome();

        int x = 121;

        int y= -121 ;

        int z = 233;


        boolean resultX = solution.isPalindrome(x);
        boolean resultY = solution.isPalindrome(y);
        boolean resultZ= solution.isPalindrome(z);

        System.out.println("Result x:" + resultX + "// Result y:" + resultY + "// ResultZ:" + resultZ);
    }


}
 /*Given an integer x, return true if x is a palindrome, and false otherwise.



Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome. */