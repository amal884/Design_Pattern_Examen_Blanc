


public class EtatParametrage {

    private int  conteurEps;
    private int conteurClr;
    private int conteurRmpl;

    public EtatParametrage(int conteurEps, int conteurClr, int conteurRmpl) {
        this.conteurEps = conteurEps;
        this.conteurClr = conteurClr;
        this.conteurRmpl = conteurRmpl;
    }

    public int getConteurEps() {
        return conteurEps;
    }

    public int getConteurClr() {
        return conteurClr;
    }

    public int getConteurRmpl() {
        return conteurRmpl;
    }

    public void setConteurEps(int conteurEps) {
        this.conteurEps = conteurEps;
    }

    public void setConteurClr(int conteurClr) {
        this.conteurClr = conteurClr;
    }

    public void setConteurRmpl(int conteurRmpl) {
        this.conteurRmpl = conteurRmpl;
    }
}
