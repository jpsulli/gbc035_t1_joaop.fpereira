import java.io.Serializable;

public abstract class Pessoa implements Serializable, Classificavel {
        protected String CPF;
        protected String nome;
        protected Endereco endereco;
        protected String estadoCivil;
        protected String dataNascimento;

        public Pessoa(){}

        public Pessoa(String CPF, String nome, Endereco endereco, String estadoCivil, String dataNascimento) {
            this.CPF = CPF;
            this.nome = nome;
            this.endereco = endereco;
            this.estadoCivil = estadoCivil;
            this.dataNascimento = dataNascimento;
        }

        public String getNome() {
            return nome;
        }
        public String getCPF() {
            return CPF;
        }
        public Endereco getEndereco() {
            return endereco;
        }
        public String getEstadoCivil() {
            return estadoCivil;
        }
        public String getDataNascimento() {
            return dataNascimento;
        }


        public void setCPF(String CPF) {
            this.CPF = CPF;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public void setEstadoCivil(String estadoCivil) {
            this.estadoCivil = estadoCivil;
        }
        public void setEndereco(Endereco endereco) {
            this.endereco = endereco;
        }
        public void setDataNascimento(String dataNascimento) {
            this.dataNascimento = dataNascimento;
        }

        public void mostrarPessoa(){
            System.out.println("Nome: " + nome);
            System.out.println("Data de nascimento: " + dataNascimento);
            System.out.println("CPF: " + CPF);
        }

        public boolean eMenorQue (Classificavel o) {
            Pessoa compara = (Pessoa) o;
            String c = compara.getCPF();
            if (CPF.compareTo(c) < 0) {
                return true;
            }
            else {
                return false;
            }
        }
}