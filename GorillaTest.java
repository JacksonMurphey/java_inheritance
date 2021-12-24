public class GorillaTest {
    
    public static void main(String[] args) {
        Gorilla g = new Gorilla();
        g.throwSomething();
        g.climb();
        g.displayEnergy();
        g.eatBananas();
        g.displayEnergy();

        // Testing that my Overload Method works.
        Gorilla g2 = new Gorilla(50);
        g2.throwSomething();
        g2.climb();
        g2.displayEnergy();
        

        // Testing that my Overload Method works on Mammal Class. 
        Mammal m = new Mammal();
        Mammal m2 = new Mammal(50);

        m.displayEnergy();
        m2.displayEnergy();

    }
}
