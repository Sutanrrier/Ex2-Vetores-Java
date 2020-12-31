package entities;

public class Funcionario {

	private String name;
	private int id;
	private double salario;
	
	public Funcionario(int id, String name, double salario) {
		this.name = name;
		this.id = id;
		this.salario = salario;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalario() {
		return salario;
	}
	
	public void SalaryIncrease(double percent) {
		salario = salario + (salario * (percent/100));
	}
	
}
