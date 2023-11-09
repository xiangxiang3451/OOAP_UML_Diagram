public class Administrator {

    private Animal[] animals;

    private Animal animal;

    private Food food;
    String name;
    public Administrator(String name){
        this.name=name;
    }
    public void feed(Food food){
        System.out.println(name+" is feeding "+ food.name);
    }



    public void careAnimal(){

        String animalType=animal.selectAnimal("tiger");

        if (animalType=="carnivores"){
            String meat= food.selectMeat("meat");
        }
        if(animalType=="herbivores"){

            String grass= food.selectGrass("grass");
        }

        animal.getEnergy();


        return;

    }
}
