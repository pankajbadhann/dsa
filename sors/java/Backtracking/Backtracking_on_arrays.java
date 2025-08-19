
public class Backtracking_on_arrays {
    public static void main(String[] args) {
        int [] arr = new int[5];
        changeArr(arr, 0, 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void changeArr(int []a, int index, int value){

        // base case
        if(index == a.length){
            return;
        }

        // recursion
        a[index] = value;
        changeArr(a, index+1, value+1);
        a[index] = a[index] - 2;// backtracking
    }
    
}
