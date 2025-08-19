import java.util.ArrayList;

public class Container_with_most_water {
    public static int stored_water(ArrayList<Integer> height){
        int max_water = 0;
//        brute force
//        for (int i = 0; i < height.size(); i++) {
//            for (int j = i+1; j < height.size() ; j++) {
//                int h = Math.min(height.get(j), height.get(i));
//                int wi = j-i;
//                int curr_water = h*wi;
//                max_water = Math.max(max_water, curr_water);
//            }
//        }
//        return max_water;

        int left = 0, right = height.size()-1;
        while(left<right){
//            water area
              int ht = Math.min(height.get(left), height.get(right));
              int wt = right-left;
              max_water = Math.max(max_water, ht*wt);

//            update the pointer
            if(height.get(left)<height.get(right))
                left++;
            else
                right--;
        }
        return max_water;
    }

}
