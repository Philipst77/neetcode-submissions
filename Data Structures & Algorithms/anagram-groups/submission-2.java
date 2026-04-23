class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        

        Map<String, List<String>> freq = new HashMap<>();


        for(String s : strs){
            int[] store = new int [26];
            for( char c: s.toCharArray()){
                store[c - 'a']++;
            }

            String key = Arrays.toString(store);

            if(!freq.containsKey(key)){
                freq.put(key, new ArrayList<>());
            }

            freq.get(key).add(s);
        }
        return new ArrayList<>(freq.values());
    }
}
