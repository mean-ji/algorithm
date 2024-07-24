package inflearn_study;

import java.util.Arrays;
import java.util.Scanner;

public class Stable {
    public int[] count(int[] arr, int capacity) {
        int[] result = new int[2];
        int cnt = 1;
        int diff = arr[arr.length - 1];
        int j = 0;
        for (int i = 0; i < arr.length; i = j - 1) {
            for (j = i + 1; j < arr.length; j++) {
                System.out.println(j + " " + i);
                if (arr[j] - arr[i] > capacity) {
                    cnt ++;
                    break;
                } else diff = Math.max(arr[j] - arr[i], diff);
            }
        }
        result[0] = cnt;
        result[1] = diff;
        System.out.println(Arrays.toString(result));
        return result;
    }
    public int solution(int n, int c, int[] arr) {
        Arrays.sort(arr);
        int answer = 0;
        int lt = 0;
        int rt = Arrays.stream(arr).max().getAsInt() - Arrays.stream(arr).min().getAsInt();
        int[] result = new int[2];
        while(lt <= rt) {
        System.out.println(lt + " " + rt);
            int mid = (lt + rt) / 2;
            result = count(arr, mid);

            if (result[0] < c) {
                answer = Math.max(result[1], answer);

                rt = mid - 1;
            } else {

                System.out.println(answer);
                lt = mid + 1;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Stable T = new Stable();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int c = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i< n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, c, arr));
    }
}
