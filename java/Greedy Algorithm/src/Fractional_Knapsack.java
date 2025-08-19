import java.util.Arrays;
import java.util.Comparator;

public class Fractional_Knapsack {
    public static int fractional_knapsack(int []weight, int []val, int w){
        double ratio[][] = new double[val.length][2];
//         0th col->index, 1st col->ratio

        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double)weight[i];
        }
//        ascending order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        int final_value = 0;
        for (int i = ratio.length-1; i >=0 ; i--) {
            int idx = (int) ratio[i][0];
            int capacity = w;

            if(capacity >=weight[idx]){ //include
                final_value += val[idx];
                capacity -= weight[idx];
            }else {
                 final_value += (ratio[i][1] * capacity);
                 capacity = 0;
                 break;
            }
        }
        return final_value;
    }
}
