public class Zoo {
//Properties
//    public String favoriteFood = "bacon";
//
////Constructor
//    public static void main(String[] args){
//        Zoo z = new Zoo();
//        z.sleep("Tiger");
//        z.eat("Tiger", "meat");
//        z.eat("Tiger", "bacon");
//    }
////Methods
//    public void sleep(String name){
//        System.out.println(name + " sleeps for 3 hours.");
//    }
//
//    public void eat(String name, String food){
//        if(food.equals(favoriteFood)){
//            System.out.println(name +" eats "+ food);
//            System.out.println("YUM!!! "+name+" wants more "+food);
//        }else{
//            System.out.println(name +" eats "+ food);
//            System.out.println(name +" sleeps more.");
//        }
//
//    }


    public static void main(String[] args) {
        //make and run a main method
//        String aString = "it's a string";
        Tiger tigger = new Tiger("Tigger");
//        tigger.eat("meat");
//        tigger.eat("kibble");
        Bear pooh = new Bear("Pooh");
//        pooh.eat("fish");
//        pooh.eat("meat");
        Unicorn rarity = new Unicorn("Rarity");
//        rarity.eat("");
//        rarity.eat("Marshmellows");
        Giraffe gemma = new Giraffe("Gemma");
//        gemma.eat("leaves");
//        gemma.eat("meat");
        Bee stinger = new Bee("Stinger");
//        stinger.eat("pollen");
//        stinger.eat("flowers");
        Animal[] animals = {tigger, pooh, rarity, gemma, stinger};
        Zookeeper zoe = new Zookeeper("Zoe");

        zoe.feedAnimals(animals, "steak");


        //make a Zookeeper instance like Zookeeper z = new Zookeeper("Zoe");

        //call z.feedAnimals(animals,"bacon");

    }



}
