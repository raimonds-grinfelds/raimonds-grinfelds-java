package lekcijaPieci.staticPiemers;

public class Cilveks {

    public String name;
    public int age = 0;

    public int darbiniekaNumurs;

    public  Cilveks(String name){
        this.name = name;

    }

    public void printname(){
        System.out.println("Cilveka vaeds ir:" + name);
        System.out.println("Darbinieka numurs ir: " + darbiniekaNumurs);
    }
}
