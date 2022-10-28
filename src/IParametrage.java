

public interface IParametrage {

    void subscribe(DessinContext dessinContext); // add observer
    void unsubscribe(DessinContext dessinContext);
    void notifyObserver();

}
