public class BatTest {
    
    public static void main(String[] args) {
        Bat bat = new Bat();
        // bat.fly();
        // bat.attackTown();
        // bat.eatHumans();
        // bat.displayEnergy();
        // bat.fly();
        // bat.attackTown();
        // bat.eatHumans();
        // bat.attackTown();
        // bat.displayEnergy();

        // Chaining Methods. 
        bat.fly().attackTown().eatHumans().displayEnergy();
        // To achieve this, I had to change what was expected to be returned from my Bat methods. 

        // originally:
        // pulic int fly(){...code.. return this.energyLevel;}

        // updated to allow chaining:
        //public Bat fly(){...code... return this;}
    }
}
