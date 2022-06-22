public abstract class jenisHewan implements Alive {
    String name;
    int age;
    String food;
    String gender;
    int alive;

    public jenisHewan(String name, int age, String food, String gender, int alive) {
        this.name = name;
        this.age = age;
        this.food = food;
        this.gender = gender;
        this.alive = alive;
    }
    
    abstract void printSound();
    
    @Override
    public boolean isAlive(){
        return alive == Alive;
    }
    
    public void printData() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Food: " + food);
        System.out.println("Gender: " + gender);
        System.out.println("Alive: " + isAlive());
    }
}
