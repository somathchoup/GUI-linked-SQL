/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patient.data.and.wellness.history.project;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 *
 * @author Somath
 */

public class PatientInformation {
    ArrayList<String> patientarray; 
    ArrayList<String> wellnessarray;
    
    //Getter for Patiemt
    public ArrayList<String> getInformation(){
        return patientarray;
    }
    
    //Setter for Patient
    public void setInformation(ArrayList<String> newInfo) {
        this.patientarray = newInfo;  
    }
    
    public ArrayList<String> getWellness(){
        return wellnessarray;
    }
    
    public void setWellness(ArrayList<String> newWellness){
        this.wellnessarray = newWellness;
    }
     
}
