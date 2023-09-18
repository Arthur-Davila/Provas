public class Trabalhador {
    private String nome;
    private int idade;
    private double valor_Hora;
    private int horas_Trabalhadas;
    private boolean ferias;
    public Trabalhador(String nome, int idade, double valor_Hora, int horas_Trabalhadas, boolean ferias) {
        this.nome = nome;
        this.idade = idade;
        this.valor_Hora = valor_Hora;
        this.horas_Trabalhadas = horas_Trabalhadas;
        this.ferias = ferias;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double getValor_Hora() {
        return valor_Hora;
    }
    public void setValor_Hora(double valor_Hora) {
        this.valor_Hora = valor_Hora;
    }
    public int getHoras_Trabalhadas() {
        return horas_Trabalhadas;
    }
    public void setHoras_Trabalhadas(int horas_Trabalhadas) {
        this.horas_Trabalhadas = horas_Trabalhadas;
    }
    public boolean isFerias() {
        return ferias;
    }
    public void setFerias(boolean ferias) {
        this.ferias = ferias;
    }

    
}
