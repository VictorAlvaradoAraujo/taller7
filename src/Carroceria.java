
public class Carroceria {
	private String codigo;
	private String tipo;
	private int numeroPuertas;
	
	public Carroceria(String codigo, String tipo, int puertas) {
		this.codigo=codigo;
		this.tipo=tipo;
		this.numeroPuertas=puertas;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	@Override
	public String toString() {
		return "Carroceria [codigo=" + codigo + ", tipo=" + tipo + ", numeroPuertas=" + numeroPuertas + "]";
	}
	
	
	
}
