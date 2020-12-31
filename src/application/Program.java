package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int cont = 0; //Aumenta o valor caso o for não ache o id procurado
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		Funcionario[] func = new Funcionario[n];
		
		for(int i=0;i<func.length;i++) {
			System.out.println("Employee #" + (i+1));
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			func[i] = new Funcionario(id, name, salary);
			System.out.print("\n");
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int code = sc.nextInt();
		
		for(int i=0;i<func.length;i++) { //Laço para procurar o id no vetor
			if(code == func[i].getId()) {
				System.out.print("Enter the percentage: ");
				double percent = sc.nextDouble();
				func[i].SalaryIncrease(percent);
			}
			else {
				cont = cont + 1;
			}
		}
		if (cont == func.length) {
			System.out.print("\nThis id does not exist!\n");
		}
		
		System.out.println("\nList of Employees:");
		for(int i = 0;i<func.length;i++) {
			System.out.println(func[i].getId() + ", " + func[i].getName() + ", " + func[i].getSalario());
		}
		
		sc.close();
	}
}
