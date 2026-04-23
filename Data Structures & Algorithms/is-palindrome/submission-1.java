class Solution {
    public boolean isPalindrome(String s) {
        

        int L = 0;
        int R = s.length()-1;

        while( L < R){

            while( L < R && !Character.isLetterOrDigit(s.charAt(L))){
                L++;

            }
            while( R> L && !Character.isLetterOrDigit(s.charAt(R))){
                R--;
            }
            if(Character.toLowerCase(s.charAt(L)) != Character.toLowerCase(s.charAt(R))){
                return false;
            }
            L++;
            R--;

        }
        return true;
    }
}
