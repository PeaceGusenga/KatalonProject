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

WebUI.click(findTestObject('Object Repository/Project_OR/Page_OpenCart - Demo/a_View AdministrationLogin  Password demoVi_195f2b'))

WebUI.switchToWindowTitle('Administration')

WebUI.click(findTestObject('Object Repository/Project_OR/Page_Administration/i_Login_fa fa-key'))

WebUI.click(findTestObject('Object Repository/Project_OR/Page_Dashboard/a_Catalog'))

WebUI.click(findTestObject('Object Repository/Project_OR/Page_Dashboard/a_Categories'))

WebUI.click(findTestObject('Object Repository/Project_OR/Page_Categories/a_Products'))

WebUI.click(findTestObject('Object Repository/Project_OR/Page_Products/a_Recurring Profiles'))

WebUI.click(findTestObject('Object Repository/Project_OR/Page_Recurring Profiles/a_Filters'))

WebUI.click(findTestObject('Object Repository/Project_OR/Page_Filters/a_Attributes'))

WebUI.click(findTestObject('Object Repository/Project_OR/Page_Filters/a_Attributes_1'))

WebUI.click(findTestObject('Object Repository/Project_OR/Page_Attributes/a_Attribute Groups'))

WebUI.click(findTestObject('Object Repository/Project_OR/Page_Attribute Groups/a_Options'))

WebUI.click(findTestObject('Object Repository/Project_OR/Page_Options/a_Manufacturers'))

WebUI.click(findTestObject('Object Repository/Project_OR/Page_Manufacturers/a_Downloads'))

WebUI.click(findTestObject('Object Repository/Project_OR/Page_Downloads/a_Reviews'))

WebUI.click(findTestObject('Object Repository/Project_OR/Page_Reviews/a_Information'))

WebUI.click(findTestObject('Object Repository/Project_OR/Page_Information/span_Logout'))

WebUI.closeBrowser()

