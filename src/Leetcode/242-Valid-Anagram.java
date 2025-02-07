class Solution {
    public boolean isAnagram(String s, String t) {
        //base case
        // if unicode characters are not present
       
    //     if(s.length()!=t.length()){
    //         return false;
    //     }
    //     //Array to store the count
    //     int[] chcount = new int[26];
    //     for(int i=0;i<s.length();i++){
    //         chcount[s.charAt(i)-'a']++; //increment the count
    //         // if charAt(i) is c -> then ['c' - 'a'] -> 2 - character to index conversion
    //         chcount[t.charAt(i)-'a']--; // dec the count
    //     }
    //     for(int cnt:chcount){
    //         if(cnt!=0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    //If unicode characters are present
    if(s.length()!=t.length()){
        return false;
    }
    Map<Character,Integer>mp_charcount = new HashMap<>();
    for(char c:s.toCharArray()){
        mp_charcount.put(c,mp_charcount.getOrDefault(c,0)+1);
        // Get the number of characters and increment and put back into the map
    }
    //for the next string
    for(char c:t.toCharArray()){
        //get the count of the character present and return false if its zero
        int cnt = mp_charcount.getOrDefault(c,0);
        if(cnt==0) return false;
        //Decrement the count 
        mp_charcount.put(c,mp_charcount.getOrDefault(c,0)-1);
    }
    return true;
}
}