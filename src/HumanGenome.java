import java.util.Scanner;


/*
Assignment 2
 Geno-Nucleic Acid and Human Genome (PART 1)

1. DESIGN

The objective of this project is to create a database to hold people's identifying information.
It is designed for us to practice with classes.
For this particular exercise, we will limit the database size to 3 individuals, codenamed alpha,
bravo, and charlie.

Each person will have their data inputted through the scanner.
There are two classes: HumanGenome and GenomeInput. HumanGenome will be what calls the methods in
GenomeInput to input, store, and display data.

HumanGenome has 2 methods: main and readValue. Main provides the commands on how the program is to run.
readValue is in charge of recording data that will be collected in GenomeInput class and then displayed
through a method in GenomeInput.


2. VARIABLES pt1

The main variables here are the identifiable information:

    String genome name,
    String genome_number,
    int chromosome_number,
    String cell_number

These are designed and then implemented in GenomeInput class.

*/

/*

3. PROCESSING pt1

This is the processing of the main method in the HumanGenome class. It's telling the program
to perform the same tasks as outlined in readValue and GenomeInput per person.

 */

public class HumanGenome {

    static Scanner s1 = new Scanner(System.in);
    public static void main(String [] args)
    {
        HumanGenome d1 = new HumanGenome();
        // test cmd
        GenomeInput alpha = d1.readValue();
        alpha.print();
        GenomeInput bravo = d1.readValue();
        bravo.print();
        GenomeInput charlie = d1.readValue();
        charlie.print();
    }

    public GenomeInput readValue() {
        //use methods in Scanner to read values - genome name, number of genes in genome,
        // number of chromosomes, number of cells in your body
        Scanner input = new Scanner(System.in);
        System.out.println("Genome name:");
        String genome_name = input.nextLine();
        System.out.println("Number of genes in genome:");
        String genome_number = input.nextLine();
        System.out.println("Number of chromosomes:");
        int chromosome_number = input.nextInt();
        input.nextLine();
        System.out.println("Cell count in body (in trillions):");
        String cell_number = input.nextLine();
        return new GenomeInput(genome_name, genome_number, chromosome_number, cell_number);
    }
}


/* OUTPUT

Genome name:
Human Bob
Number of genes in genome:
20000
Number of chromosomes:
46
Cell count in body (in trillions):
76
---------------------------------------------
This is the data of the person you entered:

Genome name: Human Bob
Genome number: 20000
Number of chromosomes: 46
Number of cells in the body (in trillions): 76
----------------------------------------------

Genome name:
Human Sally
Number of genes in genome:
20000
Number of chromosomes:
46
Cell count in body (in trillions):
120
---------------------------------------------
This is the data of the person you entered:

Genome name: Human Sally
Genome number: 20000
Number of chromosomes: 46
Number of cells in the body (in trillions): 120
----------------------------------------------

Genome name:
Human Sri
Number of genes in genome:
20000
Number of chromosomes:
46
Cell count in body (in trillions):
75
---------------------------------------------
This is the data of the person you entered:

Genome name: Human Sri
Genome number: 20000
Number of chromosomes: 46
Number of cells in the body (in trillions): 75
----------------------------------------------

 */