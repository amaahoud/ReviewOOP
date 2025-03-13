public class tabungan extends rekening{
    double BungaTahunan;

    public tabungan(String NamaPeilik, String NomorRekening, double Saldo, double BungaTahunan){
        super(NamaPeilik, NomorRekening, Saldo);
        this.BungaTahunan = BungaTahunan;
    }

    public double HitungBunga(int bulan){
        return Saldo * (BungaTahunan / 100) * (bulan/ 12.0);
    }

    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("bungatahunan :" + BungaTahunan + "%");

    }
}

class Giro extends rekening{
    double limitpenarikan;

    public Giro(String NamaPeilik, String NomorRekening, double Saldo, double BungaTahunan, double limitpenarikan){
        super(NamaPeilik, NomorRekening, Saldo);
        this.limitpenarikan = limitpenarikan;
    }

    @Override
    public void Tarik(double jumlah){
        if (jumlah <= Saldo + limitpenarikan){
            Saldo -= jumlah;
        }else{
            System.out.println("julah penarikan limit");
        }
    }
}    