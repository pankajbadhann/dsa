public class remove_duplicates_in_string {
    public static String remove_duplicates(String str, int index, StringBuffer newstr, int[] map){
        if(str.length() == index)
            return String.valueOf(newstr);
//        Work
        char curr = str.charAt(index);
        int i = curr - 'a';
        if(map[i] == 1)
            remove_duplicates(str,index+1,newstr,map);
        else {
            map[curr-'a']= 1;
            remove_duplicates(str,index+1,newstr.append(curr), map);
        }
        return newstr.toString();
    }
    public static void main(String[] args) {
        String n = "aapnnacollege";
        System.out.println(remove_duplicates(n,0,new StringBuffer(),new int[26]));
    }
}
