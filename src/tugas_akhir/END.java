/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_akhir;

/**
 *
 * @author nashe
 */
import java.util.Scanner;
public class END {
    END (){
        MENU MENU;
        GARIS GARIS;
        char x;
        System.out.print(" APAKAH ANDA INGIN MENGUKUR BERAT BADAN LAGI ? Y/T  ");
        Scanner X = new Scanner(System.in);
        x = X.next().charAt(0);
        if ( x == 'Y'| x == 'y' ){
            MENU = new MENU();
        }
        else{
            GARIS = new GARIS();
        System.out.println("            ~TERIMAKASIH ATAS KUNJUNGAN ANDA~ ");
        }
    }
}
