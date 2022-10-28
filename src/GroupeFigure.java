import java.util.ArrayList;
import java.util.List;

public class GroupeFigure extends DessinContext{

    private List<DessinContext> childs = new ArrayList<>();

    public GroupeFigure(Point point, int conteurEps, int conteurClr, int conteurRmpl) {
        super(point, conteurEps, conteurClr, conteurRmpl);
    }

    @Override
    public void update(IParametrage parametrage) {

    }


    public DessinContext  addDessin(DessinContext dessinContext){
        dessinContext.level= this.level+1;
        childs.add(dessinContext);
        return dessinContext ;
    }

    @Override
    public void show() {

        System.out.println(tab()+ "**Groupe**");

        for (DessinContext c : childs){
            c.show();
        }
    }



    @Override
    public double calculerPerimetre() {
        return 0;
    }

    @Override
    public double calculerSurface() {
        return 0;
    }
}
