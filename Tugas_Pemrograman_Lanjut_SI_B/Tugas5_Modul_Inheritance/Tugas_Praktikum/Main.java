package Bab5;

public class Main {
    public static void main(String[] args) {
        Manusia human1 = new Manusia("Fero Alexander","1212",true,true);
        System.out.println(human1);
        Manusia human2 = new Manusia("Sri Wardani","1321",false,true);
        System.out.println(human2);
        Manusia human3 = new Manusia("Muhammad Akhyar","1521",false,false);
        System.out.println(human3);
        MahasiswaFILKOM m1 = new MahasiswaFILKOM ("225150407111024",2.5,"Rr. Chusnul Imami Nabila","1332",false,false);
        System.out.println(m1);
        MahasiswaFILKOM m2 = new MahasiswaFILKOM ("225150407111024",3.4,"Rr. Chusnul Imami Nabila","1332",false,false);
        System.out.println(m2);
        MahasiswaFILKOM m3 = new MahasiswaFILKOM ("225150407111024",3.9,"Rr. Chusnul Imami Nabila","1332",false,false);
        System.out.println(m3);
        Pekerja p1 = new Pekerja (1000, 2021, 4, 2, 2, "Paijo Sudrajat", "1211", true, true);
        System.out.println(p1);
        Pekerja p2 = new Pekerja (1000, 2014, 6, 11, 0, "Roni Ramadhan", "1311", true, true);
        System.out.println(p2);
        Pekerja p3 = new Pekerja (1000, 2003, 5, 8, 10, "Sinta Putri", "4111", false, true);
        System.out.println(p3);
        Manager mng1 = new Manager("HRD", 7500, 2008, 5, 9, 3, "Ahmad Basuki", "1115", true, true);
        System.out.println(mng1);
    }
}
