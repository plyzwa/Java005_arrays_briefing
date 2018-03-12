import java.util.Scanner;

public class Main {


    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        for (int i=0;i<myIntegers.length;i++) {
            System.out.println("Value of "+i+" is "+myIntegers[i]);
        }
        System.out.println("The average of array is: " + getAverege(myIntegers) );
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\n");
        int[] values = new int[number];

        for (int i=0;i<values.length;i++) {
            values[i] = scan.nextInt();
        }
        return values;
    }
    public static double getAverege(int[] array ) {
        int sum=0;
        for (int i=0;i<array.length;i++) {
            sum+=array[i];
        }
        return (double) sum/(array.length);
    }
}
