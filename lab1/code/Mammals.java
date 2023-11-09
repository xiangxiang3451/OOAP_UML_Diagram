public class Mammals extends Animal {
    public Mammals(String name,int age){
        super(name, age);
    }

    @Override
    public void itSelf() {
        System.out.println("my name is :"+name);
    }
}
