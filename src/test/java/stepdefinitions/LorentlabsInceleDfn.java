package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LorentlabsPage;
import utilities.Driver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class LorentlabsInceleDfn {
    LorentlabsPage lorentlabsPage =new LorentlabsPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),20);

    @Given("kullanici incele tum menuyu tiklar")
    public void kullanici_incele_tum_menuyu_tiklar() {
        lorentlabsPage.incele.click();

    }

    @Given("kullanici incele icerigini yukler")
    public void kullanici_incele_icerigini_yukler() throws InterruptedException {
        String dahaFazla=lorentlabsPage.icerikYukle.getText();

        System.out.println(dahaFazla);
        while(true){
            if (lorentlabsPage.icerikYukle.getText().contains(dahaFazla)){
                lorentlabsPage.icerikYukle.click();
                Thread.sleep(5000);

            }else if (lorentlabsPage.icerikYukle.getText().contains("Maalesef Başka İçerik Bulunamadı :(")){
                break;
            }
        }



    }

    @Then("kullanici incele sayfa basliklarini excele yazdirir")
    public void kullanici_incele_sayfa_basliklarini_excele_yazdirir() throws IOException{
        int sum=0;
        List<WebElement> iceriklİste=Driver.getDriver().findElements(By.xpath("//a[@class='title']"));
        for (WebElement liste:iceriklİste) {
            String path="D:\\proje klasr\\mycucumberlorentlabsfreamwork\\src\\test\\resources\\lorent.xlsx";
            FileInputStream fileInputStream=new FileInputStream(path);
            Workbook workbook= WorkbookFactory.create(fileInputStream);
            Sheet sheet=workbook.getSheetAt(0);
            Row row=sheet.createRow(sum);
            Cell cell=row.createCell(0);
            cell.setCellValue(liste.getText());

            FileOutputStream fileOutputStream=new FileOutputStream(path);
            workbook.write(fileOutputStream);
            sum=sum+1;
            fileInputStream.close();
            fileOutputStream.close();
            workbook.close();

        }
    }

}
