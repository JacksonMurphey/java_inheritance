
public class Mammal {
    
    protected int energyLevel; // "protected" will allow this to be visible to all child classes that extend this class. 

    // Constructor method
    public Mammal(){
        this.energyLevel = 100;
    }

    // Overloaded constructor method.
    public Mammal(int energyLevel){
        this.energyLevel = energyLevel;
    }

    public int displayEnergy(){
        // this.energyLevel = energyLevel;
        System.out.println("Current energy level: " + this.energyLevel);
        return this.energyLevel;
    }

}
