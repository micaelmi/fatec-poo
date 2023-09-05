public class App {
    public static void main(String[] args) throws Exception {
        Pessoa p1 = new Pessoa("Micael");
        PessoaFisica pf = new PessoaFisica();
        pf.setNome("Micael");
        PessoaJuridica pj = new PessoaJuridica();
        pj.setNome("Cica");
        PessoaJuridica pj2 = new PessoaJuridica();
        pj2.setNome("Cica");

        System.out.println(p1.getNome());
        System.out.println(pf.getNome());
        System.out.println(pj.getNome());

        pf.setCpf(1234L);
        System.out.println(pf.getCpf());

        pf.setCpf(123.4);
        System.out.println(pf.getCpf());

        System.out.println(p1);
        System.out.println(pf);

        if(pj.equals(pj2)) {
            System.out.println("Iguais");
        } else {
            System.out.println("Diferentes");
        }
    }
}
