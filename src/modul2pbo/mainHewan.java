public class mainHewan {
    public static void main(String[] args) {
        cat cat = new cat("kucing", "udin", 3, "keju", "betina", 1);
        cat.printSound();
        System.out.println(cat.isAlive());
        cat.printData();
        System.out.println("-------------------");
        
        dog dog = new dog("anjing", "jamal", 4, "daging", "jantan", 0);
        dog.printSound();
        System.out.println(dog.isAlive());
        dog.printData();
        System.out.println("-------------------");
        
        horse horse = new horse("kuda", "budi", 5, "rumput", "betina", 1);
        horse.printSound();
        System.out.println(horse.isAlive());
        horse.printData();
        System.out.println("-------------------");
        
        duck duck = new duck("bebek", "asep", 1, "tahu", "jantan", 0);
        duck.printSound();
        System.out.println(duck.isAlive());
        duck.printData();
    }
}
