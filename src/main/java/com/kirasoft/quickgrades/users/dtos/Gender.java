package com.kirasoft.quickgrades.users.dtos;

public enum Gender {

    MALE(1),FEMALE(2);
    private int gender;

    Gender(int gender){
        this.gender = gender;
    }

    public int getGender(){
        return this.gender;
    }
/*

    public int getGenderByName(String genderName){
        int genderInt = 0;

        if(genderName!=null && !"".equalsIgnoreCase(genderName)){
            if(Gender.MALE.name().equalsIgnoreCase(genderName)){
                genderInt = MALE.gender;
            }

            if(Gender.FEMALE.name().equalsIgnoreCase(genderName)){
                genderInt = FEMALE.gender;
            }
        }

        return genderInt;
    }
*/


}
