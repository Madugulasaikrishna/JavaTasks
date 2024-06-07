public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(9));
    }

    public static boolean isPowerOfTwo(int number) {
        if (number <= 0) {
            return false;
        }
        while (number > 1) {
            if (number % 2 != 0) {
                return false;
            }
            number = number / 2;
        }
        return true;
    }
}
