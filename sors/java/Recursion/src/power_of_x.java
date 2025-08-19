public class power_of_x{
    public static int power(int base, int powerr){
        // if(powerr == 0){
        //     return 1;
        // }

        // return base * power(base, powerr-1);

        if(powerr == 0){
            return 1;
        }

        // int half_power = power(base, powerr/2) * power(base, powerr/2); O(n)
        int half_power = power(base, powerr/2);
        if(powerr % 2 == 0){
            return half_power*half_power;
        }
        else{
            return base * half_power*half_power;
        }
    }
    public static void main(String[] args) {
        System.out.println(power(2, 10));
    }
}