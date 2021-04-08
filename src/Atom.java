
import java.util.ArrayList;
import java.util.Map;

public class Atom{


    public void traducirA (ArrayList <String>index){
        ArrayList <String> dato = new  ArrayList <String> (); 
        //for (String palabra : index)
        
        
        
        for(int i =0; i<=index.size();i++){
            if(index.get(i).equals("ATOM")){

            }
            else {
                dato.add(index.get(i).toString());

            }
        }
        if (dato.size()==1){
            System.out.println("True");
            
            
        }
        else {
            System.out.println("FALSE");
          

        }
        
    }
}