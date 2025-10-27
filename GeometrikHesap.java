/* ADI:Halid
SOYADI:Elnehsen
TARİH:27.10.2025
ACIKLAMA:GeometrikHesapJava
*/
package geometrikhesap.java;
import java.util.Scanner;

public class GeometrikHesapJava {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.print("daire r=");
        float pi= 3.14f;
        double r= input.nextDouble();
      double dairealani = pi*r*r;
        System.out.printf(" daire alani:%.2f\n",dairealani);
                
        double dairecevresi=2*pi*r;
        System.out.printf(" daire cevresi:%.2f\n",dairecevresi);
        
        double dairecapi = 2*r;
        System.out.printf("daire capi:%.2f\n",dairecapi);
      double kurehacmi = (4/3)*pi*r*r*r;
        System.out.printf("kure hacmi :%.2f\n",kurehacmi);
        
        double kureYuzeyAlani =4*pi*r*r;
        System.out.printf("kure yuzey alani:%.2f\n",kureYuzeyAlani);
    } 
}
