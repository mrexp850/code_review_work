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

    public int solver1() {
        int result = times(63, 2);
        result = add(result, 18);
        result = div(result, div(result, 8));
        return result;
    }
  
    public int solver2() {
        int result = add(10, 5);
        result = times(result, 2);
        result = dif(result, div(8, 4));
        return result;
    }
    public int solver3() {
        int result = dif(11, 5);
        result = div(result, 2);
        result = times(result, add(3, 4));
        return result;
    }
}