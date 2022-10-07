import java.util.Scanner;
//This does not work whilst under the Week 1 exercises. Programs are seperated into different folders so it shouldn't even be picking up other files and thinking
//That this has some large higher purpose in life. It doesn't. It just does math. That's it. Why doesn't it work there. Too bad!
public class Program3

{
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        //This uses the Scanner method of inputting data because InputReader seems to have vanished from VSC now
        System.out.println("What is the height of the rectangle?");
        Double Height = myObj.nextDouble();
        //This section gets the height of the rectangle from the user and stores it
        System.out.println("What is the width of the rectangle?");
        Double Width = myObj.nextDouble();
        //This section gets the width of the rectangle and stores it into a variable called Width
        Double perimeter = (Height + Width) + (Height + Width); //This calculates the Perimeter. Calculated in brackets for neatness.
        Double area = Height * Width;
        System.out.println("The perimeter of the rectangle is: " + perimeter);
        System.out.println("The area of the rectangle is: " + area);
        myObj.close();
        //Closes the scanner
    }
}
