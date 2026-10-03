lass Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
     int ans[]=new int[n];
     Stack<Integer> st=new Stack<>();
     int prev=0;
     for(String log:logs){
        String[] a=log.split(":");
        int id=Integer.parseInt(a[0]);
        int time=Integer.parseInt(a[2]);
        if(a[1].equals("start")){
            if(!st.isEmpty())
            ans[st.peek()] += time-prev;
            st.push(id);
            prev=time;
                }
                else{
                    ans[st.pop()] +=time-prev+1;
                    prev=time+1;
                }
     }
     return ans;
                }        
}
   