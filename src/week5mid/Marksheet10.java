package week5mid;

public class Marksheet10 {
    public static void main(String[] args) {
      int a = 70, b = 87, c = 76, d = 68, e = 78, f = 93 ;
      int total_Marks = a+b+c+d+e+f;
      System.out.println("");
      System.out.println(" Gujarat Secondary & Higher Secondary Education Board,Gandhinagar");
      System.out.println(" ================================================================");
      System.out.println(" Statement Showing the Marks in each Subject obtained at the S.S.C. Examination-2012");
      System.out.println("");
      System.out.println(" SEAT NO.        CANDIDATE'S NAME");
      System.out.println(" -------         -----------------");
      System.out.println(" C 123456     PATEL SHIVAM TARUNKUMAR");
      System.out.println("");
      System.out.println(" Name of the Subject    Total Marks    Obtained Marks    ");
      System.out.println(" -------------------    -----------    --------------   ");
      System.out.println(" GUJARATI                  100              "+(a) );
      System.out.println(" ENGLISH                   100              "+(b) );
      System.out.println(" SANSKRIT                  100              "+(c) );
      System.out.println(" SOCIAL SCIENCE            100              "+(d) );
      System.out.println(" SCIENCE & TECHNOLOGY      100              "+(e) );
      System.out.println(" MATHEMATICS               100              "+(f) );
      System.out.println(" TOTAL                     600              "+(total_Marks));
      System.out.println("");
      System.out.println(" Month & Year of Exam    Total Subject    Result    Percentage");
      System.out.println(" --------------------    -------------    ------    ----------");
      System.out.println("    March - 2012               7           PASS        "+(total_Marks*100/600));
    }
}
