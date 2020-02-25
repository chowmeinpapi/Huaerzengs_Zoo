public class Bear extends Animal{

    //Constructor
      public Bear(String n){
//        this.name = n;
        super("Pooh","fish");
      }

      public void sleep() {
    // complete your sleep function here, noting the change from global to properties
        System.out.println(name + " hibernates for 4 months");
}
//
//    public void eat(String food) {
//        if(food.equals(favFood)){
//            System.out.println(name + " eats " + food);
//            System.out.println("YUM!!! "+name+" wants more "+food);
//        }else{
//            System.out.println(name + " eats " + food);
//            sleep();
//        }
//    }

}

