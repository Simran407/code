class Solution {
    public String reverseWords(String s) {
        int n=s.length();
        StringBuilder ans=new StringBuilder();
        for(int i=n-1;i>=0;i--){
            StringBuilder word=new StringBuilder();

            while(i>=0 && s.charAt(i)!=' '){
                word.insert(0,s.charAt(i));
                i--;
            }
            if(word.length()>=1){
                ans.append(" ").append(word);
            }
        }
        return ans.substring(1);
        
    }
}