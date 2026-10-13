class Solution {
    public String licenseKeyFormatting(String s, int k) {
        s=s.replace("-","").toUpperCase();
        StringBuilder r= new StringBuilder();
        int c=0;
        for(int i=s.length()-1;i>=0;i--){
            if(c==k){
                r.append("-");
                c=0;
            }
                    r.append(s.charAt(i));
                    c++;
                }
                return r.reverse().toString();
                }
        }