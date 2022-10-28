


public class Test {
    public static void main(String[] args) {

        GroupeFigure root = new GroupeFigure(new Point(1,2) , 1 , 2 , 3);
        GroupeFigure d1 =(GroupeFigure) root.addDessin(new GroupeFigure(new Point(8,9) , 4 , 5 , 6)) ;
        GroupeFigure d2 =(GroupeFigure) root.addDessin(new GroupeFigure(new Point(8,9) , 4 , 5 , 6)) ;
        GroupeFigure d3 =(GroupeFigure) root.addDessin(new GroupeFigure(new Point(8,9) , 4 , 5 , 6)) ;
        d1.addDessin(new Cercle(new Point(1,2) , 1 , 2 , 3,9));
        d1.addDessin(new Rectangle(new Point(1,2) , 1 , 2 , 3,9,8));
        d2.addDessin(new Rectangle(new Point(1,2) , 1 , 2 , 3,9,8));
        d2.addDessin(new Rectangle(new Point(1,2) , 1 , 2 , 3,9,8));
        d3.addDessin(new Rectangle(new Point(1,2) , 1 , 2 , 3,9,8));

        root.show();

        System.out.println(" test du design pattern Observer ");

        IParametrageImpl parametrage = new IParametrageImpl();
        Cercle cercle1 = new Cercle(new Point(1,2) , 1 , 2 , 3,9);
        Rectangle rectangle1 = new Rectangle(new Point(1,2) , 1 , 2 , 3,9,8);

        parametrage.subscribe(cercle1);
        parametrage.subscribe(rectangle1);
        parametrage.setEtatParametrage(new EtatParametrage(2,5,7));

        System.out.println(" Test du design pattern Strategy");
        cercle1.setStrategy(new StrategyTraiterImpl2());
        cercle1.traiterStrategy();


    }
}
