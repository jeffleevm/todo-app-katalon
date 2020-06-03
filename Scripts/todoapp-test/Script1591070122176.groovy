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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://a76b50877cf1c11e9af7c0a6a4a42d3b-1168106156.ap-southeast-1.elb.amazonaws.com:8085/')

WebUI.setText(findTestObject('Object Repository/Page_AngularFrontend/input_title'), 'hello world')

WebUI.sendKeys(findTestObject('Object Repository/Page_AngularFrontend/input_title'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_AngularFrontend/click_tick'))

WebUI.click(findTestObject('Object Repository/Page_AngularFrontend/click_edit'))

WebUI.setText(findTestObject('Object Repository/Page_AngularFrontend/input_edit'), 'hello world 123')

WebUI.click(findTestObject('Object Repository/Page_AngularFrontend/click_done'))

WebUI.click(findTestObject('Object Repository/Page_AngularFrontend/click_undo_tick'))

WebUI.closeBrowser()

