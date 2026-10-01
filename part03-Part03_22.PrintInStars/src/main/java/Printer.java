
public class Printer {

    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        int i = 0;
        while (i < array.length) {
            int stars = array[i];
            int istars = 0;
            while (istars < stars) {
                System.out.print("*");
                istars++;
            }
            i++;
            System.out.println("");
        }
    }
}
