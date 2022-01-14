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

WebUI.switchToWindowTitle('OpenCart - Demo')

WebUI.click(findTestObject('Object Repository/Project_OR/Page_OpenCart - Demo/a_View AdministrationLogin  Password demoVi_195f2b'))

WebUI.click(findTestObject('Object Repository/Project_OR/Page_Administration/button_Login'))

WebUI.click(findTestObject('Object Repository/Project_OR/Page_Dashboard/i_105.00_fa fa-eye'))

WebUI.click(findTestObject('Object Repository/Project_OR/Page_Orders/a_test name'))

WebUI.switchToWindowTitle('Customers')

WebUI.click(findTestObject('Object Repository/Project_OR/Page_Customers/a_Affiliate'))

WebUI.click(findTestObject('Object Repository/Project_OR/Page_Customers/a_History'))

WebUI.click(findTestObject('Object Repository/Project_OR/Page_Customers/a_Transactions'))

WebUI.click(findTestObject('Object Repository/Project_OR/Page_Customers/a_Reward Points'))

WebUI.click(findTestObject('Object Repository/Project_OR/Page_Customers/a_IP Addresses'))

WebUI.click(findTestObject('Object Repository/Project_OR/Page_Customers/i_Other Statuses_fa fa-save'))

WebUI.click(findTestObject('Object Repository/Project_OR/Page_Customers/a_Logout'))

WebUI.closeBrowser()

