import java.util.ArrayList;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]){
        InterFun inter = new InterFun();
        inter.crearAST(inter.sepTokens("(* (+ 1 2 3) 2 3)"));
        ArrayList<Map<String, String>> j = new ArrayList<>();
        inter.crearParentesis(j);


        /*
        1 2 3 2 3
        * +
         */

    }
}
