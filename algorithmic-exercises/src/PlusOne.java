public class PlusOne {

    public int[] plusOne(int[] digits) {
        int index = digits.length-1;
        while(index >= 0 && digits[index] == 9) {
            if(index == 0) {
                return fillArray(digits.length+1);
            }
            digits[index] = 0;
            index--;
        }
        digits[index] = digits[index] +1;
        return digits; 
    }

    private int[] fillArray(int length) {
        int[] result = new int[length];
        result[0] = 1;
        for(int i = 1; i < length; i++) {
            result[i] = 0;
        }
        return result;
    }
}
// взять последний digit и если он < 9 -> +1
// если последний digit = 9 взять индекс -1 и повторить шаг 1, и добавить 1 к counter.
// продолжать до тех пор пока digit не будет < 9 или i != 0
// добавить к digit < 9 +1 и все предыдущие индексы до конца массива заменить на 0
// если индекс 0 == 9 добавить к длинне массива 1 и записать 1 в ячейку 0, во все последующие ячейки +1 записать 0.