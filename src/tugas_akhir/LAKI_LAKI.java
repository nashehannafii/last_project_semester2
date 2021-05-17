/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_akhir;
import java.awt.BorderLayout;
import java.util.Scanner;
class LAKI_LAKI {

    public LAKI_LAKI() {
        GARIS GARIS;
        END END;
        int tinggi,i,b,k,l;
        char p;
        GARIS = new GARIS();
        System.out.println(" |             ~KATEGORI 1.LAKI LAKI~               |");
        GARIS = new GARIS();
        System.out.print(" MASUKKAN TINGGI BADAN (CM)  :  ");
        Scanner a = new Scanner(System.in);
        tinggi = a.nextInt();
        System.out.print(" APAKAH ANDA MENGETAHUI BERAT BADAN ANDA  ??  Y/T  ");
        Scanner pilih = new Scanner(System.in);
        p = pilih.next().charAt(0);
        if ( p == 'T' | p == 't' ){
            i = (tinggi-100)-((tinggi-100)*10/100);
            System.out.println(" BERAT IDEAL ANDA ADALAH "+i);
            END = new END();
        }
        else if ( p == 'Y' | p == 'y'){
            System.out.print(" MASUKKAN BERAT ANDA SAAT INI :  ");
            Scanner B = new Scanner(System.in);
            b = B.nextInt();
            i = (tinggi-100) - ((tinggi-100)*10/100);
            k = i - b;
            l = b - i;
            if (b>i){
                System.out.println(" \"MAKA BERAT ANDA 'TERLALU BERAT' SEBANYAK "+l+" KG\"");
                System.out.println("    NB : 'SILAHKAN DIET' ");
            }
            else if (b<i){
                System.out.println(" \"MAKA BERAT ANDA 'KURANG' "+k+" KG\"");
                System.out.println("    NB : 'BANYAK BANYAK MAKAN' ");        
            }
            else{
                System.out.println("  'SELAMAT BERAT ANDA SUDAH IDEAL' ");
            }
            END = new END();
        }
        else{
            GARIS = new GARIS();
            System.out.println("             ~MAAF PERINTAH ANDA SALAH~  ");
        }
    }    
}
