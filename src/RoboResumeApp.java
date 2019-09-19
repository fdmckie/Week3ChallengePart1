import java.util.Scanner;

public class RoboResumeApp {
    public static void main(String[] args) {


        String name = " ";
        String email = " ";

        String degreeEducation = " ";
        String degreeMajor = " ";
        String degreeUniversity = " ";
        int degreeYear = 0;

        String workCompany = " ";
        String jobTitle = " ";
        String jobDescription =  " ";
        String startDate = " ";
        String endDate = " ";

        String nameSkill = " ";
        String ratingSkill = " ";



        Name name1 = new Name();

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        name = input.nextLine();
        name1.setName(name);

        System.out.println();

        System.out.println("Please enter your e-mail address: ");
        email = input.nextLine();
        name1.setEmail(email);

        //make loop for Education (at least 1 Education)
        //begin Education loop

        System.out.println();
        System.out.println("Education...");
        System.out.println("Please enter college degree: 'Associate', 'Bachelor', Master's, 'PhD'");
        degreeEducation = input.nextLine();

        System.out.println();
        System.out.println("Please enter degree major: ");
        degreeMajor = input.nextLine();

        System.out.println();
        System.out.println("Please enter name of University or College: ");
        degreeUniversity = input.nextLine();

        System.out.println();
        System.out.println("Please enter year of Graduation: i.e. '2002'");
        degreeYear = input.nextInt();

        //end Education loop


        //make loop for Work Experience (at least 1 work experience)
        //begin Work Experience loop

        System.out.println();
        System.out.println("Work Experience...");
        System.out.println("Please enter name of company: ");
        workCompany = input.nextLine();

        System.out.println();
        System.out.println("Please enter Job Title: ");
        jobTitle = input.nextLine();

        System.out.println();
        System.out.println("Please enter Start Date: i.e. 11/30/2018");
        startDate = input.nextLine();

        System.out.println();
        System.out.println("Please enter Start Date: i.e. 11/30/2018 or 'Current' ");
        endDate = input.nextLine();

        //make loop for job description (at least 1 job description)
        //being job description loop

        System.out.println();
        System.out.println("Please enter Job Description: ");
        jobDescription = input.nextLine();

        //end job description loop

        //end Work Experience loop


        //being skills loop (at least 3 skills)

        System.out.println();
        System.out.println("Skills...");
        System.out.println("Please enter skill: ");
        nameSkill = input.nextLine();

        System.out.println();
        System.out.println("Please enter Rating/Proficiency: 'Fundamental', 'Novice', 'Intermediate', 'Advanced', 'Expert'");
        ratingSkill = input.nextLine();






        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Name: " + name1.getName());
        System.out.println("E-mail: " + name1.getEmail());


    }

}
