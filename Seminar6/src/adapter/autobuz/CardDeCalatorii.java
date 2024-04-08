package adapter.autobuz;

public class CardDeCalatorii extends CardStb{
    private float soldCard;
    private static float pretCalatorie = 3.30f;
    public CardDeCalatorii(String numeClient, String cnpClient, float soldCard) {
        super(numeClient, cnpClient);
        this.soldCard = soldCard;
    }

    private CardDeCalatorii(){}

    @Override
    public void validareCard() {
        this.soldCard -= pretCalatorie;
        if(this.soldCard > pretCalatorie)
        {
            System.out.println("Călătorie plăcută!");
        }
        else
        {
            System.out.println("Fonduri insuficiente!");
        }
    }
}
