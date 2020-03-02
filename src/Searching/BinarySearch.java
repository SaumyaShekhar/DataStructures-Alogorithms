package Searching;

import java.util.Scanner;

// Binary Search is used for sorted Array.
public class BinarySearch {
    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arrayN = new int[n];
        for (int i = 0; i < n; i++) {
            arrayN[i] = input.nextInt();
        }
        System.out.println("Element to be searched:");
        int x = input.nextInt();
        int pos = bs.search(arrayN, 0, n-1, x);
        System.out.print(pos);
    }
    public int search(int[] arr, int l, int h, int x){
        int mid = l + (h-l)/2;
        if(l>h) return -1;
        if(arr[mid] == x) return mid;
        else if(arr[mid] > x) return search(arr,0,mid-1,x);
        else return  search(arr,mid+1,h,x);
    }
}
