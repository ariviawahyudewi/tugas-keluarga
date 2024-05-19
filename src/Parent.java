class Parent {
    // Private fields for encapsulation
    private String jenisKelamin;
    private int umur;
    private int tinggiBadan;
    private int beratBadan;

    // Default constructor
    public Parent() {
    }

    // Parameterized constructor
    public Parent(String jenisKelamin, int umur, int tinggiBadan, int beratBadan) {
        this.jenisKelamin = jenisKelamin;
        this.umur = umur;
        this.tinggiBadan = tinggiBadan;
        this.beratBadan = beratBadan;
    }

    // Getter for jenisKelamin
    public String getJenisKelamin() {
        return jenisKelamin;
    }

    // Setter for jenisKelamin
    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    // Getter for umur
    public int getUmur() {
        return umur;
    }

    // Setter for umur
    public void setUmur(int umur) {
        this.umur = umur;
    }

    // Getter for tinggiBadan
    public int getTinggiBadan() {
        return tinggiBadan;
    }

    // Setter for tinggiBadan
    public void setTinggiBadan(int tinggiBadan) {
        this.tinggiBadan = tinggiBadan;
    }

    // Getter for beratBadan
    public int getBeratBadan() {
        return beratBadan;
    }

    // Setter for beratBadan
    public void setBeratBadan(int beratBadan) {
        this.beratBadan = beratBadan;
    }

    // toString method to display object information
    @Override
    public String toString() {
        return "Parent{" +
                "jenisKelamin='" + jenisKelamin + '\'' +
                ", umur=" + umur +
                ", tinggiBadan=" + tinggiBadan +
                ", beratBadan=" + beratBadan +
                '}';
    }
}

