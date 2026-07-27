class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                sb.append(s.charAt(i));
            } else {
                char shifted = (char) (s.charAt(i - 1) + (s.charAt(i) - '0'));
                sb.append(shifted);
            }
        }
        return sb.append('\0').deleteCharAt(sb.length()-1).toString();
    }
}
