public class Arrays {
    public static int trap_water(int []a){
        int[]left_max = new int[a.length];
        int []right_max = new int[a.length];
        left_max[0] = a[0];
        for (int i =1; i <a.length ; i++) {
            left_max[i] = Math.max(a[i],left_max[i-1]);
        }
        right_max[right_max.length-1] = a[a.length-1];
        for (int i = right_max.length-2; i >=0 ; i--) {
            right_max[i] = Math.max(a[i], right_max[i+1]);
        }
        int trapped_water = 0;
        for (int i = 0; i<a.length;i++){
            trapped_water+= Math.min(left_max[i],right_max[i])-a[i];
        }
        return trapped_water;
    }
}
