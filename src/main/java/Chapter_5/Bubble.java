package Chapter_5;
/*
    Упражнение 5.1 Сортировка массива
 */

import java.util.Random;
import java.util.Scanner;

public class Bubble
{
    public static void main(String[] args)
    {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int quantityMeaningsMass;
        int numsMenu;

        System.out.println("\nВыберите варриант заполнения массива:\n");
        System.out.println("1. Ввести количество элементов массива и заполнить их рандомно.");
        System.out.println("2. Задать значения элементов массива через пробел.");

        numsMenu = scanner.nextInt();

        switch (numsMenu)
        {
            case 1:
            {

                System.out.print("\nВведите колличество элементов массива: ");
                quantityMeaningsMass = scanner.nextInt();
                System.out.println();

                System.out.println("Желаете задать диапазон?\n1.Да\n2.Нет");
                numsMenu = scanner.nextInt();
                switch (numsMenu)
                {
                    case 1:
                    {
                        int[] nums = new int[quantityMeaningsMass];

                        System.out.print("\nВедите значение начала диапазона: ");
                        int low, high;
                        low = scanner.nextInt();
                        System.out.print("\nВведите конец диапазона: ");
                        high = scanner.nextInt();

                        System.out.print("\nИсходный массив: ");
                        for (int i = 0; i < nums.length; i++)
                        {
                            nums[i] = (int) ((Math.random() * (high - low)) + low);
                            System.out.print(nums[i] + " ");
                        }

                        int t;
                        for (int i = 1; i < nums.length; i++)
                        {
                            for (int b = nums.length - 1; b >= i; b--)
                            {
                                if (nums[b-1] > nums[b])
                                {
                                    t = nums[b-1];
                                    nums[b-1] = nums[b];
                                    nums[b] = t;
                                }
                            }
                        }

                        System.out.print("\nОтсортированный массив: ");
                        for (int a: nums)
                        {
                            System.out.print(a + " ");
                        }
                        break;
                    }

                    case 2:
                    {
                        int nums[] = new int[quantityMeaningsMass];

                        System.out.print("\nИсходный массив: ");
                        for (int i = 0; i < nums.length; i++)
                        {
                            nums[i] = random.nextInt(random.nextInt(10 * random.nextInt(200)));
                            System.out.print(nums[i] + " ");
                        }

                        int t;

                        for (int i = 1; i < nums.length; i++)
                        {
                            for (int b = nums.length - 1; b >= i; b--)
                            {
                                if (nums[b-1] > nums[b])
                                {
                                    t = nums[b-1];
                                    nums[b-1] = nums[b];
                                    nums[b] = t;
                                }
                            }
                        }

                        System.out.print("\nОтсортированный массив: ");
                        for (int a: nums)
                        {
                            System.out.print(a + " ");
                        }
                        break;
                    }
                }

            }
        }
    }
}
