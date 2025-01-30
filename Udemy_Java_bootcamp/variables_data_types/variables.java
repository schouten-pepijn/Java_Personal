public class variables {
    public static void main(String[] args) {
        // byte 8 bit: [-128, 127]
        byte age = 127; 
        // short 16 bit: [-32768, 32767]
        short year = 2023;
        // int 32 bit: [-2,147,483,648, 2,147,483,647]
        int population = 1_000_000_000;
        // long 64 bit: [-9,223,372,036,854,775,808, 9,223,372,036,854,775,807]
        long population2 = 1_000_000_000_000_000_000L;


        // float 32 bit: [-3.4E38, 3.4E38]
        float pi = 3.14159f;
        // double 64 bit: [-1.7E308, 1.7E308]
        double pi2 = 3.14159;


        // char 16 bit: [-32,768, 32,767]
        char letter = 'A';
        // boolean 1 bit: true or false
        boolean isTrue = true;

        // a string is a sequence of characters
        String name = "John Doe";

        // implicit casting
        int x = 10;
        double y = x;

        // explicit casting
        double z = 10.5;
        int a = (int) z;
    }
}
