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

Mobile.startApplication('C:\\Users\\anama\\Desktop\\PMA\\13.3.6.564-tst.apk', true)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.RadioButton (20)'), 0)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.Button - IR PARA PAGAMENTO (19)'), 0)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.ImageView (60)'), 0)

Mobile.setText(findTestObject('Object Repository/RENNER/android.widget.EditText - R89,90 (2)'), '50', 0)

Mobile.setText(findTestObject('Object Repository/RENNER/android.widget.EditText - R0,50 (1)'), '5000', 0)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.Button - OK (10)'), 0)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.Button - UTILIZAR CARTO PRESENTE (8)'), 0)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.Button - ENTENDI (23)'), 0)

Mobile.swipe(900, 500, 200, 500)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.TextView - Meu Carto (2)'), 0)

Mobile.closeApplication()

