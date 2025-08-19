import java.util.HashMap;

public class Valid_anagram {
    public static boolean valid_anagram(String s, String t) {
        if (s.length() == 0 || t.length() == 0)
            return true;
        if (s.length()!=t.length())
            return false;
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            if (hm.get(t.charAt(i)) != null) {
                if (hm.get(t.charAt(i)) == 1)
                    hm.remove(t.charAt(i));
                else
                    hm.put(t.charAt(i), hm.get(t.charAt(i)) - 1);
            } else
                return false;
        }
        return hm.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(valid_anagram("race", "care"));
    }
}
