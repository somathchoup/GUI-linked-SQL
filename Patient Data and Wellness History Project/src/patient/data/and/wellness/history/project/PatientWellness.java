/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patient.data.and.wellness.history.project;

import java.util.ArrayList;

/**
 *
 * @author Somath
 */
public class PatientWellness {
    
    ArrayList<String> wellnessarray; 
    
    //Getter for Patient's Wellness
    public ArrayList<String> getInformation(){
        return wellnessarray;
    }
    
    //Setter for Patient's Wellness
    public void setInformation(ArrayList<String> newInfo) {
        this.wellnessarray = newInfo;
    }
     
}
