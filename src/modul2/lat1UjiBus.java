package modul2;

public class lat1UjiBus {

    public static void main(String[] arg) {
        //membuat objek busMini dari kelas bus
        lat1bus busMini = new lat1bus();
        //memasukkan nilai jumlah penumpang dan penumpang maksimal ke
        //dalam objek busMini
        busMini.penumpang = 5;
        busMini.maxPenumpang = 15;
        //memanggil method cetak pada kelas bus
        busMini.cetak();

        //menambahkan penumpang pada bus mini
        busMini.penumpang = busMini.penumpang + 5;
        //memanggil method cetak pada kelas bus
        busMini.cetak();

        //mengurangi jumlah penumpang pada busMini
        busMini.penumpang = busMini.penumpang - 2;
        busMini.cetak();

        //menambahkan jumlah penumpang pada busMini
        busMini.penumpang = busMini.penumpang + 8;
        busMini.cetak();
    }
}
