public class cat extends jenisHewan {
    String jenis;
    public cat (String jenis, String name, int age, String food, String gender, int alive) {
        super(name, age, food, gender, alive);
        this.jenis = jenis;
    }
    
    @Override
    public void printSound(){
        System.out.println("miaw");
    }
    
    @Override
    public void printData(){
        System.out.println("Jenis : " + jenis);
        super.printData();
    }
}