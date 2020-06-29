package tao_random;

import javax.swing.*;
//import javafx.scene.control.Alert;
//import javafx.scene.control.Alert.AlertType;
//import javafx.application.Platform;
import java.util.*;
public class tao_random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[]= {"Abby Truong","Ahmed Mujtaba","Azeez Temitope Olanrewaju","Deep","Diming Chu","Dongshuo Li","Honorinicy","Jason","Junyu Liu","Kelly Liu","Kinjan","Kun Li","Muhammed Umar","Oaz","PQ","Prithviatani","Richard","Sahil Slngh Sandhu","Samuel Yang","Scott(Shi-Kai) Jhou","Shahbaz Mansahia","Shahriar Kabir","Shakur","Shrina Patel","Siyu Qiu","Siyu Lei","Sumid","Tao","Trivediakshay","Yan Huang","Zhaosaitong"};
		//ArrayList strs= new ArrayList();
		//strs.add(str);
		int rnd= new Random().nextInt(str.length);
		//System.out.println(str[rnd]);
		//for(int i= 1)
		//System.out.println(strs.get(1));
		//JOptionPane.showMessageDialog(str[rnd]);
		
		String titleBar = "random name";
		JOptionPane.showMessageDialog(null, str[rnd], "message: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
	    


	}

}

