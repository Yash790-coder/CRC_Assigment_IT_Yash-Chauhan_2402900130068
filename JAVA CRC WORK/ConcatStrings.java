public class ConcatStrings {
    public static void main(String[] args) {
        String str1 = "Hello ";
        String str2 = "World";
        String result = "";

        for (char c : str1.toCharArray()) result += c;
        for (char c : str2.toCharArray()) result += c;

        System.out.println("Concatenated string: " + result);
    }
}
