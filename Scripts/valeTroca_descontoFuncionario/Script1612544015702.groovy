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

//login já com item na sacola
Mobile.startApplication('C:\\Users\\anama\\Desktop\\PMA\\13.3.6.564-tst.apk', true)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.TextView - Menu'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.TextView - Faa login ou cadastre-se (11)'), 30)

// inserindo o cpf com desconto de funcionário
Mobile.setText(findTestObject('Object Repository/RENNER/android.widget.EditText - Insira o seu CPF ou e-mail (17)'), '11720465819', 
    30)

Mobile.setText(findTestObject('Object Repository/RENNER/android.widget.EditText - Digite sua senha (17)'), '123456', 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.Button - Entrar (17)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.ImageView (36)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.Button - ENTENDI (7)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.Button - Finalizar compra (7)'), 30)

Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/RENNER/android.view.ViewGroup (2)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.RadioButton (9)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.Button - IR PARA PAGAMENTO (10)'), 30)

Mobile.delay(6)

Mobile.swipe(900, 600, 400, 600)

//selecionando o vale troca
Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.TextView - Vale Troca (1)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.Switch - OFF (9)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.Button - UTILIZAR VALE TROCA (3)'), 30)

Mobile.delay(6)

//Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.Button - FINALIZAR PEDIDO (6)'), 30)

//Mobile.getText(findTestObject('Object Repository/RENNER/android.widget.TextView - Pedido Realizado (4)'), 30)


Mobile.closeApplication()

