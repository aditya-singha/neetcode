// class Solution {
//     public boolean isPalindrome(String s) {
//         if (s == null || s.length() == 0) return true;
//         int left = 0;
//         int right = s.length() - 1;
//         while (left < right) {
//             char l = s.charAt(left);
//             if (!((l >= 'A' && l <= 'Z') || 
//                (l >= 'a' && l <= 'z') || 
//                (l >= '0' && l <= '9'))) {
//                 left++;
//                 continue;
//             }
//             char r = s.charAt(right);
//             if (!((r >= 'A' && r <= 'Z') || 
//                (r >= 'a' && r <= 'z') || 
//                (r >= '0' && r <= '9'))) {
//                 right--;
//                 continue;
//             }
//             if ((char) (l | 32) != (char) (r | 32)) {
//                 return false;
//             }
//             left++;
//             right--;
//         }
//         return true;
//     }
    
// }

class Solution {
    public boolean isPalindrome(String s) {
        int left =0;

        int right = s.length()-1;
        String s2 = s.toLowerCase();
        while(left< right){
            while( left< right && !Character.isLetterOrDigit(s2.charAt(left))){
                left++;
            }
            while( left< right && !Character.isLetterOrDigit(s2.charAt(right))){
                right--;
            }
            if(s2.charAt(right) != s2.charAt(left)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
