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

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.ImageView (42)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.TextView - Faa login ou cadastre-se (14)'), 30)

Mobile.setText(findTestObject('Object Repository/RENNER/android.widget.EditText - Insira o seu CPF ou e-mail (19)'), '70455889090', 
    30)

Mobile.setText(findTestObject('Object Repository/RENNER/android.widget.EditText - Digite sua senha (19)'), '123456', 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.Button - Entrar (19)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.ImageView (43)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.Button - ENTENDI (15)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.Button - Finalizar compra (10)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.view.ViewGroup (23)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.RadioButton (9)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.Button - IR PARA PAGAMENTO (12)'), 30)

//o cartão presente deve estar validado
Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.TextView - Carto Presente (1)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.ImageView (44)'), 30)

Mobile.setText(findTestObject('Object Repository/RENNER/android.widget.EditText - R139,90'), '2000', 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.Button - OK (5)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.Button - UTILIZAR CARTO PRESENTE (4)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.Button - ENTENDI (16)'), 30)

Mobile.delay(3)

Mobile.swipe(100, 500, 900, 500)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.TextView - Carto Renner (1)'), 30)

Mobile.setText(findTestObject('Object Repository/RENNER/android.widget.EditText - Nmero do carto (14)'), '9999961361277900', 
    30)

Mobile.setText(findTestObject('Object Repository/RENNER/android.widget.EditText - Senha do carto (8)'), '2486', 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.Spinner - Selecione o nmero de parcelas (4)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.TextView - Quando deseja comear a pagar (3)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.Button - PRONTO (9)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.Button - ENTENDI (11)'), 30)

//Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.Button - FINALIZAR PEDIDO (6)'), 30)

Mobile.getText(findTestObject('Object Repository/RENNER/android.widget.TextView - Pedido Realizado (4)'), 30)

Mobile.closeApplication()

