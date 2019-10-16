public class RomanNum extends Num {
    public RomanNum(String value) {
        super(value);
        switch (this.value) {
            case "I": {
                this.intValue = 1;
                break;
            }
            case "II": {
                this.intValue = 2;
                break;
            }
            case "III": {
                this.intValue = 3;
                break;
            }
            case "IV": {
                this.intValue = 4;
                break;
            }
            case "V": {
                this.intValue = 5;
                break;
            }
            case "VI": {
                this.intValue = 6;
                break;
            }
            case "VII": {
                this.intValue = 7;
                break;
            }
            case "VIII": {
                this.intValue = 8;
                break;
            }
            case "IX": {
                this.intValue = 9;
                break;
            }
            case "X": {
                this.intValue = 10;
                break;
            }
        }
    }

    public RomanNum(Integer intValue) {
        super(intValue);
        converArabicToRoman();

    }

    public void converArabicToRoman() {
        int tempInt = this.intValue;
        String result = "";
        Integer[] a = {100, 50, 10, 5, 1};
        String[] r = {"C", "L", "X", "V", "I"};
        String prevNum = "";
        for (int i = 0; i < r.length; i++) {
            String currentNum = r[i];
            Integer currentInt = a[i];
            int count = this.intValue / currentInt;
            if (i < r.length - 2 && count == 0 && this.intValue / a[i + 1] == 1 && this.intValue / a[i + 2] == 9) {
                result += r[i + 2] + currentNum;
                this.intValue %= (currentInt - a[i + 2]);
                currentNum = r[i+2];
            } else if (i <= r.length - 2 && count == 1 && this.intValue / a[i + 1] == 9)  {
                result += r[i+1] + prevNum;
                this.intValue %= (a[i-1] - a[i+1]);
                currentNum = r[i+1];
            } else {
                this.intValue %= currentInt;
                if (count == 4) {
                    result += currentNum + prevNum;
                } else {
                    for (int j = 0; j < count; j++) {
                        result += currentNum;
                    }
                }
            }
            prevNum = currentNum;
        }
        this.value =result;
        this.intValue = tempInt;
    }
}
