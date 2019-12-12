
public class ChevroletDmax extends VehiculoBuilder {

	@Override
	public void definirVehiculo() {
		v= new Vehiculo();
		v.setMarca("Chevrolet");
		v.setModelo("Dmax");
		v.setAlmacenamiento("800 lb");
	}

	@Override
	public void crearMotor() {
		
		v.setMotor(new Motor("Ford", 1.5f, "Combustión interna"));
		
	}

	@Override
	public void crearCarroceria() {

		v.setCarroceria(new Carroceria("3HDUST47", "Autoportante", 4));
	
	}

	@Override
	public void definirExtras() {
		// TODO Auto-generated method stub
		
	}

}
