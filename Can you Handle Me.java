// ==========================================Application


// ==========================================Intern Hiring

// candiate
public class Candidate {
    private String name;
    private String gender;
    private int percentage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }
}


// main

import java.util.Scanner;

public class Main {
    public static Candidate getCandidateDetails() throws InvalidInternException {
        Scanner scanner = new Scanner(System.in);
		// we are creating a hiring tool where the HR can regsiter candidates based on eligibilty to the databse
		//databse connection is not done in this program to avoid complexity at this point of time
		//this could be completed using simple if else too but when systems become complex and big using the standard approach becomes the best solution
        System.out.println("Enter the candidate Details");

        System.out.println("Name");
        String name = scanner.next();

        System.out.println("Gender");
        String gender = scanner.next();

        System.out.println("Enter Percentage in 10th");
        int percentage = scanner.nextInt();
		//extra eligibilty criteria can also be added based on the understanding
		//12th marks 
		//does skills contains Java .........
        if (percentage < 50) {
            throw new InvalidInternException("Registration Failed. Percentage cannot be less then 50 %.");
        } else {
            Candidate candidate = new Candidate();
            candidate.setName(name);
            candidate.setGender(gender);
            candidate.setPercentage(percentage);

            return candidate;
        }
    }

    public static void main(String[] args) {
		System.out.println("Welcome to InterHiring Tool");

        try {
            Candidate candidate = getCandidateDetails();
            System.out.println("Registration Successful");
			//consider this was an working application over here if reg is successful we can save the data to the database.
        } catch (InvalidInternException e) {
            System.out.println(e.getMessage());
        }
    }
}

// ==========================================Multicatch
class Main 
{
	public static void main(String[] args) 
	{
      try{
		int x = sc.nextInt()
		int y = Integer.parseInt(args[1]);

		int z = x / y;
		System.out.println("Result = " + z);
	  }
      catch(ArithmeticException ex){
		  System.out.println("Exception: cannot divide a number by zero!");
	  }
	  catch(ArrayIndexOutOfBoundsException ex){
		  System.out.println("Exception: please provide minimum 2 cmd args");
	  }
	  catch(NumberFormatException ex){
		  System.out.println("Exception: please provide number without decimal point as args");
	  }
	  System.out.println("--- DONE ---");
	}
}
