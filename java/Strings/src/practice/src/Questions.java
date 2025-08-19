package practice.src;

import java.util.HashSet;

public class Questions {
    public static  String compressor(String s){
//        String ans = "";
//
//        for (int i = 0; i < s.length(); i++) {
//            Integer count = 1;
//            while(i<s.length()-1 && s.charAt(i) == s.charAt(i+1)){
//                count++;
//                i++;
//            }
//            ans += s.charAt(i);
//            if(count > 1)
//                ans += count.toString();
//        }
//        return ans;

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            Integer count = 1;
            while(i<s.length()-1 && s.charAt(i) == s.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(s.charAt(i));
            if(count >1){
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }
    public static int count_lowercase_vowels(String s){
        int count =0;
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i) == 'a' ||s.charAt(i) == 'e' || s.charAt(i) == 'i' ||s.charAt(i) == 'o' ||s.charAt(i) == 'u')
                count++;
        }
        return count;
    }
    public static void q3(){
        String s = "abhiraj";
        String s2 ="abhiraj";
        String s3 = "abhi";
//        System.out.println(s == s2);
        System.out.println(s.equals(s2));
        System.out.println(s.equals(s3));
    }
    public static void q4(){
        String s ="ApnaCollege".replace("l", "");
        System.out.println(s);
    }
    public static boolean anagrams(String s, String p){
        if(s.length() != p.length())
            return false;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i <s.length(); i++) {
            set.add(s.charAt(i));
        }
        for (int i = 0; i <p.length() ; i++) {
            if(!set.contains(p.charAt(i)))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
//        System.out.println(compressor("aaabbbc"));
//        System.out.println(count_lowercase_vowels("Abhiraj"));
//        q3();
//        q4();
        System.out.println(anagrams("race","care"));
    }
}
