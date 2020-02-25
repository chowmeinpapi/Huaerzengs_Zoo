public class Bee extends Animal{
    public Bee(String n) {
        // put your constructor content here
        super("Stinger","pollen");
    }
    public void eat(String food) {
//        // complete your eat function here!
        if(food.equals(favFood)){
            System.out.println(name + " eats " + food);
            System.out.println("YUM!!! " + name + " wants more "+ food);
        }else{
            System.out.println("YUCK!!! " + name + " will not eat "+ food);
            sleep();
        }
    }

    public void sleep() {
        // complete your sleep function here
        System.out.println(name + " never sleeps.");
    }
}
