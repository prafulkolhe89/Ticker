package com.qa.ticker.utils;

import java.time.Instant;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.ticker.base.TestBase;

public class CommonUtils extends TestBase {

	public WebElement WaitForElementToBePresence(WebElement fieldname) {
		return new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(fieldname));
	}
	
	public String timestampGenerator() 
	{
		Date date = new Date();
	    Instant Timestamp = date.toInstant();
	    return Timestamp.toString();
	}

	//This method would work for toggle who's default state is OFF
	/*public void select_ToggleButton(String Toggle_on_off_state) 
	{
		if (Toggle_on_off_state == "On" || Toggle_on_off_state == "on" || Toggle_on_off_state == "On") {

			if (Toggle_on_off_state.isDisplayed()) {
				Toggle_on_off_state.click();
			}
		} else {
			System.out.println("Gis is turned Off");
		}
	}
	*/
	
	
	
	// Pass element with arrow xpath in place of dropdown
	public void DropDownWithoutSelectTag(List<WebElement> dropdown, String ValueToBeSelected) {
		List<WebElement> myElements = dropdown;
		for (WebElement e : myElements) {
			//System.out.println(e.getText());
			if (e.getText().equalsIgnoreCase(ValueToBeSelected)) {
				e.click();
				break;
			}
		}
	}

}
