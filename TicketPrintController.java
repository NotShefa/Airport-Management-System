package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class TicketPrintController {
	@FXML
	private Stage stage;
	@FXML
	 private Scene scene;
	@FXML
	 private Parent root;
	@FXML
	private Button proceed;
	@FXML
	private Button print;
	@FXML
	private Button previous;
	@FXML
	private Label name;
	@FXML
	private Label namep;
	@FXML
	private Label classseat;
	@FXML
	private Label from;
	@FXML
	private Label fromp;
	@FXML
	private Label to;
	@FXML
	private Label top;
	@FXML
	private Label date;
	@FXML
	private Label datep;
	@FXML
	private Label gate;
	@FXML
	private Label gatep;
	@FXML
	private Label flight;
	@FXML
	private Label flightp;
	@FXML
	private Label time;
	@FXML
	private Label timep;
	@FXML
	private Label seats;
	@FXML
	private Label seatsp;
	
	private String nameR;
    private String nationalityR;
    private String emailR;
    private String phnnumberR;
    private String emerphnumR;
    private String dobR;
    private String pobR;
    private String genderR;
    private String pcnR;
    private int nosR;
    private String fromR;
    private String toR;
    private String depttimeR;
    private String deptdateR;
    private String flightR;
    private String seatclassR;
    private String fareR;
    private String terminalR;
    private String gateR;
	
	
    public TicketPrintController () {
		this.nameR="Not yet Assigned";
		this.nationalityR="Not yet Assigned";
		this.emailR="Not yet Assigned";
		this.phnnumberR="Not yet Assigned";
		this.emerphnumR="Not yet Assigned";
		//this.dob="Not yet Assigned";
		this.pobR="Not yet Assigned";
		this.genderR="Not yet Assigned";
		this.pcnR="Not yet Assigned";
		this.nosR=0;
		this.fromR="Not yet Assigned";
		this.toR="Not yet Assigned";
		this.depttimeR="Not yet Assigned";
		//this.deptdate="Not yet Assigned";
		this.flightR="Not yet Assigned"; 
		this.seatclassR="Not yet Assigned";
		this.fareR="null";
		this.terminalR="null";
		this.gateR="null";
	}
    
    public void print(ActionEvent event)throws Exception {
    	try {
	         BufferedReader reader=new BufferedReader(new FileReader("TempInfo.txt"));
	         String line;
	         int linenum=0;
	         while ((line=reader.readLine())!=null) {
	         	linenum++;
	         	if(linenum==1) {
	             
	             nameR=line;
	         	}
	         	if(linenum==2) {
	         		
	         		nationalityR=line;
	         	}
	         	if(linenum==3) {
	         		
	         		emailR=line;
	         	}
	         	if(linenum==4) {
	         		
	         		phnnumberR=line;
	         	}
	         	if(linenum==5) {
	         		
	         		emerphnumR=line;
	         	}
	         	if(linenum==6) {
	         		
	         		dobR=line;
	         	}
	         	if(linenum==7) {
	         		
	         		pobR=line;
	         	}
	         	if(linenum==8) {
	         		
	         		genderR=line;
	         	}
	         	if(linenum==9) {
	         		
	         		pcnR=line;
	         	}
	         	if(linenum==10) {
	         		
	         		nosR=Integer.parseInt(line);
	         	}
	         	if(linenum==11) {
	         		
	         		fromR=line;
	         	}
	         	if(linenum==12) {
	         		
	         		toR=line;
	         	}
	         	if(linenum==13) {
	         		
	         		deptdateR=line;
	         	}
	         	if(linenum==14) {
	         		
	         		depttimeR=line;
	         	}
	         	if(linenum==15) {
	         		
	         		flightR=line;
	         	}
	         	if(linenum==16) {
	         		
	         		seatclassR=line;
	         	}
	         	if(linenum==17) {
	         		fareR=line;
	         	}
	         	if(linenum==18) {
	         		terminalR=line;
	         	}
	         	if(linenum==19) {
	         		gateR=line;
	         	}
	         }
	         reader.close();
	     } catch (FileNotFoundException e) {
	         throw new RuntimeException(e);
	     } catch (IOException e) {
	         throw new RuntimeException(e);
	     }	 
		 
		 
		 try {
	            BufferedWriter writer=new BufferedWriter(new FileWriter("PassengerInfo.txt",true));
	            writer.write(nameR+phnnumberR+"\n"+nameR+"\n"+nationalityR+"\n"+emailR+"\n"+phnnumberR+"\n"+emerphnumR+"\n"+dobR+"\n"+pobR+"\n"+genderR+"\n"+pcnR+"\n"+nosR+"\n"+fromR+"\n"+toR+"\n"+deptdateR+"\n"+depttimeR+"\n"+flightR+"\n"+seatclassR+"\n"+fareR+"\n"+terminalR+"\n"+gateR);            
	            writer.write("\n-/-/-/-/-/-/-/-/-/-/-/-");
	            writer.close();
	        } catch (IOException e) {
	            throw new RuntimeException(e);
	        }
		 
    	
		 	name.setText(nameR);
		 	namep.setText(nameR);
			classseat.setText(seatclassR);
			from.setText(fromR);
			to.setAccessibleHelp(toR);
			date.setText(deptdateR);
			gate.setText(gateR);
			flight.setText(flightR);
			time.setText(depttimeR);
			seats.setText(String.valueOf(nosR));
			fromp.setText(fromR);
			top.setAccessibleHelp(toR);
			datep.setText(deptdateR);
			gatep.setText(gateR);
			flightp.setText(flightR);
			timep.setText(depttimeR);
			seatsp.setText(String.valueOf(nosR));
			 try {
		         BufferedWriter writer=new BufferedWriter(new FileWriter("TempInfo.txt"));
		         writer.close();
		     } catch (IOException e) {
		         throw new RuntimeException(e);
		     }
    }
public void previous(ActionEvent event)throws Exception{	
		
		root = FXMLLoader.load(getClass().getResource("TerminalScene.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
		  
		  
	}
    public void continuescene(ActionEvent event)throws Exception{	
    	 try {
             BufferedWriter writer=new BufferedWriter(new FileWriter("TempInfo.txt"));
             writer.close();
         } catch (IOException e) {
             throw new RuntimeException(e);
         }
		root = FXMLLoader.load(getClass().getResource("TicketScene.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
		  
		  
	}
    
}
