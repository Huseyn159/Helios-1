package MentorLesson5HomeProject;

public class Manufacturer {

    private String name;
    private int foundationYear;
    private String country;

    public Manufacturer(String name, int foundationYear, String country) {
        this.name = name;
        this.foundationYear = foundationYear;
        this.country = country;
    }

    @Override
    public String toString() {
        return
                 name + '(' +foundationYear + ","+  country + ')';

    }

     String getName(){
        return name;
    }
     int getFoundationYear(){
        return foundationYear;
    }
     String getCountry(){

        return country;
    }

     void setName(String name){
        this.name = name;
    }
    void setFoundationYear(int foundationYear){
        this.foundationYear = foundationYear;
    }
    void  setCountry(String country){
        this.country = country;
    }



}
