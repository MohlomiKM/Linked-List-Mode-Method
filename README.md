# Linked-List-Mode-Method
A Method that receives a list as a parameter, Returning the element(s) that appears the most in the list.

## Brief Description of the problem solving approach
Step 1: Diagram
1.1	Method Call in Test Program:
MyLinkedList<Integer> Marks = new MyLinkedList<Integer>();
ModalMark = Marks.Mode(Marks);
1.2	Diagram: Assume the Modal Mark of the assessment is 78 and is to be tested with the Mode() method.
1.3	Overall plan: We will focus on the general case in which the marks list has more than one value and only one mode instead of having more than one or no mode at all.

Traverse the list to create a temporary node for each value and within the traverse method, traverse the list by comparing the temporary value with the entire list and count how many time the value occurs for every equal comparison (through the use of a “deciding” counter).

However, we make use of two counters to keep track of the value that has the most 
occurrence namely: the decidingcounter and counter.
Int decidingcounter = 0; int counter = 0;
So the list will have a value with the have the highest counter (counter) and will be stored as the mode until a value with a counter (“deciding” counter) higher than the set highest counter exists and therefore the current highest counter will be (counter) will be replaced with the new highest counter and the value with that property will be set as the new mode. 
If (deciding counter > counter)
counter = decidingcounter;
most = temp;

Step 2: Programming Steps
2.1 Data Structures in terms of calling/parameter and return:
Marks is the calling list and the parameter list; ModeList is the return list in the data class ( all lists are of type MyLinkedList)

2.2 Call to Method and heading of method:
ModalMark = Marks.Mode(Marks);
public MyLinkedList Mode(MyLinkedList Marks);

2.3 Programming Steps:
Traverse the list with a pointer “ptr” to the next value while end of list is not reached.
Set temporary node to current pointer to allow for value to be checked, temp = ptr;
Traverse through the whole list to check how many times the temporary stored value occurs
While (ptr!=null)
if(((Comparable)temp.element).compareTo(ptr.element)==0)
		decidingcounter++;
ptr = ptr.next;
Once list has been traversed, check if the current value’s counter (indicating the occurrence of the value) is higher than the current highest counter, if true set counter to the newest highest counter and set the temporary node (with that highest counter) as the mode.

If (decidingcounter > counter)
	counter = decidingcounter;
	most = temp;
increment to the next value with “ptr” and begin the process again with the next numbers so long as the pointer hasn’t reached its end. ptr = ptr.next;
When fully traversed through the list with every number checked, Add Mode to the ModeList: ModeList.append(most.element);
Return Modelist;

Step 3: Special Cases
3.1	List of everything that could go wrong:
1.	Calling/Parameter list can be empty
2.	There might be no mode in the parameter list
3.	There might be more than one mode

3.2 Propose solutions: 
1.	return a null to indicate that the list is empty

2.	As a list with no mode has conditions of counter & decidingcounter being both equal to 1
Modify the last line: ModeList.append(most.element); with an if statement testing for no mode with the two conditions above and adding the mode to ModeList as an alternative (else) to the condition.

3.	Use the ModeList to store values for a list with more than one mode and modify the else section of the “no mode” if statement with a code that adds all values that have a counter equivalent to the highestcounter to the ModeList ( which makes use of additional component namely the isMember() method and the “continue” technique to ensure that lists with one mode and/or more than one mode do not duplicate their mode values for ):

Step 4: Java Code (Available on the student marks "source code" file) 
