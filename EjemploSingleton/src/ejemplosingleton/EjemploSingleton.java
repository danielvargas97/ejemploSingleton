package ejemplosingleton;

/**
 *
 * @author VARGAS
 */
import ejemplo.Singleton;
public class EjemploSingleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Singleton ejemploUno = Singleton.getInstance();
        Singleton ejemploDos = Singleton.getInstance();
        
        ejemploUno.saludar("Hola que hacen. Un ejemplo de Singleton o que hacen :v");
        
        System.out.println(ejemploUno.getSaludo());
        System.out.println(ejemploDos.getSaludo());
        
        
    }
    
}
