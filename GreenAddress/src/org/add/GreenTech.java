package org.add;

public class GreenTech {
public void greensomr() {
	System.out.println("Hai");
}
public void greensomr(int i) {
	System.out.println("World Id:"+i);
}
public void greensomr(int k,int j) {
	System.out.println("World No:"+k);
	System.out.println("Id:"+j);
}
public void greensomr(String l) {
	System.out.println("World Name:"+l);
	}
public static void main(String[] args) {
	GreenTech a = new GreenTech();
	a.greensomr();
	a.greensomr(8888);
	a.greensomr(887788,5554477);
	a.greensomr("I am Ravi");
}
}
