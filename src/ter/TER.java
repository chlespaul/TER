package ter;

import org.apache.poi.*;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class TER {
	
	public static final String PATH = "C:\\Users\\HONEY\\Downloads\\projet-donees-aleatoires-periode-corrigee.xlsx";

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {

		ArrayList<Resource> resources = new ArrayList<Resource>();
		Resource exploit = new Resource("Exploit", 220,44,200,66,42,207,110);
		resources.add(exploit);
        Resource testeurIt = new Resource("Testeur IT",176,176,180,44,63,115,176);
        resources.add(testeurIt);
        Resource cpIt = new Resource("CP IT",154,220,160,110,126,184,66);
        resources.add(cpIt);
        Resource cpMetier = new Resource("CP Metier",88,66,140,220,189,69,198);
        resources.add(cpMetier);
        Resource architecte = new Resource("Architecte",154,198,140,88,126,230,44);
        resources.add(architecte);
        Resource techLead = new Resource("Tech Lead",220,110,80,176,42,69,154);
        resources.add(techLead);
        Resource dev = new Resource("Dev",198,132,160,110,147,23,176);
        resources.add(dev);
        Resource recetteurFonctionnel = new Resource("Recetteur Fonctionnel",66,220,80,22,63,230,220);
        resources.add(recetteurFonctionnel);
        Resource respDomaine = new Resource("Resp Domaine",44,88,120,110,84,207,22);
        resources.add(respDomaine);
        Resource manager = new Resource("Manager",44,132,60,198,84,138,198);
        resources.add(manager);
        Resource respApplication = new Resource("Resp Application",132,154,60,110,210,161,110);
        resources.add(respApplication);
        Resource cpBi = new Resource("CP BI",22,66,80,154,84,23,88);
        resources.add(cpBi);
        
        ArrayList<Project> projects = new ArrayList<Project>();
        File file = new File(PATH);
        FileInputStream fIP = new FileInputStream(file);
        Workbook workbook = WorkbookFactory.create(file);

        // Retrieving the number of sheets in the Workbook
        System.out.println("Workbook has " + workbook.getNumberOfSheets() + " Sheets : ");
        Sheet sheet = workbook.getSheetAt(0);
        DataFormatter dataFormatter = new DataFormatter();
     // 1. You can obtain a rowIterator and columnIterator and iterate over them
        System.out.println("\n\nIterating over Rows and Columns using Iterator\n");
        Iterator<Row> rowIterator = sheet.rowIterator();
        rowIterator.next();
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            String projectName = dataFormatter.formatCellValue((row.getCell(0)));
            String roleName = dataFormatter.formatCellValue((row.getCell(1)));
            String aclName = dataFormatter.formatCellValue((row.getCell(2)));
            String dateDebutTache = dataFormatter.formatCellValue((row.getCell(3)));
            String dateFinTache = dataFormatter.formatCellValue((row.getCell(4)));
            String periode = dataFormatter.formatCellValue((row.getCell(5)));
            String effort = dataFormatter.formatCellValue((row.getCell(6)));
            String activityPriority = dataFormatter.formatCellValue((row.getCell(7)));
            String dateDebAlea = dataFormatter.formatCellValue((row.getCell(10)));
            String dateFinAlea = dataFormatter.formatCellValue((row.getCell(11)));
            String effortAlea = dataFormatter.formatCellValue((row.getCell(12)));
            
            Resource resource = null;
            for(int i=0; i<resources.size(); i++) {
            	if(resources.get(i).getName().equals(roleName))
            		resource = resources.get(i);
            }
            
            for(int i=0; i<projects.size(); i++) {
            	Project actual = projects.get(i);
            	if(actual.getName().equals(projectName)) {
            		actual.addTask(task);
            	}
            }
            // Now let's iterate over the columns of the current row
            Iterator<Cell> cellIterator = row.cellIterator();

            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                String cellValue = dataFormatter.formatCellValue(cell);
                System.out.print(cellValue + "\t");
            }
            System.out.println();
        }

	}

}
