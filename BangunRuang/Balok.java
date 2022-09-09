package BangunRuang;

public class Balok extends BangunRuang
{
    private float p;
    private float l;
    private float t;
    
    public Balok(float p, float l, float t)
    {
        this.p = p;
        this.l = l;
        this.t = t;
    }
    
    @Override
    public void hitungLuas()
    {
        luas = 2 * (p*l + p*t + l*t);
    }
    
    @Override
    public void hitungKeliling()
    {
        keliling = 4 * (p + l + t);
    }
    
    @Override
    public void hitungVolume()
    {
        volume = p * l * t;
    }
}