class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        char[] lcs = strs[0].toCharArray();

        for (int i = 1; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            StringBuilder newLcs = new StringBuilder();

            int minLength = Math.min(lcs.length, chars.length);

            for (int j = 0; j < minLength; j++) {
                if (lcs[j] == chars[j]) {
                    newLcs.append(lcs[j]);
                } else {
                    break;
                }
            }

            lcs = newLcs.toString().toCharArray();

            if (lcs.length == 0) {
                return "";
            }
        }

        return new String(lcs);
    }
}