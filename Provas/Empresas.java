
public class Empresas{
    private String nome;
    private String cnpj;
    private Trabalhador[] trabalhadores;
    private String endereco;
    private int num_Funcionario;
    private String ceo;
    public Empresas(String nome, String cnpj,int tam, String endereco, int num_Funcionario,String ceo) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.trabalhadores = new Trabalhador[tam];
        this.endereco = endereco;
        this.num_Funcionario = num_Funcionario;
        this.ceo = ceo;
    }
    public void contratar(Trabalhador t){
        setNum_Funcionario(num_Funcionario+1);
        for(int i = 0; i<num_Funcionario;i++){
           if(this.trabalhadores[i] ==null){
            this.trabalhadores[i] = t;
           }
        }

    }
    public void trabalhar(){
        for(int i = 0;i<num_Funcionario;i++){
            if(trabalhadores[i].isFerias() == false){
                trabalhadores[i].setHoras_Trabalhadas(trabalhadores[i].getHoras_Trabalhadas()+8);
            }  
        }
    }
    public void ferias(){
         for(int i = 0;i<num_Funcionario;i++){
            if(trabalhadores[i].isFerias() == false){
                trabalhadores[i].setFerias(true);
            }  
            else{
                 trabalhadores[i].setFerias(false);
            }
        }
    }
    public double calcularPagamento(){
        double total = 0;
        for(int i = 0 ; i<num_Funcionario;i++){
            total = total + (trabalhadores[i].getHoras_Trabalhadas()*trabalhadores[i].getValor_Hora());
        }
        return total;
    }







    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public int getNum_Funcionario() {
        return num_Funcionario;
    }
    public void setNum_Funcionario(int num_Funcionario) {
        this.num_Funcionario = num_Funcionario;
    }
    public String getCeo() {
        return ceo;
    }
    public void setCeo(String ceo) {
        this.ceo = ceo;
    }
}