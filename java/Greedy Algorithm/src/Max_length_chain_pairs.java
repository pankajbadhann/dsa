import java.sql.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Max_length_chain_pairs {
    public static void main(String[] args) {
        int pairs[][] ={{5,24},{39,60},{5,28},{27,40},{50,90}};
        System.out.println(max_length_pairs(pairs));
    }
    public static int max_length_pairs(int pairs[][]){
        Arrays.sort(pairs, Comparator.comparingDouble(o->o[1]));
        int chainlen = 1;
        int chainEnd = pairs[0][1]; //Last selected pair end, chain end
        for (int i = 1; i <pairs.length ; i++) {
            if(pairs[i][0]>chainEnd) {
                chainlen++;
                chainEnd = pairs[i][1];
            }
        }
        return chainlen;
    }
}
