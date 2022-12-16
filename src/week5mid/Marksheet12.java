package week5mid;

public class Marksheet12 {
    public static void main(String[] args) {
        int a = 85, b = 90, c = 70, d = 43, e = 82, f = 45, g = 92, h = 47;
        int total_Marks = a+b+c+d+e+f+g+h;
        System.out.println("");
        System.out.println(" Gujarat Secondary & Higher Secondary Education Board,Gandhinagar");
        System.out.println(" ================================================================");
        System.out.println(" Statement Of Marks - Higher Secondary Certificate Examination- March 2014");
        System.out.println("");
        System.out.println(" SEAT NO.        CANDIDATE'S NAME");
        System.out.println(" -------         -----------------");
        System.out.println(" C 123456     PATEL SHIVAM TARUNKUMAR");
        System.out.println("");
        System.out.println(" Name of the Subject    Total Marks    Obtained Marks    ");
        System.out.println(" -------------------    -----------    --------------   ");
        System.out.println(" ENGLISH                   100              "+(a) );
        System.out.println(" MATHEMATICS               100              "+(b) );
        System.out.println(" CHEMISTRY                 100              "+(c) );
        System.out.println(" CHEMISTRY PRACT            50              "+(d) );
        System.out.println(" PHYSICS                   100              "+(e) );
        System.out.println(" PHYSICS PRACT              50              "+(f) );
        System.out.println(" COMPUTER                  100              "+(g) );
        System.out.println(" COMPUTER PRACT             50              "+(h) );
        System.out.println(" TOTAL                     650              "+(total_Marks));
        System.out.println("");
        System.out.println(" Month & Year of Exam    Total Subject    Result    Percentage");
        System.out.println(" --------------------    -------------    ------    ----------");
        System.out.println("    March - 2014               7           PASS        "+(total_Marks*100/600));
    }
}