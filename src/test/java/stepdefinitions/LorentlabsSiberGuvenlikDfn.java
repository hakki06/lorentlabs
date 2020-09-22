package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.LorentlabsPage;
import utilities.Driver;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class LorentlabsSiberGuvenlikDfn {
    LorentlabsPage lorentlabsPage =new LorentlabsPage();
    @Given("kullanici siberGuvenlik menusunu tiklar")
    public void kullanici_siberGuvenlik_menusunu_tiklar() {
       lorentlabsPage.siberguvenlik.click();
    }

    @Given("kullanici tüm siberGuvenlik menusunu yukler")
    public void kullanici_tüm_siberGuvenlik_menusunu_yukler() throws InterruptedException {
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
    @Then("kullanıcı siberGuvenlik basliklarini excele yazdırır")
    public void kullanıcı_siberGuvenlik_basliklarini_excele_yazdırır() throws IOException {
        int sum=0;
        List<WebElement> iceriklİste= Driver.getDriver().findElements(By.xpath("//a[@class='title']"));
        for (WebElement liste:iceriklİste) {
            String path="D:\\proje klasr\\mycucumberlorentlabsfreamwork\\src\\test\\resources\\lorent.xlsx";
            FileInputStream fileInputStream=new FileInputStream(path);
            Workbook workbook= WorkbookFactory.create(fileInputStream);
            Sheet sheet=workbook.getSheetAt(4);
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
