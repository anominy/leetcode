class _9 {
    public boolean isPalindrome(int x) {
        int result = 0;
        int temp = x;

        while (temp > 0) {
            result *= 10;
            result += temp % 10;
            temp /= 10;
        }

        return result == x;
    }
}
