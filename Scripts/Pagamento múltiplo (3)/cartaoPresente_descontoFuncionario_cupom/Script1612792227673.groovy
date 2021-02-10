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

Mobile.startApplication('C:\\Users\\anama\\Desktop\\PMA\\Automacao\\13.3.6.564-tst.apk', true)


// login já com item na sacola (se não tiver item, rodar o test case "adicionarProdutoNaSacola")
Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.TextView - Menu'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.TextView - Faa login ou cadastre-se'), 30)

Mobile.setText(findTestObject('Object Repository/RENNER/android.widget.EditText - Insira o seu CPF ou e-mail'), '11720465819',
	30)

Mobile.setText(findTestObject('Object Repository/RENNER/android.widget.EditText - Digite sua senha'), '123456', 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.Button - Entrar'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.ImageView (13)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.Button - ENTENDI (2)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.TextView - Digite o cupom (2)'), 30)

Mobile.setText(findTestObject('Object Repository/RENNER/android.widget.EditText'),'15TOTAL', 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.TextView - Inserir cupom'), 30)

Mobile.delay(4)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.Button - Finalizar compra (2)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.view.ViewGroup (2)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.RadioButton (9)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.Button - IR PARA PAGAMENTO (2)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.TextView - Carto Presente (3)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.Switch - OFF (10)'), 30)

Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.Button - UTILIZAR CARTO PRESENTE (4)'), 30)

Mobile.delay(2)

//Comentar o passo abaixo se não quiser que a compra seja concluída (assim não precisa colocar o item na sacola novamente)
Mobile.tap(findTestObject('Object Repository/RENNER/android.widget.Button - FINALIZAR PEDIDO (2)'), 30)

Mobile.getText(findTestObject('Object Repository/RENNER/android.widget.TextView - Pedido Realizado'), 30)

Mobile.closeApplication()

