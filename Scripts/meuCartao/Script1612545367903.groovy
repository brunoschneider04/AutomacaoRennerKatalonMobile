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

Mobile.startApplication('C:\\Users\\anama\\Desktop\\PMA\\Automacao\\13.3.6.564-tst.apk', true)

Mobile.tap(findTestObject('Object Repository/RENNER/android.view.ViewGroup (26)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.TextView - Faa login ou cadastre-se (19)'), 30)

Mobile.setText(findTestObject('Object Repository/RENNER/android.widget.EditText - Insira o seu CPF ou e-mail (25)'), '02528923058', 
    30)

Mobile.setText(findTestObject('Object Repository/RENNER/android.widget.EditText - Digite sua senha (25)'), '123456', 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.Button - Entrar (25)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.TextView - Loja Virtual (2)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.TextView - Masculino (18)'), 30)

Mobile.delay(7)

Mobile.swipe(0, 900, 0, 100)

Mobile.swipe(0, 900, 0, 100)

Mobile.swipe(0, 900, 0, 200)

Mobile.swipe(0, 900, 0, 200)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.TextView - Camiseta Esportiva Copa'), 30)

Mobile.delay(7)

Mobile.swipe(0, 900, 0, 300)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.TextView - G'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.Button - ADICIONAR  SACOLA (11)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.ImageView (22)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.Button - ENTENDI (5)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.Button - Finalizar compra (5)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.view.ViewGroup (7)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.RadioButton (9)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.Button - IR PARA PAGAMENTO (5)'), 30)

Mobile.delay(7)

Mobile.swipe(900, 600, 100, 600)

Mobile.swipe(900, 600, 100, 600)

Mobile.swipe(900, 600, 800, 600)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.TextView - Meu Carto'), 30)

Mobile.setText(findTestObject('Object Repository/RENNER/android.widget.EditText - Nmero do carto (15)'), '4745257209773348', 
    30)

Mobile.setText(findTestObject('Object Repository/RENNER/android.widget.EditText - Nome impresso no carto (3)'), 'pam', 30)

Mobile.setText(findTestObject('Object Repository/RENNER/android.widget.EditText - Venc. (mmaa) (4)'), '0430', 30)

Mobile.setText(findTestObject('Object Repository/RENNER/android.widget.EditText - Cd. de Segurana (5)'), '238', 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.Spinner - Selecione o nmero de parcelas (5)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.TextView - Quando deseja comear a pagar (6)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.Button - PRONTO (10)'), 30)

//Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.Button - FINALIZAR PEDIDO (4)'), 30)

Mobile.getText(findTestObject('Object Repository/RENNER/android.widget.TextView - Pedido Realizado (1)'), 30)

Mobile.closeApplication()

