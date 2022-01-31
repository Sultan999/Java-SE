package subjecttest;

class Subject
{
	private String subID;
	private String name;
	private int maxMarks;
	private int marksObtains;
	
	public Subject(String subID,String name,int maxMarks){
		this.subID = subID;
		this.name = name;
		this.maxMarks = maxMarks;
	}

	public String getSubID(){return subID;}
	public String getName(){return name;}
	public int getMaxMarks(){return maxMarks;}
	public int getMarksObtains(){return marksObtains;}

	public void setMaxMarks(int mm){
		maxMarks = mm;
	}
	
	public void setMarksObtain(int m){
		marksObtains = m;
	}
	
	boolean isQualified(){
		return marksObtains >= maxMarks / 10 * 4;
	}
	
	public String toString(){
		return "SubjectID: " + subID + "\n Name: " + name + "\n Maximum Mark: " + maxMarks;
	}

}

public class SubjectTest {

	public static void main(String[] args) {
		
		
		
		Subject subs[] = new Subject[3];
		subs[0] = new Subject("A100", "SC", 100);
		subs[1] = new Subject("B100", "Java", 100);
		subs[2] = new Subject("C100", "C++", 100);
		for(int i = 0; i < subs.length; i++) {
			System.out.println(subs[i]);
		}
		
		
		

	}

}
