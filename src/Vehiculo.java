
public class Vehiculo {
	private String marca;
	private String modelo;
	private Motor motor;
	private String almacenamiento;
	private Carroceria carroceria;
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	public String getAlmacenamiento() {
		return almacenamiento;
	}
	public void setAlmacenamiento(String almacenamiento) {
		this.almacenamiento = almacenamiento;
	}
	public Carroceria getCarroceria() {
		return carroceria;
	}
	public void setCarroceria(Carroceria carroceria) {
		this.carroceria = carroceria;
	}
	@Override
	public String toString() {
		return "Marca: "+marca+"\n"
				+"Modelo: "+modelo+"\n"
				+"Motor: "+String.valueOf(motor.getCilindraje())+"\n"
				+"Almacenamiento: "+almacenamiento+"\n"
				+"Carroceria: "+carroceria.getCodigo();
	}
	

}
