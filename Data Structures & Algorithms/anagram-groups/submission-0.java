class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    HashMap<String , List<String>> Hs = new HashMap<>();

    for(String s : strs){
            int [] count = new int[26];
        for(char c: s.toCharArray()){
            count[c - 'a']++;
        }

        String key = Arrays.toString(count);
        if(!Hs.containsKey(key)){
            Hs.put(key , new ArrayList<>());
        }
        Hs.get(key).add(s);

        }
        return new ArrayList<>(Hs.values());
    }
}
