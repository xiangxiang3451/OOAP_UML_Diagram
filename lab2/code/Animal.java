public abstract class Animal {
    private Cage cage;
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void itSelf();

    public String selectAnimal(String type){
        return type;


    }

    public void getEnergy(){


    }
}
