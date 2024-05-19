public class ContohSuper {
    public static void main(String[] args) {
        // Membuat objek Child dengan data yang diminta
        Child child = new Child();
        child.setJenisKelamin("Perempuan");
        child.setUmur(20);
        child.setTinggiBadan(158);
        child.setBeratBadan(55);
        child.setUniversitas("Universitas Muhammadiyah Magelang");
        child.setSemester("Semester 4");
        child.setAnakKe("Anak ke-1");
        child.setJumlahSaudara("4 bersaudara");
        System.out.println(child);
    }
}