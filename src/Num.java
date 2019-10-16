public class Num extends CalculatorButton {
    protected Integer intValue;

    public Num(String value) {
        super(value);
    }

    public Num(Integer intValue) {
        this.intValue = intValue;
    }

    public Integer getIntValue() {
        return intValue;
    }

    public void setIntValue(Integer intValue) {
        this.intValue = intValue;
    }
}
