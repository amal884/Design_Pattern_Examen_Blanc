public abstract class DessinContext {

     protected  Point point ;

     protected int  conteurEps;
     protected int conteurClr;
     protected int conteurRmpl;


     protected int level = 0;

     public DessinContext(Point point, int conteurEps, int conteurClr, int conteurRmpl) {
          this.point = point;
          this.conteurEps = conteurEps;
          this.conteurClr = conteurClr;
          this.conteurRmpl = conteurRmpl;
     }



     public  String tab(){
          String tab ="";
          for (int i = 0; i < level; i++) {
               tab+="\t";

          }
          return tab ;
     }
     public abstract void update(IParametrage parametrage);
     public abstract void show();
     public abstract double calculerPerimetre();
     public abstract double calculerSurface();



}
