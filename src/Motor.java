
public class Motor {
	private String marca;
	private float cilindraje;
	private String tipoCombustion;
	
	public Motor(String marca, float cilind,String comb) {
		this.marca=marca;
		this.cilindraje=cilind;
		this.tipoCombustion=comb;
	}
	
	
	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public float getCilindraje() {
		return cilindraje;
	}


	public void setCilindraje(float cilindraje) {
		this.cilindraje = cilindraje;
	}


	public String getTipoCombustion() {
		return tipoCombustion;
	}


	public void setTipoCombustion(String tipoCombustion) {
		this.tipoCombustion = tipoCombustion;
	}


	@Override
	public String toString() {
		return "Motor [marca=" + marca + ", cilindraje=" + cilindraje + ", tipoCombustion=" + tipoCombustion + "]";
	}


}
