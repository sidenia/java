
public class Carro {
	
	private String modelo;
	private String placa;
	private int voltas; //contador
	
	public Carro (){
	}
	
	public Carro (String modelo, String placa){
		setModelo(modelo);
		setPlaca(placa);
		this.voltas = 0;		
	}
			
	//getters
	
	public String getModelo(){
		return this.modelo;
	}
	
	public String getPlaca(){
		return this.placa;
	}
	
	public int getVoltas (){
		return this.voltas;
	}
	
	//setters
	
	public void setModelo(String modelo){
		this.modelo = modelo;
	}
	
	public void setPlaca(String placa){
		this.placa = placa;
	}
	
	public void setVoltas(int voltas){
		this.voltas = voltas;
	}

	public void darVolta(){
		this.voltas++;
	}
	
	
	@Override
	public String toString() {
		return "Carros [modelo = " + modelo + " placa = " + placa + ", voltasNoQuarteirao = " + voltas + "]";
	}
	
	
}
