
public class power {

    public static int power(int base, int exponent){

        if(exponent == 0)
           return 1;
        int half_power = power(base, exponent/2);
        int half_power_sq = half_power * half_power;
        if(base%2==0){
            return half_power_sq;
        }
        return base * half_power_sq;
    }
    public static void main(String[] args) {
        System.out.println(power(2,3));
    }
}
