package Crypto.src;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13  {
Character cs;
Character cf;
int shift;//=this.cf.charValue()-this.cs.charValue();
    ROT13(Character cs, Character cf) {
        this.cs=cs;
        this.cf=cf;
        this.shift=cf.charValue()-cs.charValue();
    }

    ROT13() {
    }


    public String crypt(String text) throws UnsupportedOperationException {

        String result="";
        char alphabet;
        for(int i=0;i<text.length();i++) {
            alphabet = text.charAt(i);
            if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z') {
                alphabet = (char) (text.charAt(i) + shift);
                if (alphabet > 'z') {
                    alphabet = (char) (alphabet -26);
                }
                result = result + alphabet;
            } else if (text.charAt(i) >= 'A' && text.charAt(i) <= 'Z') {
                alphabet = (char) (text.charAt(i) + shift);
                if (alphabet > 'Z') {
                    alphabet = (char) (alphabet -26);
                }
                result = result + alphabet;
            } else
                result = result + alphabet;
        }
        return result;
    }

    public String encrypt(String text) {

        return crypt(text);
    }

    public String decrypt(String text) {

        return crypt(text);
    }

    public static String rotate(String s, Character c) {
        String result="";
        String result1="";
    int shift=c.charValue()-65;
    for(int i=0;i<shift;i++){
        char alphabet=s.charAt(i);
        alphabet = (char) (s.charAt(i));
        result1+=alphabet;
    }
    for(int i=shift;i<s.length();i++) {
        char alphabet=s.charAt(i);      //use substrings cool
        alphabet = (char) (s.charAt(i));
        result+=alphabet;
    }
        return result+result1;
    }

}
