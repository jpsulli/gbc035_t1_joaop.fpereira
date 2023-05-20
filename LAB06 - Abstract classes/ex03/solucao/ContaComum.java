public class ContaComum extends ContaCorrente {
    protected float limite;

    public ContaComum(){
        this.estado = 1;
        this.limite = 0;
    }
    public ContaComum(float saldo, int numconta, int psw){
        this.saldo = saldo;
        this.senha = psw;
        this.estado = 1;
        this.limite = 0;
        this.numConta = numconta;
    }
    @Override
    public boolean debitaValor ( float val , int pwd ) {
        if ( pwd != senha )
            return ( false ); // senha deve ser vá lida
        if ( estado != 1 )
            return ( false ); // conta deve ser ativa
        if ( val <= 0 )
            return ( false ); // val > 0
        if ( val > saldo)
            return ( false );

        saldo -= val;
        if ( saldo == 0)
            estado = 2; // torna conta inativa
        return ( true );
    }
    @Override
    public void debitaValor ( float val ) {
        saldo -= val;
    }
    @Override
    public float getSaldo ( int pwd ) {
        if ( senha == pwd )
            return saldo ;
        else
            return -1; // indicando que houve problema na senha
    }
    @Override
    public void creditaValor ( int pwd , float val ) {
        if ( senha == pwd )
            saldo += val;
    }
    @Override
    protected int getEstado ( int pwd ) {
        if ( senha == pwd )
            return estado ;
        else
            return -1;
    }
    @Override
    protected void setEstado ( int pwd , int e ) {
        if ( senha == pwd )
            estado = e;
    }
    @Override
    protected boolean isSenha ( int pwd ) {
        if ( senha == pwd )
            return true ;
        else
            return false ;
    }
    @Override
    protected  void setSenha(int pwd){
        this.senha = pwd;
    }
    public void setNumConta(int num){
        this.numConta = num;
    }
    public void setSaldo(float x){
        this.saldo = x;
    }


}
