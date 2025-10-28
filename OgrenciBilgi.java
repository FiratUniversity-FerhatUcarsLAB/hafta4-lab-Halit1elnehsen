 /*Adı Soyad:Halid ELNEHSEN
Oğrenci NO:250541617
Tarih:28.10.2025
Açıklama:OgrenciBilgileri
*/
import java.util.Scanner;
public class OgrenciBilgi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ogrenci bilgileri girin");
        
        System.out.print("ad:");
        String ad = input.next();
        
        System.out.print("soyad:");
        String soyad = input.next();
        
        System.out.print("yas:");       
        int yas = input.nextInt();
        
        System.out.print("ogrenci no:");
        int no = input.nextInt();
        
        System.out.print("GPA( 0.00-4.00):");
        double gpa =input.nextDouble();
     
        
        String durum= (gpa>= 2.00)? "Basarili" : "Basarisiz";
        System.out.println("durum: "+durum);            
                
        System.out.println("<==OGRENCİ BİLGİLERİ==>");
        
        System.out.printf("Ad Soyad:  %s %s \n" ,ad,soyad);
        
         System.out.printf("Yas:       %d   \n",yas);
         System.out.printf("Ogrenci No:%d   \n",no);
         System.out.printf("GPA:       %.2f \n",gpa);
         System.out.printf("Durum:     %s   \n",durum);
        
                   input.close();

                
       
        
      
    }
    
}
