package BangunDatar;

public class Lingkaran extends BangunDatar
{
    private float phi = 3.14f;
    private float r;

    public Lingkaran(float r)
    {
        this.r = r;
    }

    @Override
    public void hitungLuas()
    {
        luas = phi * r * r;
    }

    @Override
    public void hitungKeliling()
    {
        keliling = 2 * phi * r;
    }
}