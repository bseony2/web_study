package workshop07;

import java.util.Scanner;

public class ListTest01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("정수 입력 : "); int num = scan.nextInt();

        MakeList list = new MakeList(num);
        for(int i=0;i<list.list.size();i++){
            System.out.print(list.list.get(i) + " ");
        }
        System.out.println();
        System.out.println("평균 : " + list.getAverage());
    }

    
}
