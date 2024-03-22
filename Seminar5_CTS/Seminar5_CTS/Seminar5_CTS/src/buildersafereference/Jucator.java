package buildersafereference;

public class Jucator {
    private boolean mancareInclusa;
    private boolean scaunErgonomic;
    private boolean bauturaRacoritoare;
    private boolean muzicaAmbientala;
    private String genMuzica;

    public Jucator(boolean mancareInclusa, boolean scaunErgonomic, boolean bauturaRacoritoare, boolean muzicaAmbientala, String genMuzica) {
        this.mancareInclusa = mancareInclusa;
        this.scaunErgonomic = scaunErgonomic;
        this.bauturaRacoritoare = bauturaRacoritoare;
        this.muzicaAmbientala = muzicaAmbientala;
        this.genMuzica = genMuzica;
    }

    public boolean isMancareInclusa() {
        return mancareInclusa;
    }

    void setMancareInclusa(boolean mancareInclusa) {
        this.mancareInclusa = mancareInclusa;
    }

    void setScaunErgonomic(boolean scaunErgonomic) {
        this.scaunErgonomic = scaunErgonomic;
    }

    void setBauturaRacoritoare(boolean bauturaRacoritoare) {
        this.bauturaRacoritoare = bauturaRacoritoare;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Jucator{");
        sb.append("mancareInclusa=").append(mancareInclusa);
        sb.append(", scaunErgonomic=").append(scaunErgonomic);
        sb.append(", bauturaRacoritoare=").append(bauturaRacoritoare);
        sb.append(", muzicaAmbientala=").append(muzicaAmbientala);
        sb.append(", genMuzica='").append(genMuzica).append('\'');
        sb.append('}');
        return sb.toString();
    }

    void setMuzicaAmbientala(boolean muzicaAmbientala) {
        this.muzicaAmbientala = muzicaAmbientala;
    }

    void setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
    }

    public boolean isScaunErgonomic() {
        return scaunErgonomic;
    }

    public boolean isBauturaRacoritoare() {
        return bauturaRacoritoare;
    }

    public boolean isMuzicaAmbientala() {
        return muzicaAmbientala;
    }

    public String getGenMuzica() {
        return genMuzica;
    }
}
