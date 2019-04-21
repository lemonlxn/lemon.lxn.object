package lxn.lemon.extendsproj;

/**
 * Author: Lemon
 * Time :  2019-04-20 16:22
 */
public class Dog extends Animal {
    private String  species;

    public Dog(){

    }

    public Dog(String name,int month,String species){
        super(name, month);
        this.setSpecies(species);
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public void sleep(String name){
        System.out.println(this.getName() + " is sleeping");
    }

}
