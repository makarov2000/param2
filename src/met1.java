
public class met1 {
    public static void main (String[] args){
        int s = 0;
        int a;
        int b;
        for(int i=10; i<100; i++ ){
            a = i%10;
            b = i/10;
            s = a*a-2*a*b+b*b;
            if( ((s) > (a+b))){
                System.out.print(s+" ");
            }



        }

    }
}
