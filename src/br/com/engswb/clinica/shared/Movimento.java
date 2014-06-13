import java.util.Date;

public class Movimento {
	private int id;
	private double quantia;
	private int tipo;
	private Date dataMovimento;
	
	public Movimento() {
	}

	public Movimento(int id, double quantia, int tipo, Date dataMovimento) {
		this.id = id;
		this.quantia = quantia;
		this.tipo = tipo;
		this.dataMovimento = dataMovimento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getQuantia() {
		return quantia;
	}

	public void setQuantia(double quantia) {
		this.quantia = quantia;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public Date getDataMovimento() {
		return dataMovimento;
	}

	public void setDataMovimento(Date dataMovimento) {
		this.dataMovimento = dataMovimento;
	}
	
}
