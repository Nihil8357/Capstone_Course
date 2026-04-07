
public class AnagramCheck {
    // bruteForce
    // public static boolean isAnagram(String s, String t) {
    //     if(s.length() != t.length()) return false;

    //     char[] a = s.toCharArray();
    //     char[] b = t.toCharArray();

    //     Arrays.sort(a);
    //     Arrays.sort(b);

    //     return Arrays.equals(a, b);
    // }
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] count = new int[26];

        for(int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for(int c : count) {
            if(c != 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent"));
    }
}

