public class Birds extends Animal {
    public Birds(String name,int age){
        super(name, age);
    }

    @Override
    public void itSelf() {
        System.out.println("my name is :"+name);
    }
}

