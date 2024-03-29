public class HolaMundo{
    //atributos
        private String texto;
        private String color;
    //constructor
        public HolaMundo(String texto) {
            setTexto(texto);
            setColor("ROJO");
        }
    
    //metodos de acceso
        public void setTexto(String texto){
            this.texto=texto.equals("")?"Hola Mundo ":texto;
        }
    
        public String getTexto(){
            return texto;
        }
        
        public void setColor(String color){
            switch (color = color.toLowerCase()) {
                case "negro":this.color="\033[30m";break;
                case "rojo":this.color="\033[31m"; break;
                case "verde":this.color="\033[32m";break;          
                case "amarillo":this.color="\033[33m";break;
                case "azul":this.color="\033[34m"; break;
                case "morado":this.color="\033[35m"; break;
                case "cyan":this.color="\033[36m";break;
                case "blanco":this.color="\033[37m";break;
                default: this.color="\u001B[0m";break;
            }
        }
    
        public String getColor(){
            return color;
        }
    
    //metodos de accion
        public void cambiaMayus(){
            this.texto=this.texto.toUpperCase();
        }
        public void cambiaMin(){
            this.texto = this.texto.toLowerCase();
        }
        public String mostrar(){
            return getColor()+getTexto()+"\u001B[0m";
        }
        
    }
    