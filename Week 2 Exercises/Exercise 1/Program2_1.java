import java.util.Scanner;
public class Program2_1
{
    public static void main(String[] args)
    {
    
        Scanner myObj = new Scanner(System.in);
        System.out.println("What is your mark?");
        int mark = myObj.nextInt();
        myObj.close();

        if(mark >= 0 && mark <= 39)
            System.out.println("This is a failed attempt");
            else if (mark >= 40 && mark <= 49)
            System.out.println("This is a pass");
            else if (mark >= 50 && mark <= 59)
            System.out.println("This is a 2:2");
            else if (mark >= 60 && mark <= 69)
            System.out.println("This is a 2:1");
            else if (mark >=70 && mark <= 100)
            System.out.println("This is a 1st");
            else
            System.out.println("This is an invalid mark");
    }
}