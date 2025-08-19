public class sorted_array_or_not {
    public static boolean is_sorted(int[] arr, int index){
        if(index == arr.length)
            return true;
        if(arr[index]>arr[index+1])
            return false;
        return (arr[index]>arr[index+1])? false : is_sorted(arr, index+1);
    }
}
