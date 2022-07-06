import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Genéricos/RegistroParticipante'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Genéricos/DatosRegistroParticipante'), [('Institucion') : 'Laboratorio Prueba', ('Pass') : '123456Lab'
        , ('NroTelefono') : '12346789', ('Domicilio') : 'Cuba 2020', ('Ciudad') : 'CABA', ('CodPostal') : '', ('Pais') : 'Argentina'
        , ('NombredeContacto') : 'Automation', ('Mail') : '@prueba.com'], FailureHandling.STOP_ON_FAILURE)

def camposObligatorios = WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Calidad SAP/div_Todos los campos con  son obligatorios'), 
    12)

assert camposObligatorios == true : 'Apareció correctamente la alerta enunciando que faltan campos obligatorios'




