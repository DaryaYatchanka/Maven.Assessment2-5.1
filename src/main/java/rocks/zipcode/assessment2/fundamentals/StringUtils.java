package rocks.zipcode.assessment2.fundamentals;

import java.util.Collection;
import java.util.Collections;

/**
 * @author leon on 28/11/2018.
 */
public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {

        return String.format("%"+amountOfPadding+"s",stringToBePadded);
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {

        return String.format("%-"+amountOfPadding+"s", stringToBePadded);
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        String repeated = String.join("", Collections.nCopies(numberOfTimeToRepeat,stringToBeRepeated));
        return repeated;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {

        return string.matches("[a-zA-Z ]");
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        for (int i = 0; i <string.length() ; i++) {
            if("1234567890".contains(Character.valueOf(string.charAt(i)).toString())){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        for (int i = 0; i <string.length(); i++) {
            if("!@$%^&*||()".contains(Character.valueOf(string.charAt(i)).toString())){
                continue;
            }
            return false;

        }
        return true;
    }
}
