package td3.src.main.java.fr.ubordeaux.ao;

/**
 *
 * @author Adri
 */
public class Compare {
    
    static int compare(String str1, String str2) {
        if(str1.equals(str2)) return 0;
        for(int i = 0; i < str1.length(); i++) {
            if(i >= str2.length()) return 1;
            if(str1.charAt(i) > str2.charAt(i)) return 1;
            if(str1.charAt(i) < str2.charAt(i)) return- 1;
        }
        return -1;
    }
}
