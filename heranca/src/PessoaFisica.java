public class PessoaFisica extends Pessoa {

    private long cpf;

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public void setCpf(double cpf) {
        this.cpf = (long) cpf;
    }

    public PessoaFisica() {
        super("");
    }
    
    @Override
    public String getNome() {
        return "Meu nome é " + super.getNome();
    }

    @Override
    public String toString() {
        return "PessoaFisica [cpf=" + cpf + "] " + super.toString();
    }

    
}
