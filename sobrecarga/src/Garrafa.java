public class Garrafa {
    private int capacidade_ml;
    private int utilizado_ml;
    
    public Garrafa() {
        utilizado_ml = 0;
    }

    public Garrafa(int capacidade_ml) {
        this();
        this.capacidade_ml = capacidade_ml;
    }
    
    public Garrafa(double capacidade_l) {
        this();
        this.capacidade_ml = (int) capacidade_l * 1000;
    }

    public void encher(int ml) {
        this.utilizado_ml += ml;
        verificarVolume();
    }

    public void encher(double l) {
        this.utilizado_ml += (int) l*1000;
        verificarVolume();
    }

    private void verificarVolume() {
        if(utilizado_ml > capacidade_ml) {
            System.out.println("Transbordou");
            utilizado_ml = capacidade_ml;
        }
    }
    
}
