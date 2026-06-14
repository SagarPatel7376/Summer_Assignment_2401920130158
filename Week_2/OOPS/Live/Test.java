package Live;
import Music.Playable;
import Music.string.Veena;
import Music.wind.Saxophone;

public class Test {
    public static void main(String[] args) {
        Veena obj = new Veena();
        Saxophone obj2 = new Saxophone();
        obj.play();
        obj2.play();

        Playable p;
        p = new Veena();
        p.play();

        p = new Saxophone();
        p.play();
    }
}
