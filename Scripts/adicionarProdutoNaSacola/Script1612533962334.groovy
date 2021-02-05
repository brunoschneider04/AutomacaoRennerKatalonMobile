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

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.TextView - Menu (5)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.TextView - Faa login ou cadastre-se (16)'), 30)

// inserindo cpf comum
Mobile.setText(findTestObject('Object Repository/RENNER/android.widget.EditText - Insira o seu CPF ou e-mail (22)'), '70455889090', 
    30)

Mobile.setText(findTestObject('Object Repository/RENNER/android.widget.EditText - Digite sua senha (22)'), '123456', 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.Button - Entrar (22)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.TextView - Loja Virtual (1)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.TextView - Masculino (17)'), 30)

Mobile.delay(7)

Mobile.swipe(0, 900, 0, 200)

Mobile.swipe(0, 900, 0, 400)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.TextView - Cala Skinny Camuflada em Sarja'), 30)

Mobile.delay(7)

Mobile.swipe(0, 900, 0, 100)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.TextView - 38'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.Button - ADICIONAR  SACOLA (10)'), 30)

Mobile.closeApplication()

