
package modul2;

public class tugasBus {

    public double penumpang;
    public double maxpenumpang;
    public double beratpenumpang;

    public tugasBus(double maxpenumpang) {
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }

    public void addpenumpang(double penumpang) {
        double temp;
        temp = this.penumpang + penumpang;
        if (temp > maxpenumpang) {
            System.out.println(" penumpang melebihi kuota");
        } else {
            this.penumpang = temp;
        }
    }

    public void getpenumpang(double password) {
        if (password == 12) {
            System.out.println("Password Benar");
        } else {
            System.out.println("Pasword salah");
        }
    }

    public void getAverage(double berat) {
        double temp;
        temp = this.beratpenumpang + beratpenumpang;
        double rataRata = temp / penumpang;
        this.beratpenumpang = rataRata;
    }

    public void cetakpenumpang() {
        System.out.println("Penumpang bus sekarang = " + penumpang);
        System.out.println("Max penumpang seharusnya = " + maxpenumpang);
        System.out.println("Rata-Rata berat penumpang = " + beratpenumpang);

    }
}
