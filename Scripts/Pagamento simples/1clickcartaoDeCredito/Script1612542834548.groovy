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

// essa compra não vai ser finalizada por causa de um problema na hora de escolher a parcela

// login já com item na sacola
Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.TextView - Menu'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.TextView - Faa login ou cadastre-se'), 30)

Mobile.setText(findTestObject('Object Repository/RENNER/android.widget.EditText - Insira o seu CPF ou e-mail'), '70455889090',
	30)

Mobile.setText(findTestObject('Object Repository/RENNER/android.widget.EditText - Digite sua senha'), '123456', 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.Button - Entrar'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.ImageView (22)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.Button - ENTENDI (7)'), 30)

//1 click com cartão de crédito deve estar ativado
Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.Button - Finalizar com 1 click'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.ImageView (28)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.RadioButton (9)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.Button - IR PARA PAGAMENTO (9)'), 30)

Mobile.setText(findTestObject('Object Repository/RENNER/android.widget.EditText - Cd. de Segurana (3)'), '471',30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.Spinner - Selecione o nmero de parcelas'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.view.ViewGroup (1)'), 30)

//Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.TextView - Quando deseja comear a pagar'), 30)

//Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.Button - FINALIZAR COMPRA COM 1 CLICK'), 30)

//Mobile.getText(findTestObject('Object Repository/RENNER/android.widget.TextView - Pedido Realizado (3)'), 30)

Mobile.closeApplication()


