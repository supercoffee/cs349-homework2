/**
 * Created by Benjamin Daschel on 4/8/15.
 */
public interface Observable {

    public void registerObserver(Observer observer);
    
    public void unregisterObserver(Observer observer);

}
