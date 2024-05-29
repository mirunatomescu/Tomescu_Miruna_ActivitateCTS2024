package clase;

public class FakePersoana implements IPersoana {
    private String getSex;
    private int getVarsta;
    private boolean checkCNP;

    public void setCheckCNP(boolean checkCNP) {
        this.checkCNP = checkCNP;
    }

    public void setGetSex(String getSex) {
        this.getSex = getSex;
    }

    public void setGetVarsta(int getVarsta) {
        this.getVarsta = getVarsta;
    }

    @Override
    public String getSex() {
        return this.getSex;
    }

    @Override
    public int getVarsta() {
        return this.getVarsta;
    }

    @Override
    public boolean checkCNP() {
        return this.checkCNP;
    }

    @Override
    public void setVarsta(int i) {

    }
}