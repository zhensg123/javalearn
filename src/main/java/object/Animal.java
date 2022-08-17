package object;

public abstract class Animal {
    private  String name;
    private  int month;
    private  String species;
    private final  String type;

    public Animal(String type) {
        this.type = type;
    }

//    public Animal(String type) {
//        this.type = type;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

      this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public  void eat(){
        System.out.println("吃东西");
    }
}
