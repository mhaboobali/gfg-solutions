class Solution {
    public int kthMissing(int[] arr, int k) {
        // code here
        int lo=0,hi=arr.length-1,mid=0;
        while(lo<=hi){
            mid=lo+(hi-lo)/2;
            int correct_value=mid+1;
            int missing_value=arr[mid]-correct_value;
          //  if(missing_value==k) return (correct_value+(k-1));
            if(missing_value >= k) hi=mid-1;
            else lo=mid+1;
        }
        return lo+k;
    }
}