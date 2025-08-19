import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Activity_Selections {
   public static void max_activity(int start[], int end[]){

       int max_count = 0;
       ArrayList<Integer> ans = new ArrayList<>();

//       1st activity
       max_count = 1;
       ans.add(0);
       int last_end = end[0];
       for (int i = 1; i < end.length ; i++) {
           if (start[i]>=last_end){
//               activity select
               max_count++;
               ans.add(i);
               last_end = end[i];
           }
       }
       System.out.println("maximum activities "+ max_count);
       for (int i=0; i< ans.size(); i++) {
           System.out.print("A"+ans.get(i)+" ");
       }
//       return max_count;

//       sorting
//       int activities[][] = new int[start.length][3];
//       for (int i = 0; i < start.length; i++) {
//           activities[i][0] = i;
//           activities[i][1] = start[i];
//           activities[i][2] = end[i];
//       }
////       lambda functions
//       Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));
//       max_count = 1;
//       ans.add(activities[0][0]);
//       int last_end = activities[0][2];
//       for (int i = 1; i < end.length ; i++) {
//           if (activities[i][1]>=last_end){
////               activity select
//               max_count++;
//               ans.add(activities[i][0]);
//               last_end = end[i];
//           }
//       }
   }


    public static void main(String[] args) {
        int []start = {1,3,0,5,8,5};
        int []end = {2,4,6,7,9,9};
//        end time basics sorted
        max_activity(start, end);
    }
}
