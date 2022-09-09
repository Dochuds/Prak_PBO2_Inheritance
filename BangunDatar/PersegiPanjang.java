package BangunDatar;

public class PersegiPanjang extends BangunDatar
{
        private float p;
        private float l;

    public PersegiPanjang(float p, float l)
    {
        this.p = p;
        this.l = l;
    }
    
    @Override
    public void hitungLuas()
    {
        luas = p * l;
    }

    @Override
    public void hitungKeliling()
    {
        keliling = 2 * (p + l);
    }
}
