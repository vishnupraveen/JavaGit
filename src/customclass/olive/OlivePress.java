package customclass.olive;

import java.util.List;

public class OlivePress implements Press{
    private int currentOil;

    public int getOil(List<Olive> olives)
    {
        int totalOil=currentOil;
        for(Olive o:olives)
        {
            System.out.println(o.getName());
            //System.out.println(o.crush());
            totalOil+=o.crush();
        }
        return totalOil;
    }

    public void setOil(int oil)
    {
        currentOil=oil;
    }
}
