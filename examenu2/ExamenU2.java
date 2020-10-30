package examenu2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExamenU2 {

    public static void main(String[] args) {
       List listakate=new ArrayList(4);
       List listakate2=new ArrayList(4);
       //List listakate3=new ArrayList();
       int opc;
       Scanner c=new Scanner(System.in);
       
        System.out.println("Números");
        for(int i=0;i<=9;i++){
            System.out.println("Ingresa un número");
            opc=c.nextInt();
          
            if (opc%2==0){
                listakate.add(opc);
                if(listakate.isEmpty()){
            System.out.println("Ya no puedes ingresar pares");}
               // else{listakate.add(opc);}
            }else{
                listakate2.add(opc);
                if(listakate2.isEmpty()){
            System.out.println("Ya no puedes ingresar pares");}
            //else{listakate2.add(opc);}
       
    }}
            
            
            System.out.println("************");
            for(int k=0;k<listakate.size();k++){
                System.out.print(listakate2.get(k)+" ");
               System.out.print(listakate.get(k)+" ");
           // for(int j=0;j<listakate2.size();j++){
            
            
            }System.out.println("");
            System.out.println("************");
           
                  //}
        
       /* 
        if(listakate.isEmpty()){
            System.out.println("La lista está vacía"); 
        
        }else{
            System.out.println("************");
            for(int i=0;i<listakate.size();i++){
            System.out.print(listakate.get(i)+" ");
            } */
        }
    }
    
