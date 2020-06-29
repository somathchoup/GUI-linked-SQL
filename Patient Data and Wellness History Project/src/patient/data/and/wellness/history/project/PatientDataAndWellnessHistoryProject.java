/*
PROJECT: Create a Software Application Module for Patient Data and 
Wellness History.

Deliverables:

1. You will inform LPG as to the database and software language chosen by IBN 
to create their new application, in written form. You must detail the reasons 
that this particular database and language were chosen, without being overly 
technical to the LPG Technology Committee that you will be interfacing with. 
    a. A single Word document detailing these requirements is sufficient.

2. You must develop the database for the first phase of the project, providing 
the data structure for Basic Patient Data and Profile, and the Wellness Checkup
Profile. Tables should follow standard entity-relationship industry practices.
    a. Submit an entity-relationship diagram detailing data structure
    b. Provide a backup file of the database with your implemented data 
    structure

3. You must develop and deliver the operational front-end that allows for 
the entry of the data into the first phase screens, in the language that you 
choose. It must be operational and connect to the database that you created 
in Deliverable #2.
    a. Provide all code and files in zip archive, required to run the project

4. You must provide the above documentation from Deliverable #1, with 
installation instructions for implementing your First Phase deliverables 
for items #2 and #3.
    a. Provide installation instructions to implement the system. This can be a single Word document
 */

package patient.data.and.wellness.history.project; 
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Somath
 */
public class PatientDataAndWellnessHistoryProject {
  
    public static void main(String[] args) {
        // TODO code application logic
        try {
            Login.main(args);
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,"An Error Has Occured.", "ERROR!",JOptionPane.ERROR_MESSAGE);
        }
    }
}
