import java.util.ArrayList;
import java.util.Collections;

public class Job_sequencing_problem {

    static class Job{
        int deadline;
        int profit;
        int id;

        public Job(int i, int d, int p){
            id =i;
            deadline = d;
            profit = p;
        }
    }
    public static int job(int[][]jobsInfo){
        ArrayList<Job>jobs = new ArrayList<>();

        for (int i = 0; i < jobsInfo.length; i++) {
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }
        Collections.sort(jobs, (obj1, obj2)->obj1.profit-obj2.profit); // desending order

        ArrayList<Integer> ans = new ArrayList<>();
        int time =0;
        for (int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i);
            if(curr.deadline>time){
                ans.add(curr.id);
                time++;
            }
        }
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i)+" ");
        }
        return ans.size();
    }

    public static void main(String[] args) {
        int jobs[][] = {{4,20},{1,10},{1,40},{1,30}};
        System.out.println(job(jobs));
    }
}
