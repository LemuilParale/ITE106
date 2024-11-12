import java.io.*;
import java.lang.*;
import java.util.*;

class one{
	public void print_geek(){
		System.out.println("Geek");
	}
}
class two extends one{
	public void print_for(){
		System.out.println("For");
	}
}
public class Single{
	public static void main(String[]args){
		two g = new two();
		g.print_geek();
		g.print_for();
		g.print_geek();
	}
}