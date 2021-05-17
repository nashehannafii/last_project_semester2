/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_akhir;

import java.util.Scanner;
class IBU {

    public IBU() {
        GARIS GARIS;
        END END;
        int tinggi,i,b,k,l,umur;
        char p;
        GARIS = new GARIS();
        System.out.println(" |             ~KATEGORI 5.IBU HAMIL~               |");
        GARIS = new GARIS();
        System.out.print(" MASUKKAN TINGGI BADAN (CM)     :  ");
        Scanner a = new Scanner(System.in);
        tinggi = a.nextInt();
        System.out.print(" MASUKKAN UMUR KEHAMILAN(MINGGU):  ");
        Scanner u = new Scanner(System.in);
        umur = u.nextInt();
        System.out.print(" APAKAH ANDA MENGETAHUI BERAT BADAN ANDA  ??  Y/T  ");
        Scanner pilih = new Scanner(System.in);
        p = pilih.next().charAt(0);
        if ( p == 'T' | p == 't' ){
            i = (tinggi-100)-((tinggi-100)*15/100)+((umur*35)/100);
            System.out.println(" BERAT IDEAL ANDA ADALAH "+i);
            END = new END();
        }
        else if ( p == 'Y' | p == 'y'){
            System.out.print(" MASUKKAN BERAT ANDA SAAT INI :  ");
            Scanner B = new Scanner(System.in);
            b = B.nextInt();
            i = ((tinggi-100) - ((tinggi-100))*15/100)+((umur*35)/100);
            k = i - b;
            l = b - i;
            if (b>i){
                System.out.println(" \"MAKA BERAT ANDA 'TERLALU BERAT' SEBANYAK "+l+" KG\"");
                System.out.println("    NB : 'SILAHKAN KURANGI MAKAN' 'SEMOGA SEHAT SELALU' ");
            }
            else if (b<i){
                System.out.println(" \"MAKA BERAT ANDA 'KURANG' "+k+" KG\"");
                System.out.println("    NB : 'BANYAK BANYAK MAKAN' 'SEMOGA SEHAT SELALU'");        
            }
            else{
                System.out.println("  'SELAMAT BERAT ANDA SUDAH IDEAL' 'SEMOGA SEHAT SELALU'");
            }
            END = new END();
        }
        else{
            GARIS = new GARIS();
            System.out.println("             ~MAAF PERINTAH ANDA SALAH~  ");
        }
    }
    
}
