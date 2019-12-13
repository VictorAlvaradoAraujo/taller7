
public class Main {

	public static void main(String[] args) {
	        //Sail
		System.out.println("Auto 1: ");
		VehiculoDirector sail= new VehiculoDirector(new ChevroletSail());
		sail.VehiculoBuider();
		Vehiculo v1=sail.getVehiculo();
		System.out.println(v1+"\n");
		// Sparkt
		VehiculoDirector sparkt= new VehiculoDirector(new ChevroletSparkt());
		sparkt.VehiculoBuider();
		Vehiculo v2=sparkt.getVehiculo();
		System.out.println(v2+"\n");
		// Dmax		
		VehiculoDirector dmax= new VehiculoDirector(new ChevroletDmax());
		dmax.VehiculoBuider();
		Vehiculo v3=dmax.getVehiculo();
		System.out.println(v3+"\n");
	}
	
}
