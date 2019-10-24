

package if1.pkg10118006.latihan61.bangunruang;



/*
 * NAMA              : Alfarizi Rizki Pane
 * KELAS             : IF-01
 * NIM               : 10118006
 * Deskripsi Program : Program ini untuk menghitung volume bangun ruang.
 */

public class IF110118006Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Bola bola = new Bola();
        bola.setR(7);
        System.out.println("Hasil : V = "+Math.ceil(bola.hitungVolume()));
        
        Tabung tabung = new Tabung();
        tabung.setR(10);
        tabung.setT(21);
        System.out.println("Hasil V = "+Math.ceil(tabung.hitungVolume()));
        
        Kerucut kerucut = new Kerucut();
        kerucut.setR(14);
        kerucut.setT(9);
        System.out.println("Hasil : V = "+Math.ceil(kerucut.hitungVolume()));
    }
    
}
