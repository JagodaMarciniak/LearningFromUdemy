package SelfStudy.AppLevelUp;

public class ParsingValuesFromString {
    public static void main(String[] args) {
        String ageString = "30";
        int age = Integer.parseInt(ageString);
        System.out.println("AgeString is " + ageString);
        System.out.println("Age is " + age);
        ageString += 1;
        System.out.println("New ageString = " + ageString);
        age += 1;
        System.out.println("New age = " + age);

    }

}
