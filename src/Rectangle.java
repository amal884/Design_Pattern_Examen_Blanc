public class Rectangle extends DessinContext{
    private double L ;
    private double H ;

    private IStrategyTraiter strategy = new StrategyTraiterImpl1() ;

    public Rectangle(Point point, int conteurEps, int conteurClr, int conteurRmpl, double L , double H) {
        super(point, conteurEps, conteurClr, conteurRmpl);
        this.L = L;
        this.H=H;
    }

    @Override
    public void update(IParametrage parametrage) {
        EtatParametrage etatParametrage = ((IParametrageImpl) parametrage).getEtatParametrage() ;
        this.conteurClr= etatParametrage.getConteurClr();
        this.conteurEps = etatParametrage.getConteurEps();
        this.conteurRmpl=etatParametrage.getConteurRmpl() ;
        System.out.println("Rectangle  updated");
        this.show();
    }

    @Override
    public void show() {
        System.out.println(tab()+"**Rectangle**");
        System.out.println(tab()+"Coordonnée X de mon centre : "+point.getX());
        System.out.println(tab()+"Coordonnée Y de mon centre : "+point.getY());
        System.out.println(tab()+"largeur "+ L);
        System.out.println(tab()+"hauteur"+ H);

    }

    @Override
    public double calculerPerimetre() {
        System.out.println(" mon Primetre est : " + L*H);
        return L*H;
    }

    @Override
    public double calculerSurface() {
        System.out.println(" mon Primetre est : " + 2*(L+H));
        return 2*(L+H);
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
