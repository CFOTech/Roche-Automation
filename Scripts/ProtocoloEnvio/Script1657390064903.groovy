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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://131.255.5.194:4050/')

WebUI.click(findTestObject('Object Repository/Page_Calidad SAP/label_Login'))

WebUI.setText(findTestObject('Object Repository/Page_Calidad SAP/input_Usuario_username'), 'aa-003')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Calidad SAP/input_Contrasea_password'), 'h4AGlcY+u0Jy4laBfOY4Pw==')

WebUI.click(findTestObject('Object Repository/Page_Calidad SAP/button_Iniciar sesin'))

WebUI.click(findTestObject('Object Repository/Page_Calidad SAP/a_Envo'))

WebUI.click(findTestObject('Object Repository/Page_Calidad SAP/img_Seleccione una imagen_img-protocol pointer'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Calidad SAP/select_-- Seleccione un tipo --ManualAut. V_30d2ad'), 
    'Aut. Ventana', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Calidad SAP/select_-- Seleccione un clon --SP1EP16F11EP220Otro'), 
    'EP1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Calidad SAP/select_-- Seleccione una marca --DAKO - AGI_de3eda'), 
    'DAKO - AGILENT', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Calidad SAP/select_-- Seleccione una dilucin --15011001_612565'), 
    '1:100', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Calidad SAP/select_-- Seleccione un tiempo --15 min30 m_562664'), 
    '60 min', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Calidad SAP/select_-- Seleccione la temperatura --0C5C1_fedc78'), 
    '65°C', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Calidad SAP/select_-- Seleccione un tiempo --15 min30 m_562664_1'), 
    '30 min', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Calidad SAP/select_-- Seleccione un tiempo --15 min30 m_562664_1_2'), 
    '30 min', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Calidad SAP/select_-- Seleccione un dispositivo --Autom_5028c4'), 
    'Microondas', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Calidad SAP/select_-- Seleccione un tiempo --15 min30 m_562664_1_2_3'), 
    '60 min', true)

WebUI.click(findTestObject('Object Repository/Page_Calidad SAP/button_Enviar'))

WebUI.click(findTestObject('Object Repository/Page_Calidad SAP/label_Logout'))

