class Solution {
    public int maxChunksToSorted(int[] arr) {
        // [4,3,2,1,0] 
        int n =  arr.length;
        int chunks  = 0;
        int maxele = 0;
        for(int i=0;i<n;i++){
            maxele = Math.max(maxele,arr[i]);
            if(maxele == i){
                chunks++;
            }
        }
        return chunks;
    }
}