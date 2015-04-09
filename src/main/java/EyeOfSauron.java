import java.util.ArrayList;
import java.util.List;

/**
 * Created by Benjamin Daschel on 4/8/15.
 */
public class EyeOfSauron implements Observable {

    private List<Observer>  mObservers;
    private List<GoodGuys> mEnemies;

    public EyeOfSauron() {
        mObservers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer observer) {
        if(!mObservers.contains(observer)){
            mObservers.add(observer);
        }
    }

    @Override
    public void unregisterObserver(Observer observer) {
        mObservers.remove(observer);
    }

    public void setEnemies(List<GoodGuys> allGoodGuys) {

        mEnemies = allGoodGuys;

        for(Observer o: mObservers){
            o.onChange(this);
        }
    }

    public List<GoodGuys> getEnemies(){
        return mEnemies;
    }
}
