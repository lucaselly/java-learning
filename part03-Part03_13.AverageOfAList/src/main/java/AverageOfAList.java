
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        

        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
            sum = sum + input;
        }
        
        double average = 1.0 * sum / list.size();
        System.out.println("Average: " + average);
        
    }
}
