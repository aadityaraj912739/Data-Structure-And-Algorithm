class Solution {
    public String largestGoodInteger(String num) {
        int i = 2;
        int n = num.length();
        int maxChar=0;
        int f = 0;
        StringBuilder sb = new StringBuilder();
        while(i < n){
            if(num.charAt(i)== num.charAt(i-1) && num.charAt(i) == num.charAt(i-2)){
                f++;
                if(maxChar < num.charAt(i) - '0'){
                    maxChar = num.charAt(i) - '0';
                } 
            }
            i++;
        }
        int j = 0;
        if(f > 0){
            while(j < 3){
            sb.append(maxChar);
            j++;
            }
        }else{
            return "";
        }
        return sb.toString();

    }
}