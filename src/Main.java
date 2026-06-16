import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 1 задача
        int[] h = new int[3];
        h[0] = 1;
        h[1] = 2;
        h[2] = 3;
        double[] r = {1.57, 7.654, 9.986};
        byte[] p = {3, 4, 7};
        // 2 задача
        for (int i = 0; i < h.length; i++) {
            if (i == h.length - 1) {
                System.out.println(h[i]);
                break;
            }
            System.out.print(h[i] + ", ");
        }
        for (int i1 = 0; i1 < r.length; i1++) {
            if (i1 == r.length - 1) {
                System.out.println(r[i1]);
                break;
            }
            System.out.print(r[i1] + ", ");
        }
        for (int i3 = 0; i3 < p.length; i3++) {
            if (i3 == p.length - 1) {
                System.out.println(p[i3]);
                break;
            }
            System.out.print(p[i3] + ", ");
        }
        // 3 задача
        for (int i = h.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(h[0]);
                break;
            }
            System.out.print(h[i] + ", ");
        }
        for (int i1 = r.length - 1; i1 >= 0; i1--) {
            if (i1 == 0) {
                System.out.println(r[0]);
                break;
            }
            System.out.print(r[i1] + ", ");
        }
        for (int i3 = p.length - 1; i3 >= 0; i3--) {
            if (i3 == 0) {
                System.out.println(p[0]);
                break;
            }
            System.out.print(p[i3] + ", ");
        }
        // 4 задача
        for (int i = 0; i < h.length; i++) {
            if (h[i] % 2 != 0) {
                h[i] += 1;
            }
            if (i == h.length - 1) {
                System.out.println(h[i]);
                break;
            }
            System.out.print(h[i] + ", ");
        }
    }
}