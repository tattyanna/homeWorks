import java.util.Scanner;
public class Project2 {

    public static void main(String[] args)
    {
       // Поменять местами минимальный и максимальный элементы массива
       // Task1();

        //Удалить повторяющиеся элементы из массива
        //Task2();

        //Вывести элементы массива, которые больше среднего арифметического
        //Task3();

        //Определить индексы элементов массива, значение которых лежит в указанном пределе
       Task4();

    }
    public static void Task1()
    {
        //1. создаем массив
        //2. заполняем массив
        //3. находим индексы мин и макс значений в массиве
        //4. меняем их местами

        int[] arr = new int[10];
        int max = 0;
        int min = 0;

        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = ((int)(Math.random()*10) );
            System.out.print(arr[i]+" ");
        }
        for(int i = 0; i < arr.length; i++) {

            if(arr[i] > arr[max])
            {
                max = i;
            }
            if(arr[i] < arr[min])
            {
                min = i;
            }

        }
        System.out.println();

        int a = arr[min];
        arr[min] = arr[max];
        arr[max] = a;

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
    public static void Task2() {
        //1. создаем массив
        //2. заполняем массив
        //3. находим одинаковые элементы массива
        //4. удаляем их.


        int[] arr = new int[10];

        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = ((int)(Math.random()*10) );
            System.out.print(arr[i]+" ");
        }
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j <arr.length-1;j++)
            {
                if(arr[i]==arr[j])
                {
                    arr[j]=0;
                }
            }

        }

        System.out.println();

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }

    public static void Task3() {

        int[] arr = new int[10];

        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = ((int)(Math.random()*10) );
            System.out.print(arr[i]+" ");
        }

     int sum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }
        int average = sum / arr.length;

        System.out.println("\n"+average);

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] > average) {
                System.out.print(arr[i] + " ");
            }
        }


    }
    public static void Task4() {

        int[] arr = new int[20];

        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = ((int)(Math.random()*10) );
            System.out.print(arr[i]+" ");
        }

        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        System.out.println();

        for(int i = start; i < end; i++) {

            System.out.print(arr[i]+" ");
        }




    }

}
