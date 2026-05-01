public class RemoveNonAlphabets {
    public static void main(String[] args) {
        String str = "Hello123 World!";
        String result = "";

        for (char c : str.toCharArray()) {
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                result += c;
            }
        }

        System.out.println("Only alphabets: " + result);
    }
}

