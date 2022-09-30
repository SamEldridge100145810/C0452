import java.util.*;
import java.util.Scanner;

public class Program

{
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        String name;

        System.out.println("What is your name?");
        name = myObj.nextLine();
        System.out.println("Hello " + name);
        myObj.close();
    }
}
