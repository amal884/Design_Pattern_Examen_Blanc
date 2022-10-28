public class Cercle extends DessinContext{

    private IStrategyTraiter strategy = new StrategyTraiterImpl1() ;

    private double pi = 3.14 ;
    private double R;
    public Cercle(Point point, int conteurEps, int conteurClr, int conteurRmpl, double R) {
        super(point, conteurEps, conteurClr, conteurRmpl);
        this.R = R ;
    }

    @Override
    public void update(IParametrage parametrage) {
        EtatParametrage etatParametrage = ((IParametrageImpl) parametrage).getEtatParametrage() ;
        this.conteurClr= etatParametrage.getConteurClr();
        this.conteurEps = etatParametrage.getConteurEps();
        this.conteurRmpl=etatParametrage.getConteurRmpl() ;
        System.out.println("Cercle updated");
        this.show();
    }

    @Override
    public void show() {
        System.out.println(tab()+" **Cercle**)");
        System.out.println(tab()+"Coordonnée X de mon centre : "+point.getX());
        System.out.println(tab()+"Coordonnée Y de mon centre : "+point.getY());
        System.out.println(tab()+"Rayon : " + R);
    }

    @Override
    public double calculerPerimetre() {
        System.out.println(" mon Primetre est : " +  pi * R * R);
        return pi * R * R;
    }

    @Override
    public double calculerSurface() {
        System.out.println(" mon surface est : " +  2 *pi * R );
        return 2 *pi * R ;
    }

    public void traiterStrategy( ){
        System.out.println("Traitement"); // partie constante
        System.out.println(".........."); // partie constante
        strategy.traiter();              // partie dynamique
        System.out.println(".........."); // code qui demeur constante

    }

    public void setStrategy(IStrategyTraiter strategy) {
        this.strategy = strategy;
    }
}
