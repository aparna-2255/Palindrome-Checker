public class UseCase13PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "level";

        long startTime = System.nanoTime();
        boolean result1 = isPalindromeTwoPointer(input);
        long endTime = System.nanoTime();
        long executionTime1 = endTime - startTime;

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result1);
        System.out.println("Execution Time : " + executionTime1 + " ns");
    }

    private static boolean isPalindromeTwoPointer(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}