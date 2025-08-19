public class Search_in_rotated_array {
    public static int search(int arr[], int si, int ei, int target) {

        if (si > ei)
            return -1;


//        kaam
        int mid = si + (ei - si) / 2;

//        case found
        if (arr[mid] == target)
            return mid;
//        mid on line L1
        if (arr[si] <= arr[mid]) {
//            case a: left
            if (arr[si] <= target && target <= arr[mid]) {
                return search(arr, target, si, mid);
            } else {
//                case b: right
                search(arr, target, mid + 1, ei);
            }
        }
//        mid on line L2
        else {
//            case c: right
            if (arr[mid] <= target && target <= arr[ei])
                return search(arr, target, mid + 1, ei);
//            case d: left
            else
                return search(arr, target, si, mid - 1);
        }
        return mid;
    }

    public static int search2(int[] arr, int start, int end, int target) {
        int index = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                index = mid;
                break;
            }
            else if(arr[start]<=arr[mid]){
                if(arr[start]<=target && target<=arr[mid])
                    end = mid-1;
                else
                    start = mid+1;
            }
            else{
                if(arr[mid]<=target && target<=arr[end])
                    start = mid+1;
                else
                    end = mid-1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int target = 3;
        int index = search2(arr, 0, arr.length-1, target);
        System.out.println(index);
    }
}
