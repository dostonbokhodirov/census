package uz.tuit.census.enums;

import lombok.Getter;

@Getter
public enum PersonCondition {

    EMPLOYMENT_STATUS("Bandlik holati"),
    EDUCATION_STATUS("Ta'lim ma'lumoti"),
    FAMILY_STATUS("Oilaviy holat"),
    SOCIAL_STATUS("Ijtimoiy holat"),
    HEALTH_STATUS("Salomatlik holati");

    private final String name;

    PersonCondition(String name) {
        this.name = name;
    }
}
