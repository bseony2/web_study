public class WrapperTest {
    public static void main(String[] args) {
        int num=10;
        Integer objnum = new Integer(10);
        //10이 기본형이 아닌 Integer라는 wrapper class가 됨(객체 10)
        System.out.println(objnum.MAX_VALUE);
        int pdtnum = objnum.intValue();
        System.out.println(pdtnum);
    }
}
