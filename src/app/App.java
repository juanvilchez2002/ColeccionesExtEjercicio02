
package app;

import entidad.CantanteFamoso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class App {


    public static void main(String[] args) {
        
        //
        Scanner consola = new Scanner(System.in);
        ArrayList<CantanteFamoso> cf = new ArrayList();
        
        cf.add(new CantanteFamoso("Cristian Castro", "Azul"));
        cf.add(new CantanteFamoso("Rafaga", "La Ventanita"));
        cf.add(new CantanteFamoso("Eroz Ramazzoti", "La cosa mas bella"));
        cf.add(new CantanteFamoso("laura Paussini", "La Soledad"));
        cf.add(new CantanteFamoso("Rata Blanca", "Mujer Amante"));
        
        String op;
        String cantante;
        String disco, cantanteEliminar;
        boolean flagD = true;
        
        do{
            System.out.println("1. Adicionar otro cantante.");
            System.out.println("2. Mostrar todos los cantantes.");
            System.out.println("3. Eliminar cantante.");
            System.out.println("4. Salir.");
            System.out.println("Eliga una opción");
            op = consola.nextLine();
            
            switch(op){
                case "1":
                    System.out.print("Nuevo cantante: ");
                    cantante = consola.nextLine();
                    System.out.print("Disco: ");
                    disco = consola.nextLine();
                    cf.add(new CantanteFamoso(cantante, disco));
                    break;
                case "2":
                    System.out.println("--- Listado Cantantes ---");
                    for(CantanteFamoso cfp: cf){
                        System.out.println("Cantante: "+cfp.getCantante()+"   -   Disco: "+cfp.getDisco());
                    }
                    break;
                case "3":
                    boolean flag = true;
                    Iterator<CantanteFamoso> itCF = cf.iterator();
                    System.out.print("Ingrese cantante a eliminar: ");
                    cantanteEliminar = consola.nextLine();
                    while(itCF.hasNext()){
                        if(itCF.next().getCantante().equalsIgnoreCase(cantanteEliminar)){
                            itCF.remove();
                            System.out.println("Registro Eliminado");
                            flag=false;
                        }
                    }
                    if(flag) System.out.println("Registro No Existe");
                    break;
                case "4":
                    System.out.println("Saliendo...");
                    flagD = false;
                    break;
                default:
                    System.out.println("Opcion invalida...");                    
            }        
        }while(flagD);
        
        System.out.println("--- Listado Cantantes : Actual ---");
        for(CantanteFamoso cfp: cf){
            System.out.println("Cantante: "+cfp.getCantante()+"   -   Disco: "+cfp.getDisco());
        }
    }
    
}
