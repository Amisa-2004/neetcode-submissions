class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        s = new String(ch);
        ch = t.toCharArray();
        Arrays.sort(ch);
        t = new String(ch);
        if(s.equals(t)) {
            return true;
        }
        return false;
    }
}
