import java.util.Arrays;

class _14 {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        String s0 = strs[0];
        String s1 = strs[strs.length - 1];

        int i = 0;
        int length = Math.min(s0.length(), s1.length());
        for (; i < length; ++i) {
            char c0 = s0.charAt(i);
            char c1 = s1.charAt(i);

            if (c0 != c1) {
                break;
            }
        }

        return s1.substring(0, i);
    }
}
