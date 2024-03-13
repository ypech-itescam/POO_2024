package mariaisabeltrejomoo;
public class HolaMundo {
    private String saludoI;
    private Color c;

    public HolaMundo(String saludoI, Color c) {
        setSaludo(saludoI);
        setColor(c);
    }

    public String getSaludoI() {
        return saludoI;
    }

    public void setSaludo(String saludoI) {
        this.saludoI = saludoI.equals(" ") ? "Hola Mundo" : saludoI;
    }
    public Color getColor(){
        return c;
    }

    public void setColor(Color c){
        this.c=new Color(c);
    }

    public String show() {
        return c.getColorANSI() + getSaludoI();
    }
}
