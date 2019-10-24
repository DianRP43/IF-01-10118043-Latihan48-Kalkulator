
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kalkulator k = new Kalkulator();
        double v1,v2;
        Scanner input = new Scanner(System.in);
        System.out.println("V1 : ");
        v1 = input.nextDouble();
        k.setV1(v1);
        System.out.println("V2 : ");
        v2 = input.nextDouble();
        k.setV2(v2);
        k.cetak();
        
        
        
    }
    
}
