import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class _20 {
    private static final Map<Character, Character> M = new HashMap<>();

    static {
        M.put('[', ']');
        M.put('(', ')');
        M.put('{', '}');
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (M.containsKey(c)) {
                stack.push(M.get(c));
            } else if (stack.isEmpty()
                    || c != stack.pop()) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
