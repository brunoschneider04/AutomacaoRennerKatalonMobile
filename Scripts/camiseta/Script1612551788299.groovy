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

Mobile.tap(findTestObject('Object Repository/RENNER/android.view.ViewGroup (26)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.TextView - Faa login ou cadastre-se (19)'), 30)

Mobile.setText(findTestObject('Object Repository/RENNER/android.widget.EditText - Insira o seu CPF ou e-mail (25)'), '02528923058', 
    30)

Mobile.setText(findTestObject('Object Repository/RENNER/android.widget.EditText - Digite sua senha (25)'), '123456', 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.Button - Entrar (25)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.TextView - Loja Virtual (2)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.TextView - Masculino (18)'), 30)

Mobile.swipe(0, 900, 0, 500)

Mobile.swipe(0, 900, 0, 100)

Mobile.swipe(0, 900, 0, 200)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.ImageView (50)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.ImageButton (12)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.TextView - Camiseta Esportiva Copa'), 30)

Mobile.swipe(0, 900, 0, 300)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.TextView - G'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.Button - ADICIONAR  SACOLA (11)'), 30)

Mobile.closeApplication()

