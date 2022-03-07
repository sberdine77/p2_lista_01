package br.ufrpe.questao03;

import java.time.LocalDate;

public class Q3 {
    public static void main(String[] args) throws Exception {
        Person person1 = new Person("Joao Augusto", "83784738298", "IDOSOS", LocalDate.of(1940, 11, 03));
        Person person2 = new Person("Maria Augusta", "64703872698", "TRABALHADORES DA SAUDE", LocalDate.of(1979, 01, 03));
        Person person3 = new Person("Pedro Rabelo", "04984716276", "IDOSOS", LocalDate.of(1980, 12, 03));
        Person person4 = new Person("Monica Geller", "18274372872", "IDOSOS", LocalDate.of(1990, 04, 21));
        Person person5 = new Person("Phoebe Buffet", "92873651423", "TRABALHADORES DA SAUDE", LocalDate.of(1995, 11, 03));

        Vaccine vaccine1 = new Vaccine(01, Vaccine.NameType.CORONAVAC, "01");
        Vaccine vaccine2 = new Vaccine(02, Vaccine.NameType.OXFORD, "02");

        VaccineRegister register1 = new VaccineRegister("01", LocalDate.of(2021, 11, 3), "Maria José", 1, VaccineRegister.LocalType.DRIVETHRU_UFRPE_UNIVERSIDADE_RURAL, VaccineRegister.GroupType.IDOSOS , vaccine1, person1);
        VaccineRegister register2 = new VaccineRegister("02", LocalDate.of(2021, 12, 3), "João José", 1, VaccineRegister.LocalType.CENTRO_DE_VACINACAO_COMPAZ_ARIANO_SUASSUNA, VaccineRegister.GroupType.TRABALHADORES_DA_SAUDE , vaccine1, person2);
        VaccineRegister register3 = new VaccineRegister("03", LocalDate.of(2021, 10, 3), "Maria José", 1, VaccineRegister.LocalType.DRIVETHRU_GERALDAO, VaccineRegister.GroupType.IDOSOS , vaccine1, person3);
        VaccineRegister register4 = new VaccineRegister("04", LocalDate.of(2021, 7, 3), "João José", 1, VaccineRegister.LocalType.CENTRO_DE_VACINACAO_PARQUE_DE_EXPOSICAO, VaccineRegister.GroupType.IDOSOS , vaccine1, person4);
        VaccineRegister register5 = new VaccineRegister("05", LocalDate.of(2021, 8, 3), "Maria José", 1, VaccineRegister.LocalType.DRIVE_THRU_ARRUDA, VaccineRegister.GroupType.TRABALHADORES_DA_SAUDE , vaccine1, person5);
        VaccineRegister register6 = new VaccineRegister("06", LocalDate.of(2021, 9, 3), "Maria José", 2, VaccineRegister.LocalType.DRIVETHRU_UFRPE_UNIVERSIDADE_RURAL, VaccineRegister.GroupType.IDOSOS , vaccine2, person1);
        
        VaccinatedList vaccinatedList = new VaccinatedList();
        vaccinatedList.add(register1);
        vaccinatedList.add(register2);
        vaccinatedList.add(register3);
        vaccinatedList.add(register4);
        vaccinatedList.add(register5);
        vaccinatedList.add(register6);

        vaccinatedList.listPeopleWithout2Dose();
    }
}
