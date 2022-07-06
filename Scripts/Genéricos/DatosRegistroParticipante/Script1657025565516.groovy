import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
def date = new Date().format('yyMMddHHmms')

WebUI.setText(findTestObject('Object Repository/Page_Calidad SAP/input_Institucin_hospital'), Institucion)

WebUI.setText(findTestObject('Object Repository/Page_Calidad SAP/input_Contrasea_password'), Pass)

WebUI.setText(findTestObject('Object Repository/Page_Calidad SAP/input_Confirmar contrasea_confirm'), Pass)

WebUI.setText(findTestObject('Object Repository/Page_Calidad SAP/input_Telfono_phoneNumber'), NroTelefono)

WebUI.setText(findTestObject('Object Repository/Page_Calidad SAP/input_Direccin 1_addressOne'), Domicilio)

WebUI.setText(findTestObject('Object Repository/Page_Calidad SAP/input_Ciudad_city'), Ciudad)

WebUI.setText(findTestObject('Object Repository/Page_Calidad SAP/input_Cdigo postal_zip'), CodPostal)

WebUI.setText(findTestObject('Object Repository/Page_Calidad SAP/input_Pas_country'), Pais)

WebUI.setText(findTestObject('Object Repository/Page_Calidad SAP/input_Nombre 1_contactNameOne'), NombredeContacto)

WebUI.setText(findTestObject('Object Repository/Page_Calidad SAP/input_Email 1_emailOne'), date + Mail)

WebUI.click(findTestObject('Page_Calidad SAP/btn_Registrarse'))