package BangunRuang;

public class Kubus extends BangunRuang
{
    private float s;
    
    public Kubus (float s)
    {
        this.s = s;
    }
    
    @Override
    public void hitungLuas()
    {
        luas = 6 * (s*s);
    }
    
   @Override
    public void hitungKeliling()
    {
        keliling = 12 * s;
    }
    
    @Override
    public void hitungVolume()
    {
        volume = s * s * s;
    }   
}
