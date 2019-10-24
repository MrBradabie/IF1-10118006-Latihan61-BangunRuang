
package if1.pkg10118006.latihan61.bangunruang;

/*
 * NAMA              : Alfarizi Rizki Pane
 * KELAS             : IF-01
 * NIM               : 10118006
 */
public class Bola extends BangunRuang {
    
    private double r;
    private double volume;

    @Override
    public double hitungVolume() {
        volume = (4*Math.PI*Math.pow(r, 3))/3;
        
        return volume;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    
    
}
