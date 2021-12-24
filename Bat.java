public class Bat extends Mammal {
    
    public Bat(){
        this.energyLevel = 300;
        // could have also wrote: super(300);
    }
    public Bat(int energyLevel){
        super(energyLevel);
        // solution: super(300);
        // This is odd because I am passing an int argument when I create an instance of BAT, so would this override what I pass? Watching the solution vid. they just wrote what i had for line 3, then super(300); that makes more sense.
    }

    public Bat fly(){
        System.out.println("RVvvroom, Rvvroom, Rvvroom, on no!! This bat has taken flight.");
        this.energyLevel -= 50;
        return this;
    }

    public Bat eatHumans(){
        System.out.println("AHHHhh the horror!! (in the distance you hear the screams of humans dying)");
        this.energyLevel += 25;
        return this;
    }

    public Bat attackTown(){
        System.out.println("From a disance, we can see smoke billowing above a nearby town and feel the heat of the flames. The town is being destroyed");
        this.energyLevel -= 100;
        return this;
    }
    
}
