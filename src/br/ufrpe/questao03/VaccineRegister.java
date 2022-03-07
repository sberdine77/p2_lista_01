package br.ufrpe.questao03;

import java.time.LocalDate;

public class VaccineRegister {
    String id;
    LocalDate vaccinationDate;
    String attendant;
    int dose;
    String local;
    String group;
    Vaccine vaccine;
    Person vaccinated;

    enum LocalType {
        DRIVETHRU_UFRPE_UNIVERSIDADE_RURAL,
        DRIVETHRU_GERALDAO,
        CENTRO_DE_VACINACAO_PARQUE_DE_EXPOSICAO,
        CENTRO_DE_VACINACAO_COMPAZ_ARIANO_SUASSUNA,
        DRIVE_THRU_PARQUE_DE_EXPOSICAO,
        DRIVE_THRU_ARRUDA,
    }

    enum GroupType {
        IDOSOS,
        TRABALHADORES_DA_SAUDE,
        OUTRAS_PRIORIDADES,
    }

    public VaccineRegister(String id, LocalDate vaccinationDate, String attendant, int dose, LocalType local, GroupType group, Vaccine vaccine, Person vaccinated){
        this.id = id;
        this.vaccinationDate = vaccinationDate;
        this.attendant = attendant;
        this.dose = dose;
        this.local = returnLocalFromLocalType(local);
        this.group = returnGroupFromGroupType(group);
        this.vaccine  = vaccine;
        vaccinated.addVaccineRegisters(this);
        this.vaccinated = vaccinated;
    }

    public VaccineRegister(){
        this.id = "";
        this.vaccinationDate = LocalDate.now();
        this.attendant = "";
        this.dose = -1;
        this.local = "";
        this.group = "";
        this.vaccine  = new Vaccine();
        this.vaccinated = new Person();
    }

    private String returnGroupFromGroupType(GroupType group) {
        switch (group) {
            case IDOSOS:
                return "IDOSOS";
            case TRABALHADORES_DA_SAUDE:
                return "TRABALHADORES DA SAÚDE";
            case OUTRAS_PRIORIDADES:
                return "OUTRAS PRIORIDADES";
            default:
                return "OUTRAS PRIORIDADES";
        }
    }

    private String returnLocalFromLocalType(LocalType local) {
        switch (local) {
            case DRIVETHRU_UFRPE_UNIVERSIDADE_RURAL:
                return "DRIVE THRU - UFRPE - UNIVERSIDADE RURAL";
            case DRIVETHRU_GERALDAO:
                return "DRIVE THRU GERALDÃO";
            case CENTRO_DE_VACINACAO_PARQUE_DE_EXPOSICAO:
                return "CENTRO DE VACINAÇÃO PARQUE DE EXPOSIÇÃO";
            case CENTRO_DE_VACINACAO_COMPAZ_ARIANO_SUASSUNA:
                return "CENTRO DE VACINAÇÃO  COMPAZ ARIANO SUASSUNA";
            case DRIVE_THRU_PARQUE_DE_EXPOSICAO:
                return "DRIVE THRU PARQUE DE EXPOSIÇÃO";
            case DRIVE_THRU_ARRUDA:
                return "DRIVE THRU ARRUDA";
            default:
                return "DRIVE_THRU_ARRUDA";
        }
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getVaccinationDate() {
        return this.vaccinationDate;
    }

    public void setVaccinationDate(LocalDate vaccinationDate) {
        this.vaccinationDate = vaccinationDate;
    }

    public String getAttendant() {
        return this.attendant;
    }

    public void setAttendant(String attendant) {
        this.attendant = attendant;
    }

    public int getDose() {
        return this.dose;
    }

    public void setDose(int dose) {
        this.dose = dose;
    }

    public String getLocal() {
        return this.local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getGroup() {
        return this.group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Vaccine getVaccine() {
        return this.vaccine;
    }

    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }

    public Person getVaccinated() {
        return this.vaccinated;
    }

    public void setVaccinated(Person vaccinated) {
        this.vaccinated = vaccinated;
    }
}
