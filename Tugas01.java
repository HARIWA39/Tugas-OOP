package latihan01;
import javax.swing.JOptionPane;
/**
 *
 * @author HARIWA
 * HARI PUTRA MAHA DEWA L
 * 2201010683
 * 18/03/2024
 * 
 */
public class Tugas01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String inputAlas = JOptionPane.showInputDialog("Masukkan alas segitiga: ");
        double alas = Double.parseDouble(inputAlas);
        
        String inputTinggi = JOptionPane.showInputDialog("Masukkan tinggi segitiga: ");
        double tinggi = Double.parseDouble(inputTinggi);
        
        double luas = (alas * tinggi) / 2;
        
        JOptionPane.showMessageDialog(null, "Luas segitiga adalah: " + luas);
    }
    
}
