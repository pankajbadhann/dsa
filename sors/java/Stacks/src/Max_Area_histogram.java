import java.util.Stack;

public class Max_Area_histogram {
    public static int max_area(int a[]){
        int max_area = 0;
        int nsl[] = new int[a.length];
        int nsr[] = new int[a.length];

//        Next Smaller Right
        Stack<Integer> s = new Stack<>();

        for (int i = a.length-1; i >=0 ; i--) {
            while (!s.isEmpty() && a[s.peek()]>=a[i])
                s.pop();
            if(s.isEmpty()){
                nsr[i] = a.length;
            }else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }
//        Next Smaller left
        s = new Stack<>();
        for (int i = 0; i <a.length ; i++) {
            while (!s.isEmpty() && a[s.peek()]>=a[i])
                s.pop();
            if (s.isEmpty())
                nsl[i] = -1;
            else
                nsl[i] = s.peek();
            s.push(i);
        }

//        Current Area
        for (int i = 0; i < a.length; i++) {
            int height = a[i];
            int width = nsr[i]-nsl[i]-1;
            int curr_area = height*width;
            max_area = Math.max(max_area, curr_area);
        }
        return max_area;
    }

    public static void main(String[] args) {
        System.out.println(max_area(new int[]{2,6,10,6,8,3}));
    }
}
