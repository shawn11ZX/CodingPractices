package Q1;

/**
 * to convert String to char[], the length of char[] should be (str.length+1) * 3 to allow ending '\0'
 */
public class Q1_3 {
    static public char[] URLify(char[] str) {
        int blankCount = 0;
        int length = 0;
        for(;str[length] != '\0'; length++)
            if (str[length] == ' ')
                blankCount++;
        int destIndex = length + blankCount*2;
        for(int i = length-1;i>=0; i--) {
            if (str[i] == ' ') {
                destIndex -= 3;
                str[destIndex] = '%';
                str[destIndex+1] = '2';
                str[destIndex+2] = '0';
            }
            else {
                destIndex -= 1;
                str[destIndex] = str[i];
            }
        }
        return str;
    }
}
