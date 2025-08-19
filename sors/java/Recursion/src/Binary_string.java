public class Binary_string {
    public static void Print_binary_string(int n, int lastplace, String str){

        if(n == 0) {
            System.out.println(str);
            return;
        }
//        kaam
//        if(lastplace == 0){
////            sit 0 on chair n
//            Print_binary_string(n-1, lastplace, str.append("0"));
//            Print_binary_string(n-1,1, str.append("1"));
//        }
//        else{
//            Print_binary_string(n-1,0,str.append("0"-));
//        }
        Print_binary_string(n-1, 0, str+"0");
        if (lastplace == 0)
            Print_binary_string(n-1,1,str+"1");
    }

    public static void main(String[] args) {
        Print_binary_string(3,0,new String());
    }
}
