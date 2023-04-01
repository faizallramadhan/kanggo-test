import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://kanggo.id/')

WebUI.verifyElementPresent(findTestObject('Object Repository/Home Page/Home Page/img_Tentang Kami_img-responsive standard-lo_27995f'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Home Page/Home Page/a_Tentang Kami'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Home Page/Home Page/a_Layanan'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Home Page/Home Page/a_Jasa Pipa Mampet  Instalasi Pipa'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Home Page/Home Page/a_Jasa Pasang Plafon Gypsum'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Home Page/Home Page/a_Daftar Harga'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Home Page/Home Page/a_Inspirasi  Solusi'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Home Page/Home Page/a_Gabung Mitra'))

WebUI.verifyElementText(findTestObject('Object Repository/Home Page/Home Page/h2_KANGGO - Aplikasi Tukang Bangunan'), 'KANGGO - Aplikasi Tukang Bangunan')

WebUI.takeScreenshot()

WebUI.closeBrowser()

