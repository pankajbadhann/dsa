public class occurence_of_key {
    public static int first_occurance(int []arr, int key, int index){
        if(arr[index] == key)
            return index;
        return (index<arr.length-1)?first_occurance(arr, key, index+1):-1;
    }
    public static int last_occurance(int []arr, int key, int index){
        if(index == arr.length-1)
            return -1;
        if(last_occurance(arr,key,index+1) == -1 && arr[index]==key)
            return index;
        return last_occurance(arr, key, index+1);
    }

    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(first_occurance(arr, 10, 0));
    }
}
