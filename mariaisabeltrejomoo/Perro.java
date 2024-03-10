package mariaisabeltrejomoo;

public class Perro{
	private String nombreI;
	private int edadI;
	private double pesoI;
	private String razaI;
	private String estadoI;

	public Perro(String nombreI, int edadI, double pesoI, String razaI, String estadoI){
		setNombreI(nombreI);
		setEdadI(edadI);
		setPesoI(pesoI);
		setRazaI(razaI);
		setEstadoI(estadoI);
	}
	public String getNombreI(){
		return nombreI;
	}
	public void setNombreI(String nombreI){
		this.nombreI=nombreI.equals("")? "Solovino": nombreI;
	}
	public int getEdadI(){
		return edadI;
	}
	public void setEdadI(int edadI){
		this.edadI=edadI;
	}
	public double getPesoI(){
		return pesoI;
	}
	public void setPesoI(double pesoI){
		this.pesoI=pesoI;
	}
	public String getRazaI(){
		return razaI;
	}
	public void setRazaI(String razaI){
		this.razaI=razaI;
	}
	public String getEstadoI(){
		return estadoI;
	}
	public void setEstadoI(String estadoI){
		this.estadoI=estadoI;
	}
	public void ladrar(){
		if(!getEstadoI().equals("muerto")){
			System.out.println("Gua, Gua, Gua, Gua, Gua");
		}
		else{
			System.out.println("Estoy muerto");
		}
	}
	public void comer(String comida){
		if(!getEstadoI().equals("muerto")){
			System.out.println("Estoy comiendo " + comida);
		}
		else{
			System.out.println("Estoy muerto");
		}
	}
	public void jugar(String pelota){
		if(!getEstadoI().equals("muerto")){
			System.out.println("Estoy jugando con la " + pelota);
		}
		else{
			System.out.println("Estoy muerto");
		}
	}
	public void moverCola(){
		if(!getEstadoI().equals("muerto")){
			System.out.println("Estoy moviendo la cola");
		}
		else{
			System.out.println("Estoy muerto");
		}
	}
}