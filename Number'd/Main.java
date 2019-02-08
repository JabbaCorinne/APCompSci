import java.util.ArrayList;

public class Main {

    public static int max= 9;

    public static void main(String[] args) {

        //numbers can be changed as desired
        int[] numbers = {0, 1, 63, 127, 255, 256};
        System.out.println("\nConverter for Base Values 2, 8, and 16:");
        for (int x : numbers) {
            System.out.printf("%3d: (Binary) %s (Octal) %s (Hex) %s\n", x, toBinary(x), toOctal(x), toHex(x));
        }

        //extra credit
        System.out.println("\nCustom Base Value Converter:");
        for (int x : numbers) {
            //insert desired base value below
            System.out.printf("%3d: %s\n", x, toCustomBase(x, 10));
        }
    }


    public static String toBinary(int dec){

        String binary= "";
        ArrayList binaryList = new ArrayList();

        for (int digits= max; digits > 0; digits-- ) {
            int digitBaseValue= (int) Math.pow(2, digits- 1);
            int binaryIntAtDigit= dec/digitBaseValue;
            binaryList.add(binaryIntAtDigit);
            dec= dec%digitBaseValue;
        }

        for(int i= 0; i < max; i++){
            binary+=binaryList.get(i).toString();
        }

        return binary;
    }


    public static String toOctal(int dec){

        String octal= "";
        ArrayList octalList= new ArrayList();

        for (int digits= max; digits > 0; digits-- ) {
            int digitBaseValue= (int) Math.pow(8, digits- 1);
            int octalIntAtDigit= dec/digitBaseValue;
            octalList.add(octalIntAtDigit);
            dec= dec%digitBaseValue;
        }

        for(int i = 0; i < max; i++){
            octal+=octalList.get(i).toString();
        }

        return octal;
    }

    public static String toHex(int dec){

        String hex = "";

        ArrayList<String> hexStrings = new ArrayList();
        hexStrings.add("0");
        hexStrings.add("1");
        hexStrings.add("2");
        hexStrings.add("3");
        hexStrings.add("4");
        hexStrings.add("5");
        hexStrings.add("6");
        hexStrings.add("7");
        hexStrings.add("8");
        hexStrings.add("9");
        hexStrings.add("A");
        hexStrings.add("B");
        hexStrings.add("C");
        hexStrings.add("D");
        hexStrings.add("E");
        hexStrings.add("F");

        ArrayList hexDigits= new ArrayList();

        for (int digit= max; digit > 0; digit--) {
            int digitBaseValue= (int) Math.pow(16, digit - 1);
            int hexIntAtDigit= dec/digitBaseValue;
            hexDigits.add(hexStrings.get(hexIntAtDigit));
            dec= dec%digitBaseValue;
        }

        for(int i= 0; i < hexDigits.size(); i++){
            hex+= hexDigits.get(i);
        }

        return hex;
    }

    //Extra Credit
    public static String toCustomBase(int dec, int baseVal){

        String convertedVal = "(Selected base: " + Integer.toString(baseVal) + ") ";

        if(baseVal>16){
            return convertedVal + "invalid base- must be 16 or less";
        }

        ArrayList<String> baseValStr = new ArrayList();
        baseValStr.add("0");
        baseValStr.add("1");
        baseValStr.add("2");
        baseValStr.add("3");
        baseValStr.add("4");
        baseValStr.add("5");
        baseValStr.add("6");
        baseValStr.add("7");
        baseValStr.add("8");
        baseValStr.add("9");
        baseValStr.add("A");
        baseValStr.add("B");
        baseValStr.add("C");
        baseValStr.add("D");
        baseValStr.add("E");
        baseValStr.add("F");

        ArrayList digits= new ArrayList();

        for (int digC= max; digC > 0; digC-- ) {
            int positionBaseVal= (int) Math.pow(baseVal, digC-1);
            int intAtPosition= dec/positionBaseVal;
            digits.add(baseValStr.get(intAtPosition));
            dec= dec%positionBaseVal;
        }

        for(int i= 0; i < digits.size(); i++){
            convertedVal+=digits.get(i);
        }

        return convertedVal;
    }
}