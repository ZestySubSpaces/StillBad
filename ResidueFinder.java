/*
 *Finds the number of times an amino acid of choice is found
 *within a protein sequence of choice
 */
public class ResidueFinder {
  public static void main(String[] args) {
    char r = args[0].charAt(0); //the one-letter code for the amino acid of interest
    String sequence = (args[1]); //the FASTA sequence of the protein with all newlines removed
    int counter=0;
    if (r=='R'||r=='H'||r=='K'||r=='D'||r=='E'||r=='S'||r=='T'||r=='N'||r=='Q'||r=='C'||r=='G'||r=='P'||r=='A'||r=='V'||r=='I'||r=='L'||r=='M'||r=='F'||r=='Y'||r=='W'){
      for(int i=0;i<sequence.length();i++){
        if (r==sequence.charAt(i)){
          counter++;
        }
      }
    } else {
      throw new IllegalArgumentException("Invalid residue search. Boohoo.");
    }
       System.out.println("your sequence has " + counter + " " + r);
  }
}
