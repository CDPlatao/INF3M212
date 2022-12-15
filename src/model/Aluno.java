package model;

public class Aluno {

    private String nome;
    private int idade;
    private String cpf;
    private String rg;
    private String telefone;
    private String cidade;
    private String matricula;

    public Aluno() {

    }

    public Aluno(String nome, int idade, String cpf, String rg, String telefone, String cidade, String matricula) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.rg = rg;
        this.telefone = telefone;
        this.cidade = cidade;
        this.matricula = matricula;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return " Nome: " + nome + "| Idade:" + idade + "| Cpf: " + cpf + "| Rg: " + rg + "| Telefone: "
                + telefone + "| Cidade: " + cidade + "| Matricula: " + matricula;
    }

}
