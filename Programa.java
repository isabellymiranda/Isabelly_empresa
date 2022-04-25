
public class Programa {
	public static void main(String[] args) {
		
		Vendedor v = new Vendedor();
		v.setDataDeEntrada("12/04/2018");
		v.setDepartamento("Vendas");
		v.setEstaNaEmpresa(true);
		v.setNome("Eliza de Souza Abrão");
		v.setRg("45.965.856.2");
		//v.calculaSalario();		
		 	
		 
		Gerente g1 = new Gerente();
		g1.departamento = "Vendas";
		g1.dataDeEntrada = "03/02/2020";
		g1.estaNaEmpresa = true;
		g1.nome = "Arthur Fonseca";		
		g1.rg = "52.586.236.1";
		g1.salario = 3500.0;
		g1.calculaSalario();
		
		
		g1.setLogin("Arthur Fonseca");
		g1.setSenha("123");
		
		Supervisor supervisor = new Supervisor();
		supervisor.salario = 5000.0;
		
		ControleDeBonificacao controle = new ControleDeBonificacao();
		controle.calculaTotalDeBonus(v);
		controle.calculaTotalDeBonus(g1);
		controle.calculaTotalDeBonus(supervisor);
			
		System.out.println(v.getDataDeEntrada());
		System.out.println(v.getDepartamento());
		System.out.println(v.getNome());
		System.out.println(v.getRg());
		System.out.println(v.getSalario());
		System.out.println(v.isEstaNaEmpresa());
		System.out.println(v.bonifica());
		
		
		System.out.println("______________________");
		g1.autentica("Arthur Fonseca", "123");
		System.out.println(g1.getDataDeEntrada());
		System.out.println(g1.getDepartamento());
		System.out.println(g1.getNome());
		System.out.println(g1.getRg());
		System.out.println(g1.getSalario());		
		System.out.println(g1.bonifica());
		
		
		System.out.println("Total de bonus: R$" + controle.getTotalDeBonus());
		
		
		
		
		
		
		
		
	}
}


