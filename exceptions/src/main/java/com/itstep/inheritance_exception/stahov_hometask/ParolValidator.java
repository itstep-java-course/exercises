package com.itstep.inheritance_exception.stahov_hometask;

public class ParolValidator {

    private char[] simvol;
    ParolValidator(String passw) throws ExcepCustom{
        simvol=passw.toCharArray();
        if(!(availableBigLetter() && availableThreeNumbers() && availableSpecialsSimvol() &&  goodLength()))
        throw new ExcepCustom();
        System.out.println("All right this so good");
    }
    private boolean availableBigLetter(){
        for (int i = 0; i <simvol.length ; i++) {
            if(simvol[i]<91 && simvol[i]>64)
                return true;

        }
        return false;
    }
    private boolean availableThreeNumbers(){
        int g=0;
        for (int i = 0; i <simvol.length ; i++) {
            if(simvol[i]<58 && simvol[i]>47)
                g++;

        }
        if(g>2){
            return true;
        }
        return false;
    }
    private boolean availableSpecialsSimvol(){
        int jo=simvol.length;
        for (int i = 0; i <simvol.length ; i++) {
            if ((simvol[i]>64 && simvol[i]<91)||(simvol[i]<58 && simvol[i]>47)||(simvol[i]<123 && simvol[i]>96)){
                jo--;
            }
            if(jo>0){
                return true;
            }

        }
        return false;
    }
    private boolean goodLength(){
        if(simvol.length<12 && simvol.length>5){
            return true;
        }
        return false;
    }
}
