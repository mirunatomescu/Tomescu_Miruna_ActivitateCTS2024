package template_method.clase;

public class AchizitieMedicament extends AchizitieAbstracta{

    private String numeMedicament;

    public AchizitieMedicament(String numeMedicament)
    {
        super();
        this.numeMedicament = numeMedicament;
    }

    @Override
    protected void primireReteta() {
        System.out.println("S-a primit reteta!");
    }

    @Override
    protected boolean verificareStoc() {
        return super.stocuri.containsKey(this.numeMedicament);
    }

    @Override
    protected void incaseaza() {
        System.out.printf("Am incasat banii pe medicamentul %s.%n", this.numeMedicament);
    }

    @Override
    protected void aduceMedicamente() {
        System.out.printf("Medicamentul %s este adus din depozit.%n", this.numeMedicament);
        if(super.stocuri.get(this.numeMedicament)>1)
        {super.stocuri.replace(this.numeMedicament, super.stocuri.get(this.numeMedicament)-1);}
        else {
            super.stocuri.remove(this.numeMedicament);
        }
    }

    @Override
    protected void emiteBon() {
        System.out.printf("S-a emis bonul pentru medicamentul %s.%n", this.numeMedicament);
    }

    @Override
    protected void respingeAchizitie() {
        System.out.printf("Nu avem stoc suficient pentru medicamentul %s.%n", this.numeMedicament);
    }
}
