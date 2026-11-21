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
        int result = times(63, 2);
        result = add(result, 18);
        result = div(result, div(result, 8));
        return result;
    }
}