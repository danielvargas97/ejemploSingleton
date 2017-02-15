package ejemplo;

/**
 *
 * @author VARGAS
 */
public class Singleton {
    private static Singleton mySingleton;
    private String saludo;
    
    private Singleton(){}
    
    public static Singleton getInstance(){
        if(mySingleton == null){
            mySingleton = new Singleton();
        }
        return mySingleton;
    }
    
    public void saludar(String mensaje){
        this.saludo = mensaje;
    }
    
    public String getSaludo(){
        return this.saludo;
    }
}
