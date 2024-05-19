class Child extends Parent {
    // Atribut khusus untuk class Child
    private String universitas;
    private String semester;
    private String anakKe;
    private String jumlahSaudara;

    // Konstruktor default
    public Child() {
        super();
    }

    // Konstruktor parameterized
    public Child(String jenisKelamin, int umur, int tinggiBadan, int beratBadan,
                 String universitas, String semester, String anakKe, String jumlahSaudara) {
        super(jenisKelamin, umur, tinggiBadan, beratBadan);
        this.universitas = universitas;
        this.semester = semester;
        this.anakKe = anakKe;
        this.jumlahSaudara = jumlahSaudara;
    }

    // Getter dan Setter untuk universitas
    public String getUniversitas() {
        return universitas;
    }

    public void setUniversitas(String universitas) {
        this.universitas = universitas;
    }

    // Getter dan Setter untuk semester
    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    // Getter dan Setter untuk anakKe
    public String getAnakKe() {
        return anakKe;
    }

    public void setAnakKe(String anakKe) {
        this.anakKe = anakKe;
    }

    // Getter dan Setter untuk jumlahSaudara
    public String getJumlahSaudara() {
        return jumlahSaudara;
    }

    public void setJumlahSaudara(String jumlahSaudara) {
        this.jumlahSaudara = jumlahSaudara;
    }

    // Metode toString untuk menampilkan informasi objek secara vertikal
    @Override
    public String toString() {
        return "Child {" +
                "\nuniversitas='" + universitas + '\'' +
                ", \nsemester='" + semester + '\'' +
                ", \nanakKe='" + anakKe + '\'' +
                ", \njumlahSaudara='" + jumlahSaudara + '\'' +
                ", \njenisKelamin='" + getJenisKelamin() + '\'' +
                ", \numur=" + getUmur() +
                ", \ntinggiBadan=" + getTinggiBadan() +
                ", \nberatBadan=" + getBeratBadan() +
                "\n}";
    }
}
