import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Indian_coins {
    public static int count(int[] coins, int amount){
        Integer coin[] = new Integer[coins.length];
        Arrays.setAll(coin, i->coins[i]);
        Arrays.sort(coin, Comparator.reverseOrder());

        int count = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < coin.length; i++) {
            if(coin[i]<=amount){
                while(coin[i]<=amount) {
                    amount -= coin[i];
                    ans.add(coin[i]);
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(count(new int[]{1,2,5,10,20,50,100,500,2000}, 590));
    }
}

