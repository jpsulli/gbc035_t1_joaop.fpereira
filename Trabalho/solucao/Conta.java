import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;

public abstract class Conta implements Serializable {
    protected int senha;
    protected boolean status;
    protected Cliente[] clientes;
    protected ArrayList<Transacao> transacoes;
    protected int numConta;
    protected float saldoAtual;
    protected LocalDateTime dataAbertura;
    protected LocalDateTime ultimaMovimentação;
    protected int contadorcliente = 0;

    public Conta (int senha, Cliente[] clientes, int numConta, float saldo) {
        this.clientes = new Cliente[2];
        this.senha = senha;
        this.status = true;
        this.transacoes = new ArrayList<Transacao>();
        this.numConta = numConta;
        this.saldoAtual = saldo;
        this.dataAbertura = LocalDateTime.now();
        this.ultimaMovimentação = LocalDateTime.now();

        for(int i = 0; i < 2; i++) {
            if(clientes[i] != null){
                this.clientes[i] = new Cliente();
                this.clientes[i] = clientes[i];
                contadorcliente++;
                this.clientes[i].setContas(this);
            }
        }
    }

    public ArrayList<Transacao> getTransacoes(int senha) {
        if(senha == this.senha)
            return transacoes;
        else
            return null;
    }
    public Cliente[] getClientes(int senha) {
        if(senha == this.senha)
            return clientes;
        else {
            System.out.println("ERRO: Senha errada");
            return null;
        }
    }
    public float getSaldoAtual(int senha) {
        if(senha == this.senha)
            return saldoAtual;
        else {
            System.out.println("ERRO: Senha errada");
            return -1;
        }
    }
    public int getContadorcliente(int senha) {
        if(senha == this.senha)
            return contadorcliente;
        else {
            System.out.println("ERRO: Senha errada");
            return -1;
        }
    }
    public int getNumConta(int senha) {
        if(senha == this.senha)
            return numConta;
        else {
            System.out.println("ERRO: Senha errada");
            return -1;
        }
    }
    public int getSenha(int numConta) {
        if(numConta == this.numConta)
            return senha;
        else {
            System.out.println("ERRO: Numero de conta errado");
            return -1;
        }
    }
    public String getDataAbertura(int senha) {
        if(senha == this.senha){
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String data = dataAbertura.format(formatter);
            return data;
        }
        else {
            System.out.println("ERRO: Senha errada");
            return null;
        }
    }
    public String getUltimaMovimentação(int senha) {
        if(senha == this.senha){
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String lastop = ultimaMovimentação.format(formatter);
            return lastop;
        }
        else {
            System.out.println("ERRO: Senha errada");
            return null;
        }
    }

    public void setUltimaMovimentação(int senha, LocalDateTime ultimaMovimentação) {
        if(senha == this.senha)
            this.ultimaMovimentação = ultimaMovimentação;
        else {
            System.out.println("ERRO: Senha errada");
        }
    }
    public void setContadorcliente(int senha, int contadorcliente) {
        if(senha == this.senha)
            this.contadorcliente = contadorcliente;
        else {
            System.out.println("ERRO: Senha errada");
        }
    }
    public void setDataAbertura(int senha, LocalDateTime dataAbertura) {
        if(senha == this.senha)
            this.dataAbertura = dataAbertura;
        else {
            System.out.println("ERRO: Senha errada");
        }
    }
    public void setCliente(int senha, Cliente cliente) {
        if (senha == this.senha) {
            if (!ehConjunta()) {
                this.clientes[contadorcliente] = cliente;
                contadorcliente++;
            }
            else {
                System.out.println("ERRO: Limite de clientes já foi alcançado");
            }
        }
        else {
            System.out.println("ERRO: Senha errada");
        }
    }
    public void desligarConta(int senha) {
        if(this.senha == senha) {
            this.status = false;
        }
        else {
            System.out.println("ERRO: Senha errada");
        }
    }
    public void setNumConta(int senha, int numConta) {
        if(this.senha == senha) {
            this.numConta = numConta;
        }
        else {
            System.out.println("ERRO: Senha errada");
        }
    }
    public void setSaldoAtual(int senha, float saldoAtual) {
        if(this.senha == senha) {
            this.saldoAtual = saldoAtual;
        }
        else {
            System.out.println("ERRO: Senha errada");
        }
    }
    public void setStatus(int senha, boolean status) {
        if(this.senha == senha) {
            this.status = status;
        }
        else {
            System.out.println("ERRO: Senha errada");
        }
    }
    public void setTransacoes(int senha, Transacao transacao) {
        if(this.senha == senha) {
            this.transacoes.add(transacao);
        }
        else {
            System.out.println("ERRO: Senha errada");
            // exception senha invalida
        }
    }
    public void setSenha(int senha, int senhaNova) {
        if(this.senha == senha) {
            this.senha = senhaNova;
        }
        else {
            System.out.println("ERRO: Senha errada");
            // else exeception senha invalida
        }
    }

    protected boolean ehConjunta(){
        if (contadorcliente > 1){
            return true;
        }
        return false;
    }

    public boolean comparaNum(int num){
        if(num == numConta){
            return true;
        }
        return false;
    }

    public boolean testarSenha(int senha){
        if(senha == this.senha){
            return true;
        }
        return false;
    }

    public void sacar(int senha, String canal, float valor) {
        if(senha==this.senha) {
            if(status) {
                if (valor > 0) {
                    if (valor <= saldoAtual) {
                        saldoAtual = saldoAtual - valor;
                        Transacao transacao = new Transacao(valor, canal, "saque", this);
                        this.transacoes.add(transacao);
                    }else throw new SaldoInvalidoException("Exception: Saldo insuficiente para operacao!"); // else exception valor invalido (valor muito alto)
                }else throw new SaldoInvalidoException("Exception: Valor invalido para operacao!"); // else exception valor invalido (valor muito baixo)
            }else throw new StatusInvalidoExcepetion("Exception: Conta desativada, ative-a para realizar operacoes!");// else exception conta desativada
        } // else exception senha errada
    }
    public void deposita(int senha, String canal, float valor){
        if(senha==this.senha) {
            if(status) {
                if (valor > 0) {
                    saldoAtual = saldoAtual + valor;
                    Transacao transacao = new Transacao(valor, canal, "deposito", this);
                    this.transacoes.add(transacao);
                }else throw new SaldoInvalidoException("Exception: Valor invalido para operacao!"); // else exception valor invalido (valor muito baixo)
            }else throw new StatusInvalidoExcepetion("Exception: Conta desativada, ative-a para realizar operacoes!"); // else exception conta desativada
        } // else exception senha errada
    }
    public void consultaSaldo(int senha, String canal) {
        if (senha == this.senha) {
            if(status) {
                System.out.println("Seu saldo e de" + saldoAtual);
                Transacao transacao = new Transacao(canal, "consulta_saldo", this);
                this.transacoes.add(transacao);
            }else throw new StatusInvalidoExcepetion("Exception: Conta desativada, ative-a para realizar operacoes!"); // else exception conta desativada
        } // else exception senha errada
    }
    public void receberPagamento(float pagamento, String canal){
        if(status) {
            this.saldoAtual = this.saldoAtual + pagamento;
            Transacao transacao = new Transacao(pagamento, canal, "receber_pagamento", this);
            this.transacoes.add(transacao);
        } else throw new StatusInvalidoExcepetion("Exception: Conta desativada, ative-a para realizar operacoes!");// else exception conta desativada
    }
    public void pagamentoConta(int senha, String canal, float valor, Conta conta) {
        if(senha==this.senha) {
            if(status) {
                if (valor > 0) {
                    if (valor < this.saldoAtual) {
                        conta.receberPagamento(valor, canal);
                        this.saldoAtual = this.saldoAtual - valor;
                        Transacao transacao = new Transacao(valor, canal, "pagamento_conta", this);
                        this.transacoes.add(transacao);
                    }else throw new SaldoInvalidoException("Exception: Saldo insuficiente para operacao!"); // else exception valor invalido (valor muito alto)
                } // else exception valor invalido (valor muito baixo)
            }else throw new StatusInvalidoExcepetion("Exception: Conta desativada, ative-a para realizar operacoes!");// else exception conta desativada
        } // else exception senha errada
    }
    protected void getDados(){
        System.out.println("Status da conta" + status);
        if (this.ehConjunta()) {
            System.out.println("Nome do cliente 1: " + clientes[0].getNome());
            System.out.println("Nome do cliente 2: " + clientes[1].getNome());
        } else {
            System.out.println("Nome do cliente: " + clientes[0].getNome());
        }
        System.out.println("Numero da conta: " + numConta);
        System.out.println("Data de abertura: " + dataAbertura);
        System.out.println("Data da ultima movimentaçao: " + ultimaMovimentação);
        System.out.println("Saldo Atual da conta: " + saldoAtual);
    }
    public abstract void mostrarDados(int senha);
    public void extratotransacao(int senha) {
        if(senha==this.senha) {
            for(Transacao t : transacoes){
                t.mostrarTransacao();
            }
        }
        else
        {
            // exception senha invalida
        }
    }
    public void ativarConta(int senha){
        if(this.senha == senha){
            this.status = true;
        }
        else{
            System.out.println("ERRO: Senha errada");
        }
    }
}