class Solution {
    public boolean areNumbersAscending(String s) {
       String[] a= s.split(" ");
       int prev=0;
       for(String x:a){
        if(Character.isDigit(x.charAt(0))){
            int n=Integer.parseInt(x);
            if(n<=prev) return false;
            prev=n;

        
        }
       } 
    return true;
}
}