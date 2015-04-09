import java.util.Arrays;
import java.util.List;

/**
 * Created by Benjamin Daschel on 4/8/15.
 */
public class Homework2 {

    public static void main(String[] args) {

        EyeOfSauron eye = new EyeOfSauron();
        BadGuy saruman = new BadGuy(eye, "Saruman");
        BadGuy witchKing= new BadGuy(eye, "Witch King");

        //This is probably the cleanest way to declare a List with initial elements
        List<GoodGuys> goodGuys = Arrays.asList(
            new GoodGuys("Hobbit", 1),
            new GoodGuys("Elf", 1),
            new GoodGuys("Dwarves", 3)
        );
        eye.setEnemies(goodGuys); //hobbits, elves, dwarves, men -- BTW, this is HORRIBLE coding style
        //message should be displayed from Saruman and Angmar that they know about 1 hobbit, 1 elf, 2 dwarves

        saruman.defeated(); //Saruman is no longer registered with the Eye

        goodGuys = Arrays.asList(
                new GoodGuys("Hobbits", 2),
                new GoodGuys("Elf", 1),
                new GoodGuys("Dwarves", 3),
                new GoodGuys("Men", 2)
        );
        eye.setEnemies(goodGuys);
        //only the Witch King reports on the enemies

    }//end main


}
