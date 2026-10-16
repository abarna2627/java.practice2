class Solution {
    public int findLengthOfLCIS(int[] a) {
        int c=1,ans=1;
        for(int i=1;i<a.length;i++){
            c=a[i]>a[i-1]?c+1:1;
            ans=Math.max(ans,c);
        }
        return ans;
    }
}