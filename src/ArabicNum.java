public class ArabicNum extends Num {
    public ArabicNum(String value) {
        super(value);
        this.intValue = Integer.parseInt(this.value);
        if (this.intValue < 1 || this.intValue > 10) {
            throw new IllegalArgumentException("The value must be between 1 and 10! Your value: " + this.value);
        }
    }

    public ArabicNum(Integer intValue) {
        super(intValue);
        this.value = String.valueOf(intValue);
    }
}
