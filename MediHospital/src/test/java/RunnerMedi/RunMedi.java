package RunnerMedi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PagesMedi.AddBirthRecord;
import PagesMedi.BirthAndDeath;
import PagesMedi.LoginMedi;
import PagesMedi.deathrocord;
import baseMedi.BaseclassMedi;

public class RunMedi extends BaseclassMedi {

	LoginMedi s;
	BirthAndDeath v;
	AddBirthRecord m;
	deathrocord a;
    
	//@Parameters("LOG IN")
	@Test (priority = -1)
	public void login() throws InterruptedException {

	    user(s.getUsername(), "jason@gmail.com");
		pass(s.getPassword(), "password");
		click(s.getClick());
		wait(3000);
	}

	//@Parameters("BD Record")
	@Test(priority = 1)
	public void birthAnddeath() throws InterruptedException {
		wait(5000);
		death(v.getDeathre());
		wait(5000);
	}
	@Ignore
	@Parameters("BirthRecord")
	@Test//(priority = 3)
	public void birth() throws InterruptedException {
		birth(v.birth());
		wait(3);
		windowhandle();
		wait(3000);
		addbirth(m.getAddbir());
		wait(3000);
		windowhandles();
		wait(3000);
	}

	@Ignore
	@Test(priority = 4)
	public void birthrecord() throws InterruptedException {
		child(m.getName(), "ravi");
		wait(3000);
		drop(m.getDrop(), "visible text", "Male");
		wait(3000);
		weight(m.getWeight(), "60");
		wait(3000);
		photo(m.getPhoto(), "C:\\Users\\soundhararaj\\Pictures\\Saved Pictures\\Screenshot (1).png");
		wait(3000);
		birthdate(m.getBirthdate(), "09.04.1997 2:17 PM", Keys.ENTER);
		wait(3000);
		phone(m.getNumber(), "8988989899");
		wait(3000);
		address(m.getAdd(), "222,illinoise");
		wait(3000);
		Caseid(m.getId(), "752");
		wait(3000);
		mother(m.getMphoto(), "C:\\Users\\soundhararaj\\Pictures\\Saved Pictures\\anonymous_hacker_5k_1.jpg");
		wait(3000);
		fathername(m.getFname(), "neymar");
		wait(3000);
		fphoto(m.getFphoto(), "C:\\Users\\soundhararaj\\Pictures\\Saved Pictures\\Screenshot (1).png");
		wait(3000);
		report(m.getRep(), "good");
		wait(3000);
		attach(m.getAttach(), "C:\\Users\\soundhararaj\\Pictures\\Saved Pictures\\yamaha_mt_10-1.jpg");
		wait(3000);
		save(m.getSave());
		wait(3000);
	}
	@Ignore
	@Test(priority = 6)
	public void deathrecord() throws InterruptedException {
		click(a.getDeath());
		wait(3000);
		windowhandle();
		wait(5000);
		click(a.getAdddeath());
		wait(5000);
		windowhandles();
		send(a.getId(), "752");
		wait(3000);
		send(a.getRep(), "04.01.2023 2:26 PM");
		wait(3000);
		send(a.getGuard(), "John");
		wait(3000);
		send(a.getAttach(), "C:\\Users\\soundhararaj\\Pictures\\Saved Pictures\\yamaha_mt_10-1.jpg");
		wait(3000);
		send(a.getReport(), "good");
		wait(3000);
		click(a.getSave());
		wait(3000);
	}

	@BeforeClass
	public void beforeClass() {
		browserlaunch("chrome");
		s = new LoginMedi(d);
		v = new BirthAndDeath(d);
		m = new AddBirthRecord(d);
		a = new deathrocord(d);
	}

	@AfterClass
	public void afterClass() {
   
	}

}
