public class zoo {

    private String name;
    private String favoriteFood = "bacon";

    public zoo(String name, String favoriteFood) {
        this.name = name;
        this.favoriteFood = favoriteFood;

    }



    public void sleep( String name){

         System.out.println(this.name + " sleeps for 8 hours");
    }

    public void eat( String food){
        System.out.println(this.name + " eats " + food);
        if(food==this.favoriteFood){
            System.out.println("YUM!!!" + this.name + " wants more " + food);
        }else{
            sleep(name);
        }
    }



}
