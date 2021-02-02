public class String_2 {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("Hello");

        s.append("world");
        System.out.println(s);
        s.insert(5, "!!!");
        System.out.println(s);
        s.delete(0, 5);
        System.out.println(s);

        String data = s.toString();

        
    }
}
