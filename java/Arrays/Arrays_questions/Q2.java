package Arrays_questions;

public class Q2 {
    public static int pivot(int[]a, int target){
      int minIndex = minSearch(a);
      if(a[minIndex]<=target && target<=a[a.length-1])
          return search(a,minIndex,a.length-1,target);
      else
          return search(a,0,a.length-1,target);
    }


    public static int search(int []a, int low, int high, int target){
        while(low<=high){
            int mid = high - (high - low)/2;
            if(a[mid] == target)
                return mid;
            else if(a[mid]>target)
                high = mid-1;
            else
                low = mid-1;
        }
        return -1;
    }
    public static int minSearch(int[]a){
        int left =0;
        int right = a.length-1;
        while(left<right){
            int mid = left + (right-left)/2;
            if(mid > 0 && a[mid-1]>a[mid])
                return mid;
            else if (a[left]<=a[right] && a[mid]>a[right])
                left = mid+1;
            else
                right = mid-1;
        }
        return left;
    }

    public static void main(String[] args) {
        System.out.println(pivot(new int[]{4,  5, 6, 7, 0, 1, 2}, 0));
    }
}
