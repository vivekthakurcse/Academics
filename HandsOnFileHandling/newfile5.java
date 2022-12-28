import java.util.* ;
import java.io.File;  //importing file library
import java.io.FileNotFoundException ; // Incase file is not created
import java.io.FileWriter;   //importing file writer to write file
import java.io.IOException;   //importing this libary to handle unkown errors

class StudentAttendence {
	String name;
	String branch;
	int sem;
	int reg_no;
	int days_present;

//	public void createRecord() {
//		try {
//			File database = new File("database.txt");
//			FileWriter dat = new FileWriter("database.txt", true);  // use the "true" flag to append to the file
//			Scanner in = new Scanner(System.in);

//			System.out.print("    Student's Name   : ");
//			name = in.nextLine();
//			System.out.print("    Student's Branch : ");
//			branch = in.nextLine();
//			System.out.print("    Semester  : ");
//			sem = in.nextInt();
//			in.nextLine();  // consume the remaining newline character
//			System.out.print("    Registration No. :  ");
//			reg_no = in.nextInt();
//			in.nextLine();  // consume the remaining newline character
//			System.out.print("    No. of days present : ");
//			days_present = in.nextInt();

//			dat.append("     Student Name : " + name + "\n");
//			dat.append("     Branch    : " + branch + "\n");
//			dat.append("     Semester  : " + sem + "\n");
//			dat.append("     Registration No. : " + reg_no + "\n");
//			dat.append("     Total Attendence : " + days_present + "\n");
//			dat.close();
//			in.close();
//		} catch (IOException e) {
//			System.out.print(" Unknown error occurred");
//			e.printStackTrace();
//		}
//	}
	public void createRecord() {
    try {
        File database = new File("database.txt");
        FileWriter dat = new FileWriter("database.txt", true);  // use the "true" flag to append to the file
        Scanner in = new Scanner(System.in);

        System.out.print("    Student's Name   : ");
        name = in.nextLine();
        System.out.print("    Student's Branch : ");
        branch = in.nextLine();
        System.out.print("    Semester  : ");
        sem = in.nextInt();
        in.nextLine();  // consume the remaining newline character
        System.out.print("    Registration No. :  ");
        reg_no = in.nextInt();
        in.nextLine();  // consume the remaining newline character
        System.out.print("    No. of days present : ");
        days_present = in.nextInt();
        in.nextLine();  // consume the remaining newline character

        dat.append("     Student Name : " + name + "\n");
        dat.append("     Branch    : " + branch + "\n");
        dat.append("     Semester  : " + sem + "\n");
        dat.append("     Registration No. : " + reg_no + "\n");
        dat.append("     Total Attendence : " + days_present + "\n");
        dat.close();
        in.close();

    } catch (IOException e) {
        System.out.print(" Unknown error occurred");
        e.printStackTrace();
    }
}


//	public void showRecord() {
//		try {
//			File database = new File("database.txt");
//			Scanner readRecords = new Scanner(database);
//			while (readRecords.hasNextLine()) {  // continue reading until the end of the file is reached
//				String n = readRecords.nextLine();
//				String br = readRecords.nextLine();
//				int rll = readRecords.nextInt();  // read semester as an integer
//				readRecords.nextLine();  // consume the remaining newline character
//				int rgnum = readRecords.nextInt();  // read registration number as an integer
//				readRecords.nextLine();  // consume the remaining newline character
//				int attnd = readRecords.nextInt();  // read days present as an integer
//				readRecords.nextLine();  // consume the remaining newline character

//				System.out.print(" -------- Student Record --------\n");
//				System.out.print(n + "\n");
//				System.out.print(br + "\n");
//				System.out.print(rll + "\n");
//				System.out.print(rgnum + "\n");
//				System.out.print(attnd + "\n");
//			}
//			readRecords.close();
//		} catch (IOException s) {
//			System.out.print(" Unknown error occurred");
//			s.printStackTrace();
//		}
//	}
public void showRecord() {
    try {
        File database = new File("database.txt");
        Scanner readRecords = new Scanner(database);
        while (readRecords.hasNextLine()) {  // continue reading until the end of the file is reached
            String line = readRecords.nextLine();
            String[] fields = line.split(" : ");  // split the line into fields using the " : " delimiter
            if (fields[0].equals("     Student Name")) {
                String name = fields[1];
                String br = readRecords.nextLine();
                fields = br.split(" : ");
                String branch = fields[1];
                String rll = readRecords.nextLine();
                fields = rll.split(" : ");
                int sem = Integer.parseInt(fields[1]);
                String rgnum = readRecords.nextLine();
                fields = rgnum.split(" : ");
                int reg_no = Integer.parseInt(fields[1]);
                String attnd = readRecords.nextLine();
                fields = attnd.split(" : ");
                int days_present = Integer.parseInt(fields[1]);

                System.out.print(" -------- Student Record --------\n");
                System.out.print("     Student Name : " + name + "\n");
                System.out.print("     Branch    : " + branch + "\n");
                System.out.print("     Semester  : " + sem + "\n");
                System.out.print("     Registration No. : " + reg_no + "\n");
                System.out.print("     Total Attendence : " + days_present + "\n");
            }
        }
        readRecords.close();
    } catch (IOException s) {
        System.out.print(" Unknown error occurred");
        s.printStackTrace();
    }
}

}

public class AttendenceManagementSys {
	public static void main(String[] args) {
		StudentAttendence sa = new StudentAttendence();
		sa.createRecord();
		sa.showRecord();  // call the showRecord method to display all records
	}
}
