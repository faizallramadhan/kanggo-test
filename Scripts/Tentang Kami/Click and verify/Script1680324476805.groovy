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

WebUI.click(findTestObject('Object Repository/Tentang Kami/Page_Jasa Tukang Bangunan  Aplikasi Pertuka_280b22/a_Tentang Kami'))

WebUI.click(findTestObject('Object Repository/Tentang Kami/Page_Tentang Kami  Kanggo - Perbaiki Rumah,_895661/label_Bergabung Menjadi Mitra'))

WebUI.verifyElementText(findTestObject('Object Repository/Tentang Kami/Page_Tentang Kami  Kanggo - Perbaiki Rumah,_895661/p_Untuk menjadi mitra KANGGO, pertama-tama,_6a6c8c'), 
    'Untuk menjadi mitra KANGGO, pertama-tama, Anda haruslah seorang tukang dengan keahlian tertentu.')

WebUI.click(findTestObject('Object Repository/Tentang Kami/Page_Tentang Kami  Kanggo - Perbaiki Rumah,_895661/label_Hubungi Kami'))

WebUI.verifyElementText(findTestObject('Object Repository/Tentang Kami/Page_Tentang Kami  Kanggo - Perbaiki Rumah,_895661/p_KANGGO Apps merupakan produk dari PT Tena_4c1c88'), 
    'KANGGO Apps merupakan produk dari PT Tenaga Kanggo Indonesia.')

WebUI.click(findTestObject('Object Repository/Tentang Kami/Page_Tentang Kami  Kanggo - Perbaiki Rumah,_895661/label_Link terkait'))

WebUI.verifyElementText(findTestObject('Object Repository/Tentang Kami/Page_Tentang Kami  Kanggo - Perbaiki Rumah,_895661/p_Berikut link terkait dengan KANGGO'), 
    'Berikut link terkait dengan KANGGO')

WebUI.click(findTestObject('Object Repository/Tentang Kami/Page_Tentang Kami  Kanggo - Perbaiki Rumah,_895661/a_Contact Us'))

WebUI.click(findTestObject('Object Repository/Tentang Kami/Page_Kontak Kami  Kanggo - Perbaiki Rumah, _35a35e/div_Kontak KamiHubungi kami untuk mendapatk_087fe7'))

WebUI.verifyElementPresent(findTestObject('Tentang Kami/contact/Page_Kontak Kami  Kanggo - Perbaiki Rumah, Berikan Pekerjaan/h1_Kontak Kami'), 
    0)

WebUI.takeScreenshot()

WebUI.closeBrowser()

