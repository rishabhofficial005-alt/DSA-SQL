class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int total=m+n;
        int current=0;
        int prev=0;
        int i=0;
        int j=0;
        for(int k=0;k<=total/2;k++){
            prev=current;
            if(i<m && j<n){
                if(nums1[i]<nums2[j]){
                    current=nums1[i++];
                }
                else{
                    current=nums2[j++];
                }
            }
            else if(i<m){
                current=nums1[i++];

            }
            else{
                current=nums2[j++];
            }
        }
        if(total%2==1){
            return current;
        }
        return (current+prev)/2.0;
        
    }
}