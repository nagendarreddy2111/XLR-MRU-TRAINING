public class LTcode007 {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newNumber = new int[digits.length + 1];
        newNumber[0] = 1; 
        return newNumber;
    }

    public static void main(String[] args) {
        LTcode007 solution = new LTcode007();
        int[] digits1 = {1, 2, 3};
        int[] result1 = solution.plusOne(digits1);
        System.out.print("Result 1: ");
        for (int num : result1) {
            System.out.print(num + " ");
        }
        System.out.println();
        int[] digits2 = {4, 3, 2, 1};
        int[] result2 = solution.plusOne(digits2);
        System.out.print("Result 2: ");
        for (int num : result2) {
            System.out.print(num + " ");
        }
        System.out.println();
        int[] digits3 = {9};
        int[] result3 = solution.plusOne(digits3);
        System.out.print("Result 3: ");
        for (int num : result3) {
            System.out.print(num + " ");
        }
        System.out.println();
}
}