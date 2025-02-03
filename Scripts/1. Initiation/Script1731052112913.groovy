import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import javax.xml.bind.annotation.XmlElementDecl.GLOBAL
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.android.AndroidKeyCode
import com.kms.katalon.core.configuration.RunConfiguration

// Testing push
String baseDir = System.getProperty('user.dir')

String packageName = 'com.emobile.mobileentry'
String launcherActivity = 'com.example.bcafrevamp.screen.splash.SplashActivity'

Mobile.startExistingApplication(packageName)
AndroidDriver<?> driver = MobileDriverFactory.getDriver()

String id = 'com.emobile.mobileentry:id'

String userID = GlobalVariable.userID
String password = GlobalVariable.password
Mobile.setText(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.EditText[1]"]), userID, 0)
Mobile.setText(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.EditText[2]"]), password, 0)

Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.TextView' and (@text = '?' or . = '?') and @resource-id = 'com.emobile.mobileentry:id/IP']"]), 0)
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.Spinner[1]"]), 0)
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.CheckedTextView[2]"]), 0)

Mobile.takeScreenshot((((baseDir + GlobalVariable.screenshotPath)) + '/' + No + '/' + 'Mobile ID') + '1. Login.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[1]"]), 0)

Mobile.delay(2)
Mobile.takeScreenshot((((baseDir + GlobalVariable.screenshotPath)) + '/' + No + '/' + 'Mobile ID') + '2. After Login.png', FailureHandling.STOP_ON_FAILURE)
// Welcome MO
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.RelativeLayout[1]/android.widget.ListView[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]"]), 0)
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.RelativeLayout[2]/android.widget.TextView[1]"]), 0)

Mobile.takeScreenshot((((baseDir + GlobalVariable.screenshotPath)) + '/' + No + '/' + 'Mobile ID') + '3. Inisiasi.png', FailureHandling.STOP_ON_FAILURE)

// Initation

// 1 Tipe Konsumen
switch(TipePerorangan) {
	case 'Perorangan':
		Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.RelativeLayout[1]/android.widget.RadioGroup[1]/android.widget.RadioButton[1]"]), 0)
		break;
	case 'Badan Usaha':
		Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.RelativeLayout[1]/android.widget.RadioGroup[1]/android.widget.RadioButton[2]"]), 0)
		break;
}

// 2. Status
switch(StatusPerkawinan) {
	case 'Married':
		Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.RadioGroup[2]/android.widget.RadioButton[1]"]), 0)
		break;
	case 'Single':
		Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.RadioGroup[2]/android.widget.RadioButton[2]"]), 0)
		break;
}

// 3. KondisiMobil
switch(KondisiMobil) {
	case 'New':
		Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.RadioGroup[3]/android.widget.RadioButton[1]"]), 0)
		break;
	case 'Used':
		Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.RadioGroup[3]/android.widget.RadioButton[2]"]), 0)
		break;
}

// 4. Penjamin
switch(Penjamin) {
	case 'Ada':
		Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.RadioGroup[4]/android.widget.RadioButton[1]"]), 0)
		Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.RadioGroup[5]/android.widget.RadioButton[1]"]), 0)
		break;
	case 'Tidak':
	case 'Tidak Ada':
		Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.RadioGroup[4]/android.widget.RadioButton[2]"]), 0)
		break;
}


// 5. Segmentasi
switch(Segmentasi) {
	case 'HNWI':
		Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.RadioButton' and (@text = 'HNWI' or . = 'HNWI') and @resource-id = 'com.emobile.mobileentry:id/chckHNWI']"]), 0)
		break;
	case 'Affluent':
		Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.RadioButton' and (@text = 'Affluent' or . = 'Affluent') and @resource-id = 'com.emobile.mobileentry:id/chckAffluent']"]), 0)
		break;
	case 'Uppermass':
		Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.RadioButton' and (@text = 'Uppermass' or . = 'Uppermass') and @resource-id = 'com.emobile.mobileentry:id/chckUpperMass']"]), 0)
		break;
	case 'Mass':
		Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.RadioButton' and (@text = 'Mass' or . = 'Mass') and @resource-id = 'com.emobile.mobileentry:id/chckMass']"]), 0)
		break;
	case 'Tidak Tersegmentasi':
		Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.RadioButton' and (@text = 'Tidak Tersegmentasi' or . = 'Tidak Tersegmentasi') and @resource-id = 'com.emobile.mobileentry:id/chckTidakTersegmentasi']"]), 0)
		break;
}

// 6. Membership
switch(Membership) {
	case 'Solitaire':
		Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.RadioButton' and (@text = 'Solitaire' or . = 'Solitaire') and @resource-id = 'com.emobile.mobileentry:id/chckSolitaire']"]), 0)
		break;
	case 'Prioritas':
		Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.RadioButton' and (@text = 'Prioritas' or . = 'Prioritas') and @resource-id = 'com.emobile.mobileentry:id/chckPrioritas']"]), 0)
		break;
	case 'Reguler':
		Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.RadioButton' and (@text = 'Reguler' or . = 'Reguler') and @resource-id = 'com.emobile.mobileentry:id/chckReguler']"]), 0)
		break;
}

// 7. Jenis Debitur
switch(JenisDebitur) {
	case 'Korporasi':
		Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.RadioButton' and (@text = 'Korporasi' or . = 'Korporasi') and @resource-id = 'com.emobile.mobileentry:id/chckKorporasi']"]), 0)
		break;
	case 'Komersial':
		Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.RadioButton' and (@text = 'Komersial' or . = 'Komersial') and @resource-id = 'com.emobile.mobileentry:id/chckKomersial']"]), 0)
		break;
	case 'SME':
		Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.RadioButton' and (@text = 'SME' or . = 'SME') and @resource-id = 'com.emobile.mobileentry:id/chckSme']"]), 0)
		break;
	case 'KUK/KUR':
		Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.RadioButton' and (@text = 'KUK/KUR' or . = 'KUK/KUR') and @resource-id = 'com.emobile.mobileentry:id/chckKukKur']"]), 0)
		break;
	case 'Non Debitur':
		Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.RadioButton' and (@text = 'Non Debitur' or . = 'Non Debitur') and @resource-id = 'com.emobile.mobileentry:id/chckNonDebitur']"]), 0)
		break;
}

// 8. Top Up
switch(TopUp) {
	case 'Yes':
		Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.RadioButton' and (@text = 'Yes' or . = 'Yes') and @resource-id = 'com.emobile.mobileentry:id/chckTopUpYes']"]), 0)
		break;
	case 'No':
		Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.RadioButton' and (@text = 'No' or . = 'No') and @resource-id = 'com.emobile.mobileentry:id/chckTopUpNo']"]), 0)
		break;
}

// 9. Repeat Order
switch(RO) {
	case 'Yes':
		Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.RadioButton' and (@text = 'Yes' or . = 'Yes') and @resource-id = 'com.emobile.mobileentry:id/chckRepeatYes']"]), 0)
		break;
	case 'No':
		Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.RadioButton' and (@text = 'No' or . = 'No') and @resource-id = 'com.emobile.mobileentry:id/chckRepeatNo']"]), 0)
		break;
}

Mobile.takeScreenshot((((baseDir + GlobalVariable.screenshotPath)) + '/' + No + '/' + 'Mobile ID') + '4. Before Proceed.png', FailureHandling.STOP_ON_FAILURE)

// Proceed
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.Button' and (@text = 'Proceed' or . = 'Proceed') and @resource-id = 'com.emobile.mobileentry:id/proceed_button']"]), 0)

Mobile.takeScreenshot((((baseDir + GlobalVariable.screenshotPath)) + '/' + No + '/' + 'Mobile ID') + '5.  Confirm Proceed.png', FailureHandling.STOP_ON_FAILURE)
// Confirm
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.Button' and (@text = 'Yes' or . = 'Yes') and @resource-id = 'android:id/button1']"]), 0)
Mobile.delay(3)
Mobile.takeScreenshot((((baseDir + GlobalVariable.screenshotPath)) + '/' + No + '/' + 'Mobile ID') + '6. Mobile ID.png', FailureHandling.STOP_ON_FAILURE)