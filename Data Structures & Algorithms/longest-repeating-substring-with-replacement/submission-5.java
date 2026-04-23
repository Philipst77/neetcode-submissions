class Solution {
    public int characterReplacement(String s, int k) {

            int maxSize =0;
            int L =0;
            int maxfreq =0;
            


            int[] freq = new int[26];
            for(int R =0; R< s.length(); R++){
                char c = s.charAt(R);
                freq[c - 'A']++;
                maxfreq = Math.max(maxfreq , freq[c-'A']);

                if( (R-L+1) - maxfreq > k){
                    freq[s.charAt(L)-'A']--;
                    L++;
            }

        maxSize = Math.max(maxSize, R-L +1);


        }
        return maxSize;

        
    }
}