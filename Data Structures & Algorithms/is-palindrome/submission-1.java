class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() < 1) {
            return false;
        }

        char[] charArr = s.toLowerCase().toCharArray();
        int n = charArr.length;
        int leftPtr = 0;
        int rightPtr = n - 1;
        while(leftPtr < rightPtr) {
            if(!Character.isLetterOrDigit(charArr[leftPtr])) {
                leftPtr++;
                continue;
            }

            if(!Character.isLetterOrDigit(charArr[rightPtr])) {
                rightPtr--;
                continue;
            }
            
            if(charArr[leftPtr] != charArr[rightPtr]) {
                return false;
            } else {
                leftPtr++;
                rightPtr--;
                continue;
            }

        }
        
        return true;
    }
}
