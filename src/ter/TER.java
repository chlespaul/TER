package ter;

import org.apache.poi.*;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class TER {
	
	public static final String PATH = "C:\\Users\\HONEY\\Downloads\\projet-donees-aleatoires-periode-corrigee.xlsx";

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {

		Resource exploit = new Resource("Exploit", 220,44,200,66,42,207,110);
        Resource testeurIt = new Resource("Testeur IT",176,176,180,44,63,115,176);
        Resource cpIt = new Resource("CP IT",154,220,160,110,126,184,66);
        Resource cpMetier = new Resource("CP Metier",88,66,140,220,189,69,198);
        Resource architecte = new Resource("Architecte",154,198,140,88,126,230,44);
        Resource techLead = new Resource("Tech Lead",220,110,80,176,42,69,154);
        Resource dev = new Resource("Dev",198,132,160,110,147,23,176);
        Resource recetteurFonctionnel = new Resource("Recetteur Fonctionnel",66,220,80,22,63,230,220);
        Resource respDomaine = new Resource("Resp Domaine",44,88,120,110,84,207,22);
        Resource manager = new Resource("Manager",44,132,60,198,84,138,198);
        Resource respApplication = new Resource("Resp Application",132,154,60,110,210,161,110);
        Resource cpBi = new Resource("CP BI",22,66,80,154,84,23,88);
        
        ArrayList<Project> projects = new ArrayList<Project>();
        File file = new File(PATH);
        FileInputStream fIP = new FileInputStream(file);
        Workbook workbook = WorkbookFactory.create(file);

        // Retrieving the number of sheets in the Workbook
        System.out.println("Workbook has " + workbook.getNumberOfSheets() + " Sheets : ");
        
	}

}
