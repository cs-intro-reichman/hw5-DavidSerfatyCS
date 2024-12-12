

/**
 * A library of string functions.
 */
public class MyString {
    public static void main(String args[]) {
        System.out.println(subsetOf("desk", "desjzkkgau"));
        System.out.println(remove("paracaidas", "caidas"));
        System.out.println(randomStringOfLetters(8));
        System.out.println(spacedString("Prueba"));
        String hello = "hello";
        System.out.println(countChar(hello, 'h'));
        System.out.println(countChar(hello, 'l'));
        System.out.println(countChar(hello, 'z'));
        System.out.println(spacedString(hello));
        //// Put your other tests here.
    }

    /**
     * Returns the number of times the given character appears in the given string.
     * Example: countChar("Center",'e') returns 2 and countChar("Center",'c') returns 0. 
     * 
     * @param str - a string
     * @param c - a character
     * @return the number of times c appears in str
     */
    public static int countChar(String str, char ch) {

        int count = 0;

    for (int i = 0; i < str.length(); i++) 
    {
       boolean isCharAt = str.charAt(i) == ch;
       if (isCharAt) { count++; }
        
    }
        return count;
    }

    /** Returns true if str1 is a subset string str2, false otherwise
     *  Examples:
     *  subsetOf("sap","space") returns true
     *  subsetOf("spa","space") returns true
     *  subsetOf("pass","space") returns false
     *  subsetOf("c","space") returns true
     *
     * @param str1 - a string
     * @param str2 - a string
     * @return true is str1 is a subset of str2, false otherwise
     */
    public static boolean subsetOf(String str1, String str2) {
        
        String newStr2 = str2;

        for ( int i = 0  ; i < str1.length() ; i++) {
           
               char charStr1 = str1.charAt(i);
               
               int index = newStr2.indexOf(String.valueOf(charStr1));
                if (index == -1) { return false; }
                newStr2 = remove(newStr2, String.valueOf(charStr1));
                 }
                 
            
            return true;
        }
    
    /** Returns a string which is the same as the given string, with a space
     * character inserted after each character in the given string, except
     * for the last character. 
     * Example: spacedString("silent") returns "s i l e n t"
     * 
     * @param str - a string
     * @return a string consisting of the characters of str, separated by spaces.
     */
    public static String spacedString(String str) {
       
        String spacedString = "";
    for (int i = 0; i <= str.length(); i++) {
        char spacedLetter = str.charAt(i);
        spacedString += spacedLetter + " ";
    }
    spacedString += str.charAt(str.length() - 1);
     


        return spacedString;
    }
  
    /**
     * Returns a string of n lowercase letters, selected randomly from 
     * the English alphabet 'a', 'b', 'c', ..., 'z'. Note that the same
     * letter can be selected more than once.
     * 
     * Example: randomStringOfLetters(3) can return "zoo"
     * 
     * @param n - the number of letter to select
     * @return a randomly generated string, consisting of 'n' lowercase letters
     */
    public static String randomStringOfLetters(int n) {
        
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char [] alphaChar = alphabet.toCharArray();

        String randomStr = "";

        for (int i = 0; i < n; i++) 
        {
            int pickALetter = (int) (Math.random() * alphaChar.length);
            randomStr += alphaChar[pickALetter];
        }
        return randomStr;
    }

    /**
     * Returns a string consisting of the string str1, minus all the characters in the
     * string str2. Assumes (without checking) that str2 is a subset of str1.
     * Example: remove("meet","committee") returns "comit" 
     * 
     * @param str1 - a string
     * @param str2 - a string
     * @return a string consisting of str1 minus all the characters of str2
     */
    public static String remove(String str1, String str2) {

        String newString = str1;
    
        for (int i = 0; i < str2.length(); i++) 
        {
           char charToRemove = str2.charAt(i);
           int indexOfChar = newString.indexOf(charToRemove);

           if (indexOfChar != -1) 
           {
           newString = newString.substring(0,indexOfChar) + newString.substring(indexOfChar + 1);
           } 
        }
        return newString;
    }

    /**
     * Returns a string consisting of the given string, with the given 
     * character inserted randomly somewhere in the string.
     * For example, insertRandomly("s","cat") can return "scat", or "csat", or "cast", or "cats".  
     * @param ch - a character
     * @param str - a string
     * @return a string consisting of str with ch inserted somewhere
     */
    public static String insertRandomly(char ch, String str) {
 
         int randomIndex = (int) (Math.random() * (str.length() + 1));
         
         String result = str.substring(0, randomIndex) + ch + str.substring(randomIndex);
         return result;
    }    
}
