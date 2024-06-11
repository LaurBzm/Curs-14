package org.example;

import java.lang.*;
import java.util.Scanner;


public class Repository
{



        public static int recurSum(int n)
        {
            if (n <= 1)
                return n;
            return n + recurSum(n - 1);
        }


        public static void main(String args[])
        {
            int n = 5;
            System.out.println(recurSum(n));
        }
    }


class Even {


    public static void main(String[] args)
    {
        int n = 8;
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 1; i <= 2 * n; i++) {

            if ((i & 1) == 0)
                evenSum += i;
            else
                oddSum += i;
        }

        System.out.println("Suma " + n
                + " Even  = " + evenSum);


        System.out.println("Suma " + n
                + " Odd  = " + oddSum);
    }
}

class Palindrome
{

    static boolean isPalRec(String str,
                            int s, int e)
    {

        if (s == e)
            return true;


        if ((str.charAt(s)) != (str.charAt(e)))
            return false;


        if (s < e + 1)
            return isPalRec(str, s + 1, e - 1);

        return true;
    }

    static boolean isPalindrome(String str)
    {
        int n = str.length();


        if (n == 0)
            return true;

        return isPalRec(str, 0, n - 1);
    }


    public static void main(String args[])
    {
        String str = "laur";

        if (isPalindrome(str))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}



class MainRecursivity
{
    public static int sum_of_digit(int num)
    {
        if (num == 0)
            return 0;
        return (num % 10 + sum_of_digit(num / 10));
    }

    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introducere numar: ");
        int num=sc.nextInt();
        int res=sum_of_digit(num);
        System.out.println("Suma digit este: "+res);
    }
}
class Fibonacci {
    static int fib(int n)
    {
        if (n==0)
            return 0;
        else if(n==1 || n==2)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String args[])
    {
        int n = 9;
        System.out.println(fib(n));
    }
}