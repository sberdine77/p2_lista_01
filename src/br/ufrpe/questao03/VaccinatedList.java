package br.ufrpe.questao03;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class VaccinatedList {
    private List<VaccineRegister> vaccinated;

    public VaccinatedList(List<VaccineRegister> vaccinated) {
        this.vaccinated = vaccinated;
    }

    public VaccinatedList() {
        this.vaccinated = new ArrayList<VaccineRegister>();
    }

    public List<VaccineRegister> getVaccinated() {
        return this.vaccinated;
    }

    public void setVaccinated(List<VaccineRegister> vaccinated) {
        this.vaccinated = vaccinated;
    }

    public void add(VaccineRegister vaccineRegister){
        this.vaccinated.add(vaccineRegister);
    }

    public int calculateTotalVaccinatedBeyondAge(int age){
        int numberOfPeople = 0;
        for(VaccineRegister vacc : this.vaccinated){
            if(vacc.getVaccinated().calculateAge() > age){
                numberOfPeople++;
            }
        }
        return numberOfPeople;
    }

    public void listElderlyWhoToke2Dose(){
        List<Person> result = new ArrayList<>();
        for(VaccineRegister vacc : this.vaccinated){
            if(vacc.group == "IDOSOS" && vacc.dose == 2){
                result.add(vacc.getVaccinated());
            }
        }
        for(Person person : result) {
            System.out.println(person.getName());
        }
    }

    public void listPeopleWithout2Dose(){
        List<VaccineRegister> result = new ArrayList<VaccineRegister>();
        for(VaccineRegister vacc : this.vaccinated){
            if(vacc.dose != 2){
                Boolean isPersonVaccinetedWith2Dose = false;
                for(VaccineRegister anotherRegisters : vacc.getVaccinated().getVaccineRegisters()){
                    if(anotherRegisters.dose == 2) {
                        isPersonVaccinetedWith2Dose = true;
                    }
                }
                if(!isPersonVaccinetedWith2Dose) {
                    result.add(vacc);
                }
            }
        }
        System.out.println("CPF \t\t| Nome \t\t| Idade \t| Data Indicada p. 2a Dose");
        System.out.println("-----------------------------------------------------------------------");
        for(VaccineRegister register : result){
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
            System.out.println(register.getVaccinated().getCpf() + " \t| " + register.getVaccinated().getName() + " |\t\t" + register.getVaccinated().calculateAge() + " | \t\t" + register.getVaccinationDate().plusDays(90).format(formatter));
        }
    }
}
