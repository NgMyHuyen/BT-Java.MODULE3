package session17.Exception;

public class MainTest {
    public static boolean isPrime(int number) throws CheckedException {
        if (number < 0) {
            throw new CheckedException("Không phải là số nguyên tố");
        }
        if (number < 2) {
            throw new UncheckException("Số nhỏ hơn 2 không phải là số nguyên tố");
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, 9, 17};

        for (int number : arr) {
            try {
                boolean result = isPrime(number);
                System.out.println(number + " là số nguyên tố: " + result);
            } catch (CheckedException e) {
                System.out.println("Lỗi: " + e.getMessage());
            } catch (UncheckException e) {
                e.printStackTrace();
            }
        }
    }
}