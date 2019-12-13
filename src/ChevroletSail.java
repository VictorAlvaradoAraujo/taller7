
public class ChevroletSail extends VehiculoBuilder {

	@Override
	public void definirVehiculo() {
		v= new Vehiculo();
		v.setMarca("Chevrolet");
		v.setModelo("Sail");
		v.setAlmacenamiento("1000 lb");	
	}

	@Override
	public void crearMotor() {
		
		v.setMotor(new Motor("Abarth", 1.4f, "Combustión interna"));
		
	}

	@Override
	public void crearCarroceria() {
		v.setCarroceria(new Carroceria("1J23KO23", "Autoportante", 4));
		
	}

	@Override
	public void definirExtras() {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
}
