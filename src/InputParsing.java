public class InputParsing {
    private String input;
    private Num num1;
    private Num num2;
    private Sign sign;

    public InputParsing(String input) {
        this.input = input;
    }

    public String getInput() {
        return input;
    }

    public Num getNum1() {
        return num1;
    }

    public Num getNum2() {
        return num2;
    }

    public Sign getSign() {
        return sign;
    }

    public void parse() {
        String parsingInput[] = input.split(" ");
        this.num1 = numChecker(parsingInput[0]);
        this.num2 = numChecker(parsingInput[2]);
        signChecker(parsingInput[1]);

    }

    public Num numChecker(String numValue) {
        switch (numValue) {
            case "I":
                return new RomanNum(numValue);
            case "II": {
                return new RomanNum(numValue);
            }
            case "III": {
                return new RomanNum(numValue);
            }
            case "IV": {
                return new RomanNum(numValue);
            }
            case "V": {
                return new RomanNum(numValue);
            }
            case "VI": {
                return new RomanNum(numValue);
            }
            case "VII": {
                return new RomanNum(numValue);
            }
            case "VIII": {
                return new RomanNum(numValue);
            }
            case "IX": {
                return new RomanNum(numValue);
            }
            case "X": {
                return new RomanNum(numValue);
            }
            case "1":
                return new ArabicNum(numValue);
            case "2": {
                return new ArabicNum(numValue);
            }
            case "3": {
                return new ArabicNum(numValue);
            }
            case "4": {
                return new ArabicNum(numValue);
            }
            case "5": {
                return new ArabicNum(numValue);
            }
            case "6": {
                return new ArabicNum(numValue);
            }
            case "7": {
                return new ArabicNum(numValue);
            }
            case "8": {
                return new ArabicNum(numValue);
            }
            case "9": {
                return new ArabicNum(numValue);
            }
            case "10": {
                return new ArabicNum(numValue);
            }
            default: {
                throw new IllegalArgumentException("The value must be between I and X or 1 and 10 ! Your value: " + numValue);
            }

        }
    }

    public void signChecker(String signValue) {
        switch (signValue) {
            case "+":
                this.sign = new Sign(signValue);
                break;
            case "-": {
                this.sign = new Sign(signValue);
                break;
            }
            case "/": {
                this.sign = new Sign(signValue);
                break;
            }
            case "*": {
                this.sign = new Sign(signValue);
                break;
            } default: {
                throw new IllegalArgumentException("The operation must be \"+\", \"-\", \"\\\" or \"*\"! Your value: " + signValue);
            }
        }
    }
}
