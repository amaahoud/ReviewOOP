public class rekening {
    String NamaPemilik ;
    String NomorRekening;
    double Saldo;

    public rekening(String NamaPeilik, String NomorRekening, double Saldo ) {
        this.NamaPemilik = NamaPemilik;
        this.NomorRekening = NomorRekening;
        this.Saldo = Saldo;
    }

    public void Setor(double jumlah){
        Saldo += jumlah;
    }

    public void Tarik(double jumlah){
        if (jumlah <= Saldo){
            Saldo -= jumlah;
        } else{
            System.out.println("Saldo tidak Cukup");
        }

        
    }

    public void tampilkanInfo(){
        System.out.println("Nama: " + NamaPemilik);
        System.out.println("Nomor Rekening: " + NomorRekening);
        System.out.println("jumlah Saldo: " + Saldo);
        System.out.println("==========================");
    }
    
}
