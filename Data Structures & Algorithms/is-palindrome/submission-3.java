class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() < 1) {
            return false;
        }

        int n = s.length();
        int leftPtr = 0;
        int rightPtr = n - 1;
        while(leftPtr < rightPtr) {
            if(!Character.isLetterOrDigit(s.charAt(leftPtr))) {
                leftPtr++;
                continue;
            }

            if(!Character.isLetterOrDigit(s.charAt(rightPtr))) {
                rightPtr--;
                continue;
            }
            
            if(Character.toLowerCase(s.charAt(leftPtr++)) != Character.toLowerCase(s.charAt(rightPtr--))) {
                return false;
            } else {
                continue;
            }

        }
        
        return true;
    }
}
