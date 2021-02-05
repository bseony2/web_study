package workshop07;
import java.util.ArrayList;

public class MakeList {
    static ArrayList<Integer> list = new ArrayList<Integer>();

    public MakeList(){
    }

    public MakeList(int num){
        for(int i=0; i<num;i++){
            list.add((int)((Math.random() * 10) +10));
        }
    }

    public double getAverage(){
        double avg=0;
        for(int x : list){
            avg += x;
        }
        return avg/list.size();
    }

    public ArrayList<Integer> getList(){
        return list;
    }

}
