package split;

public class split {
    public static void main(String[] args) {
        String data = "aa/bb/cc,dd/ee/xx,kk/yy/zz";
        data = data.replaceAll(",", "/");
        String[] result = data.split("/");
        for(String s : result){
            System.out.println(s);
        }
        
    }    
}
