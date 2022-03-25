package algorithm;

public class ToLowerCase {
    public static void main(String[] args) {
        String b = "ZJJhhh";
//        System.out.println(toLowerCase(b));
        System.out.println(lengthOfLastWord("a "));
    }

    public static String toLowerCase(String str) {
        if(str == null || str.length() == 0){
            return str;
        }

        StringBuilder stringBuild = new StringBuilder();
        for(int i = 0; i < str.length(); i ++) {
            char k = str.charAt(i);
            if(k >= 'A' && k <= 'Z') {
                stringBuild.append((char)(k + 32));
            } else {
                stringBuild.append(k);
            }
        }
        return stringBuild.toString();
    }

    public static int lengthOfLastWord(String s) {
        if(s == null || s.isEmpty()) {
            return 0;
        }
        String k = s.trim();
        int count = 0;
        for(int i = s.length()-1; i >= 0; i--) {
            if (s.charAt(i) == ' ')
                break;
            if (s.charAt(i) != ' '){
                ++count;
            }
        }
        return count;

    }
}
