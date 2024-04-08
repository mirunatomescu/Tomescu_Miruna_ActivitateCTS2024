package adapter.autobuz;

public abstract class CardStb {
    protected String numeClient;
    protected String cnpClient;

    protected CardStb(){}

    public CardStb(String numeClient, String cnpClient) {
        this.numeClient = numeClient;
        this.cnpClient = cnpClient;
    }

    public abstract void validareCard();
}
