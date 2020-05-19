package customclass.olive;

import java.util.List;

public class OlivePress {

    public int getOil(List<Olive> olives)
    {
        int totalOil=0;
        for(Olive o:olives)
        {
            System.out.println(o.getName());
            //System.out.println(o.crush());
            totalOil+=o.crush();
        }
        return totalOil;
    }
}
