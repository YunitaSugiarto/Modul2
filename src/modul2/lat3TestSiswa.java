package modul2;

public class lat3TestSiswa {

    public static void main(String args[]) {
        lat3EncapSiswa siswa = new lat3EncapSiswa();
        siswa.setName("Julian");
        siswa.setAbsen(23);
        siswa.setAddress("Malang");

        System.out.println("Name : " + siswa.getName() + "Absen : " + siswa.getAbsen() + "Address : " + siswa.getAddress());
    }
}
