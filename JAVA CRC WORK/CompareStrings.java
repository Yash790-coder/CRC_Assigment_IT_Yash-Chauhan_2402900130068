public class CompareStrings {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Java";
        boolean equal = true;

        if (str1.length() != str2.length()) {
            equal = false;
        } else {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    equal = false;
                    break;
                }
            }
        }

        if (equal) System.out.println("Strings are equal");
        else System.out.println("Strings are not equal");
    }
}
