package edu.utfpr.cp.dacom.sa.soilcorrection;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class NutrienteAdicional {

    private final NomeNutrienteAdicional nome;
    private final double teorNutriente;

    private double correcaoAdicional;

    public double getTeorNutriente() {
        return this.teorNutriente;
    }

    public void setCorrecaoAdicional(double correcaoAdicional) {
        this.correcaoAdicional = correcaoAdicional;
    }

    public double getCorrecaoAdicional() {
        return this.correcaoAdicional;
    }
    
}
