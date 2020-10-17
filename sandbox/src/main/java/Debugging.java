public class Debugging {
    public static void main(String[] args) {
        example1();
    }
    private static void example1() {
        String source = "The quick brown fox jumps over the lazy dog";
        StringBuilder reversed = new StringBuilder();
        for (int i = source.length() - 1; i >= 0; i--) {
            reversed.append(source.charAt(i));

        }
        System.out.println(reversed);
    }

}

