class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> sHashMap = new HashMap<>();
        Map<Character, Integer> tHashMap = new HashMap<>();
        char[] sCharArr = s.toCharArray();
        char[] tCharArr = t.toCharArray();
        int n = sCharArr.length;

        for(int i=0; i<n; i++) {
            sHashMap.put(sCharArr[i], sHashMap.getOrDefault(sCharArr[i], 0) + 1);
            tHashMap.put(tCharArr[i], tHashMap.getOrDefault(tCharArr[i], 0) + 1);
        }

        if(sHashMap.equals(tHashMap)) {
            return true;
        }

        return false;
    }
}
