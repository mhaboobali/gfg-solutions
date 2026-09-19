class Solution {
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        int rows=mat.length,cols=mat[0].length;
        int lo=0,hi=rows*cols-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            int rowsmid=mid/cols;
            int colsmid=mid%cols;
            if(mat[rowsmid][colsmid]==x) return true;
            else if(mat[rowsmid][colsmid]<x) lo=mid+1;
            else hi=mid-1;
        }
        return false;
    }
}
