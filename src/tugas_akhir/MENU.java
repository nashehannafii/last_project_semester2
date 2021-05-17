/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_akhir;
import java.util.Scanner;
public class MENU {
    MENU(){
        LAKI_LAKI LAKI_LAKI;
        GARIS GARIS;
        WANITA WANITA;
        ANAK ANAK;
        BAYI BAYI;
        MENU MENU;
        IBU IBU;
        int x ;
        GARIS = new GARIS();
        System.out.println(" || JENIS JENIS KATEGORI :                          ||");
        System.out.println(" ||  1. LAKI LAKI DEWASA                            ||");
        System.out.println(" ||  2. WANITA DEWASA                               ||");
        System.out.println(" ||  3. ANAK ANAK 1 - 10 TH                         ||");
        System.out.println(" ||  4. BAYI 0 - 12 BULAN                           ||");
        System.out.println(" ||  5. IBU HAMIL                                   ||");
        GARIS = new GARIS();
        System.out.print("  ~ MASUKKAN KATEGORI ANDA  :   ");
        Scanner pilihan = new Scanner(System.in);
        x = pilihan.nextInt();
        switch (x){
            case 1:
                LAKI_LAKI = new LAKI_LAKI();
                break;
            case 2:
                WANITA = new WANITA();
                break;
            case 3:
                ANAK = new ANAK();
                break;
            case 4:
                BAYI = new BAYI();
                break;
            case 5:
                IBU = new IBU();
                break;
            default:
            GARIS = new GARIS();
            System.out.println("                MAAF PILIHAN ANDA SALAH ");
            System.out.println("                  --SILAHKAN ULANGI--   ");
        }
    }
}
