public class Calculator {
    private Num num1;
    private Num num2;
    private Sign sign;
    private Integer result;

    public Calculator(Num num1, Num num2, Sign sign) {
        this.num1 = num1;
        this.num2 = num2;
        this.sign = sign;
        this.result = null;
    }

    public Num calculate() {
        Num result = null;
        if (num1.getClass().equals(num2.getClass())) {
            if (num1 instanceof RomanNum) {
                result = new RomanNum(operate());
            } else {
                result = new ArabicNum(operate());
            }
        } else {
            throw new IllegalArgumentException("The types of nums are not the same!");
        }
        return result;
    }

    public Integer operate() {
        Integer result = null;
        switch (this.sign.getValue()) {
            case "+": {
                return result = this.num1.getIntValue() + this.num2.getIntValue();
            }
            case "-": {
                return result = this.num1.getIntValue() - this.num2.getIntValue();
            }
            case "/": {
                return result = this.num1.getIntValue() / this.num2.getIntValue();
            }
            case "*": {
                return result = this.num1.getIntValue() * this.num2.getIntValue();
            } default: {
                throw new RuntimeException("Some problems with app");
            }
        }

    }
}
