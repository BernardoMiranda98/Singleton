/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;


public class SingleObject {
    private static SingleObject instance;
    
    private SingleObject(){
         }
    
         public static SingleObject getInstance(){
             if (instance == null) {
                 instance = new SingleObject ();
             }
             return instance;
         }
         public void showMessage(){
             System.out.println("Single Object:" + this);
         }
}