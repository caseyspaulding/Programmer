import java.lang.reflect.Array;
import java.util.ArrayList;

public class Programmer {
    private String name;
    private String company;
    private ArrayList<String> languages;

    public Programmer(String name, String company, ArrayList<String> languages) {
        this.name = name;
        this.company = company;
        this.languages = languages;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public ArrayList<String> getLanguages() {
        return languages;
    }

    public void addLanguage(String language) {
        if(language != null) {
            languages.add(language);
        }else {
            System.out.println("Language is null. We don't allow null values to be added at SkillStorm.");
        }
    }

    public void forgetLanguage(String language) {
        System.out.println( name + " Forgot the programming language " + language + ".");
        languages.remove(language);
    }

    public void learnedLanguage(String language) {
        System.out.println(name + " learned the programming language " + language + ".");
        languages.add(language);
    }

    public void changeCompany(String company) {
        this.company = company;
    }

    public void changeName(String name) {
        this.name = name;
    }



    public void printProgrammer() {
        System.out.println("Name: " + name);
        System.out.println("Company: " + company);
        System.out.println("Languages: " + languages);
    }

    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<String>();
        languages.add("Java");
        languages.add("C#");
        languages.add("Python");
        languages.add("JavaScript");
        languages.add("HTML");
        languages.add("CSS");

        Programmer programmer = new Programmer("Casey Spaulding", "SkillStorm", languages);
        Programmer programmer2 = new Programmer("Bruce Wayne", "DC", languages);

        programmer2.forgetLanguage("Java");
        programmer.printProgrammer();
        programmer.addLanguage("C#");
        programmer.forgetLanguage("C#");
        programmer.printProgrammer();

        programmer.printProgrammer();
        programmer.changeCompany("Google");
        programmer.printProgrammer();
        programmer.changeName("Casey");
        programmer.printProgrammer();
    }





}
