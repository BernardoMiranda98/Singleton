
package singleton;


public class Principal {

   
    public static void main(String[] args) {
        
        
        SingleObject object1 = SingleObject.getInstance();
        object1.showMessage();
        
         SingleObject object2 = SingleObject.getInstance();
        object1.showMessage();
    }
    
}
