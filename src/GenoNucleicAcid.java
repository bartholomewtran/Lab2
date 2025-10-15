import java.util.Scanner;

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
        //use methods in Scanner to read values - genome name, number of genes in genome,
        // number of chromosomes, number of cells in your body
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
