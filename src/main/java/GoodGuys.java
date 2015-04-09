/**
 * Created by Benjamin Daschel on 4/8/15.
 */
public class GoodGuys {

    /*
        Do I really need setters and getters for this?
        No, it's just a bundle intended to be slightly less hacky
        to work with than passing ints around.
     */
    String name;
    int count;

    public GoodGuys(String name, int count) {
        this.name = name;
        this.count = count;
    }

}
