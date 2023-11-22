import java.util.Scanner;

public class Permutation{
//Permutation
    public static void permutation(String s,String d){
        if(s.length()==0){
            System.out.println(d);
            return;
        }

        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            String lsub= s.substring(0, i);
            String rsub= s.substring(i+1);
            String w=lsub+rsub;
            permutation(w,d+c);
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Permutation String : ");
        String s= sc.next();
        permutation(s, "");
    }
}
