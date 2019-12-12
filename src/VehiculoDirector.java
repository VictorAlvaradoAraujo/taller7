
public class VehiculoDirector {
	private VehiculoBuilder builder;
	
	public VehiculoDirector(VehiculoBuilder builder) {
		this.builder=builder;
	}
	
	public void VehiculoBuider() {
		builder.crearCarroceria();
		builder.crearMotor();
		builder.definirExtras();
		builder.definirVehiculo();
	}
	
	public Vehiculo getVehiculo() {
		return builder.v;
	}
}
