
import java.util.Scanner;

public class Ascii {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String textPart = in.nextLine();
        String binaryPart = "";
        for (char car : textPart.toCharArray()) {
            String binaryString = Integer.toBinaryString(car);
            while (binaryString.length() < 7) {
                binaryString = "0" + binaryString;
            }
            binaryPart += binaryString;
        }

        char lastChar = '2';
       
        for (char car : binaryPart.toCharArray()) {
            if (car == lastChar) {
                System.out.print("0");
            } else {
                if (lastChar != '2') {
                    System.out.print(" ");
                }
                lastChar = car;
                if (lastChar == '0') {
                    System.out.print("0");
                }
                System.out.print("0 0");
            }
        }
    }
}
