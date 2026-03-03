public class ValidIDandCheckDigit {
    public static void main(String[] args) {
        System.out.println(isValidID("THMBB7092WD114221"));
        System.out.println(isValidID("A001-606X-17X"));
    }
    public static boolean isValidID(String id) {
        int sum = 0;
        for (int i = 0; i < id.length() - 1; i++) {
            char c =  id.charAt(i);
            if (Character.isDigit(c)) {
                int num = Character.getNumericValue(c);
                sum+=num;
            }
        }
        int checkDigit = sum % 11;
        char last = id.charAt(id.length() - 1);
        int lastNum = 0;
        if (Character.isDigit(last)) {
            lastNum = Character.getNumericValue(last);
        } else if (last == 'X') {
            lastNum = 10;
        }

        if (checkDigit == lastNum) {
            return true;
        }
        return false;
    }
}
