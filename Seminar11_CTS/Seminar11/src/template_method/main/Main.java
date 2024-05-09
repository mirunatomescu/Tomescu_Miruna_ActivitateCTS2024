package template_method.main;

import template_method.clase.AchizitieMedicament;

public class Main {
    public static void main(String[] args) {
        AchizitieMedicament achizitieMedicament = new AchizitieMedicament("Paracetamol");
        achizitieMedicament.cumparaMedicament();
        achizitieMedicament.cumparaMedicament();
    }
}
