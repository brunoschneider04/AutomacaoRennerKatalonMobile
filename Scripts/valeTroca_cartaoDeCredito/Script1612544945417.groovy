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

// login já com item na sacola (se não tiver item, rodar o test case "adicionarProdutoNaSacola")
Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.TextView - Menu'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.TextView - Faa login ou cadastre-se (13)'), 30)

Mobile.setText(findTestObject('Object Repository/RENNER/android.widget.EditText - Insira o seu CPF ou e-mail (18)'), '70455889090', 
    30)

Mobile.setText(findTestObject('Object Repository/RENNER/android.widget.EditText - Digite sua senha (18)'), '123456', 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.Button - Entrar (18)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.ImageView (22)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.Button - ENTENDI (13)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.Button - Finalizar compra (9)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.view.ViewGroup (21)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.RadioButton (9)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.Button - IR PARA PAGAMENTO (11)'), 30)

Mobile.delay(6)

Mobile.swipe(900, 600, 400, 600)

//selecionando o vale troca
Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.TextView - Vale Troca (2)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.ImageView (41)'), 30)

Mobile.setText(findTestObject('Object Repository/RENNER/android.widget.EditText - R139,90 (2)'), '5000', 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.Button - OK (4)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.Button - UTILIZAR VALE TROCA (4)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.Button - ENTENDI (14)'), 30)

Mobile.delay(6)

Mobile.swipe(900, 600, 400, 600)

Mobile.swipe(900, 600, 400, 600)

//selecionando o cartão de crédito
Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.TextView - Carto de Crdito'), 30)

Mobile.setText(findTestObject('Object Repository/RENNER/android.widget.EditText - Nmero do carto (12)'), '5390437226518927', 
    30)

Mobile.setText(findTestObject('Object Repository/RENNER/android.widget.EditText - Nome impresso no carto (2)'), 'pam', 30)

Mobile.setText(findTestObject('Object Repository/RENNER/android.widget.EditText - Venc. (mmaa) (3)'), '0322', 30)

Mobile.setText(findTestObject('Object Repository/RENNER/android.widget.EditText - Cd. de Segurana (4)'), '471', 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.Spinner - Selecione o nmero de parcelas (3)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.view.ViewGroup (22)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.Button - PRONTO (8)'), 30)

//Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.Button - FINALIZAR PEDIDO (6)'), 30)

Mobile.getText(findTestObject('Object Repository/RENNER/android.widget.TextView - Pedido Realizado (4)'), 30)


Mobile.closeApplication()

