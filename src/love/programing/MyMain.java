package love.programing;

public class MyMain {

    /*Polymorphism

     */

    public static void main(String[] args) {

     Animal[]   animals=new Animal[5];

     animals[0]= new Fish();
     animals[1]=new Bird();
     animals[2]=new Spider();
     animals[3]=new Hare();
     animals[4]=new Sparrow();

     /*Sparrow s= new Sparrow();
     s.move();*/

     for (int i=0; i<animals.length;i++) {

            animals[i].move();
        }


    }
}
