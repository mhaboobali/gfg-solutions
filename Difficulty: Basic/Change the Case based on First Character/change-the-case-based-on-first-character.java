class Solution {
    String modify(String s) {
        if(s.charAt(0)>='A' && s.charAt(0)<='Z') return s.toUpperCase();
        else return s.toLowerCase();
    }
}