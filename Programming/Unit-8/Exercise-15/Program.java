import collections.ArrayInt;

public class Program
{
    public static void main(String[] args)
    {
        ArrayInt array = new ArrayInt(10);
        array.fill();

        System.out.println("Unsorted:");
        System.out.println(array);

        array.sort();

        System.out.println("Sorted:");
        System.out.println(array);
    }
}