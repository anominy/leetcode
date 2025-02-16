import java.util.HashMap;
import java.util.Map;

class _13 {
    private static final Map<Character, Integer> M = new HashMap<>();

    static {
        M.put('I', 1);
        M.put('V', 5);
        M.put('X', 10);
        M.put('L', 50);
        M.put('C', 100);
        M.put('D', 500);
        M.put('M', 1000);
    }

    public int romanToInt(String s) {
        int result = 0;
        for (int i = s.length() - 1; i >= 0; --i) {
            int n = M.get(s.charAt(i));

            if (4 * n < result) {
                result -= n;
            } else {
                result += n;
            }
        }
        return result;
    }
}
