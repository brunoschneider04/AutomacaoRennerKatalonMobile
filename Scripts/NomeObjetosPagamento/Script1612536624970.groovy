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

// só deixei salvos alguns códigos úteis aqui

Mobile.startApplication('C:\\Users\\anama\\Desktop\\PMA\\13.3.6.564-tst.apk', true)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.TextView - Menu (6)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.TextView - Faa login ou cadastre-se (17)'), 30)

Mobile.setText(findTestObject('Object Repository/RENNER/android.widget.EditText - Insira o seu CPF ou e-mail (23)'), '70455889090', 
    30)

Mobile.setText(findTestObject('Object Repository/RENNER/android.widget.EditText - Digite sua senha (23)'), '123456', 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.Button - Entrar (23)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.TextView - Carto Renner (2)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.ImageView (48)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.TextView - Carto Presente (3)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.ImageView (49)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.view.View (1)'), 30)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.TextView - Vale Troca (3)'), 30)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.TextView - Meu Carto (1)'), 30)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.TextView - Carto de Crdito (1)'), 30)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.TextView - Boleto Bancrio'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.TextView - Normal'), 30)

Mobile.closeApplication()

