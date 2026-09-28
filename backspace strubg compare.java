class Solution {
    public boolean backspaceCompare(String s, String t) {
       return build(s).equals(build(t));
    }
    String build(String s){
        StringBuilder x=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c=='#'){
                if(x.length()>0)x.deleteCharAt(x.length()-1);
            }
            else x.append(c);
            
    }
    return x.toString();
}
}