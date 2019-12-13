
public class Main {

	public static void main(String[] args) {
		
		VehiculoDirector sail= new VehiculoDirector(new ChevroletSail());
		sail.VehiculoBuider();
		Vehiculo v1=sail.getVehiculo();
		System.out.println(v1);
	}
	
}
