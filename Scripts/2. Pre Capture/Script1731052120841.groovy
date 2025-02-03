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
import io.appium.java_client.android.nativekey.AndroidKey
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

String KKPath = RunConfiguration.getProjectDir() + "/Assets/kk_dummy.jpg"
String adbCommandKK = adbPath + " push \"" + KKPath + "\" /sdcard/Download/kk_dummy.jpg"
println("Uploading KK image with command: " + adbCommandKK)
Runtime.getRuntime().exec(adbCommandKK)
Thread.sleep(2000)

String NPWPPath = RunConfiguration.getProjectDir() + "/Assets/npwp_dummy.jpg"
String adbCommandNPWP = adbPath + " push \"" + NPWPPath + "\" /sdcard/Download/npwp_dummy.jpg"
println("Uploading NPWP image with command: " + adbCommandNPWP)
Runtime.getRuntime().exec(adbCommandNPWP)
Thread.sleep(2000)

String FAPPAth = RunConfiguration.getProjectDir() + "/Assets/fap_dummy.png"
String adbCommandFAP = adbPath + " push \"" + FAPPAth + "\" /sdcard/Download/fap_dummy.png"
println("Uploading NPWP image with command: " + FAPPAth)
Runtime.getRuntime().exec(adbCommandFAP)
Thread.sleep(2000)

Mobile.delay(7)
Mobile.scrollToText('Save')
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.Button' and (@text = 'Save' or . = 'Save') and @resource-id = 'com.emobile.mobileentry:id/save_button_ktp_konsumen']"]), 0)

// 2. KK Upload
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.Button' and (@text = 'Capture' or . = 'Capture') and @resource-id = 'com.emobile.mobileentry:id/btnKartuKeluarga']"]), 0)
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.CheckedTextView[2]"]), 0)    
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.Button[1]"]), 0)
Mobile.delay(7)

// Isi Kode Pos
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.Spinner' and @resource-id = 'com.emobile.mobileentry:id/spKodePosKK' and (@text = '' or . = '')]"]), 0)
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.TextView' and (@text = '10120' or . = '10120') and @resource-id = 'android:id/text1']"]), 0)
Mobile.scrollToText('Save')
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.Button' and (@text = 'Save' or . = 'Save') and @resource-id = 'com.emobile.mobileentry:id/save_button_kk']"]), 0)

// 3. Cover Buku Tabungan
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.Button' and (@text = 'Capture' or . = 'Capture') and @resource-id = 'com.emobile.mobileentry:id/btnCoverBukuTabungan']"]), 0)
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.CheckedTextView[2]"]), 0)
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.Button[1]"]), 0)
Mobile.delay(7)
Mobile.scrollToText('Save')
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.Button' and (@text = 'Save' or . = 'Save') and @resource-id = 'com.emobile.mobileentry:id/save_button_Cover']"]), 0)

// 4. FAP Upload
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.Button' and (@text = 'Capture' or . = 'Capture') and @resource-id = 'com.emobile.mobileentry:id/btnFormAplikasiPengajuan']"]), 0)
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.CheckedTextView[2]"]), 0)
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.Button[1]"]), 0)
Mobile.delay(7)
Mobile.scrollToText('Save')
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.Button' and (@text = 'Save' or . = 'Save') and @resource-id = 'com.emobile.mobileentry:id/save_button_FormAplikasi']"]), 0)

// 5. Bukti Segmentasi
Mobile.scrollToText('Bukti Segmentasi/Membership KKB')
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.Button' and (@text = 'Bukti Segmentasi/Membership KKB' or . = 'Bukti Segmentasi/Membership KKB') and @resource-id = 'com.emobile.mobileentry:id/btnOtherDoc']"]), 0)
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.CheckedTextView[2]"]), 0)
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.Button[1]"]), 0)
Mobile.setText(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.EditText' and @resource-id = 'com.emobile.mobileentry:id/editTextDialogUserInput' and (@text = '' or . = '')]"]), 'segmentasi',  0)
Mobile.hideKeyboard()
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.Button' and (@text = 'Simpan File Name' or . = 'Simpan File Name') and @resource-id = 'android:id/button1']"]), 0)
Mobile.delay(7)
Mobile.scrollToText('Save')
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.Button' and (@text = 'Save' or . = 'Save') and @resource-id = 'com.emobile.mobileentry:id/save_button_Siup']"]), 0)

/*
// other. NPWP Upload
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.Button' and (@text = 'Capture' or . = 'Capture') and @resource-id = 'com.emobile.mobileentry:id/btnNpwpKonsumen']"]), 0)
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.CheckedTextView[2]"]), 0)
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.Button[1]"]), 0)
Mobile.delay(7)
Mobile.scrollToText('Save')
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.Button' and (@text = 'Save' or . = 'Save') and @resource-id = 'com.emobile.mobileentry:id/save_button_NK']"]), 0)
*/

// -- VIEWING AND MAINTAIN SECTION --
// 1. KTP Konsumen
Mobile.scrollToText('KTP Konsumen (ICR)')
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.RelativeLayout[1]/android.widget.Button[1]"]), 0)
Mobile.setText(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.EditText' and @resource-id = 'com.emobile.mobileentry:id/edtNoKtp' and (@text = '' or . = '')]"]), NIK,  0)
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.EditText' and @resource-id = 'com.emobile.mobileentry:id/edtNoKtp']"]), 0)
Mobile.hideKeyboard();

Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.EditText' and @resource-id = 'com.emobile.mobileentry:id/edtName']"]), 0)
Mobile.clearText(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.EditText' and @resource-id = 'com.emobile.mobileentry:id/edtName']"]), 0)
Mobile.setText(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.EditText' and @resource-id = 'com.emobile.mobileentry:id/edtName']"]), NamaKonsumen,  0)
Mobile.hideKeyboard();

Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.ImageView' and @resource-id = 'com.emobile.mobileentry:id/imgCalKTP_KONSUMEN' and (@text = '' or . = '')]"]), 0)
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.LinearLayout[1]/android.widget.NumberPicker[3]/android.widget.EditText[1]"]), 0)

String TahunDOB = TahunDOB
for (int i = 0; i < TahunDOB.length(); i++) {
	char digit = TahunDOB.charAt(i)
	int keyCode = Character.getNumericValue(digit) + 7
	driver.pressKeyCode(keyCode)
}
driver.pressKeyCode(AndroidKeyCode.ENTER)
driver.pressKeyCode(AndroidKeyCode.ENTER)
Mobile.hideKeyboard();

Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.EditText' and @resource-id = 'com.emobile.mobileentry:id/edtTempatLahir']"]), 0)
Mobile.setText(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.EditText' and @resource-id = 'com.emobile.mobileentry:id/edtTempatLahir']"]), TempatLahir,  0)
Mobile.hideKeyboard();

Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.EditText' and @resource-id = 'com.emobile.mobileentry:id/edtAlamat']"]), 0)
Mobile.setText(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.EditText' and @resource-id = 'com.emobile.mobileentry:id/edtAlamat']"]), Alamat,  0)
Mobile.hideKeyboard();

Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.EditText' and @resource-id = 'com.emobile.mobileentry:id/edtProvinsi' and (@text = '' or . = '')]"]), 0)
Mobile.setText(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.EditText' and @resource-id = 'com.emobile.mobileentry:id/edtProvinsi' and (@text = '' or . = '')]"]), Provinsi,  0)
Mobile.hideKeyboard();
Mobile.takeScreenshot((((baseDir + GlobalVariable.screenshotPath)) + '/' + No + '/' + 'Mobile ID') + '7. VIEW KTP 1.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.EditText' and @resource-id = 'com.emobile.mobileentry:id/edtKota']"]), 0)
Mobile.setText(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.EditText' and @resource-id = 'com.emobile.mobileentry:id/edtKota']"]), Kota,  0)
Mobile.hideKeyboard();

Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.EditText' and @resource-id = 'com.emobile.mobileentry:id/edtKecamatan']"]), 0)
Mobile.setText(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.EditText' and @resource-id = 'com.emobile.mobileentry:id/edtKecamatan']"]), Kecamatan,  0)
Mobile.hideKeyboard();

Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.EditText' and @resource-id = 'com.emobile.mobileentry:id/edtKelurahan']"]), 0)
Mobile.setText(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.EditText' and @resource-id = 'com.emobile.mobileentry:id/edtKelurahan']"]), Kelurahan,  0)
Mobile.hideKeyboard();
Mobile.takeScreenshot((((baseDir + GlobalVariable.screenshotPath)) + '/' + No + '/' + 'Mobile ID') + '8. VIEW KTP 2.png', FailureHandling.STOP_ON_FAILURE)

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
Mobile.takeScreenshot((((baseDir + GlobalVariable.screenshotPath)) + '/' + No + '/' + 'Mobile ID') + '9. VIEW KK.png', FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Save')
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.Button' and (@text = 'Save' or . = 'Save') and @resource-id = 'com.emobile.mobileentry:id/save_button_kk']"]), 0)

// 3. Cover Buku Tabungan
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.Button' and (@text = 'View' or . = 'View') and @resource-id = 'com.emobile.mobileentry:id/btnCoverBukuTabungan']"]), 0)
Mobile.setText(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.EditText' and @resource-id = 'com.emobile.mobileentry:id/edtNoRekBCACover' and (@text = '' or . = '')]"]), '1234567891123', 0)
Mobile.hideKeyboard()
Mobile.setText(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.EditText' and @resource-id = 'com.emobile.mobileentry:id/edtCabangBCACover' and (@text = '' or . = '')]"]), 'PONDOK INDAH', 0)
Mobile.hideKeyboard()
Mobile.takeScreenshot((((baseDir + GlobalVariable.screenshotPath)) + '/' + No + '/' + 'Mobile ID') + '10. VIEW COVER BUKU TABUNGAN.png', FailureHandling.STOP_ON_FAILURE)
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.Button' and (@text = 'Save' or . = 'Save') and @resource-id = 'com.emobile.mobileentry:id/save_button_Cover']"]), 0)

/*
// 3. NPWP
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@resource-id = 'com.emobile.mobileentry:id/btnNpwpKonsumen']"]), 0)
Mobile.setText(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.EditText[1]"]), NoNPWP, 0)
Mobile.hideKeyboard();
Mobile.scrollToText('Save')
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.Button' and (@text = 'Save' or . = 'Save') and @resource-id = 'com.emobile.mobileentry:id/save_button_NK']"]), 0)
*/

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
Mobile.takeScreenshot((((baseDir + GlobalVariable.screenshotPath)) + '/' + No + '/' + 'Mobile ID') + '11. VIEW FAP.png', FailureHandling.STOP_ON_FAILURE)
Mobile.scrollToText('Save')
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.Button' and (@text = 'Save' or . = 'Save') and @resource-id = 'com.emobile.mobileentry:id/save_button_FormAplikasi']"]), 0)

// 5. BUKTI SEGMENTASI
Mobile.scrollToText('Bukti Segmentasi/Membership KKB')
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.Button' and (@text = 'View' or . = 'View') and @resource-id = 'com.emobile.mobileentry:id/btnOtherDoc']"]), 0)
Mobile.takeScreenshot((((baseDir + GlobalVariable.screenshotPath)) + '/' + No + '/' + 'Mobile ID') + '12. VIEW Bukti Segmentasi.png', FailureHandling.STOP_ON_FAILURE)
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.Button' and (@text = 'Save' or . = 'Save') and @resource-id = 'com.emobile.mobileentry:id/save_button_Siup']"]), 0)

// UPLOAD
Mobile.scrollToText('Upload')
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.Button' and (@text = 'Upload' or . = 'Upload') and @resource-id = 'com.emobile.mobileentry:id/upload_button']"]), 0)
Mobile.takeScreenshot((((baseDir + GlobalVariable.screenshotPath)) + '/' + No + '/' + 'Mobile ID') + '13. Upload File', FailureHandling.STOP_ON_FAILURE)
Mobile.delay(15)

// SAVE
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.Button' and (@text = 'Save' or . = 'Save') and @resource-id = 'com.emobile.mobileentry:id/save_button']"]), 0)
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.Button' and (@text = 'Yes' or . = 'Yes') and @resource-id = 'android:id/button1']"]), 0)
Mobile.takeScreenshot((((baseDir + GlobalVariable.screenshotPath)) + '/' + No + '/' + 'Mobile ID') + '14. Save File', FailureHandling.STOP_ON_FAILURE)
