import java.util.ArrayList;

public class Aritmeticas extends InterpretarF{
    /*
    *, /, +,-
     */
    /**
     * constructor sin parametros
     */
    private Pila<Integer> pila;

    public Aritmeticas() {
        pila = new Pila<>();
    }


    /**
     *override de operar de la interface calculadora
     *sirve para leer el formato postfix y hacer los calculos
     */
    public String expresion(Pila<String> d){
        ArrayList<String> u = new ArrayList<>();
        for(int i = 0; i<d.size();i++){
            u.add(d.peek());
            d.pop();
        }
        String valores = "";
        for(String f: u){
            valores = valores + f;
        }
        return valores;
    }

    public double operar(String p) {
        // TODO Auto-generated method stub


        for (int i = 0; i<p.length();i++) {
            char a = p.charAt(i);

            if (Character.isDigit(a)) {
                pila.push(a -'0');
            }

            else {
                if (p.charAt(i)!= ' ') {

                    int value1 = pila.pop();

                    int value2 = pila.pop();


                    switch (a) {
                        case '+':
                            pila.push(value1+value2);
                            break;
                        case '-':
                            pila.push(value1-value2);
                            break;
                        case '*':
                            pila.push(value1*value2);
                            break;
                        case '/':
                            pila.push(value1/value2);
                            break;
                    }
                }

            }

        }

        return pila.pop();
    }


}

