package BangunRuang;

public class Bola extends BangunRuang
{
    private float r;
    private float phi = (float) 3.14;
    
    public Bola (float r)
    {
        this.r = r;
    }
    
    @Override
    public void hitungLuas()
    {
        luas = 4 * phi * r * r;
    }
    
    @Override
    public void hitungVolume()
    {
        volume = (4/3) * phi * r * r * r;
    }
}
