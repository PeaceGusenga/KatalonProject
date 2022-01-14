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

WebUI.click(findTestObject('Object Repository/Project_OR/Page_Administration/button_Login'))

WebUI.click(findTestObject('Object Repository/Project_OR/Page_Dashboard/a_Reports'))

WebUI.click(findTestObject('Object Repository/Project_OR/Page_Dashboard/a_Reports_1_2'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Project_OR/Page_Reports/select_Customer Transaction ReportCustomer _0b0047'), 
    'https://demo.opencart.com/admin/index.php?route=report/report&user_token=ztthIqcnGYnVgf24Es1TOeWarvtdeiHh&code=sale_tax', 
    true)

WebUI.click(findTestObject('Object Repository/Project_OR/Page_Reports/a_2'))

WebUI.click(findTestObject('Object Repository/Project_OR/Page_Reports/a_3'))

WebUI.click(findTestObject('Object Repository/Project_OR/Page_Reports/a_'))

WebUI.click(findTestObject('Object Repository/Project_OR/Page_Reports/span_Logout'))

WebUI.closeBrowser()

