package Memento;

import java.util.List;

public class InfoEveniment {
    private String dataMeciului;
    private List<String> echipe;
    private int nrSpectatori;
    private int nrSticleApa;
    private int nrJandarmi;

    public InfoEveniment(String dataMeciului, List<String> echipe, int nrSpectatori,
                         int nrSticleApa, int nrJandarmi) {
        this.dataMeciului = dataMeciului;
        this.echipe = echipe;
        this.nrSpectatori = nrSpectatori;
        this.nrSticleApa = nrSticleApa;
        this.nrJandarmi = nrJandarmi;
    }

    public String getDataMeciului() {
        return dataMeciului;
    }

    public List<String> getEchipe() {
        return echipe;
    }

    public int getNrSpectatori() {
        return nrSpectatori;
    }

    public int getNrSticleApa() {
        return nrSticleApa;
    }

    public int getNrJandarmi() {
        return nrJandarmi;
    }

    @Override
    public String toString() {
        return "Data meciului: '" + dataMeciului + "'\n" +
                "Echipe: " + echipe + "\n" +
                "Numar spectatori: " + nrSpectatori + "\n" +
                "Numar sticle apa: " + nrSticleApa + "\n" +
                "Numar jandarmi: " + nrJandarmi;
    }
}
