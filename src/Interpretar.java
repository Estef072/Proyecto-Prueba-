import java.util.ArrayList;
import java.util.HashMap;

public interface Interpretar {
    public ArrayList<String> sepTokens(String inputLisp);
    public void crearAST(ArrayList<String> pila);
    public void interpretarMap(ArrayList<HashMap<String, String>> exp);
    public void categorizar(String input);



}
