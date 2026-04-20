package com.pluralsight;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        try
        {
            String[] quotes =
                    {
                    "The only way to do great work is to love what you do.",
                    "Success is not final, failure is not fatal: it is the courage to continue that counts.",
                    "In the middle of every difficulty lies opportunity.",
                    "Do what you can, with what you have, where you are.",
                    "It always seems impossible until it's done.",
                    "Happiness depends upon ourselves.",
                    "Believe you can and you're halfway there.",
                    "Dream big and dare to fail.",
                    "What we think, we become.",
                    "Act as if what you do makes a difference. It does."
                    };

            Scanner myScanner = new Scanner(System.in);
            System.out.println("Select a number between 1-10: ");
            int index = Integer.parseInt(myScanner.nextLine());

            System.out.println(quotes[index-1]);

        } catch (NumberFormatException e)
        {
            System.out.println("Choose an integer from 1-10");
        }catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("OUT OF BOUNDS");
        }


    }
}
