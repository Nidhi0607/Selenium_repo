package books;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qsp.genericutility.BaseClass;
import com.qsp.genericutility.ExcelUtility;
import com.qsp.genericutility.ListnerUtility;
import com.qsp.objectrepository.HomePage;

@Listeners(ListnerUtility.class)

public class TC_DWS_005_Test extends BaseClass{
	@Test
	public void clickOnBooks() throws EncryptedDocumentException, IOException{
		hp=new HomePage(driver);
		hp.getBooklink().click();
		excelLib=new ExcelUtility();
		String acutalTile = driver.getTitle();
		String ExpectedTitle = excelLib.getStringDataFromExcel("Books",1,0);
		Assert.assertEquals(acutalTile, ExpectedTitle, "Books page is not displayed");
		Reporter.log("Books page is displayed", true);
		
		
	}
	
		


}
