import java.util.ArrayList;
import java.util.List;

public class IParametrageImpl implements IParametrage {


    private EtatParametrage etatParametrage;

    private List<DessinContext> observers = new ArrayList<>();
    @Override
    public void subscribe(DessinContext dessinContext) {
        observers.add(dessinContext);
    }

    @Override
    public void unsubscribe(DessinContext dessinContext) {

        observers.remove(dessinContext);

    }

    @Override
    public void notifyObserver() {
        for (DessinContext o :observers) {
            o.update(this);

        }
    }

    public EtatParametrage getEtatParametrage() {
        return etatParametrage;
    }

    public void setEtatParametrage(EtatParametrage etatParametrage) {
        this.etatParametrage = etatParametrage;
        this.notifyObserver();
    }
}
