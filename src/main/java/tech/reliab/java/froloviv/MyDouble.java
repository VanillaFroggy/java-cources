package tech.reliab.java.froloviv;

public class MyDouble {
    private double value;

    public MyDouble() {
        this.value = 0.0;
    }

    public MyDouble(double value) {
        this.value = value;
    }

    public MyDouble(String value) {
        try {
            char[] chArr = value.toCharArray();
            int count = 0;
            for (int i = 0; i < chArr.length; i++) {
                if (chArr[i] == '.') {
                    count = i;
                    break;
                } else if (i == chArr.length - 1) {
                    throw new NumberFormatException(value + " isn't a number.");
                }
            }
            this.value = 0.0;
            for (int i = 0; i < chArr.length; i++) {
                if (i < count) {
                    int temp = 1;
                    for (int j = 0; j < count - i - 1; j++)
                        temp *= 10;
                    this.value += temp * (chArr[i] - '0');
                } else if (i > count) {
                    double temp = 1;
                    for (int j = 0; j < i - count; j++)
                        temp *= 0.1;
                    this.value += temp * (chArr[i] - '0');
                }
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public boolean equals(MyDouble other) {
        return this.value == other.value;
    }

    public void add(MyDouble other) {
        value += other.getValue();
    }

    public void reduce(MyDouble other) {
        value -= other.getValue();
    }

    public void multiple(MyDouble other) {
        value *= other.getValue();
    }

    public void divide(MyDouble other) {
        value /= other.getValue();
    }

    public void pow(int exponent) {
        for (int i = 0; i < exponent; i++)
            value *= value;
    }

    public String toHexString() {
        int intPart = (int) value;
        double fractionalPart = value - intPart;
        String digits = "0123456789ABCDEF";
        String hex = "";
        hex += getByRegex(intPart, 16, digits);
        hex += '.';
        while ((int) fractionalPart / 100 == 0) {
            fractionalPart *= 16;
        }
        hex += getByRegex((int) fractionalPart, 16, digits);
        return hex;
    }

    public String toOctalString() {
        int intPart = (int) value;
        double fractionalPart = value - intPart;
        String digits = "01234567";
        String hex = "";
        hex += getByRegex(intPart, 8, digits);
        hex += '.';
        while ((int) fractionalPart / 100 == 0) {
            fractionalPart *= 8;
        }
        hex += getByRegex((int) fractionalPart, 8, digits);
        return hex;
    }

    protected String getByRegex(int num, int base, String digits) {
        String result = "";
        char[] arr = new char[256];
        int i = 0;
        while (num > 0) {
            int digit = num % base;              // rightmost digit
            arr[i] = digits.charAt(digit);  // string concatenation
            num /= base;
            i++;
        }
        for (int j = i - 1; j >= 0; j--)
            result += arr[j];
        return result;
    }
}
