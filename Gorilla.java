
public class Gorilla extends Mammal {
    
    // constructor
    public Gorilla(){
        this.energyLevel = 100;
    }
    
    // Overloading constructor
    public Gorilla(int energyLevel){
        super(energyLevel);
    }

    public int throwSomething(){
        System.out.println("This gorilla just threw a big boulder");
        this.energyLevel -= 5;
        return this.energyLevel;
    }

    public int eatBananas(){
        System.out.println("This gorilla just ate some bananas. MmMmm soo tasty");
        this.energyLevel += 10;
        return this.energyLevel;
    }

    public int climb(){
        System.out.println("This gorilla just climbed a tree, where did he go?");
        this.energyLevel -= 10;
        return this.energyLevel;
    }

}
