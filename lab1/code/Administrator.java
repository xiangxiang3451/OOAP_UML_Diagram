public class Administrator {

    private Animal[] animals;
    String name;
    public Administrator(String name){
        this.name=name;
    }
    public void feed(Food food){
        System.out.println(name+" is feeding "+ food.name);
    }
}
