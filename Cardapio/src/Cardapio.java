import java.util.Arrays;

public class Cardapio {
	//objetos
	String cafe = null;
	String lancheManha = null;
	String almoco = null;
	String lancheTarde = null;
	String jantar = null;
	String ceia = null;
	
	//blocos construtores
	public Cardapio (){

	}
	
	public Cardapio (String cafe, String lancheManha, String almoco, String lancheTarde, String jantar, String ceia){
		this.setCafe(cafe); // ou this.cafe = cafe;
		this.setLancheManha(lancheManha);
		this.setAlmoco(almoco);
		this.setLancheTarde(lancheTarde);
		this.setJantar(jantar);
		this.setCeia(ceia);
	}
	
	//getters
	
	public String getCafe(){
		return cafe;
	}
	
	public String getLancheManha(){
		return lancheManha;
	}
	
	public String almoco(){
		return almoco;
	}
	
	public String lancheTarde(){
		return lancheTarde;
	}
	
	public String jantar(){
		return jantar;
	}
	
	public String ceia(){
		return ceia;
	}
	
	//setters
	
	public void setCafe(String cafe){
		this.cafe = cafe;
	}
	
	public void setLancheManha(String lancheManha){
		this.lancheManha = lancheManha;
	}
	
	public void setAlmoco(String almoco){
		this.almoco = almoco;
	}
	
	public void setLancheTarde(String lancheTarde){
		this.lancheTarde = lancheTarde;
	}
	
	public void setJantar(String jantar){
		this.jantar = jantar;
	}
	
	public void setCeia(String ceia){
		this.ceia = ceia;
	}
	
	//metodos
	

	@Override
	public String toString() {
		return "Cardapio do dia: \n" + "\nCafe da manhã = " + cafe + "\nLanche da Manhã = "
				+ lancheManha + "\nAlmoço = " + almoco + "\nLanche da Tarde = " + lancheTarde + "\nJantar = " + jantar + "\nCeia = "
				+ ceia;
	}

	
	
}
