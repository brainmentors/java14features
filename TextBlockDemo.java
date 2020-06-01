public class TextBlockDemo {
    public static void main(String[] args) {
        // IN eariler version
        String msg = "Learn Java 14 Feature \n"+
                " 1. TextBlock\n"+
                "2. Records";
        // Now  from Java 14
        String str = """
                Learn Java 14 Feature
                1. Text Block
                2. Records\
                \s3.Switch Expression
                """;
        System.out.println(str);
        // Using Formatting
        int a = 100;
        int b = 200;
        int c =  a + b;
        String msg2 = """
                A is %d , 
                B is %d 
                C is %d
                """.formatted(a,b,c);
        System.out.println(msg2);
    }
}

