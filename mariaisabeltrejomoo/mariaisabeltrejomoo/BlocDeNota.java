package mariaisabeltrejomoo;

public class BlocDeNota{
    public Nota nota;

    public BlocDeNota(Nota nota){
        nota = new Nota;
    }
    public boolean addNota(Nota n){
        return true;
    }
    public boolean saveNotas(){
        return false;
    }
    public boolean updateNota(Nota n){
        return true;
    }
    public boolean updateNota(String txt, String c){
        return false;
    }
    public boolean deleteNote(){
        return true;
    }
}