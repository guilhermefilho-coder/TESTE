abstract class Sensor implements Monitoravel{

    protected String ID;
    private boolean ativo;
    protected double ultimaLeitura;
    
    public Sensor(String ID,boolean ativo){
        this.ID = ID;
        this.ativo = ativo;
        this.ultimaLeitura = 0.0;
    }

    @Override
    public boolean verificarConexao(){
        return true;
    }

    @Override
    public void enviarAlerta(String alerta){
        System.out.println("ALERTA: " + ID + " " + alerta);
    }

    public String getIdentificador(){
        return ID;
    }

    public double getUltimaLeitura(){
        return ultimaLeitura;
    }

    public boolean getAtivo(){
        return ativo;
    }

    public String isAtivo(){
        if(ativo){
            return "Ativo";
        }else{
            return "Inativo";
        }
    }

    protected void realizarLeitura(){}

    protected void exibirDados(){}
}
