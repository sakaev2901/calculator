
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        InputParsing inputParsing = new InputParsing(input);
        inputParsing.parse();
        Calculator calculator = new Calculator(inputParsing.getNum1(), inputParsing.getNum2(),inputParsing.getSign());
        System.out.println(calculator.calculate().getValue());

    }
}
