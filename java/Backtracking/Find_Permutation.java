public class Find_Permutation {
    public static void permutation(String str, String ans){
//        base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
//        recursion - choices
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
//             delete the choosen char from the string
            String str1 = str.substring(0,i) + str.substring(i+1);
            permutation(str1, ans+ch);
        }
    }

    public static void main(String[] args) {
        permutation("abc","");
        String s = "abc";

    }
}
