package projcompanhiaaerea;

public class Passageiro extends Pessoa{
    private int  codPassageiro;
    private double pesoBagagem;
    private static int qtdPassageiros;

    Voo voo;
    //quando a lista de passageiros for implementada na classe voo, um atributo voo sera adicionado na classe Passageiro
    
     Passageiro(){
        Passageiro.qtdPassageiros = Passageiro.qtdPassageiros+1;
        this.codPassageiro = qtdPassageiros;
    }
    
    public static int getQtdPassageiros() {
        return qtdPassageiros;
    }

    public int getCodPassageiro() {
        return codPassageiro;
    }

    public void setCodPassageiro(int codPassageiro) {
        this.codPassageiro = codPassageiro;
    }

    public double getPesoBagagem() {
        return pesoBagagem;
    }

    public void setPesoBagagem(double pesoBagagem) {
        this.pesoBagagem = pesoBagagem;
    }
    
    void mostraPassageiro(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Email: " + this.getEmail());
        System.out.println("Telefone: " + this.getTelefone());
        System.out.println("Data Nascimento: " + this.getDataNascimento());
        System.out.println("Peso da Bagagem: " + this.getPesoBagagem() + "kg");
    }
    
    void addVoo(Voo voo){
        this.voo = voo;
        this.voo.addPassageiro(this, voo);
    }
    
}
