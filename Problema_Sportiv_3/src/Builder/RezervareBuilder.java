package Builder;

public class RezervareBuilder implements IBuilder {
    private Rezervare rezervare;
    public RezervareBuilder() {
        rezervare = new Rezervare(false,false,false,
                false,null);
    }
    @Override
    public Rezervare build() {
        return rezervare;
    }

    public RezervareBuilder setAreMancare(boolean areMancare) {
        this.rezervare.setAreMancare(areMancare);
        return this;
    }

    public RezervareBuilder setAreScaunErgonomic(boolean areScaunErgonomic) {
        this.rezervare.setAreScaunErgonomic(areScaunErgonomic);
        return this;
    }

    public RezervareBuilder setAreBautura(boolean areBautura) {
        this.rezervare.setAreBautura(areBautura);
        return this;
    }

    public RezervareBuilder setAreMuzicaAmbientala(boolean areMancare) {
        this.rezervare.setAreMancare(areMancare);
        return this;
    }

    public RezervareBuilder setGenMuzica(String muzica){
        this.rezervare.setGenMuzica(muzica);
        return this;
    }
}
