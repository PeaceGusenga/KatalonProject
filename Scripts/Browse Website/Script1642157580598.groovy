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

WebUI.navigateToUrl('https://www.opencart.com/index.php?route=cms/demo')

WebUI.click(findTestObject('Object Repository/Project_OR/Page_OpenCart - Demo/a_View Store Front'))

WebUI.switchToWindowTitle('Your Store')

WebUI.click(findTestObject('Object Repository/Project_OR/Page_Your Store/a_Desktops'))

WebUI.click(findTestObject('Object Repository/Project_OR/Page_Your Store/a_Show All Desktops'))

WebUI.click(findTestObject('Object Repository/Project_OR/Page_Desktops/a_Show All Laptops  Notebooks'))

WebUI.click(findTestObject('Object Repository/Project_OR/Page_Laptops  Notebooks/a_Show All Components'))

WebUI.click(findTestObject('Object Repository/Project_OR/Page_Components/a_Tablets'))

WebUI.click(findTestObject('Object Repository/Project_OR/Page_Tablets/a_Software'))

WebUI.click(findTestObject('Object Repository/Project_OR/Page_Software/a_Phones  PDAs'))

WebUI.click(findTestObject('Object Repository/Project_OR/Page_Phones  PDAs/a_Cameras'))

WebUI.click(findTestObject('Object Repository/Project_OR/Page_Cameras/a_MP3 Players'))

WebUI.click(findTestObject('Object Repository/Project_OR/Page_Cameras/a_Show All MP3 Players'))

WebUI.click(findTestObject('Object Repository/Project_OR/Page_MP3 Players/img_Add to Cart_img-responsive'))

WebUI.click(findTestObject('Object Repository/Project_OR/Page_iPod Touch/i_Add to Cart_fa fa-star-o fa-stack-1x'))

WebUI.closeBrowser()

