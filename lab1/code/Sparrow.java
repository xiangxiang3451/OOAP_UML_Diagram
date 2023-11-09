public class Sparrow extends Birds implements CryBehavior{
    public Sparrow(String name,int age){
        super(name, age);
    }

    @Override
    public void Cry() {
        System.out.println(name+" is crying ");
    }
}
