public class Giraffe extends Animal {

    public Giraffe(String n) {
        // put your constructor content here
        super(n, "leaves");
    }

    public void eat(String food) {
//        // complete your eat function here!
        if(food.equals(favFood)){
            System.out.println(name + " eats " + food);
            System.out.println("YUM!!!" + name + " wants more "+ food);
        }else{
            System.out.println("YUCK!!! " + name + " will not eat "+ food);
            sleep();
        }
    }
}