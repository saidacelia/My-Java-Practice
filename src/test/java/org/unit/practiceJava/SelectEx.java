package org.unit.practiceJava; /*  Created By  Lyes  on 3/31/2021 , at 11:26 AM  */

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SelectEx {


    //@Test
    public void test() throws IOException {
        WebDriver driver = null;
        WebElement element = null;
        WebElement source = null;
        WebElement target = null;


        Select select= new Select(element);
        select.selectByIndex(0);

        Actions action=new Actions(driver);
        action.dragAndDrop(source,target).build().perform();

        action.moveToElement(target).build().perform();

        action.doubleClick().build().perform();

        String screenShotName= "pict";
        TakesScreenshot ts= (TakesScreenshot) driver;
        File src= ts.getScreenshotAs((OutputType.FILE));
        FileUtils.copyFile(src, new File("./MyScreenShots/"+screenShotName+".png"));

        WebDriverWait wait= new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(element));

        Alert alert = driver.switchTo().alert();
        alert.getText();
        alert.accept();

        driver.switchTo().frame(0);

        List links= driver.findElements(By.tagName("a"));
        for (int i=0; i<links.size();i++){
            String clik= Keys.chord(Keys.CONTROL, Keys.ENTER);    // to topen the link in a new window
            driver.findElements(By.tagName("a")).get(i).sendKeys(clik);
        }
        Set<String> windowHandles= driver.getWindowHandles();
        Iterator<String>it= windowHandles.iterator();

        while(it.hasNext()){
            driver.switchTo().window(it.next());
            System.out.println(driver.getTitle());
        }


    }
}
