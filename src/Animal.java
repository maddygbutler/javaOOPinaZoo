public class Animal {

    public String name;
    public String favoriteFood = "";
    static int animalPopulation=0;

    public Animal(String name, String favoriteFood) {
        this.name=name;
        this.favoriteFood=favoriteFood;
        animalPopulation++;
    }

    public void sleep( String name) {
        System.out.println(name + " sleeps for 8 hours");
    }

    public void eat(String food) {
        System.out.println(this.name + " eats " + food);
        if(food==this.favoriteFood){
            System.out.println("YUM!!! " + this.name + " wants more " + food);
        }else{
            sleep(name);
        }
    }


}
