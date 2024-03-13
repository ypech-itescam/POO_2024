public class Color{
    private String color;
    private String colorAnsi;

     public Color(String Color){
        setColor(color);
     }

     public void setColor(String color) {
         this.color = color;
         switch (color.toLowerCase()) {
            case "negro":
                this.colorAnsi = "\033[30m";
                break;
            case "rojo":
                this.colorAnsi = "\033[31m";
                break;
            case "verde":
                this.colorAnsi = "\033[32m";
                break;
            case "amarillo":
                this.colorAnsi = "\033[33m";
                break;
            case "azul":
                this.colorAnsi = "\033[34m";
                break;
            default:
                this.colorAnsi = "\033[37m";
        };
     }

     public String getColor() {
         return color;
     }

     public void setColorAnsi(String colorAnsi) {
         this.colorAnsi = colorAnsi;
     }

     public String getColorAnsi() {
         return colorAnsi;
     }
}
