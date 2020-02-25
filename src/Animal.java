public class Animal {
    // Put your properties here
    public String name;
    public String favFood;
    static int population = 0;

    public Animal(String name, String favoriteFood) {
        // set the parameters into the properties,
        //  like this.name =name
        this.name =name;
        this.favFood =favoriteFood;
        population++;
    }

    public void sleep() {
        // complete your sleep function here
        System.out.println(name + " sleeps for 8 hours");
    }

    public void eat(String food) {
        // complete your eat function here
        if(food.equals(favFood)){
            System.out.println(name + " eats " + food);
            System.out.println("YUM!!! " + name + " wants more "+ food);
        }else{
            System.out.println(name + " eats "+ food);
            sleep();
        }
    }
}

