public class StringOperation {
    public static void main(String[] args) {
        // String literal
        String str = "Hello";
        System.out.println(str);

        // String object
        String str1 = new String("Hello2");
        System.out.println(str1);

        // Concatenation
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        // Length
        String quote = "The quick brown fox jumps over the lazy dog.";
        int length = quote.length();
        System.out.println(length);

        // Accessing characters
        char firstChar = quote.charAt(0);
        System.out.println(firstChar);
    }
}
