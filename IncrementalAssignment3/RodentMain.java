abstract class Rodent {

    public abstract void sound();
    public abstract void color();

    Rodent() {

        System.out.println("Rodent constructor");
        System.out.println();
    }
}

class Mouse extends Rodent {

    Mouse() {
        System.out.println("Mouse class constructor");
    }

    public void sound( ) {
        System.out.println("sound of Mouse is chu chu");
    }
    public void color( ) {
        System.out.println("Color of Mouse is grey" );
    }
}

class Gerbil extends Rodent {

    Gerbil() {
        System.out.println("This is the default constructor for Gerbil class");
    }

    public void sound( ) {
        System.out.println("sound of Gerbil is gil gil");
    }
    public void color( ) {
        System.out.println("Color of Gerbil is white");
    }
}

class Hamster extends Rodent {

    Hamster() {
        System.out.println("This is the default constructor for Hamster class.");
    }

    public void sound( ) {
        System.out.println("sound of Hamster is ham ham");
    }
    public void color( ) {
        System.out.println("Color of Hamster is black");
    }
}

public class RodentMain {

    public static void main(String a[]) {

        Rodent[] arr = new Rodent[3];
        arr[0] = new Mouse();
        arr[1] = new Gerbil();
        arr[2] = new Hamster();
        for(int i=0; i<3; i++) {
            arr[i].sound();
            arr[i].color();
        }
    }
}