public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int dif(int a, int b) {
        return a - b;
    }

    public int div(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль невозможно");
        }
        return a / b;
    }

    public int times(int a, int b) {
        return a * b;
    }

    public int solver() {
        int result = dif(11, 5);
        result = div(result, 2);
        result = times(result, add(3, 4));
        return result;
    }
}