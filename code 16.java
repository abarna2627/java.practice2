class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum=0;
        for(int x:arr) sum+=x;
        if(sum% 3!=0) return false;
        int target=sum/3,count=0,cur=0;
        for(int x:arr){
            cur+=x;
            if(cur==target){
                count++;
                cur=0;

            }
        }
        return count>=3;
    }
}