public class ImplementStrStr {
    
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0) {
            return 0;
        }
        CharSequence cs = needle;
        if(haystack.contains(cs)) {
            String[] s = haystack.split(needle, 2);
            return s[0].length();
        }
        return -1;
    }

}
