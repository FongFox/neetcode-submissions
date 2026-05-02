class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> sHashMap = new HashMap<>();
        for(char c : s.toCharArray()) {
            sHashMap.put(c, sHashMap.getOrDefault(c, 0) + 1);
        }

        HashMap<Character, Integer> tHashMap = new HashMap<>();
        for(char c : t.toCharArray()) {
            tHashMap.put(c, tHashMap.getOrDefault(c, 0) + 1);
        }

        if(sHashMap.equals(tHashMap)) {
            return true;
        }

        return false;
    }
}
