import java.time.LocalDateTime;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;

public abstract class Conta {
    protected int senha;
    protected boolean status;
    protected Cliente[] clientes;
    protected ArrayList<Transacao> transacoes;
    protected int numConta;
    protected float saldoAtual;
    protected LocalDateTime dataAbertura;
    DateTimeFormatter formatter;
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
        this.formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        for(int i = 0; i < 2; i++) {
            if(clientes[i] != null){
                this.clientes[i] = new Cliente();
                this.clientes[i] = clientes[i];
                contadorcliente++;
                this.clientes[i].setContas(this);
            }
        }
    }

    public ArrayList<Transacao> getTransacoes() {
        return transacoes;
    }
    public Cliente[] getClientes() {
        return clientes;
    }
    public float getSaldoAtual() {
        return saldoAtual;
    }
    public int getContadorcliente() {
        return contadorcliente;
    }
    public int getNumConta() {
        return numConta;
    }
    public int getSenha() {
        return senha;
    }
    public String getDataAbertura() {
        String data = dataAbertura.format(formatter);
        return data;
    }
    public String getUltimaMovimentação() {
        String lastop = ultimaMovimentação.format(formatter);
        return lastop;
    }


    public void setUltimaMovimentação(LocalDateTime ultimaMovimentação) {
        this.ultimaMovimentação = ultimaMovimentação;
    }
    public void setContadorcliente(int contadorcliente) {
        this.contadorcliente = contadorcliente;
    }
    public void setDataAbertura(LocalDateTime dataAbertura) {
        this.dataAbertura = dataAbertura;
    }
    public void setCliente(Cliente cliente) {
        if(!ehConjunta()) {
            this.clientes[contadorcliente] = cliente;
            contadorcliente++;
        }
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public void setSaldoAtual(float saldoAtual) {
        this.saldoAtual = saldoAtual;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public void setTransacoes(ArrayList<Transacao> transacoes) {
        this.transacoes = transacoes;
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }


    public boolean ehConjunta(){
        if (contadorcliente > 1){
            return true;
        }
        return false;
    }

    public void sacar(int senha, String canal, float valor) {
        float saldo_atual = getSaldoAtual();
        if(senha==this.senha)
        {
            if(saldo_atual>0)
            {
                if(valor>=saldo_atual)
                {
                    saldo_atual = saldoAtual - valor;
                    Transacao transacao = new Transacao(valor, canal,"saque", this);
                    this.transacoes.add(transacao);
                }
            }
        }
    }
    public void deposita(int senha, String canal, float valor){
        if(senha==this.senha) {
            if(valor > 0){
                saldoAtual = saldoAtual+valor;
                Transacao transacao = new Transacao(valor, canal, "deposito", this);
                this.transacoes.add(transacao);
            }
        }
    }
    public void consulta_saldo(int senha, String canal) {
        if (senha == this.senha) {
            System.out.println("Seu saldo e de" + getSaldoAtual());
            Transacao transacao = new Transacao(canal, "consulta_saldo", this);
            this.transacoes.add(transacao);
        }
    }
    public void receberPagamento(float pagamento, String canal){
        this.saldoAtual = this.saldoAtual + pagamento;
        Transacao transacao = new Transacao(pagamento, canal, "receber_pagamento", this);
        this.transacoes.add(transacao);
    }
    public void pagamento_conta(int senha, String canal, float valor, Conta conta) {
        if(senha==this.senha) {
            if(valor < this.saldoAtual){
                this.saldoAtual = this.saldoAtual - valor;
                Transacao transacao = new Transacao(valor, canal, "pagamento_conta", this);
                this.transacoes.add(transacao);
                conta.deposita(senha, canal, valor);
            }
        }
    }
}
