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

String baseDir = System.getProperty('user.dir')

String packageName = 'com.emobile.mobileentry'
String launcherActivity = 'com.example.bcafrevamp.screen.splash.SplashActivity'

Mobile.startExistingApplication(packageName)
AndroidDriver<?> driver = MobileDriverFactory.getDriver()

String id = 'com.emobile.mobileentry:id'
String adbPath = "\"C:/Users/clarien cahyono/AppData/Local/Android/Sdk/platform-tools/adb.exe\""

// 1. KTP Upload
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.Button[1]"]), 0)
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.CheckedTextView[2]"]), 0)
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.Button[1]"]), 0)

String KTPPath = RunConfiguration.getProjectDir() + "/Assets/ktp_dummy.png"
String adbCommandKTP = adbPath + " push \"" + KTPPath + "\" /sdcard/Download/ktp_dummy.png"
println("Uploading KTP image with command: " + adbCommandKTP)
Runtime.getRuntime().exec(adbCommandKTP)
Thread.sleep(2000)

Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ImageButton[1]"]), 0)
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.ListView[1]/android.widget.LinearLayout[3]"]), 0)
Mobile.delay(2)
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.LinearLayout[4]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.ImageView[1]"]), 0)
Mobile.delay(2)

Mobile.scrollToText('Save')
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.Button' and (@text = 'Save' or . = 'Save') and @resource-id = 'com.emobile.mobileentry:id/save_button_ktp_konsumen']"]), 0)
// 2. KK Upload
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.Button' and (@text = 'Capture' or . = 'Capture') and @resource-id = 'com.emobile.mobileentry:id/btnKartuKeluarga']"]), 0)
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.CheckedTextView[2]"]), 0)
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.Button[1]"]), 0)
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
String KKPath = RunConfiguration.getProjectDir() + "/Assets/kk_dummy.jpg"
String adbCommandKK = adbPath + " push \"" + KKPath + "\" /sdcard/Download/kk_dummy.jpg"
println("Uploading KK image with command: " + adbCommandKK)
Runtime.getRuntime().exec(adbCommandKK)
Thread.sleep(2000)

Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.ImageView[1]"]), 0)
Mobile.delay(2)

// Isi Kode Pos
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.EditText[2]"]), 0)
String KodePos = KodePos
for (int i = 0; i < KodePos.length(); i++) {
	char digit = KodePos.charAt(i)
	int keyCode = Character.getNumericValue(digit) + 7
	driver.pressKeyCode(keyCode)
}

Mobile.scrollToText('Save')
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.Button' and (@text = 'Save' or . = 'Save') and @resource-id = 'com.emobile.mobileentry:id/save_button_kk']"]), 0)

// 3. NPWP Upload
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.Button' and (@text = 'Capture' or . = 'Capture') and @resource-id = 'com.emobile.mobileentry:id/btnNpwpKonsumen']"]), 0)
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.CheckedTextView[2]"]), 0)
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.Button[1]"]), 0)

String NPWPPath = RunConfiguration.getProjectDir() + "/Assets/npwp_dummy.jpg"
String adbCommandNPWP = adbPath + " push \"" + NPWPPath + "\" /sdcard/Download/npwp_dummy.jpg"
println("Uploading NPWP image with command: " + adbCommandNPWP)
Runtime.getRuntime().exec(adbCommandNPWP)
Thread.sleep(2000)

Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.ImageView[1]"]), 0)
Mobile.delay(2)

Mobile.scrollToText('Save')
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.Button' and (@text = 'Save' or . = 'Save') and @resource-id = 'com.emobile.mobileentry:id/save_button_NK']"]), 0)

// 4. FAP Upload
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.Button' and (@text = 'Capture' or . = 'Capture') and @resource-id = 'com.emobile.mobileentry:id/btnFormAplikasiPengajuan']"]), 0)
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.CheckedTextView[2]"]), 0)
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.Button[1]"]), 0)
 
String FAPPAth = RunConfiguration.getProjectDir() + "/Assets/fap_dummy.png"
String adbCommandFAP = adbPath + " push \"" + FAPPAth + "\" /sdcard/Download/fap_dummy.png"
println("Uploading NPWP image with command: " + FAPPAth)
Runtime.getRuntime().exec(adbCommandFAP)
Thread.sleep(2000)

Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.LinearLayout[3]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.ImageView[1]"]), 0)
Mobile.delay(2)
 
Mobile.scrollToText('Save')
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.Button' and (@text = 'Save' or . = 'Save') and @resource-id = 'com.emobile.mobileentry:id/save_button_FormAplikasi']"]), 0)

// -- VIEWING AND MAINTAIN SECTION --
// 1. KTP Konsumen
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.RelativeLayout[1]/android.widget.Button[1]"]), 0)
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.EditText[1]"]), 0)
Mobile.clearText(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.EditText[1]"]), 0)
Mobile.setText(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.EditText[1]"]), NIK,  0)

Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.EditText[2]"]), 0)
Mobile.clearText(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.EditText[2]"]), 0)
Mobile.setText(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.EditText[2]"]), NamaKonsumen,  0)
Mobile.hideKeyboard();

Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.ImageView' and @resource-id = 'com.emobile.mobileentry:id/imgCalKTP_KONSUMEN' and (@text = '' or . = '')]"]), 0)
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.LinearLayout[1]/android.widget.NumberPicker[3]/android.widget.EditText[1]"]), 0)

String TahunDOB = TahunDOB
for (int i = 0; i < TahunDOB.length(); i++) {
	char digit = TahunDOB.charAt(i)
	int keyCode = Character.getNumericValue(digit) + 7
	driver.pressKeyCode(keyCode)
}

Mobile.hideKeyboard();
Mobile.scrollToText('Save')
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.Button' and (@text = 'Save' or . = 'Save') and @resource-id = 'com.emobile.mobileentry:id/save_button_ktp_konsumen']"]), 0)

// 2. KK
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.Button' and (@text = 'View' or . = 'View') and @resource-id = 'com.emobile.mobileentry:id/btnKartuKeluarga']"]), 0)
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.Spinner' and @resource-id = 'com.emobile.mobileentry:id/edtPendidikanKonsumenKK' and (@text = '' or . = '')]"]), 0)
switch(Education) {
	case 'SMU':
		Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.CheckedTextView[2]"]), 0)
		break;
	case 'SMP':
		Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.CheckedTextView[3]"]), 0)
		break;
	case 'D1':
		Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.CheckedTextView[4]"]), 0)
		break;
	case 'SD':
		Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.CheckedTextView[5]"]), 0)
		break;
	case 'D2':
		Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.CheckedTextView[6]"]), 0)
		break;
	case 'D3':
		Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.CheckedTextView[7]"]), 0)
		break;
	case 'Universitas':
		Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.CheckedTextView[8]"]), 0)
		break;
	case 'S1':
		Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.CheckedTextView[9]"]), 0)
		break;
}

Mobile.setText(findTestObject('Object Repository/xpath', ['xpath' : "//*[@resource-id = 'com.emobile.mobileentry:id/edtIbuKandung']"]), IbuKandung, 0)
Mobile.hideKeyboard();
Mobile.scrollToText('Save')
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.Button' and (@text = 'Save' or . = 'Save') and @resource-id = 'com.emobile.mobileentry:id/save_button_kk']"]), 0)

// 3. NPWP
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@resource-id = 'com.emobile.mobileentry:id/btnNpwpKonsumen']"]), 0)
Mobile.setText(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.EditText[1]"]), NoNPWP, 0)
Mobile.hideKeyboard();
Mobile.scrollToText('Save')
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.Button' and (@text = 'Save' or . = 'Save') and @resource-id = 'com.emobile.mobileentry:id/save_button_NK']"]), 0)

// 4. FAP
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.RelativeLayout[1]/android.widget.Button[6]"]), 0)
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.RadioButton' and (@text = 'Yes' or . = 'Yes') and @resource-id = 'com.emobile.mobileentry:id/chckYes']"]), 0)

Mobile.scrollToText('Email')
Mobile.setText(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.EditText' and @resource-id = 'com.emobile.mobileentry:id/edtEmailFormAplikasi']"]), Email, 0)
Mobile.hideKeyboard();

Mobile.scrollToText('Prefix Handphone 1')
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.EditText' and @resource-id = 'com.emobile.mobileentry:id/edtKodeHp1FormAplikasi']"]), 0)
String HandphonePrefix = HandphonePrefix
for (int i = 0; i < HandphonePrefix.length(); i++) {
	char digit = HandphonePrefix.charAt(i)
	int keyCode = Character.getNumericValue(digit) + 7
	driver.pressKeyCode(keyCode)
}

Mobile.hideKeyboard();

Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.EditText' and @resource-id = 'com.emobile.mobileentry:id/edtHp1FormAplikasi']"]), 0)
String HandphoneNumber = HandphoneNumber
for (int i = 0; i < HandphoneNumber.length(); i++) {
	char digit = HandphoneNumber.charAt(i)
	int keyCode = Character.getNumericValue(digit) + 7
	driver.pressKeyCode(keyCode)
}
Mobile.hideKeyboard();

Mobile.scrollToText('Save')
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.Button' and (@text = 'Save' or . = 'Save') and @resource-id = 'com.emobile.mobileentry:id/save_button_FormAplikasi']"]), 0)

// UPLOAD
Mobile.scrollToText('Upload')
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.Button' and (@text = 'Upload' or . = 'Upload') and @resource-id = 'com.emobile.mobileentry:id/upload_button']"]), 0)
Mobile.delay(7)

// SAVE
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.Button' and (@text = 'Save' or . = 'Save') and @resource-id = 'com.emobile.mobileentry:id/save_button']"]), 0)
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.Button' and (@text = 'Yes' or . = 'Yes') and @resource-id = 'android:id/button1']"]), 0)
