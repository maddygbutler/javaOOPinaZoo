public class Bee extends Animal {
    public Bee(String name){
        super(name, "pollen");
    }
    public void sleep(String name){
        System.out.println( name + " never sleeps");
    }
    public void eat(String food){
        if(food.equals(this.favoriteFood)){
            System.out.println("YUM!!! " + this.name + " wants more pollen");
        }else{
            System.out.println("YUCK!!! " + this.name + " will not eat " + food);
            this.sleep(name);
        }
    }


}
