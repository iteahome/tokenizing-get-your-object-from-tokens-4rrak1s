package model;

public class Student {

    int ID;
    String firstName;
    String lastName;
    String city;
    String nativeLanguage;
    float grade;

    public Student(int ID, String firstName, String lastName, String city, String nativeLanguage, float grade) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.nativeLanguage = nativeLanguage;
        this.grade = grade;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNativeLanguage() {
        return nativeLanguage;
    }

    public void setNativeLanguage(String nativeLanguage) {
        this.nativeLanguage = nativeLanguage;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    @Override
    public String toString(){
        return ID + ", " + firstName + ", " + lastName + ", " + city + ", " + nativeLanguage + ", " + grade;
    }
}
