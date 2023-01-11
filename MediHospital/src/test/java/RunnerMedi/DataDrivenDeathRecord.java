package RunnerMedi;

import org.testng.annotations.Test;

import PagesMedi.AddBirthRecord;
import PagesMedi.BirthAndDeath;
import PagesMedi.LoginMedi;
import PagesMedi.deathrocord;
import baseMedi.BaseclassMedi;

import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

public class DataDrivenDeathRecord extends BaseclassMedi {

	String path = "C:\\Users\\soundhararaj\\Desktop\\Death Record.xlsx";

	LoginMedi s;
	BirthAndDeath v;
	deathrocord a;

	@Test(alwaysRun = true)
	public void login() throws InterruptedException {

		user(s.getUsername(), "jason@gmail.com");
		pass(s.getPassword(), "password");
		login(s.getClick());
		wait(3000);
	}

	@Test(priority = 6)
	public void deathrecord() throws InterruptedException {
		click(a.getDeath());
		wait(3000);
		windowhandle();
		wait(5000);
		click(a.getAdddeath());
		wait(5000);
		windowhandles();
		wait(10000);
	}

	@Test(priority = 8)
	public void deathData() throws InterruptedException, IOException {

		FileInputStream src = new FileInputStream(path);

		XSSFWorkbook s = new XSSFWorkbook(src);

		XSSFSheet v = s.getSheetAt(0);

		// XSSFRow n = v.getRow(1);

		XSSFCell cell;

		for (int i = 1; i <= v.getLastRowNum(); i++) {

			// XSSFCell cell = v.getRow(i).getCell(i);
			// cell.getStringCellValue();

			String Caseid = v.getRow(i).getCell(0).getStringCellValue();

			send(a.getId(), Caseid);

			wait(2000);

			String date = v.getRow(i).getCell(1).getStringCellValue();

			send(a.getRep(), date);

			wait(2000);

			String gaurd = v.getRow(i).getCell(2).getStringCellValue();

			send(a.getGuard(), gaurd);

			wait(2000);

			String photo = v.getRow(i).getCell(3).getStringCellValue();

			send(a.getAttach(), photo);
			wait(2000);

			String repo = v.getRow(i).getCell(4).getStringCellValue();
			send(a.getReport(), repo);
			wait(2000);

			click(a.getSave());

			wait(2000);
			click(a.getAdddeath());
			wait(2000);
			windowhandles();
			wait(2000);

		}

	}

	@Test(priority = 2)
	public void birthAnddeath() throws InterruptedException {
		death(v.getDeathre());
		wait(2000);
	}

	@BeforeClass
	public void beforeClass() {
		browserlaunch("chrome");
		s = new LoginMedi(d);
		v = new BirthAndDeath(d);
		a = new deathrocord(d);
	}

	@AfterClass
	public void afterClass() throws InterruptedException {
		wait(2000);
		closebutton(a.getClosebutton());

	}

}
