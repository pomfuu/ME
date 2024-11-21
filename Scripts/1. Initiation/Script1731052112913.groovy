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

Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.Button[1]"]), 0)

// Welcome MO
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.RelativeLayout[1]/android.widget.ListView[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]"]), 0)
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.RelativeLayout[2]/android.widget.TextView[1]"]), 0)

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

// 5. Cluster
switch(Cluster) {
	case 'A':
		Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.RadioButton' and (@text = 'A' or . = 'A')]"]), 0)
		break;
	case 'B':
		Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.RadioButton' and (@text = 'B' or . = 'B')]"]), 0)
		break;
	case 'Mass':
		Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.RadioButton' and (@text = 'Mass' or . = 'Mass')]"]), 0)
		break;
}

// 6. Top Up
switch(TopUp) {
	case 'Yes':
		Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.RadioButton' and (@text = 'Yes' or . = 'Yes') and @resource-id = 'com.emobile.mobileentry:id/chckTopUpYes']"]), 0)
		break;
	case 'No':
		Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.RadioButton' and (@text = 'No' or . = 'No') and @resource-id = 'com.emobile.mobileentry:id/chckTopUpNo']"]), 0)
		break;
}

// 7. Repeat Order
switch(RO) {
	case 'Yes':
		Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.RadioButton' and (@text = 'Yes' or . = 'Yes') and @resource-id = 'com.emobile.mobileentry:id/chckRepeatYes']"]), 0)
		break;
	case 'No':
		Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.RadioButton' and (@text = 'No' or . = 'No') and @resource-id = 'com.emobile.mobileentry:id/chckRepeatNo']"]), 0)
		break;
}

// Proceed
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.Button' and (@text = 'Proceed' or . = 'Proceed') and @resource-id = 'com.emobile.mobileentry:id/proceed_button']"]), 0)

// Confirm
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.Button' and (@text = 'Yes' or . = 'Yes') and @resource-id = 'android:id/button1']"]), 0)
Mobile.delay(2)
Mobile.takeScreenshot((((baseDir + GlobalVariable.screenshotPath)) + '/' + No + '/' + 'Mobile ID') + '.png', FailureHandling.STOP_ON_FAILURE)