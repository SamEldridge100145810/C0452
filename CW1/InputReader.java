package CW1;
import java.util.Scanner;
import java.io.*;

/**
 * InputReader reads typed text input from the standard text terminal. 
 * The text typed by a user is returned.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2016.02.29)
 * 
 * Modified by Derek Peacock 13/12/2020
 * Modified by Nick Day 28/09/2022 - drawing from Charatan and Kans' EasyIn class
 */
public class InputReader
{
    private static Scanner reader = new Scanner(System.in);

    // for the solution provided by Charatan and Kans
    static String s = new String();
    static byte[] b = new byte[512];
    static int bytesRead = 0;

    /**
     * Read a line of text from standard input (the text terminal),
     * and return it as a String.
     *
     * @return  A String typed by the user.
     */
    public static String getString(String prompt)
    {
        String inputLine = null;
        boolean isValid = false;
        
        while(!isValid)
        {
            System.out.print(prompt);         // print prompt
            inputLine = reader.nextLine();
            
            if(!inputLine.isEmpty())
                isValid = true;
            else 
                System.out.println("\nYour input is empty!\n");
        }

        return inputLine;
    }
    public static char getChar(String prompt)
  {
     char c = ' ';
     boolean ok = false;

     while(!ok)
     {
        System.out.print(prompt); 
        try
        {
           bytesRead = System.in.read(b);
           s = new String(b,0,bytesRead-1);
           if(s.trim().length()!=1)
           {
             System.out.println("Make sure you enter a single character");
           }
           else
           {
                c = s.trim().charAt(0);
                ok = true;
           }
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
     }
     return c;
  }
    /**
     * Read a the next int from standard input (the text terminal),
     * and return it as an integer.
     * 
     * Solution template provided by Charatan and Kans - modified by N Day September 2022
     * 
     * @return Integer typed by user.
     */
    public static int getInt(String prompt)
    {
        int number = 0;
        boolean isValid = false;

        while(!isValid)
        {
            System.out.print(prompt);         // print prompt

            try
            {
                //trim the input to remove extraneous characters
                bytesRead = System.in.read(b);
                s = new String(b,0,bytesRead-1);
                number = Integer.parseInt(s.trim());
                isValid = true;
            }
            catch(NumberFormatException e)
            {
                System.out.println("That is not a valid integer number!");
            }
            catch(IOException e)
            {
                System.out.println(e.getMessage());
            }
        }
        return number;
    }

    /**
     * Read a the next int from standard input (the text terminal),
     * and return it as an integer.
     * 
     * Solution template provided by Charatan and Kans - modified by N Day September 2022
     * 
     * @return Integer typed by user.
     */
    public static double getDouble(String prompt)
    {
        double number = 0;
        boolean isValid = false;

        while(!isValid)
        {
            System.out.print(prompt);         // print prompt
            
            try
            {
                //trim the input to remove extraneous characters
                bytesRead = System.in.read(b);
                s = new String(b,0,bytesRead-1);
                number = (Double.valueOf(s.trim())).doubleValue();
                isValid = true;
            }
            catch(NumberFormatException e)
            {
                System.out.println("That is not a valid double number!");
            }
            catch(IOException e)
            {
                System.out.println(e.getMessage());
            }
        }
        return number;
    }

}

