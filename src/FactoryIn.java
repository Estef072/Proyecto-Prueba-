public class FactoryIn {

    public FactoryIn() {

    }

    public static InterpretarF fabricar(int interpreterType) {
        switch (interpreterType) {
            case 1: //Interprete para Funciones
                return new Funciones();
                
            case 2: //Interprete para aritmeticas
                return new Aritmeticas();
                
            default:
                System.out.println("No existe en el sistema");
                return null;
        }
    }
}
