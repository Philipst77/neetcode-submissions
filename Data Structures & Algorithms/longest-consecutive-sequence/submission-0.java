class Solution {
    public int longestConsecutive(int[] nums) {
       Set<Integer> store = new HashSet<>();

       for(int n: nums){
        store.add(n);
       } 


       int longest =0;

       for(int i : store){
        if(!store.contains(i-1)){
                int length =1;

                while(store.contains(i + length)){
                    length ++;

                }

                longest = Math.max(length, longest);

        }
       }
       return longest;
    }
}
