import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class ApacheTesting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Something: ");
        String userInput = input.nextLine();

        if(StringUtils.isNumeric(userInput))
            System.out.println("Input is numeric");
        else
            System.out.println("Input is not numeric");

        System.out.println("Here is the case of your input reversed: " + StringUtils.swapCase(userInput));
        System.out.println("Uh oh, we accidentally reversed your input: " + StringUtils.reverse(userInput));

    }
}
