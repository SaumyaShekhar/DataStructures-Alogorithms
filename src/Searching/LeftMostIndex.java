package Searching;

import java.util.Scanner;
// Sorted Array with Repetitions, find the left most index of an element Ex- 1,2,3,3,3,3
public class LeftMostIndex {
    public static void main(String[] args) {
        LeftMostIndex lfi = new LeftMostIndex();
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arrayN = new int[n];
        for (int i = 0; i < n; i++) {
            arrayN[i] = input.nextInt();
        }
        System.out.println("Element Whose left most index is to be found");
        int x = input.nextInt();
        int pos = lfi.search(arrayN, 0, n-1, x);
        System.out.print(pos);
    }
    private int search(int[] arr, int l, int h, int x){
        int mid = l + (h-l)/2;
        if(l>h) return -1;
        if(arr[mid] == x && (mid == 0 || arr[mid-1] != x)) return mid;
        else if(arr[mid] >= x) return search(arr,0,mid-1,x);
        else return  search(arr,mid+1,h,x);
    }
}
