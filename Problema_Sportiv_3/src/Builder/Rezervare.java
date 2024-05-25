package Builder;

public class Rezervare {
    boolean areMancare;
    boolean areScaunErgonomic;
    boolean areBautura;
    boolean areMuzicaAmbientala;
    String genMuzica;

    public Rezervare(boolean areMancare, boolean areScaunErgonomic,
                     boolean areBautura, boolean areMuzicaAmbientala, String genMuzica) {
        this.areMancare = areMancare;
        this.areScaunErgonomic = areScaunErgonomic;
        this.areBautura = areBautura;
        this.areMuzicaAmbientala = areMuzicaAmbientala;
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rezervarea clientului: ");
        sb.append("\n  Are mancare: ").append(areMancare ? "da" : "nu");
        sb.append("\n  Are scaun ergonomic: ").append(areScaunErgonomic ? "da" : "nu");
        sb.append("\n  Are bautura: ").append(areBautura ? "da" : "nu");
        sb.append("\n  Are muzica ambientala: ").append(areMuzicaAmbientala ? "da" : "nu");
        sb.append("\n  Gen muzica: ").append(genMuzica);
        return sb.toString();
    }



    public boolean areMancare() {
        return areMancare;
    }

    public void setAreMancare(boolean areMancare) {
        this.areMancare = areMancare;
    }

    public boolean areScaunErgonomic() {
        return areScaunErgonomic;
    }

    public void setAreScaunErgonomic(boolean areScaunErgonomic) {
        this.areScaunErgonomic = areScaunErgonomic;
    }

    public boolean areBautura() {
        return areBautura;
    }

    public void setAreBautura(boolean areBautura) {
        this.areBautura = areBautura;
    }

    public boolean areMuzicaAmbientala() {
        return areMuzicaAmbientala;
    }

    public void setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
        this.areMuzicaAmbientala = areMuzicaAmbientala;
    }

    public String getGenMuzica() {
        return genMuzica;
    }

    public void setGenMuzica(String getGenMuzica) {
        this.genMuzica = getGenMuzica;
    }
}
