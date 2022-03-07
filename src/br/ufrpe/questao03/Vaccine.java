package br.ufrpe.questao03;

public class Vaccine {
    enum NameType {
        CORONAVAC,
        OXFORD,
    }
    private int code;
    private String name;
    private String lote;
    
    Vaccine(int code, NameType name, String lote){
        this.code = code;
        this.name = returnNameFromNameEnum(name);
        this.lote = lote;
    }

    Vaccine(){
        this.code = -1;
        this.name = "";
        this.lote = "";
    }

    private String returnNameFromNameEnum(NameType name) {
        switch (name) {
            case CORONAVAC:
                return "CORONAVAC";
            case OXFORD:
                return "OXFORD";
            default:
                return "CORONAVAC";
        }
    }

    public String getName() {
        return this.name;
    }

    public String getLote() {
        return this.lote;
    }

    public void setName(NameType name) {
        this.name = returnNameFromNameEnum(name);
    }

    public void setLote(String lote){
        this.lote = lote;
    }
}
