class Solution {
    public boolean isPalindrome(String s) {
        String new_s = "";
        for(int i = 0; i < s.length(); i++) {
            if(Character.isLetterOrDigit(s.charAt(i))) {
                new_s += s.charAt(i);
            }
        }
        s = new_s.toLowerCase();
        String reversed = new StringBuilder(s).reverse().toString().toLowerCase();
        if(s.equals(reversed)) {
            return true;
        }
        return false;
    }
}