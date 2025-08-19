public class Quick_sort {
    public static void quick_sort(int []arr, int si, int ei){
        if(si>=ei){
            return;
        }
        int pivot = arr[si];
        int count = 0;
        for(int i=si+1;i<=ei;i++){
            if(arr[i]<=pivot){
                count++;
            }
        }
        int pivot_index = si+count;
        int temp = arr[si];
        arr[si] = arr[pivot_index];
        arr[pivot_index] = temp;
        int i = si;
        int j = ei;
        while(i<pivot_index && j>pivot_index){
            if(arr[i]<=pivot){
                i++;
            }
            else if(arr[j]>pivot){
                j--;
            }
            else{
                int temp1 = arr[i];
                arr[i] = arr[j];
                arr[j] = temp1;
                i++;
                j--;
            }
        }
        quick_sort(arr, si, pivot_index-1);
        quick_sort(arr, pivot_index+1, ei);
    }
    public static int partition(int[] arr, int si, int ei){

        int pivot = arr[ei];
        int i = si-1; //to make place for els smaller than pivot

        for(int j = si; j<=ei; j++) {
            if (arr[j] <= pivot) {
                i++;
//        swap
                int temp = arr[i];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        int[]arr = {5, 4, 3, 2, 1};
        quick_sort(arr, 0, arr.length-1);
        for(int i = 0; i<arr.length; i++)
            System.out.print(arr[i]+" ");
    }
}
