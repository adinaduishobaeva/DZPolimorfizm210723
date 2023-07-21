public class Main {
    public static void main(String[] args) {

        Shark shark = new Shark();
        Turtle turtle = new Turtle();
        Eagle eagle = new Eagle();

        Animal [] animals = {shark,turtle,eagle};
         for (Animal animal : animals)

        if(shark instanceof Animal );
            shark.attack();
        System.out.println(shark.getClass());
        shark.attack();
        if (turtle instanceof Animal){
            turtle.swim();
        }
        System.out.println(turtle.getClass());
        turtle.swim();
        if (eagle instanceof Animal){
            eagle.fly();
        }
          System.out.println(eagle.getClass());
          eagle.fly();

         Shark [] sharks = {shark };
         Turtle [] turtles = { turtle};
         Eagle [] eagles = { eagle};













      }












    }
