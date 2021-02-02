public class Ex08_9 {
    public static void main(String[] args) {
        int num = 10;
        Integer num2 = num;
        System.out.println(num==num2);


        Object[] obj = {10, "홍길동", 3.14, true, 'a'};
        for(Object o : obj){
            System.out.println(o);
        }
        
    }

    
}
