public class Studentmarks
{
	private String Studentname;
	private String Studentnumber;
	private String Assessment;
	private int Mark;
	private char Grade;
	
	public Studentmarks()
	{
		this("","00000000","",0,' ');
	}
	
	public Studentmarks(String Studentname, String Studentnumber, String Assessment, int Mark, char Grade)
	{
		setStudentname(Studentname);
		setStudentnumber(Studentnumber);
		setAssessment(Assessment);
		setMark(Mark);
		setGrade(Grade);
	}
	
	public void setStudentname(String Studentname)
	{
		this.Studentname = Studentname;
	}
	
	public void setStudentnumber(String Studentnumber)
	{
		this.Studentnumber = Studentnumber;
	}
	
	public void setAssessment(String Assessment)
	{
		this.Assessment = Assessment;
	}
	
	public void setMark(int Mark)
	{
		this.Mark = Mark;
	}
	
	public void setGrade(char Grade)
	{
		this.Grade = Grade;
	}
	
	public String getStudentname()
	{
		return Studentname;
	}
	
	public String getStudentnumber()
	{
		return Studentnumber;
	}
	
	public String getAssessment()
	{
		return Assessment;
	}
	
	public int getMark()
	{
		return Mark;
	}
	
	public char getGrade()
	{
		return Grade;
	}
	
}