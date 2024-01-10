import java.util.Scanner;
class Performance{
int[] marks=new int[10];
int[] count= new int[10];
int highest=0;
int lowest=100;
int modefreq=1;
int mode = 0;
int i;

void readMarks(){
for(i=0;i<10;i++){
	System.out.print("Enter mark of student "+i+" :");
	Scanner scan = new Scanner(System.in);
	marks[i]=scan.nextInt();
}
}
void highest(){
for(i=0;i<10;i++){
	if(highest<marks[i]){
	highest=marks[i];
}
}
}
void lowest(){
for(i=0;i<10;i++){
	if(lowest>marks[i]){
	lowest=marks[i];
}
}
}

void mode(){
	int highfreq=0;
	int pos=-1;
	for(i=0;i<10;i++){
		for(int j=0;j<10;j++){
			if(marks[i]==marks[j]){
				count[i]++;
			}
		}
	}
	for(i=0;i<10;i++){
	if(highfreq<count[i]){
	highfreq=count[i];
	pos=i;
}
	modefreq=highfreq;
	mode = marks[pos];
}
}


void display(){
System.out.print("\n\nOUTPUT\n\nMARKS : ");
for(int i=0;i<marks.length;i++){
	System.out.print(marks[i]+" ");
}
System.out.println("\nHIGHEST MARK : " + highest);
System.out.println("LOWEST MARK : " + lowest);
System.out.println("MODE : " + mode);
System.out.println("MODE FREQUENCY : " + modefreq);
}
public static void main(String args[]){
Performance obj=new Performance();
obj.readMarks();
obj.highest();
obj.mode();
obj.lowest();
obj.display();
}
}
