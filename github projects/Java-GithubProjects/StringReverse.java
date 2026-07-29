public class StringReverse {
    public static void main(String[] args) {
        String str = "Renu";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reversed);
    }
}
