package BangunDatar;

public class Persegi extends BangunDatar
{
    private float s;

    public Persegi(float s)
    {
        this.s = s;
    }

    @Override
    public void hitungLuas()
    {
        luas = s * s;
    }

    @Override
    public void hitungKeliling()
    {
        keliling = 4 * s;
    }
}