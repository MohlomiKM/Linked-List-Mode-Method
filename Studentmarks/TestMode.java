public class TestMode
{
	public static void main(String[] args)
	{
		MyLinkedList<Integer> Marks = new MyLinkedList<Integer>();
		MyLinkedList<Integer> ModalMark = new MyLinkedList<Integer>();
		
		System.out.println("Test1: Empty list");
		System.out.println("Marks: " + Marks);
		ModalMark = Marks.Mode(Marks);
		System.out.println("Mode: " + ModalMark);
		
		System.out.println("\n");
		
		Studentmarks S1 = new Studentmarks("KM Mohlomi","31547796","Test1",56,'B');
		Studentmarks S2 = new Studentmarks("K Mabaso","31547596","Test1",78,'D');
		Studentmarks S3 = new Studentmarks("M Mokoena","31747796","Test1",87,'A');
		Studentmarks S4 = new Studentmarks("KM Mpisi","31547786","Test1",50,'D');
		
		
		System.out.println("Test2: No mode");
		Marks.append(new Integer(S1.getMark()));
		Marks.append(new Integer(S2.getMark()));
		Marks.append(new Integer(S3.getMark()));
		Marks.append(new Integer(S4.getMark()));
		System.out.println("Marks: " + Marks);
		ModalMark = Marks.Mode(Marks);
		System.out.println("Mode: " + ModalMark);
		
		System.out.println("\n");
		
		Studentmarks S5 = new Studentmarks("M Jackson","32167796","Test1",78,'B');
		Studentmarks S6 = new Studentmarks("K West","31547746","Test1",78,'B');
		
		System.out.println("Test3: General case (1 mode)");
		Marks.clear();
		Marks.append(new Integer(S1.getMark()));
		Marks.append(new Integer(S2.getMark()));
		Marks.append(new Integer(S3.getMark()));
		Marks.append(new Integer(S4.getMark()));
		Marks.append(new Integer(S5.getMark()));
		Marks.append(new Integer(S6.getMark()));
		System.out.println("Marks: " + Marks);
		ModalMark = Marks.Mode(Marks);
		System.out.println("Mode: " + ModalMark);
		
		System.out.println("\n");
		
		Studentmarks S7 = new Studentmarks("P Bush","31541396","Test1",96,'A');
		Studentmarks S8 = new Studentmarks("O Clinton","31747719","Test1",96,'A');
		Studentmarks S9 = new Studentmarks("N Bama","31543386","Test1",96,'A');
		
		System.out.println("Test4: More than one mode");
		Marks.clear();
		Marks.append(new Integer(S1.getMark()));
		Marks.append(new Integer(S2.getMark()));
		Marks.append(new Integer(S3.getMark()));
		Marks.append(new Integer(S4.getMark()));
		Marks.append(new Integer(S5.getMark()));
		Marks.append(new Integer(S6.getMark()));
		Marks.append(new Integer(S7.getMark()));
		Marks.append(new Integer(S8.getMark()));
		Marks.append(new Integer(S9.getMark()));
		System.out.println("Marks: " + Marks);
		ModalMark = Marks.Mode(Marks);
		System.out.println("Mode: " + ModalMark);
	}
}
		
		