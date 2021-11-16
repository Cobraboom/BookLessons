package Chapter_5;

import java.lang.constant.Constable;

public class BinarySearch
{

    private int[] mass;
    private int meaning;

    public BinarySearch(int[] mass, int meaning)
    {
        this.mass = mass;
        this.meaning = meaning;
    }

    public int Search(int[] mass, int meaning)
    {
        int low = 1,
            top = mass.length,
            mid, guess;

        while (low <= top)
        {
            mid = (low + top) / 2;
            guess = mass[mid];
            if (guess == meaning)
            {
                return mid;
            }

            if (guess < meaning) low = mid - 1;
            else top = mid + 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] mass = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int meaning = 7;

        BinarySearch bs = new BinarySearch(mass, meaning);

        System.out.println(bs.Search(mass,meaning));
    }
}
