package buildersafereference;

public class JucatorBuilder implements AbstractBuilder{
    private boolean mancareInclusa;
    private boolean scaunErgonomic;
    private boolean bauturaRacoritoare;
    private boolean muzicaAmbientala;
    private String genMuzica;

    public JucatorBuilder() {
        this.mancareInclusa = false;
        this.scaunErgonomic = false;
        this.bauturaRacoritoare = false;
        this.muzicaAmbientala = false;
        this.genMuzica = null;
    }

    @Override
    public Jucator build() {
        return new Jucator(mancareInclusa, scaunErgonomic, bauturaRacoritoare, muzicaAmbientala, genMuzica);
    }
    public JucatorBuilder setMancareInclusa() {
        this.mancareInclusa = !this.mancareInclusa;
        return this;
    }
    public JucatorBuilder setScaunErgonomic() {
        this.scaunErgonomic = !this.scaunErgonomic;
        return this;
    }
    public JucatorBuilder setBauturaRacoritoare() {
        this.bauturaRacoritoare = !this.bauturaRacoritoare;
        return this;
    }
    public JucatorBuilder setMuzicaAmbientala() {
        this.muzicaAmbientala = !this.muzicaAmbientala;
        return this;
    }
    public JucatorBuilder setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
        return this;
    }
}
