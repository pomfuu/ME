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

// INPUT DATA
// Matching
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.Button' and (@text = 'MATCHING' or . = 'MATCHING') and @resource-id = 'com.emobile.mobileentry:id/matching_button']"]), 0)
 
// Occupation Data
Mobile.scrollToText('Occupation Data')
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.Button' and (@text = 'SELECT' or . = 'SELECT') and @resource-id = 'com.emobile.mobileentry:id/ekonomic_button']"]), 0)
Mobile.setText(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.EditText' and (@text = 'Economy Code' or . = 'Economy Code') and @resource-id = 'com.emobile.mobileentry:id/edtEkonomiCode']"]), '111308', 0)
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.Button' and (@text = 'Search' or . = 'Search') and @resource-id = 'com.emobile.mobileentry:id/search_button']"]), 0)
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.TextView' and (@text = '111308 Pelayanan umum, lembaga nasional/internasional-ketenagakerjaan-Jasa Outsourcing' or . = '111308 Pelayanan umum, lembaga nasional/internasional-ketenagakerjaan-Jasa Outsourcing') and @resource-id = 'com.emobile.mobileentry:id/txtsearchResult']"]), 0)

Mobile.setText(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.EditText' and (@text = 'Company Name' or . = 'Company Name') and @resource-id = 'com.emobile.mobileentry:id/edtCompanyName']"]), 'PT' + NamaKonsumen, 0)
Mobile.hideKeyboard();

Mobile.setText(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.EditText' and (@text = 'Jabatan/Profesi' or . = 'Jabatan/Profesi') and @resource-id = 'com.emobile.mobileentry:id/edtJabatanProfesi']"]), 'QA', 0)
Mobile.hideKeyboard();

Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.EditText' and (@text = 'Total Penghasilan' or . = 'Total Penghasilan') and @resource-id = 'com.emobile.mobileentry:id/edtTotalPenghasilan']"]), 0)
String TotalPenghasilan = TotalPenghasilan
for (int i = 0; i < TotalPenghasilan.length(); i++) {
	char digit = TotalPenghasilan.charAt(i)
	int keyCode = Character.getNumericValue(digit) + 7
	driver.pressKeyCode(keyCode)
}
Mobile.hideKeyboard();

// Dealer
Mobile.scrollToText('Dealer / Vehicle')
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.Button' and (@text = 'SELECT' or . = 'SELECT') and @resource-id = 'com.emobile.mobileentry:id/dealer_name_button']"]), 0)
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.Button' and (@text = 'Search' or . = 'Search') and @resource-id = 'com.emobile.mobileentry:id/search_button']"]), 0)
Mobile.setText(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.EditText' and (@text = 'Dealer Name' or . = 'Dealer Name') and @resource-id = 'com.emobile.mobileentry:id/edtEkonomiCode']"]), Dealer, 0)
Mobile.hideKeyboard()
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.Button' and (@text = 'Search' or . = 'Search') and @resource-id = 'com.emobile.mobileentry:id/search_button']"]), 0)
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.RelativeLayout[1]/android.widget.ListView[1]/android.widget.TextView[1]"]), 0)

Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.Button' and (@text = 'SELECT' or . = 'SELECT') and @resource-id = 'com.emobile.mobileentry:id/branch_button']"]), 0)
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.Button' and (@text = 'Search' or . = 'Search') and @resource-id = 'com.emobile.mobileentry:id/search_button']"]), 0)
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.RelativeLayout[1]/android.widget.ListView[1]/android.widget.TextView[1]"]), 0)

// Brand
Mobile.scrollToText('Data Kendaraan')
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.Button' and (@text = 'SELECT' or . = 'SELECT') and @resource-id = 'com.emobile.mobileentry:id/brand_button']"]), 0)
Mobile.setText(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.EditText[1]"]), Brand, 0)
Mobile.hideKeyboard()
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.Button' and (@text = 'Search' or . = 'Search') and @resource-id = 'com.emobile.mobileentry:id/search_button']"]), 0)
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.RelativeLayout[1]/android.widget.ListView[1]/android.widget.TextView[1]"]), 0)

// Model
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.Button' and (@text = 'SELECT' or . = 'SELECT') and @resource-id = 'com.emobile.mobileentry:id/model_button']"]), 0)
Mobile.setText(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.EditText[1]"]), Model, 0)
Mobile.hideKeyboard()
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.Button' and (@text = 'Search' or . = 'Search') and @resource-id = 'com.emobile.mobileentry:id/search_button']"]), 0)
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.RelativeLayout[1]/android.widget.ListView[1]/android.widget.TextView[1]"]), 0)

// Type
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.Button' and (@text = 'SELECT' or . = 'SELECT') and @resource-id = 'com.emobile.mobileentry:id/type_button']"]), 0)
Mobile.setText(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.EditText' and (@text = 'Type Name' or . = 'Type Name') and @resource-id = 'com.emobile.mobileentry:id/edtEkonomiCode']"]), Type, 0)
Mobile.hideKeyboard()
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.Button' and (@text = 'Search' or . = 'Search') and @resource-id = 'com.emobile.mobileentry:id/search_button']"]), 0)
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.RelativeLayout[1]/android.widget.ListView[1]/android.widget.TextView[1]"]), 0)
// Year
Mobile.setText(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.EditText' and (@text = 'Year' or . = 'Year') and @resource-id = 'com.emobile.mobileentry:id/edtYearCar']"]), '2020', 0)
Mobile.hideKeyboard()

// Personal
Mobile.scrollToText('Personal')
Mobile.setText(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.EditText' and (@text = 'Color' or . = 'Color') and @resource-id = 'com.emobile.mobileentry:id/edtColor']"]), Color, 0)
Mobile.hideKeyboard();
Mobile.setText(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.EditText' and (@text = 'Engine No' or . = 'Engine No') and @resource-id = 'com.emobile.mobileentry:id/edtEngineNo']"]), EngineNo, 0)
Mobile.hideKeyboard();
Mobile.setText(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.EditText' and (@text = 'Body No' or . = 'Body No') and @resource-id = 'com.emobile.mobileentry:id/edtBodyNo']"]), BodyNo, 0)
Mobile.hideKeyboard();

// Loan / Insurance Data
Mobile.scrollToText('Loan / Insurance Data')

// Sales Type
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.Spinner' and @resource-id = 'com.emobile.mobileentry:id/spinnerSalesType' and (@text = '' or . = '')]"]), 0)
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.TextView' and (@text = '(1) DIRECT SALES' or . = '(1) DIRECT SALES') and @resource-id = 'android:id/text1']"]), 0)

if(Membership=='Reguler') {
	Mobile.setText(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.EditText' and (@text = 'Lama Membership (tahun)' or . = 'Lama Membership (tahun)') and @resource-id = 'com.emobile.mobileentry:id/edtLamaMembership']"]), '5', 0)
	Mobile.hideKeyboard();
}

if(JenisDebitur=='Non Debitur') {
	
}

// Packet 2
Mobile.setText(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.EditText' and (@text = 'Packet 2' or . = 'Packet 2') and @resource-id = 'com.emobile.mobileentry:id/edtPacket2']"]), 'AC30', 0)
Mobile.hideKeyboard();

// OTR
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.EditText' and (@text = 'On The Road Price' or . = 'On The Road Price') and @resource-id = 'com.emobile.mobileentry:id/edtOtrPrice']"]), 0)
String OTR = OTR
for (int i = 0; i < OTR.length(); i++) {
	 char digit = OTR.charAt(i)
	 int keyCode = Character.getNumericValue(digit) + 7
	 driver.pressKeyCode(keyCode)
}
Mobile.hideKeyboard();

// Down Payment
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.EditText[3]"]), 0)
String DownPayment = DownPayment
for (int i = 0; i < DownPayment.length(); i++) {
	  char digit = DownPayment.charAt(i)
	  int keyCode = Character.getNumericValue(digit) + 7
	  driver.pressKeyCode(keyCode)
}
Mobile.hideKeyboard();

// Tenor
Mobile.setText(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.EditText' and (@text = 'Tenor' or . = 'Tenor') and @resource-id = 'com.emobile.mobileentry:id/edtTenor']"]), Tenor,  0)
Mobile.hideKeyboard();

Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.RadioButton' and (@text = 'In Advance' or . = 'In Advance') and @resource-id = 'com.emobile.mobileentry:id/chckAdv']"]), 0)

// Adm Fee
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.EditText' and (@text = 'Adm Fee' or . = 'Adm Fee') and @resource-id = 'com.emobile.mobileentry:id/edtAdmFee']"]), 0)
String AdmFee = AdmFee
for (int i = 0; i < AdmFee.length(); i++) {
	  char digit = AdmFee.charAt(i)
	  int keyCode = Character.getNumericValue(digit) + 7
	  driver.pressKeyCode(keyCode)
}
Mobile.hideKeyboard();

// ProvisionalFee
Mobile.scrollToText('Provisional Fee')
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.EditText' and (@text = 'Provisional Fee' or . = 'Provisional Fee') and @resource-id = 'com.emobile.mobileentry:id/edtProvisionalFee']"]), 0)
String ProvisionalFee = ProvisionalFee
for (int i = 0; i < ProvisionalFee.length(); i++) {
	   char digit = ProvisionalFee.charAt(i)
	   int keyCode = Character.getNumericValue(digit) + 7
	   driver.pressKeyCode(keyCode)
}
Mobile.hideKeyboard();

// Tujuan Kredit
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.RadioButton' and (@text = 'Modal Kerja' or . = 'Modal Kerja') and @resource-id = 'com.emobile.mobileentry:id/chckModalKerja']"]), 0)

// Asuransi
Mobile.scrollToText('Asuransi')
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.Spinner' and @resource-id = 'com.emobile.mobileentry:id/spinnerCarInsCorp' and (@text = '' or . = '')]"]), 0)
Mobile.scrollToText('NEW - UMUM BCA (BCAI)')
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.TextView' and (@text = 'NEW - UMUM BCA (BCAI)' or . = 'NEW - UMUM BCA (BCAI)') and @resource-id = 'android:id/text1']"]), 0)

Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.Spinner' and @resource-id = 'com.emobile.mobileentry:id/spinnerBranchCarIns' and (@text = '' or . = '')]"]), 0)
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.TextView' and (@text = '(NCSI013) TIPE 3 - W2 - KKB' or . = '(NCSI013) TIPE 3 - W2 - KKB') and @resource-id = 'android:id/text1']"]), 0)

// Insurance Type
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "(//*[@class = 'android.widget.Spinner' and (@text = '' or . = '')])[3]"]), 0)
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.TextView' and (@text = 'ALL RISK' or . = 'ALL RISK') and @resource-id = 'android:id/text1']"]), 0)

Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "(//*[@class = 'android.widget.Spinner' and (@text = '' or . = '')])[4]"]), 0)
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.TextView' and (@text = 'ALL RISK' or . = 'ALL RISK') and @resource-id = 'android:id/text1']"]), 0)
 
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "(//*[@class = 'android.widget.Spinner' and (@text = '' or . = '')])[5]"]), 0)
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.TextView' and (@text = 'ALL RISK' or . = 'ALL RISK') and @resource-id = 'android:id/text1']"]), 0)

Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "(//*[@class = 'android.widget.Spinner' and (@text = '' or . = '')])[6]"]), 0)
Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.TextView' and (@text = 'ALL RISK' or . = 'ALL RISK') and @resource-id = 'android:id/text1']"]), 0)

Mobile.tap(findTestObject('Object Repository/xpath', ['xpath' : "//*[@class = 'android.widget.RadioButton' and (@text = 'Prepaid' or . = 'Prepaid') and @resource-id = 'com.emobile.mobileentry:id/chckInsurancePaymentPrepaid']"]), 0)
