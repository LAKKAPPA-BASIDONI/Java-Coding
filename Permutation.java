import java.util.Scanner;

public class Permutation{

    public static void permute(String s,String d){
        if(s.length()==0){
            System.out.println(d);
            return;
        }

        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            String lsub= s.substring(0, i);
            String rsub= s.substring(i+1);
            String w=lsub+rsub;
            permute(w,d+c);
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Permutation String : ");
        String s= sc.next();
        permute(s, "");
    }
}