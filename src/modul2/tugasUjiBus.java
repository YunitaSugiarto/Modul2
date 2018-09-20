
package modul2;

public class tugasUjiBus {

    public static void main(String[] arg) {
        tugasBus Bus = new tugasBus(10);
        Bus.getpenumpang(12);
        Bus.cetakpenumpang();

        //penambahan penumpang
        Bus.addpenumpang(2);//tambah 2 penumpang
        Bus.getAverage(20);
        Bus.cetakpenumpang();
        
        //penambahan penumpang
        Bus.addpenumpang(2);//tambah 2 penumpang
        Bus.getAverage(30);
        Bus.cetakpenumpang();
        
        //penambahan penumpang
        Bus.addpenumpang(2);//tambah 2 penumpang
        Bus.getAverage(50);
        Bus.cetakpenumpang();
    }
}
