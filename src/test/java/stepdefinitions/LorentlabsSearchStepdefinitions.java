package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.LorentlabsPage;
import utilities.Driver;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class LorentlabsSearchStepdefinitions {
    LorentlabsPage lorentlabsPage=new LorentlabsPage();
    @Given("kullanici lorentlabsda gider")
    public void kullanici_lorentlabsda_gider() {
        Driver.getDriver().get("https://lorentlabs.com/");

    }

    @Given("kullanici vpn arar")
    public void kullanici_vpn_arar() {
        lorentlabsPage.araTikla.click();
        lorentlabsPage.ara.sendKeys("vpn"+ Keys.ENTER);

    }
    @Then("kullanici vpn oldugunu dogrular")
    public void kullanici_vpn_oldugunu_dogrular() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("vpn"));

    }
    @Given("kullanici iphone arar")
    public void kullanici_iphone_arar() {
        lorentlabsPage.araTikla.click();
        lorentlabsPage.ara.sendKeys("iphone");
        lorentlabsPage.ara.submit();
    }




    @Then("kullanici iphone oldugunu dogrular")
    public void kullanici_iphone_oldugunu_dogrular() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("iphone"));

    }
    @Given("kullanici aranani listeler")
    public void kullanici_aranani_listeler() throws IOException {
        List<WebElement> list = lorentlabsPage.liste;


        int sum = 0;
        for (WebElement listeler : list) {
            int sayi = 15;
            System.out.println(listeler.getText());


            String path = "D:\\proje klasr\\mycucumberlorentlabsfreamwork\\src\\test\\resources\\lorent.xlsx";
            FileInputStream fileInputStream = new FileInputStream(path);
            Workbook workbook = WorkbookFactory.create(fileInputStream);
            Sheet sheet = workbook.getSheetAt(0);
            Row row = sheet.createRow(sum);
            Cell cell = row.createCell(0);
            cell.setCellValue(listeler.getText());


            FileOutputStream fileOutputStream = new FileOutputStream(path);
            workbook.write(fileOutputStream);


            sum = sum + 1;
            if (sum == sayi) {
                break;
            }

            fileInputStream.close();
            fileOutputStream.close();
            workbook.close();


        }}
        @Given("kullanici inceleme katogorisini listeler")
        public void kullanici_inceleme_katogorisini_listeler () throws IOException {
            lorentlabsPage.incele.click();
            int sum=0;

            List<WebElement> allOptions = Driver.getDriver().findElements(By.xpath("//a[@class='title']"));
            for(WebElement option : allOptions){
                String path = "D:\\proje klasr\\mycucumberlorentlabsfreamwork\\src\\test\\resources\\lorent.xlsx";
                FileInputStream fileInputStream = new FileInputStream(path);
                Workbook workbook = WorkbookFactory.create(fileInputStream);
                Sheet sheet = workbook.getSheetAt(1);
                Row row = sheet.createRow(sum);
                Cell cell = row.createCell(0);
                cell.setCellValue(option.getText());


                FileOutputStream fileOutputStream = new FileOutputStream(path);
                workbook.write(fileOutputStream);


                sum = sum + 1;


                fileInputStream.close();
                fileOutputStream.close();
                workbook.close();

                System.out.println(option.getText());
            }




        }




        @Then("kullanici kaç adet doldugunu yazdırır")
        public void kullanici_kaç_adet_doldugunu_yazdırır() {
            lorentlabsPage.incele.click();


            List<WebElement> allOptions = Driver.getDriver().findElements(By.xpath("//a[@class='title']"));
            for(WebElement option : allOptions){
                System.out.println(option.getSize());
            }
        }

    }




