public class maximum_subarray_sum {
    public int maximum_subarray_s(int []a){

        int curr_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        int [] prefix = new int[a.length];

        prefix[0] = a[0];
        for (int i = 1; i < prefix.length ; i++) {
            prefix[i] = prefix[i-1]+a[i];
        }

        for (int i = 0; i < a.length; i++) {
            int start = i;
            for (int j = i; j<a.length;j++){
                int end = j;
//                curr_sum = 0;
                curr_sum = start==0 ? prefix[end]  : prefix[end]- prefix[start-1];
//                for (int k = start; k <=end ; k++) {
//                    curr_sum += a[k];
//                }
                if (curr_sum>max_sum)
                    max_sum = curr_sum;
            }
        }

        return max_sum;
    }
    //        Kadel's Algorithm

    public int Kaden_Algorithm(int []a){
        int max_sum = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i<a.length; i++){
            cs = cs + a[i];
            if (cs < 0){
                cs = 0;
            }
            max_sum = Math.max(max_sum,cs);
        }
        return max_sum;
//        If we have -ve numbers then return the smallest -ve number
    }
}
