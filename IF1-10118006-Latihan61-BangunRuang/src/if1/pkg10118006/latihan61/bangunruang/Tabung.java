
package if1.pkg10118006.latihan61.bangunruang;

/*
 * NAMA              : Alfarizi Rizki Pane
 * KELAS             : IF-01
 * NIM               : 10118006
 */
public class Tabung extends BangunRuang{
    
    private double r;
    private double t;
    private double volume;

    @Override
    public double hitungVolume() {
        volume = Math.PI*Math.pow(r, 2)*t;
        
        return volume;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }
    
    
    
}
