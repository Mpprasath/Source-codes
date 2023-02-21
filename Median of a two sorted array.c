/*
Question:
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
*/


double findMedianSortedArrays(int* nums1, int nums1Size, int* nums2, int nums2Size){
     int size=nums1Size+nums2Size;
     int arr[size],j=0,temp=0;
     for(int i=0;i<size;i++){
         if(i<nums1Size) arr[i]=nums1[i];
         else arr[i]=nums2[j++];
     }
     for(int i=0;i<size;i++){
         for(int j=i+1;j<size;j++){
             if(arr[i]>arr[j]){
                 temp=arr[i];
                 arr[i]=arr[j];
                 arr[j]=temp;
             }
         }
     }
     if(size%2==0) return (arr[size/2]+arr[size/2-1])/2.00;
     else return arr[size/2];
}
