package modul2;

public class lat2Ujibus {

    public static void main(String[] arg) {

        //membuat objek busBesar dari class Bus
        lat2Bus busBesar = new lat2Bus(40);
        busBesar.cetak();

        //penambahan penumpang
        busBesar.addPenumpang(15);//menambahkan 15 penumpang
        busBesar.cetak();

        //penambahan penumpang
        busBesar.addPenumpang(5);//menambahkan 5 penumpang

        //penambahan penumpang
        busBesar.addPenumpang(26);//menambahkan 26 penumpang
        busBesar.cetak();
    }
}
