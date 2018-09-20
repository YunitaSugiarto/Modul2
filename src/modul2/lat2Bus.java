package modul2;

public class lat2Bus {

    private int penumpang;
    private int maxPenumpang;

    //konstruktor kelas bus
    public lat2Bus(int maxPenumpang) {
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }

    //method mutator untuk menambahkan penumpang 
    public void addPenumpang(int penumpang) {
        int temp;
        temp = this.penumpang + penumpang;
        if (temp >= maxPenumpang) {
            System.out.println("Penumpang melebihi kuota");
        } else {
            this.penumpang = temp;
        }
    }

    public void cetak() {
        System.out.println("Penumpang bus sekarang adalah " + penumpang);
        System.out.println("Penumpanh maksimum seharusnya adalah " + maxPenumpang);
    }
}
