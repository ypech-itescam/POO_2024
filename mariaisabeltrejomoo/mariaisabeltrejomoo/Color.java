package mariaisabeltrejomoo;
public class Color {
    private String colorI;
    private String colorANSI;

    public Color(Color colorI){
        setColor(colorANSI);
    }
    public String getColor(){
        return colorI;
    }
    public void setColor(String colorI){
        if(colorI.equals(" ")){
            this.colorI=colorI;
            switch(colorI) {
                case "negro":
                case "Negro":
                    this.colorANSI="\033[30m";
                    break;
                case "rojo":
                case "Rojo":
                    this.colorANSI="\033[31m";
                    break;
                case "verde":
                case "Verde":
                    this.colorANSI="\033[32m";
                    break;
                case "amarillo":
                case "Amarrillo":
                    this.colorANSI="\033[33m";
                    break;
                case "azul":
                case "Azul":                
                   this.colorANSI="\033[34m";
                    break;
                case "magenta":
                case "Magenta":
                    this.colorANSI="\033[35m";
                    break;
                case "cyan":
                case "Cyan":
                    this.colorANSI="\033[36m";
                    break;
                default:
                    this.colorI="blanco";
                    this.colorANSI="\033[37m";
                    break;
            }
        }
    }
    public String getColorANSI() {
        return colorANSI;
    }

    public void setColorANSI(String colorANSI){
        this.colorANSI=colorANSI;
    }
}