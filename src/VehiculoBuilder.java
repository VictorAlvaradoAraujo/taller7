
public abstract class VehiculoBuilder {
	protected Vehiculo v;
	
	public Vehiculo getVehiculo() {
		return v;
	}
	
	public abstract void definirVehiculo();
	public abstract void crearMotor();
	public abstract void crearCarroceria();
	public abstract void definirExtras();
	
}
