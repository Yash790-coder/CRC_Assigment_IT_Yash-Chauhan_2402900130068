public class CopyString {
    public static void main(String[] args) {
        String str1 = "Java Programming";
        char[] source = str1.toCharArray();
        char[] dest = new char[source.length];

        System.arraycopy(source, 0, dest, 0, source.length);

        String str2 = new String(dest);
        System.out.println("Copied string: " + str2);
    }
}

