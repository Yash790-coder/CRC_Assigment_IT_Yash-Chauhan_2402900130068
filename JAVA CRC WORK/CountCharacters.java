public class CountCharacters {
    public static void main(String[] args) {
        String str = "Hello World 123";
        int vowels = 0, consonants = 0, digits = 0, spaces = 0;

        str = str.toLowerCase();
        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                    vowels++;
                else
                    consonants++;
            } else if (c >= '0' && c <= '9') {
                digits++;
            } else if (c == ' ') {
                spaces++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);
    }
}

