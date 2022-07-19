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
import java.time.LocalDate as LocalDate
import java.time.format.DateTimeFormatter as DateTimeFormatter
import java.util.concurrent.ConcurrentHashMap.KeySetView as KeySetView
import java.text.DateFormat as DateFormat

WebUI.callTestCase(findTestCase('Genéricos/NavegarACalendario'), [:], FailureHandling.STOP_ON_FAILURE)

def fechaInicio = LocalDate.now().format(DateTimeFormatter.ofPattern('dd/MM/yyyy'))

def fechaFin = LocalDate.now().plusDays(7).format(DateTimeFormatter.ofPattern('dd/MM/yyyy'))

WebUI.click(findTestObject('Page_Calendario/button_Nuevo Calendario'))

WebUI.sendKeys(findTestObject('Page_Calendario/input_nombreCorrida'), corrida + protocolo)

WebUI.selectOptionByLabel(findTestObject('Page_Calendario/select_Protocolo'), protocolo, false)

WebUI.click(findTestObject('Page_Calendario/input_Clausura envio de protocolo'))

WebUI.sendKeys(findTestObject('Page_Calendario/input_Clausura envio de protocolo'), Keys.chord((Keys.CONTROL + 'A') + Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('Page_Calendario/input_Clausura envio de protocolo'), fechaFin)

WebUI.click(findTestObject('Page_Calendario/popup_Calendario'))

WebUI.click(findTestObject('Page_Calendario/input_Clausura de resultados'))

WebUI.sendKeys(findTestObject('Page_Calendario/input_Clausura de resultados'), Keys.chord((Keys.CONTROL + 'A') + Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('Page_Calendario/input_Clausura de resultados'), fechaFin)

WebUI.click(findTestObject('Page_Calendario/popup_Calendario'))

WebUI.click(findTestObject('Page_Calendario/button_Aceptar'))

