class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() < 1) {
            return false;
        }

        String newStr = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        // System.out.println(newStr);

        char[] charArr = newStr.toCharArray();
        // System.out.println(charArr);
        int leftPtr = 0;
        int rightPtr = charArr.length - 1;
        while(leftPtr < rightPtr) {
            if(charArr[leftPtr++] != charArr[rightPtr--]) {
                return false;
            }
        }

        return true;
    }
}
