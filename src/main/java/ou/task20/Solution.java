package ou.task20;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 == 1)
            return false;
        Deque<Character> characters = new LinkedList<>();
        Set<Character> openChars = new HashSet<>();
        Set<Character> closeChars = new HashSet<>();

        openChars.add('[');
        openChars.add('{');
        openChars.add('(');

        closeChars.add(']');
        closeChars.add('}');
        closeChars.add(')');

        for (Character c : s.toCharArray())
        {
            if (openChars.contains(c))
                characters.add(c);
            else if (characters.isEmpty() ||
                    !closeChars.contains(c) ||
                    !canRemove(characters.removeLast(), c)) {
                return false;
            }
        }
        return characters.isEmpty();
    }

    public boolean canRemove(Character c1, Character c2) {
        return (c1 == '[' && c2 == ']') ||
                (c1 == '{' && c2 == '}') ||
                (c1 == '(' && c2 == ')');
    }
}
