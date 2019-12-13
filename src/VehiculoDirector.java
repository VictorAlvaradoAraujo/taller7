
public class VehiculoDirector {
	protected VehiculoBuilder builder;
	
	public VehiculoDirector(VehiculoBuilder builder) {
		this.builder=builder;
	}
	
	public void VehiculoBuider() {
		builder.definirVehiculo();
		builder.crearMotor();
		builder.crearCarroceria();
		builder.definirExtras();
	}
	
	public Vehiculo getVehiculo() {
		return builder.getVehiculo();
	}
}
