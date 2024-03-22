package builderinnerclass;

public class BuilderInner {
    private final Builder builder;
    static class Builder {
            private boolean mancareInclusa;
            private boolean scaunErgonomic;
            private boolean bauturaRacoritoare;
            private boolean muzicaAmbientala;
            private String genMuzica;

            Builder()
            {
                this.mancareInclusa = false;
                this.scaunErgonomic = false;
                this.bauturaRacoritoare = false;
                this.muzicaAmbientala = false;
                this.genMuzica = null;
            }


        public Jucator build() {
            return new Jucator(this.mancareInclusa, this.scaunErgonomic, this.bauturaRacoritoare, this.muzicaAmbientala, this.genMuzica);
        }
    }
    public boolean isMancareInclusa() {
        return builder.mancareInclusa;
    }

    public boolean isScaunErgonomic() {
        return builder.scaunErgonomic;
    }

    public boolean isBauturaRacoritoare() {
        return builder.bauturaRacoritoare;
    }

    public boolean isMuzicaAmbientala() {
        return builder.muzicaAmbientala;
    }

    public String getGenMuzica() {
        return builder.genMuzica;
    }

    public BuilderInner setMancareInclusa() {
        this.builder.mancareInclusa = !this.builder.mancareInclusa;
        return this;
    }
    public BuilderInner setScaunErgonomic() {
        this.builder.scaunErgonomic = !this.builder.scaunErgonomic;
        return this;
    }
    public BuilderInner setBauturaRacoritoare() {
        this.builder.bauturaRacoritoare = !this.builder.bauturaRacoritoare;
        return this;
    }
    public BuilderInner setMuzicaAmbientala() {
        this.builder.muzicaAmbientala = !this.builder.muzicaAmbientala;
        return this;
    }
    public BuilderInner setGenMuzica(String genMuzica) {
        this.builder.genMuzica = genMuzica;
        return this;
    }
    public BuilderInner() {
        this.builder = new Builder();
    }
    public  Jucator build() {
        return builder.build();
    }
}
