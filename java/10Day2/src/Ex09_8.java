class UserException extends Exception{
    public UserException(String mesg){
        super(mesg);
    }
}

public class Ex09_8 {
    public static void check(int num) throws UserException{
        if (num<100){
            throw new UserException("num값이 100보다 작다");
        }
    }
    public static void main(String[] args) {
        System.out.println("프로그램 시작");
        try{
            check(70);
        }catch(UserException e){
            System.out.println("예외발생 : " + e.getMessage());
        }
        System.out.println("프로그램 정상 종료");
    }
}
