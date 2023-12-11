import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    // Instance variables (if needed)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        initializeDogList();
        initializeMonkeyList();

        // Add a loop that displays the menu, accepts the users input
        // and takes the appropriate action.
	// For the project submission you must also include input validation
        // and appropriate feedback to the user.
        // Hint: create a Scanner and pass it to the necessary
        // methods 
	// Hint: Menu options 4, 5, and 6 should all connect to the printAnimals() method.
        
        while(true) {
        	displayMenu();
        	input=scanner.nextLine();
        	switch(input) {
        		case "1":
        			intakeNewDog(scanner);
        			break;
        		case"2":
        			intakeNewMonkey(scanner);
        			break;
        		case "3":
        			reserveAnimal(scanner);
        			break;
        		case "4":
        			printAnimals("dog");
        			break;
        		case "5":
        			printAnimals("monkey");
        			break;
        		case "6":
        			printAnimals("available");
        			break;
        		case "q":
        			System.out.println("Quitting application.");
        			return;
        		default:
        			System.out.println("Invalid selection. Please try again.");
        		
        	}
        }
        
    }

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "in service", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "in service", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {
    	Monkey monkey1 = new Monkey("Sammy", "female", "3", "11.2", "12-12-1999", "Africa", "in service", true, "USA", "5", "34", "32", "Tall");
    	monkeyList.add(monkey1);
    }


    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }
        
        System.out.println("Enter the breed of the dog: ");
        String breed = scanner.nextLine();
        
        System.out.println("Enter the gender of the dog: ");
        String gender = scanner.nextLine();
        
        System.out.println("Enter the age of the dog: ");
        String age = scanner.nextLine();
        
        System.out.println("Enter the weight of the dog: ");
        String weight = scanner.nextLine();
        
        System.out.println("Enter the acquisition date of the dog: ");
        String acquisitionDate = scanner.nextLine();
        
        System.out.println("Enter the acquisition country of the dog: ");
        String acquisitionCountry = scanner.nextLine();
        
        System.out.println("Enter the training status of the dog: ");
        String trainingStatus = scanner.nextLine();
        
        System.out.println("Is the dog reserved? (yes/no): ");
        boolean reserved = scanner.nextLine().trim().equalsIgnoreCase("yes");
       
        System.out.println("Enter the in-service country of the dog: ");
        String inServiceCountry = scanner.nextLine();
        
        // Add the code to instantiate a new dog and add it to the appropriate list
        Dog newDog = new Dog(name, breed, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, 
        		reserved, inServiceCountry);	
        dogList.add(newDog);
        System.out.println("New dog added successfully.");
    }


        // Complete intakeNewMonkey
	//Instantiate and add the new monkey to the appropriate list
        // For the project submission you must also  validate the input
	// to make sure the monkey doesn't already exist and the species type is allowed
        public static void intakeNewMonkey(Scanner scanner) {
        	// Allowed Monkey species List
            List<String> allowedSpecies = Arrays.asList("Capuchin", "Guenon", "Macaque", "Marmoset", "Squirrel monkey", "Tamarin");
            
            System.out.println("What is the monkey's name? ");
            String name = scanner.nextLine();
            
            for (Monkey monkey: monkeyList) {
            	if (monkey.getName().equalsIgnoreCase(name)) {
            		System.out.println("\n\nThis monkey is already in our system\n\n");
            		return; // returns to menu
            	}
            }
            
            // Validate the species type
            System.out.println("Enter the monkey's species: ");
            String species = scanner.nextLine();
            if (!allowedSpecies.contains(species)) {
            	System.out.println("This species is not allowed. Allowed species are: " + allowedSpecies);
            	return;
            }
            
            System.out.println("Enter the monkey's gender: ");
            String gender = scanner.nextLine();
            
            System.out.println("Enter the monkey's age: ");
            String age = scanner.nextLine();
            
            System.out.println("Enter the monkey's weight: ");
            String weight = scanner.nextLine();
            
            System.out.println("Enter the monkey's acquisition date: ");
            String acquisitionDate = scanner.nextLine();
            
            System.out.println("Enter the monkey's acquisition country: ");
            String acquisitionCountry = scanner.nextLine();
            
            System.out.println("Enter the monkey's training status: ");
            String trainingStatus = scanner.nextLine();
            
            System.out.println("Is the monkey reserved? (yes/no): ");
            boolean reserved = scanner.nextLine().trim().equalsIgnoreCase("yes");
            
            System.out.println("Enter the monkey's in-service country: ");
            String inServiceCountry = scanner.nextLine();
            
            System.out.println("Enter the monkey's tail length: ");
            String tailLength = scanner.nextLine();
            
            System.out.println("Enter the monkey's height: ");
            String height = scanner.nextLine();
            
            System.out.println("Enter the monkey's body length: ");
            String bodyLength = scanner.nextLine();
            
            // Adding code to instantiate a new monkey and add to the appropriate list
            Monkey newMonkey = new Monkey(name, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus,
            		reserved, inServiceCountry, tailLength, height, bodyLength, species);
            monkeyList.add(newMonkey);
            System.out.println("New monkey added successfully.");
        }

        // Complete reserveAnimal
        // You will need to find the animal by animal type and in service country
        public static void reserveAnimal(Scanner scanner) {
        	System.out.println("Enter the type of animal to reserve (dog/monkey): ");
            String animalType = scanner.nextLine().trim().toLowerCase();
            
            System.out.println("Enter the in-service country of the animal: ");
            String inServiceCountry = scanner.nextLine().trim();
            
            boolean animalFound = false;
            
            if (animalType.equals("dog")) {
            	for (Dog dog : dogList) {
            		if (dog.getInServiceLocation().equalsIgnoreCase(inServiceCountry) && !dog.getReserved()){
            			dog.setReserved(true);
            			animalFound = true;
            			System.out.println("A dog in " + inServiceCountry + " has been reserved.");
            			break;
            		}
            	}
            } else if (animalType.equals("monkey")) {
            	for (Monkey monkey : monkeyList) {
            		if (monkey.getInServiceLocation().equalsIgnoreCase(inServiceCountry) && !monkey.getReserved()){
            			monkey.setReserved(true);
            			animalFound = true;
            			System.out.println("A monkey in " + inServiceCountry + " has been reserved.");
            			break;
            		}
            	}
            } else {
            	System.out.println("You've either entered invalid animal type or the animal is not available. Try again. Please select an option.");
            	return;
            }
        }

        // Complete printAnimals
        // Include the animal name, status, acquisition country and if the animal is reserved.
	// Remember that this method connects to three different menu items.
        // The printAnimals() method has three different outputs
        // based on the listType parameter
        // dog - prints the list of dogs
        // monkey - prints the list of monkeys
        // available - prints a combined list of all animals that are
        // fully trained ("in service") but not reserved 
	// Remember that you only have to fully implement ONE of these lists. 
	// The other lists can have a print statement saying "This option needs to be implemented".
	// To score "exemplary" you must correctly implement the "available" list.
        public static void printAnimals(String animalType) {
            if (animalType.equals("dog")) {
            	System.out.println("List of All Dogs: ");
            	for (Dog dog : dogList) {
            		printAnimalDetails(dog);
            	}
            } else if (animalType.equals("monkey")){
            	System.out.println("List of All Monkeys: ");
            	for (Monkey monkey : monkeyList) {
            		printAnimalDetails(monkey);
            	}
            } else if (animalType.equals("available")) {
            	System.out.println("List of All Available Animals: ");
                for (Dog dog : dogList) {
            		if (dog.getTrainingStatus().equalsIgnoreCase("in service") && !dog.getReserved()){
            			printAnimalDetails(dog);
            		}
            	}
            	for (Monkey monkey : monkeyList) {
            		if (monkey.getTrainingStatus().equalsIgnoreCase("in service") && !monkey.getReserved()){
            			printAnimalDetails(monkey);
            		}
            	}
            }

        }
        
        public static void printAnimalDetails(RescueAnimal animal) {
        	System.out.println("Name: " + animal.getName() + ", Status: " + 
        	animal.getTrainingStatus() + ", AcquisionCountry: " + animal.getAcquisitionLocation() + 
        	", Reserved: " + (animal.getReserved()? "Yes": "No"));
        }
}

