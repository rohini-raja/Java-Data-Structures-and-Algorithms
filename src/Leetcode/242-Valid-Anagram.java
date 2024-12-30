class Solution {
    public boolean isAnagram(String s, String t) {
        //base case
        if(s.length()!=t.length()){
            return false;
        }
        //Array to store the count
        int[] chcount = new int[26];
        for(int i=0;i<s.length();i++){
            chcount[s.charAt(i)-'a']++; //increment the count
            // if charAt(i) is c -> then ['c' - 'a'] -> 2 - character to index conversion
            chcount[t.charAt(i)-'a']--; // dec the count
        }
        for(int cnt:chcount){
            if(cnt!=0){
                return false;
            }
        }
        return true;
    }
}