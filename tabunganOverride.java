public class tabunganOverride extends rekening {
    public tabunganOverride(String NamaPeilik, String NomorRekening, double Saldo) {
        super(NamaPeilik, NomorRekening, Saldo);
    }

    public void Setor(double jumlah, boolean transfer) {
        if (transfer) {
            Saldo += (jumlah - 2500);
        } else {
            Saldo += jumlah;
        }
    }
}
