public class Lion extends Mammals implements CryBehavior{

    public Lion(String name,int age){
        super(name, age);
    }

    @Override
    public void Cry() {
        System.out.println(name+" is crying");
    }
}
