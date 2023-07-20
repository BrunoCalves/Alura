public class Conta {
        private double saldo = 0.2; //valor de teste

        public void setSaldo(Double saldo) {
            this.saldo = saldo;
        }
        public Double getSaldo(){
            return saldo;
        }

        public void consultaSaldo(){
            System.out.println("\n\nSaldo disponível: "+ getSaldo());
        }
        public void depositar(Double valor){
            double atualizaSaldo;
            atualizaSaldo = getSaldo() + valor;
            setSaldo(atualizaSaldo);
            System.out.println("Operação realizada com sucesso! ");
        }

        public void transferir(Double valor){
            double atualizaSaldo;
            if(getSaldo() >= valor){
                atualizaSaldo = getSaldo() - valor;
                setSaldo(atualizaSaldo);
                System.out.println("Operação realizada com sucesso! ");
            }else {
                System.out.println("Saldo insuficiente! ");
            }
        }
}
