public class CharFrequency {
    public static void main(String[] args) {
        String str = "hello world";
        int[] freq = new int[256]; // ASCII size

        for (char c : str.toCharArray()) {
            freq[c]++;
        }

        System.out.println("Character frequencies:");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println((char)i + " : " + freq[i]);
            }
        }
    }
}

