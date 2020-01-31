public class Calculator {

    static int add(int firstNum, int secondNum) {
        int result;
        result = firstNum + secondNum;
        return result;
    }

    static int sub(int firstNum, int secondNum) {
        int result;
        result = firstNum - secondNum;
        return result;
    }

    static int multiply(int firstNum, int secondNum) {
        int result;
        result = firstNum * secondNum;
        return result;
    }

    static int divide(int firstNum, int secondNum) {
        int result;
        result = firstNum / secondNum;
        return result;
    }

    public static void main(String[] args) {
        System.out.println("the result is " + add(10, 50));
        System.out.println("the result is " + sub(10, 50));
    }
}
