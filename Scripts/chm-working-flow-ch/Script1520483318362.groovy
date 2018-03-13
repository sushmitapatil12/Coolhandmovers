import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import com.thoughtworks.selenium.Selenium
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern
import static org.apache.commons.lang3.StringUtils.join

WebUI.openBrowser('https://www.katalon.com/')
def driver = DriverFactory.getWebDriver()
String baseUrl = "https://www.katalon.com/"
selenium = new WebDriverBackedSelenium(driver, baseUrl)
selenium.open("https://coolhandmovers.com/")
selenium.click("link=Our Blog")
selenium.click("link=Contact")
selenium.click("id=fld_8768091_1")
selenium.type("id=fld_8768091_1", "Sushmita")
selenium.click("id=fld_9970286_1")
selenium.type("id=fld_9970286_1", "patil")
selenium.click("id=fld_6009157_1")
selenium.type("id=fld_6009157_1", "sushmita.patil@ahytech.com")
selenium.click("id=fld_7683514_1")
selenium.type("id=fld_7683514_1", "test")
selenium.click("id=fld_7908577_1")
selenium.click("link=Get Estimate")
selenium.click("id=fld_2163186_1")
selenium.type("id=fld_2163186_1", "Sushmita")
selenium.click("id=fld_2350828_1")
selenium.type("id=fld_2350828_1", "patil")
selenium.click("id=fld_8053743_1")
selenium.type("id=fld_8053743_1", "test@gmail.com")
selenium.click("id=fld_4601568_1")
selenium.type("id=fld_4601568_1", "12345")
selenium.click("id=fld_7955603_1")
selenium.type("id=fld_7955603_1", "1212")
selenium.click("id=fld_2561433_1")
selenium.select("id=fld_2561433_1", "label=Social media")
selenium.click("id=fld_2561433_1")
selenium.click("//span[@id='conditional_fld_8880791_1']/div/div/label[3]")
selenium.click("id=fld_7675795_1")
selenium.type("id=fld_7675795_1", "test")
selenium.click("id=fld_1176735_1")
selenium.type("id=fld_1176735_1", "12")
selenium.click("id=fld_3609723_1")
selenium.select("id=fld_3609723_1", "label=Elevator")
selenium.click("id=fld_3609723_1")
selenium.click("id=fld_7914160_1")
selenium.type("id=fld_7914160_1", "werwr ret")
selenium.click("id=fld_7914160Caption")
selenium.click("id=fld_8672473_1")
selenium.type("id=fld_8672473_1", "34")
selenium.click("id=fld_1252285_1")
selenium.select("id=fld_1252285_1", "label=Ground")
selenium.click("id=fld_1252285_1")
selenium.click("//span[@id='conditional_fld_7954516_1']/div/div/label[2]")
selenium.click("id=fld_8312364_1")
selenium.type("id=fld_8312364_1", "dsfgfd")
selenium.click("id=fld_4920531_1")
selenium.select("id=fld_4920531_1", "label=1")
selenium.click("id=fld_4920531_1")
selenium.click("id=fld_1830543_1")
selenium.type("id=fld_1830543_1", "3")
selenium.click("id=fld_2465881_1")
selenium.type("id=fld_2465881_1", "3")
selenium.click("id=fld_57379_1")
selenium.type("id=fld_57379_1", "fgdf")
selenium.click("id=fld_3083821_1")
selenium.type("id=fld_3083821_1", "dfhgfdh")
selenium.click("id=fld_6842372_1_opt1128792")
selenium.click("id=fld_8983159_1")
selenium.type("id=fld_8983159_1", "werwer")
selenium.click("id=fld_8774288_1")
selenium.click("link=Get Estimate")
