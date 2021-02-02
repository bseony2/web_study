public class String_1 {
    public static void main(String[] args) throws Exception {
        String s3 = "홍길동/이순신/유관순";
        String[] names = s3.split("/");
        for(int x=0; x<names.length; x++){
            System.out.println(names[x]);
        }

        System.out.println(String.valueOf(123));
        System.out.println(123+"");
    }
}
