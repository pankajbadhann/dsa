public class Subsets {
    public static void find_subset(String str, String ans, int index){
//        base case
        if(index == str.length()){
            if (ans.length()==0)
                System.out.println("null");
            System.out.println(ans);
            return;
        }
//        recursion
//        Yes choice
        find_subset(str, ans+(str.charAt(index)),index+1);
//        No choice
        find_subset(str, ans, index+1);

    }

    public static void main(String[] args) {
        find_subset("abc","", 0);
    }
}
