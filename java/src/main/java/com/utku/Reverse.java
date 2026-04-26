package com.utku;

public class Reverse {

    /**
     * Verilen int değerini tersine çevirir.
     * Eğer ters çevrilmiş hali int sınırlarını aşarsa 0 döndürür.
     */

    public int reverse(int x) {
        long reversed = 0;
        while (x != 0) {
            reversed = (reversed * 10) + (x % 10);
            x = x / 10;

            // Java int sınırları kontrolü (Overflow/Underflow)
            if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
                return 0;
            }
        }

        return (int) reversed;
    }

    public static void main(String[] args) {

        Reverse solution = new Reverse();

        int test1 = 123;
        int test2 = -123;
        int test3 = 120;
        int test4 = 1534236469;

        int result1 = solution.reverse(test1);
        int result2 = solution.reverse(test2);
        int result3 = solution.reverse(test3);
        int result4 = solution.reverse(test4);


        System.out.println("Girdi: " + test1 + "  Sonuç: " + result1);
        System.out.println("Girdi: " + test2 + "  Sonuç: " + result2);
        System.out.println("Girdi: " + test3 + "  Sonuç: " + result3);
        System.out.println("Girdi: " + test4 + "  Sonuç: " + result4 + " (Sınır aşıldığı için 0)");
    }
}