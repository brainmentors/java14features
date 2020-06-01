public class NPE {
    public static void main(String[] args) {
        // Problem Before Java 14
        String name = null;
        System.out.println(name.toUpperCase());
    }
}
