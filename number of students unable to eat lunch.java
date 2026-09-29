class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
       int c0=0,c1=0;
       for(int x: students){
        if(x==0)c0++;
        else c1++;
       }
       for(int x:sandwiches){
if(x==0){
    if(c0==0) return c1;
    c0--;
}
else{
    if(c1==0) return c0;
    c1--;
}
    }