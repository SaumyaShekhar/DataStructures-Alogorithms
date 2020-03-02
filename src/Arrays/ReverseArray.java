package Arrays;
import java.util.Scanner;

public class ReverseArray {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arrayN = new int[n];
        for(int i=0; i<n;i++) {
            arrayN[i] = input.nextInt();
        }
        int low = 0;
        int high = n-1;
        while (low < high){
            int temp = arrayN[low];
            arrayN[low] = arrayN[high];
            arrayN[high] = temp;
            low++;
            high--;
        }
        for(int i=0; i<n;i++){
            System.out.print(arrayN[i]);
        }
    }
}
