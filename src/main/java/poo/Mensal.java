package poo;

public class Mensal {
    String nome;
    double salario;

    public Mensal(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double calcularSalario(){

    }

    public void aumentarSalario(double percentual){

    }

    @Override
    public String toString() {
        return "Funcionarios{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
