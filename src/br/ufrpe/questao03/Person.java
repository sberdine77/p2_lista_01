package br.ufrpe.questao03;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Person {
    private String cpf;
    private String group;
    private LocalDate dateOfBirth;
    private List<VaccineRegister> vaccineRegisters;
    private String name;

    public Person(String name, String cpf, String group, LocalDate dateOfBirth){
        this.name = name;
        this.cpf = cpf;
        this.group = group;
        this.dateOfBirth = dateOfBirth;
        this.vaccineRegisters = new ArrayList<VaccineRegister>();
    }

    public Person(){
        this.cpf = "";
        this.group = "";
        this.dateOfBirth = LocalDate.now();
        this.vaccineRegisters = new ArrayList<VaccineRegister>();
    }

    public int calculateAge(){
        return (int) ChronoUnit.YEARS.between(this.dateOfBirth, LocalDate.now());
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return this.group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public List<VaccineRegister> getVaccineRegisters() {
        return this.vaccineRegisters;
    }

    public void addVaccineRegisters(VaccineRegister register) {
        this.vaccineRegisters.add(register);
    }  

}
