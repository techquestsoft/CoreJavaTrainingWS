package com.hi.interviews.problems;

class BinarySearch {
    static int binarySearch(int a[], int beg, int end, int val) {
        int mid;
        if (end >= beg) {
            mid = (beg + end) / 2;
            if (a[mid] == val) {
                return mid + 1;  /* if the item to be searched is present at middle
                 */
            }
            /* if the item to be searched is smaller than middle, then it can only
be in left subarray */
            else if (a[mid] < val) {
                return binarySearch(a, mid + 1, end, val);
            }
            /* if the item to be searched is greater than middle, then it can only be
in right subarray */
            else {
                return binarySearch(a, beg, mid - 1, val);
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int a[] = {8, 10, 22, 27, 37, 44, 49, 55, 69,70}; // given array
        int val = 8; // value to be searched
        int n = a.length; // size of array
        int res = binarySearch(a, 0, n - 1, val); // Store result
        System.out.print("The elements of the array are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("Element to be searched is: " + val);
        if (res == -1)
            System.out.println("Element is not present in the array");
        else
            System.out.println("Element is present at " + res + " position of array");
    }
}
