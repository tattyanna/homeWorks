import java.util.Arrays;
import java.util.Scanner;


public class Hello {
    public static void main(String[] args) {

        //Task11();
        //Task22();
        //Task1();
       //Task2();
        //Task3();
        //Task4();
/*
        for(int i = 1; i <= 100; i++)
        {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
*/
        /*
        int[] array = new int[10];

        for(int i = 0; i<array.length;i++)
        {
            array[i] = ((int)(Math.random()*10) );
            System.out.print(array[i]+" ");
        }
        */
/*
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        int number = 1;
        System.out.print(value + "! = ");

        for(int i = 1; i <= value; i++)
        {
            number*=i;
            System.out.print(i + " * ");

        }

        System.out.println(" = " + number);
*/
        int rand = (int)(Math.random() * 100);

        do
        {
            Scanner scanner = new Scanner(System.in);
            int value = scanner.nextInt();

            if(value > rand)
            {
                System.out.println("мое число меньше");
            }
            else if(value < rand)
            {
                System.out.println("мое число больше");
            }

        } while(!rand);

        System.out.println("Победа");


    }
    public static void Task11()
    {
        // 1. Ввод числа
        // 2. Проверка на четность
        // 2.1. Нечетное - выводим  "Weird"
        // 2.2.1. 2 <= число <= 5 "Not Weird"
        // 2.2.2. 6 <= число <= 20 "Weird!"
        // 2.2.3. 20 < число "Not Weird!"



        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        if(N % 2 != 0)
        {
            System.out.println("Weird");
        }
        else
        {
            if(N >= 2 && N<=5)
            {
                System.out.println("Not Weird");
            }
           else if(N >= 6 && N<=20)
            {
                System.out.println("Weird!");
            }
           else if( N>20 )
           {
                System.out.println("Not Weird!");
            }

        }
    }
    public static void Task22()
    {
        // 1. Ввод int числа
        // 2. Ввод float числа
        // 3. Ввод строки
        // 4. Вывод int числа
        // 5. Вывод float числа
        // 6. Вывод строки

        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);
        float number= scanner1.nextFloat();

        Scanner scanner2 = new Scanner(System.in);
        String str = scanner2.nextLine();

       System.out.printf("int: %d \nfloat: %2f \nstring: %s \n", value, number,str);

        System.out.println("int: " + value);
        System.out.println("float: " + number);
        System.out.println("string: " + str);

    }
    public static void Task1()
    {
        while (true) {
            System.out.println();

            Scanner scanner = new Scanner(System.in);
            int value = scanner.nextInt();

            int a1, a2;

            a1 = value / 10;
            a2 = value % 10;

            if (a1 > a2) {
                System.out.printf("Max = %d\nMin = %d", a1, a2);
            } else if (a1 < a2) {
                System.out.printf("Max = %d\nMin = %d", a2, a1);
            } else {
                System.out.println("Max = Min = " + a1);
            }
        }

    }
    public static void Task2()
    {

        while (true) {

            Scanner scanner = new Scanner(System.in);
            int value = scanner.nextInt();

            int a1 = value / 100;
            int a2 = (value / 10) % 10;
            int a3 = value % 10;

            if (a1 == a2 || a1 == a3 || a2 == a3) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }

    }
    public static void Task3()
    {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int value = scanner.nextInt();

            int a1 = value / 10000;
            int a2 = (value / 1000) % 10;
            int a4 = (value / 10) % 10;
            int a5 = value % 10;

            if (a1 == a5 && a2 == a4) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }

        }

    }
    public static void Task4()
    {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);
        int n = scanner.nextInt();

        int value1 = 1;

        for(int i = 1; i <= n; i++)
        {
            value1 *=value;
            System.out.println(value1);
        }
        System.out.println(value1);
    }
}
