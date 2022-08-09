import java.util.regex.*;

public class LongestCommonPrefix {

    private String[] inputArray;

    public void getLognestCommotPrefix(String[] strs) {
        inputArray = strs;
        int charIndex = 0;
        if (validateInputArray(inputArray)) {
            while(checkRow(charIndex)) {
                charIndex++;
            }
        }
        System.out.println(inputArray[0].substring(0, charIndex));
    }

    private boolean checkRow(int charIndex) {
        for (int arrayIndex = 0; arrayIndex < inputArray.length-1; arrayIndex++) {
            if (!compareTwoChars(arrayIndex, charIndex)) {
                return false;
            }
        }
        return true;
    }

    private boolean compareTwoChars(Integer arrayIndex, Integer charIndex) {
        try {
            if(inputArray[arrayIndex].charAt(charIndex) == inputArray[arrayIndex + 1].charAt(charIndex)) {
            return true;
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    private boolean validateInputArray(String[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            if (!isInputCorrect(inputArray[i])) {
                return false;
            }
        }
        return true;
    }
    
    private boolean isInputCorrect(String word) {
        Pattern p = Pattern.compile("^[a-z]{0,200}$");
        return p.matcher(word).find();
    }
}