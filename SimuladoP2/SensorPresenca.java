public class SensorPresenca extends Sensor{
    
    public SensorPresenca(String ID, boolean ativo){
        super(ID, ativo);
    }

    @Override
    public boolean verificarConexao(){
        return getAtivo();
    }
    
    @Override
    public void realizarLeitura(){
        double movimento = (int) (Math.random()*2);

        ultimaLeitura = movimento;

        if(movimento == 1){
            System.out.println("Sensor[" + ID + "]: Leitura realizada = [" + movimento + "] Movimento"); 
        }else{
            System.out.println("Sensor[" + ID + "]: Leitura realizada = [" + movimento + "] Sem movimento");
        }
    }

    @Override
    public void exibirDados(){
        System.out.println("Sensor: Presença");
        System.out.println("ID: " + ID);
        System.out.println("Status: " + isAtivo());
        System.out.println("Ultima leitura: " + ultimaLeitura);
    }
}
