import java.util.List;

/**
 * Created by Benjamin Daschel on 4/8/15.
 */
public class BadGuy implements Observer {

    private final EyeOfSauron mEyeOfSauron;
    private final String mName;

    public BadGuy(EyeOfSauron eye, String s) {
        mEyeOfSauron = eye;
        eye.registerObserver(this);
        mName = s;
    }

    public void defeated() {
        mEyeOfSauron.unregisterObserver(this);
        System.out.println(String.format("%s has been defeated.", mName));
    }

    @Override
    public void onChange(Observable observable) {

        //In a many-to-many observer pattern, check to make sure that
        // the eye of sauron is calling this method.
        if(observable == mEyeOfSauron){
            List<GoodGuys> enemies = mEyeOfSauron.getEnemies();

            StringBuilder sb = new StringBuilder();
            sb.append(mName)
                    .append(" notified about the presence of ");

            for(GoodGuys g: enemies){
                sb.append(String.format("%d %s ", g.count, g.name));
            }

            System.out.println(sb.toString());
        }

    }

    @Override
    public String toString() {
        return mName;
    }
}
