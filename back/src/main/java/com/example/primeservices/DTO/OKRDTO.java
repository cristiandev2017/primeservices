package com.example.primeservices.DTO;

public class OKRDTO {

    private String idokr;
    private String titleokr;
    private String descriptionokr;

    public OKRDTO(String idokr, String titleokr, String descriptionokr) {
        this.idokr = idokr;
        this.titleokr = titleokr;
        this.descriptionokr = descriptionokr;
    }

    public OKRDTO(String titleokr, String descriptionokr) {
        this.titleokr = titleokr;
        this.descriptionokr = descriptionokr;
    }

    public OKRDTO() {
    }

    public String getIdokr() {
        return idokr;
    }

    public void setIdokr(String idokr) {
        this.idokr = idokr;
    }

    public String getTitleokr() {
        return titleokr;
    }

    public void setTitleokr(String titleokr) {
        this.titleokr = titleokr;
    }

    public String getDescriptionokr() {
        return descriptionokr;
    }

    public void setDescriptionokr(String descriptionokr) {
        this.descriptionokr = descriptionokr;
    }
}
