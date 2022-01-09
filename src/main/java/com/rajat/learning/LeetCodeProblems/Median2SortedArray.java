package com.rajat.learning.LeetCodeProblems;

public class Median2SortedArray {

    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};

        System.out.println("Median of sorted arrays is : " + findMedianSortedArrays(nums1,nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = 0;

        // Declare a array with Size of both arrays
        int[] mergedArray = new int[nums1.length + nums2.length];


        int i,j,k;
        i = j = k = 0;
        while(i < nums1.length && j < nums2.length){
            if (nums1[i] < nums2[j]) {
                mergedArray[k++] = nums1[i++];
            } else {
                mergedArray[k++] = nums2[j++];
            }
        }

        while (i < nums1.length){
            mergedArray[k++] = nums1[i++];
        }

        while (j < nums2.length){
            mergedArray[k++] = nums2[j++];
        }

        if(mergedArray.length%2 == 0){
            median = ((double)mergedArray[mergedArray.length/2] + (double)mergedArray[mergedArray.length/2 - 1]) / 2;
        }else{
            median = mergedArray[mergedArray.length/2];
        }

        return median;
    }
}
