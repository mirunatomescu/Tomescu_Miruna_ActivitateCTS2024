package template_method.clase;

import java.util.HashMap;
import java.util.Map;

public abstract class AchizitieAbstracta {
    protected Map<String, Integer> stocuri;

    public AchizitieAbstracta()
    {
        this.stocuri = new HashMap<>(Map.of(
                "Paracetamol", 1,
                "Ibuprofen", 2
        ));
    }

    protected abstract void primireReteta();
    protected abstract boolean verificareStoc();
    protected abstract void incaseaza();
    protected abstract void aduceMedicamente();
    protected abstract void emiteBon();
    protected abstract void respingeAchizitie();

    public final void cumparaMedicament()
    {
        primireReteta();
        if(verificareStoc())
        {
            aduceMedicamente();
            incaseaza();
            emiteBon();
        }
        else {
            respingeAchizitie();
        }
    }
}
