package BinarySearch;

public class SmallestLetterLeetcodeQn {
        public static void main(String[] args) {
            // Test input
            char[] letters = {'c', 'd', 'f', 'j'};
            char target = 'f';

            // Call the function and print the output
            char result = nextGreatestLetter(letters, target);
            System.out.println("Output: " + result);
        }

    public static char nextGreatestLetter(char[] letters, char target) {
            int start = 0;
            int end = letters.length - 1;
            while(start <= end) {
                int mid = start + (end - start) / 2;
                if(target < letters[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }

        return letters[start % letters.length] ;
    }
}
