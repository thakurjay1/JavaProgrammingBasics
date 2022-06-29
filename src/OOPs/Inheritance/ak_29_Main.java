package OOPs.Inheritance;

public class ak_29_Main {
    public static void main(String[] args) {
        ak_29_Teacher t = new ak_29_Teacher("Yashwant Singh");
        //t.name = "Yashwant Singh";
        t.eat();
        t.teach();
        t.laugh();

        ak_29_Singer s = new ak_29_Singer("Honey Singh");
        //s.name = "Honey Singh";
        s.eat();
        s.sing();
        s.laugh();
    }
}
