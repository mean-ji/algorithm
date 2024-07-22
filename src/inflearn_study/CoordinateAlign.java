package inflearn_study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//class Point implements Comparable<Point> {
//    public int x, y;
//    Point (int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//    @Override
//    public int compareTo(Point o) {
//        if (this.x == o.x) return this.y - o.y;
//        else return this.x - o.x;
//    }
//}
public class CoordinateAlign {
    // me
    public static void main(String[] args) {
        CoordinateAlign T = new CoordinateAlign();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = kb.nextInt();
            arr[i][1] = kb.nextInt();
        }
        for (int[] x : T.solution(n, arr)) {
            System.out.println(x[0] + " " + x[1]);
        }
    }

    public int[][] solution(int n, int[][] arr) {
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n - i + 1; j++) {
                if (arr[j][0] < arr[j - 1][0]) {
                    int[] tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                }
                else if (arr[j][0] == arr[j - 1][0]) {
                    if (arr[j][1] < arr[j - 1][1]) {
                        int[] tmp = arr[j];
                        arr[j] = arr[j - 1];
                        arr[j - 1] = tmp;
                    }
                }
            }
        }
        return arr;
    }
    // lecture
//    public static void main(String[] args) {
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        ArrayList<Point> list = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            int x = kb.nextInt();
//            int y = kb.nextInt();
//            list.add(new Point(x, y));
//        }
//        Collections.sort(list);
//        for (Point o : list) {
//            System.out.println(o.x + " " + o.y);
//        }
//    }
}
