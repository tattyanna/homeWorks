import java.util.Arrays;
import java.util.Scanner;

public class Project1
{
    public static void main(String[] args)
    {
        //RightTriangle();
        //Square();
        //Task4();
        EquilateralTriangle();

    }
    public static void RightTriangle()
    {
        System.out.print("Height = ");
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();

        for(int i = 0; i <height ; i++) {
            for(int j = height-i; j<=height; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void Square()
    {
        System.out.print("Height = ");
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();

        for(int i = 0; i<height;i++)
        {
            for(int j = 0; j<height;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Task4() {
        System.out.print("A = ");
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();

        System.out.print("B = ");
        Scanner scn = new Scanner(System.in);
        int B = scanner.nextInt();

        for(int i = A; i <= B; i++)
        {
            System.out.print(i +" * " + i + " = ");
            System.out.println(i * i);
        }

    }
    public static void EquilateralTriangle() {

        System.out.print("Height = ");
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();

        for (int i = 0; i < height; i++)
        {

            for (int j = 1; j <= height - i; j++)
                System.out.print(" ");

            for (int j = height - 2 * i; j <= height; j++)
                System.out.print("*");
            System.out.println();
        }


    }

}
