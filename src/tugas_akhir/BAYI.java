/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_akhir;

import java.util.Scanner;

class BAYI {

    public BAYI() {
        GARIS GARIS;
        END END;
        int umur,i,b,k,l;
        char p;
        GARIS = new GARIS();
        System.out.println(" |           ~KATEGORI 4.BAYI 0-12BULAN~            |");
        GARIS = new GARIS();
        System.out.print(" MASUKKAN USIA    (BULAN)    :  ");
        Scanner a = new Scanner(System.in);
        umur = a.nextInt();
        System.out.print(" APAKAH ANDA MENGETAHUI BERAT BADAN ANDA  ??  Y/T  ");
        Scanner pilih = new Scanner(System.in);
        p = pilih.next().charAt(0);
        if ( p == 'T' | p == 't' ){
            i = (umur/2)+4;
            System.out.println(" BERAT IDEAL ANDA ADALAH "+i);
            END = new END();
        }
        else if ( p == 'Y' | p == 'y'){
            System.out.print(" MASUKKAN BERAT ANDA SAAT INI :  ");
            Scanner B = new Scanner(System.in);
            b = B.nextInt();
            i = (umur/2)+4;
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
