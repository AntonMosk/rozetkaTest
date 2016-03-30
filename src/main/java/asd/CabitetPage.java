package asd;

import org.apache.commons.codec.binary.Hex;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by tatsiak on 3/30/16.
 */
public class CabitetPage {
    public CabitetPage(WebDriver driver) {
        this.driver = driver;
    }

    protected WebDriver driver;
    private By checkButton = By.id("confirm_email_btn");
    public static By actualMail = By.xpath("//div[contains(text(), \"@walkmail.ru\")]");

    public void clickConfirmMail() throws InterruptedException {
        driver.findElement(checkButton).click();
        Thread.sleep(10000);
    }
   /* public void generateUrlForRequest()  {
        String mail=actualMail.toString();
       // final MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.reset();
        messageDigest.update(mail.getBytes(Charset.forName("UTF8")));
        final byte[] resultByte = messageDigest.digest();
        final String result = new String(Hex.encodeHex(resultByte));
    }
}*/
}

