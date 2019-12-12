
public class ChevroletSparkt extends VehiculoBuilder {

	@Override
	public void definirVehiculo() {
		v= new Vehiculo();
		v.setMarca("Chevrolet");
		v.setModelo("Spark");
		v.setAlmacenamiento("500 lb");
	}

	@Override
	public void crearMotor() {

		v.setMotor(new Motor("Honda", 1.2f, "Combustión interna"));
		
	}

	@Override
	public void crearCarroceria() {
		
		v.setCarroceria(new Carroceria("JWE9EWF8", "Autoportante", 4));
		
	}

	@Override
	public void definirExtras() {
		// TODO Auto-generated method stub
		
	}

}
