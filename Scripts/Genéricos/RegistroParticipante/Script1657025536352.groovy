import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI



WebUI.openBrowser('')

WebUI.navigateToUrl('http://131.255.5.194:4050/')

WebUI.click(findTestObject('Object Repository/Page_Calidad SAP/label_Login'))

WebUI.click(findTestObject('Page_Calidad SAP/a_Alta_nuevo_participante'))


