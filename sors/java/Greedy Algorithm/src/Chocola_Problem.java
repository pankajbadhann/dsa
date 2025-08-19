import java.util.Arrays;
import java.util.Collections;

public class Chocola_Problem {

    public static void main(String[] args) {
//        int n =4, m =6;
        Integer[] costVert = {2, 1, 3, 1, 4};//m-1
        Integer[] costHoriz = {4, 1, 2};//n-1

        Arrays.sort(costVert, Collections.reverseOrder());
        Arrays.sort(costHoriz, Collections.reverseOrder());

        int h = 0, v = 0;// pointers
        int hp = 1, vp = 1;// horizontal and vertical pieces
        int cost = 0;
        while (h < costHoriz.length && v < costVert.length) {
//            vertical cost
            if (costVert[v] <= costHoriz[h]) {// horizontal cut
                cost += (costHoriz[h] * vp);
                hp++;
                h++;
            }
//            horizontal cost
            else {// vertical cut
                cost += (costVert[v] * hp);
                vp++;
                v++;
            }
        }
        while (h < costHoriz.length) {
            cost += (costHoriz[h] * vp);
            hp++;
        }
        while (v < costVert.length) {
            cost += (costVert[v] * hp);
        }
        System.out.println("Hello World!");
        System.out.println("Minimum cost " + cost);
    }
}
