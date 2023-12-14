public class Main {
    public static void main(String[] args) {
        Tiger tiger = new Tiger("James");
        Bird bird = new Bird(100.5);

        AnimalHouse<Tiger> tigerHouse = new AnimalHouse<>(tiger);
        AnimalHouse<Bird> birdHouse = new AnimalHouse<>(bird);
        System.out.println("Tiger in a tiger house with name " + tigerHouse.animal.name + ".");
        System.out.println("Bird in a bird house with high of flight " + birdHouse.animal.highOfFlight + ".");
    }
}
