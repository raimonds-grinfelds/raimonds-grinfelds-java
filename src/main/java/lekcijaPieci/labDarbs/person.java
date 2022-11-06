package lekcijaPieci.labDarbs;

import java.util.Random;

public class person {

    private long personasKods;

    private String vards;

    private String uzvards;

    private int vecums;

    public person(String vards,String uzvards){
        this.vards = vards;
        this.uzvards = uzvards;
        this.vecums = 0;
    }

    public long getPersonasKods() {
        return personasKods;
    }

    public String getVards() {
        return vards;
    }

    public String getUzvards() {
        return uzvards;
    }

    public int getVecums() {
        return vecums;
    }


}
