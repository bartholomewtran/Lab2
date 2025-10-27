import java.util.Scanner;

/*
Assignment 2
 Geno-Nucleic Acid and Human Genome (PART 2)

1. DESIGN

The objective of this project is to create a database to hold people's identifying information.
It is designed for us to practice with classes.
For this part of the exercise, we will expand the database size to 5 individuals, codenamed alpha,
bravo, charlie, along with delta and echo.

Each person will have their data inputted through the scanner.
There are two classes: GenoNucleicAcid and NucleicAcid. Like from part 1, GenoNucleicAcid will be
what calls the methods in NucleicAcid to input, store, and display data.

GenoNucleicAcid has 2 methods: main and readValue. Main provides the commands on how the program is to run.
readValue is in charge of recording data that will be collected in NucleicAcid class and then displayed
through a method in NucleicAcid.


2. VARIABLES pt1

The main variables here are the identifiable information:

    string nucleic_name
    string chemical_formula
    float molar_mass
    float density

These are designed and then implemented in NucleicAcid class.

*/
public class GenoNucleicAcid {

    static Scanner s1 = new Scanner(System.in);
    public static void main(String [] args)
    {
        GenoNucleicAcid d1 = new GenoNucleicAcid();
        // test cmd
        NucleicAcid alpha = d1.readValue();
        alpha.print();
        NucleicAcid bravo = d1.readValue();
        bravo.print();
        NucleicAcid charlie = d1.readValue();
        charlie.print();
        NucleicAcid delta = d1.readValue();
        delta.print();
        NucleicAcid echo = d1.readValue();
        echo.print();
    }

    public NucleicAcid readValue() {
        //use methods in Scanner to read values - nucleic name, chemical formula,
        // molar mass, density
        Scanner input = new Scanner(System.in);
        System.out.println("Nucleic name:");
        String nucleic_name = input.nextLine();
        System.out.println("Chemical formula:");
        String chemical_formula = input.nextLine();
        System.out.println("Molar Mass:");
        float molar_mass = input.nextFloat();
        System.out.println("Density:");
        float density = input.nextFloat();
        return new NucleicAcid(nucleic_name, chemical_formula, molar_mass, density);
    }
}

/* OUTPUT

Nucleic name:
Nuc Alfa
Chemical formula: 
abc123
Molar mass:
30
Density:
2
---------------------------------------------
This is the data of the person you entered:

Nucleic name: Nuc Alfa
Chemical formula: abc123
Molar Mass: 30
Density: 2
----------------------------------------------

Nucleic name:
Nuc Beta
Chemical formula: 
abc234
Molar mass:
4
Density:
1
---------------------------------------------
This is the data of the person you entered:

Nucleic name: Nuc Beta
Chemical formula: abc234
Molar Mass: 4
Density: 1
----------------------------------------------

Nucleic name:
Nuc Charlie
Chemical formula: 
ccc213
Molar mass:
65
Density:
3
---------------------------------------------
This is the data of the person you entered:

Nucleic name: Nuc Charlie
Chemical formula: ccc213
Molar Mass: 65
Density: 3
----------------------------------------------

 */
