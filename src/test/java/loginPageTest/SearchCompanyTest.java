package loginPageTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.ticker.base.TestBase;
import com.qa.ticker.pages.SearchPage;
import com.qa.ticker.utils.CommonUtils;
import com.qa.ticker.utils.Utilities;

public class SearchCompanyTest extends TestBase {

	SearchPage LoginPageObj;
	CommonUtils utils;
	String error_message;
	String rating;
	
	public SearchCompanyTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initiate();
		LoginPageObj = new SearchPage();
		utils = new CommonUtils();
		error_message = "";
	}
	
		
	@DataProvider
	public Object[][] Ganpatitestdata() throws InvalidFormatException
	{
		Object[][] data = Utilities.getdata("Data");
		return data ;
	}
	
	//@Test(dataProvider = "Ganpatitestdata")	
	public void GanpatiMandal(String Name,String Number) throws InterruptedException 
	{
		System.out.println(Name.toString());
		System.out.println(Number.replace("E9", "").replace(".", ""));
		LoginPageObj.Name.sendKeys(Name);
		LoginPageObj.Mobile.sendKeys(Number.replace("E9", "").replace(".", ""));
		LoginPageObj.Jillha.sendKeys("Nagpur");
		LoginPageObj.Pincode.sendKeys("440025");
		LoginPageObj.Mandal_name.click();
		LoginPageObj.Submit_button.click();
		AssertJUnit.assertEquals(LoginPageObj.Formresponse.getText(), "प्रतियोगीता मे सहभाग लेने के लिये हम आपके आभारी है। धन्यवाद !");
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
		//@Test()
		public void IntrinsicValue() throws InterruptedException 
		{
			String[] Companies = {
					"Shree Rama Multi-Tech Ltd",
					"Maan Aluminium Ltd",
					"Sicagen India Ltd",
					"IVP Ltd"};
			
			for (String comp : Companies) 
			{
				LoginPageObj.SearchStock.clear();
				LoginPageObj.SearchStock.sendKeys(comp);
				System.out.println(comp);
			}
			
			
		}
	
	

	@Test()
	public void LoginToApplicationWithsqlinEmail() throws InterruptedException {

		String[] Companies = {
				"Blue Blends (India) Ltd",
				"DCM Ltd",
				"GAEKWAR MILLS Ltd",
				"FORBES & COMPANY Ltd",
				"KATARE SPINNING MILLS Ltd",
				"KESORAM INDUSTRIES Ltd",
				"VARDHMAN TEXTILES Ltd",
				"PENINSULA LAND Ltd",
				"The Phoenix Mills Ltd",
				"MARATHON NEXTGEN REALTY Ltd",
				"RAJA BAHADUR INTERNATIONAL Ltd",
				"RUBY MILLS Ltd",
				"SWAN ENERGY Ltd",
				"S.V.TRADING & AGENCIES Ltd",
				"SVARAJ TRADING & AGENCIES Ltd",
				"KSHITIZ INVESTMENT Ltd",
				"SHREE SALASAR INVESTMENT Ltd",
				"INDSOYA Ltd",
				"SW Investments Ltd",
				"UNIJOLLY INVESTMENTS CO.Ltd",
				"ELCID INVESTMENTS Ltd",
				"HEALTHY INVESTMENTS Ltd",
				"BANSWARA SYNTEX Ltd",
				"MODIPON Ltd",
				"SRF Ltd",
				"SIYARAM SILK MILLS Ltd",
				"SWADESHI POLYTEX Ltd",
				"SHREE MANUFACTURING CO.Ltd",
				"HIND SYNTEX Ltd",
				"SATYAM SILK MILLS Ltd",
				"BHARAT BIJLEE Ltd",
				"EMCO Ltd",
				"HIND RECTIFIERS Ltd",
				"INDO-NATIONAL Ltd",
				"ZENSAR TECHNOLOGIES Ltd",
				"JSL INDUSTRIES Ltd",
				"PANASONIC ENERGY INDIA COMPANY Ltd",
				"NELCO Ltd",
				"STANDARD BATTERIES Ltd",
				"UNIVERSAL CABLES Ltd",
				"W.S.INDUSTRIES (INDIA) Ltd",
				"DELTON CABLES Ltd",
				"DELTRON Ltd",
				"TUMUS ELECTRIC CORPORATION Ltd",
				"DELTA MAGNETS Ltd",
				"Ravindra Energy Ltd",
				"G.D.TRADING & AGENCIES Ltd",
				"MULTIPURPOSE TRADING & AGENCIES Ltd",
				"REMI SALES & ENGINEERING Ltd",
				"RIDHI SYNTHETICS Ltd",
				"ARDI INVESTMENT & TRADING Ltd",
				"SOFTBPO GLOBAL SERVICES Ltd",
				"Nyssa Corporation Ltd",
				"VINADITYA TRADING CO.Ltd",
				"AVTIL Enterprise Ltd",
				"Krishna Ventures Ltd",
				"GANESH HOLDINGS Ltd",
				"SARDA ENERGY & MINERALS Ltd",
				"BWL Ltd",
				"BOMBAY WIRE ROPES Ltd",
				"CHASE BRIGHT STEEL Ltd",
				"UNIVERSAL PRIME ALUMINIUM Ltd",
				"GALADA POWER & TELECOMMUNICATION Ltd",
				"INDIAN BRIGHT STEEL CO.Ltd",
				"INDIAN HUME PIPE CO.Ltd",
				"INDIAN LINK CHAIN MANUFACTURES Ltd",
				"KAIRA CAN CO.Ltd",
				"ORIENT ABRASIVES Ltd",
				"NATIONAL STANDARD (INDIA) Ltd",
				"RATHI STEEL & POWER Ltd",
				"STEWARTS & LLOYDS OF INDIA Ltd",
				"TINPLATE COMPANY OF INDIA Ltd",
				"TI Financial Holdings Ltd",
				"WESTERN MINISTIL Ltd",
				"AUTOMOTIVE AXLES Ltd",
				"ATLAS CYCLES (HARYANA) Ltd",
				"SETCO AUTOMOTIVE Ltd",
				"SCOOTERS INDIA Ltd",
				"TALBROS AUTOMOTIVE COMPONENTS Ltd",
				"Z.F.STEERING GEAR (INDIA) Ltd",
				"SML ISUZU Ltd",
				"TIL Ltd",
				"EICHER MOTORS Ltd",
				"JAINEX AAMCOL Ltd",
				"CIMMCO Ltd",
				"Veljan Denison Ltd",
				"DYNAMATIC TECHNOLOGIES Ltd",
				"G.G.DANDEKAR MACHINE WORKS Ltd",
				"KIRLOSKAR PNEUMATIC CO.Ltd",
				"Tulive Developers Ltd",
				"KULKARNI POWER & TOOLS Ltd",
				"LAKSHMI AUTOMATIC LOOM WORKS Ltd",
				"MANUGRAPH INDIA Ltd",
				"Mirch Technologies (India) Ltd",
				"NESCO Ltd",
				"REVATHI EQUIPMENT Ltd",
				"TEXMACO INFRASTRUCTURE & HOLDINGS Ltd",
				"WENDT (INDIA) Ltd",
				"PS IT Infrastructure & Services Ltd",
				"SINDU VALLEY TECHNOLOGIES Ltd",
				"Axon Ventures Ltd",
				"RESPONSIVE INDUSTRIES Ltd",
				"SHYAMKAMAL INVESTMENTS Ltd",
				"HEM HOLDINGS & TRADING Ltd",
				"DOLAT INVESTMENTS Ltd",
				"SHYAMAL HOLDINGS & TRADING Ltd",
				"WESTLIFE DEVELOPMENT Ltd",
				"ZEE ENTERTAINMENT ENTERPRISES Ltd",
				"IMC FINANCE Ltd",
				"W W TECHNOLOGY HOLDINGS Ltd",
				"KOVALAM INVESTMENT & TRADING CO.Ltd",
				"MULTIPLUS HOLDINGS Ltd",
				"SKYLINE MILLARS Ltd",
				"REMI PROCESS PLANT & MACHINERY Ltd",
				"TAPARIA TOOLS Ltd",
				"BHARAT GEARS Ltd",
				"ELECON ENGINEERING CO.Ltd",
				"DECCAN BEARINGS Ltd",
				"GRAUER & WEIL (INDIA) Ltd",
				"GABRIEL INDIA Ltd",
				"HERCULES HOISTS Ltd",
				"IFB INDUSTRIES Ltd",
				"FEDERAL-MOGUL GOETZE (INDIA) Ltd",
				"Schaeffler India Ltd",
				"MIPCO SEAMLESS RINGS (GUJARAT) Ltd",
				"RANE HOLDINGS Ltd",
				"ROLCON ENGINEERING CO.Ltd",
				"REIL ELECTRICALS INDIA Ltd",
				"TRF Ltd",
				"KENNAMETAL INDIA Ltd",
				"HINDUSTAN HARDY SPICER Ltd",
				"JRI Industries & Infrastructure Ltd",
				"PRAKASH INDUSTRIES Ltd",
				"HARIYANA METALS Ltd",
				"PRABHU STEEL INDUSTRIES Ltd",
				"Arshiya Ltd",
				"GRINDWELL NORTON Ltd",
				"LAKSHMI PRECISION SCREWS Ltd",
				"ANUP MALLEABLE Ltd",
				"PRECIOUS TRADING & INVESTMENTS Ltd",
				"GENESYS INTERNATIONAL CORPORATION Ltd",
				"ALNA TRADING & EXPORTS Ltd",
				"INTELLIVATE CAPITAL VENTURES Ltd",
				"VISAGAR POLYTEX Ltd",
				"ISHWARSHAKTI HOLDINGS & TRADERS Ltd",
				"TERRAFORM MAGNUM Ltd",
				"APIS INDIA Ltd",
				"KHATAU EXIM Ltd",
				"SHREE OM TRADES Ltd",
				 
				"SARVAMANGAL MERCANTILE CO.Ltd",
				"Arihant Superstructures Ltd",
				"VIKSIT ENGINEERING Ltd",
				"BLISS GVS PHARMA Ltd",
				"INEOS Styrolution India Ltd",
				"ALEMBIC Ltd",
				"BAYER CROPSCIENCE Ltd",
				"Sashwat Technocrats Ltd",
				"CHEMO PHARMA LABORATORIES Ltd",
				"CLARIANT CHEMICALS (INDIA) Ltd",
				"COROMANDEL INTERNATIONAL Ltd",
				"DEEPAK NITRITE Ltd",
				"DIL Ltd",
				"GOCL Corporation Ltd",
				"KANORIA CHEMICALS & INDUSTRIES Ltd",
				"KELTECH ENERGIES Ltd",
				"M.P.AGRO INDUSTRIES Ltd",
				"ORIENTAL CARBON & CHEMICALS Ltd",
				"PHILLIPS CARBON BLACK Ltd",
				"PUNJAB CHEMICALS AND CROP PROTECTION Ltd",
				"GUJCHEM DISTILLERS INDIA Ltd",
				"SUDARSHAN CHEMICAL INDUSTRIES Ltd",
				"UNICHEM LABORATORIES Ltd",
				"Zandu Realty Ltd",
				"ALKYL AMINES CHEMICALS Ltd",
				"ASTRAZENECA PHARMA INDIA Ltd",
				"PUNJAB ALKALIES & CHEMICALS Ltd",
				"TANFAC INDUSTRIES Ltd",
				"GUJARAT PETROSYNTHESE Ltd",
				"MASTER CHEMICALS Ltd",
				"CONTINENTAL CHEMICALS Ltd",
				"J.B.CHEMICALS & PHARMACEUTICALS Ltd",
				"INDO GULF INDUSTRIES Ltd",
				"ADVANCE PETROCHEMICALS Ltd",
				"RAJASTHAN PETRO SYNTHETICS Ltd",
				"JAGATJIT INDUSTRIES Ltd",
				"KESAR ENTERPRISES Ltd",
				"TILAKNAGAR INDUSTRIES Ltd",
				"Emerald Leisures Ltd",
				"SAKTHI SUGARS Ltd",
				"WALCHANDNAGAR INDUSTRIES Ltd",
				"KHODAY INDIA Ltd",
				"IFB AGRO INDUSTRIES Ltd",
				"DHARANI SUGARS & CHEMICALS Ltd",
				"THIRU AROORAN SUGARS Ltd",
				"CAPROLACTAM CHEMICALS Ltd",
				"G.M.BREWERIES Ltd",
				"RANA SUGARS Ltd",
				"GIRDHARILAL SUGAR & ALLIED INDUSTRIES Ltd",
				"SOM DISTILLERIES & BREWERIES Ltd",
				"C.J.GELATINE PRODUCTS Ltd",
				"AMRIT CORP.Ltd",
				"COROMANDEL AGRO PRODUCTS & OILS Ltd",
				"IVP Ltd",
				"OLYMPIC OIL INDUSTRIES Ltd",
				"POLSON Ltd",
				"Ratnamani Agro Industries Ltd",
				"SAGAR SOYA PRODUCTS Ltd",
				"WIPRO Ltd",
				"DHANUKA AGRITECH Ltd",
				"TTK HEALTHCARE Ltd",
				"LIME CHEMICALS Ltd",
				"TAINWALA CHEMICALS & PLASTICS (INDIA) Ltd",
				"JAGSONPAL PHARMACEUTICALS Ltd",
				"KHAITAN CHEMICALS & FERTILIZERS Ltd",
				"UNITED LEASING & INDUSTRIES Ltd",
				"GILLETTE INDIA Ltd",
				"ANSAL HOUSING & CONSTRUCTION Ltd",
				"MAC CHARLES (INDIA) Ltd",
				"ASHNOOR TEXTILE MILLS Ltd",
				"UNITECH Ltd",
				"V.I.P.INDUSTRIES Ltd",
				"DHRUV ESTATES Ltd",
				"EAST BUILDTECH Ltd",
				"MANIPAL FINANCE CORPORATION Ltd",
				"KIDUJA INDIA Ltd",
				"KEY CORP Ltd",
				"SHIKHAR LEASING & TRADING Ltd",
				"PARAMOUNT COSMETICS (INDIA) Ltd",
				"JUPITER INDUSTRIES & LEASING Ltd",
				"HAWKINS COOKERS Ltd",
				"WARREN TEA Ltd",
				"COCHIN MALABAR ESTATES & INDUSTRIES Ltd",
				"BEST EASTERN HOTELS Ltd",
				"NEELAMALAI AGRO INDUSTRIES Ltd",
				"IST Ltd",
				"COSMO FILMS Ltd",
				"NEW MARKETS ADVISORY Ltd",
				"APOLLO HOSPITALS ENTERPRISE Ltd",
				"Nitin Castings Ltd",
				"ZENITH CAPITALS Ltd",
				"EVEREST INDUSTRIES Ltd",
				"Joy Realty Ltd",
				"AYM Syntex Ltd",
				"Finkurve Financial Services Ltd",
				"HB LEASING & FINANCE CO.Ltd",
				"SHRICON INDUSTRIES Ltd",
				"Frontier Capital Ltd",
				"Navneet Education Ltd",
				"KEDIA CONSTRUCTION CO.Ltd",
				"TRANSOCEANIC PROPERTIES Ltd",
				"AuSom Enterprise Ltd",
				"RUCHI INFRASTRUCTURE Ltd",
				"VJTF EDUSERVICES Ltd",
				"LEENA CONSULTANCY Ltd",
				"INDIAN INFOTECH & SOFTWARE Ltd",
				"VISAKA INDUSTRIES Ltd",
				"HATHWAY BHAWANI CABLETEL & DATACOM Ltd",
				"Pressman Advertising Ltd",
				"GUFIC BIOSCIENCES Ltd",
				"PHOTON CAPITAL ADVISORS Ltd",
				"OSWAL LEASING Ltd",
				"GRP Ltd",
				"MM RUBBER COMPANY Ltd",
				"PTL ENTERPRISES Ltd",
				"TVS SRICHAKRA Ltd",
				"BENARES HOTELS Ltd",
				"BHAGWATI OXYGEN Ltd",
				"BOMBAY OXYGEN CORPORATION Ltd",
				"BERGER PAINTS INDIA Ltd",
				"GRAPHITE INDIA Ltd",
				"ITD CEMENTATION INDIA Ltd",
				"EMPIRE INDUSTRIES Ltd",
				"GAMMON INDIA Ltd",
				"GARWARE-WALL ROPES Ltd",
				"GARWARE MARINE INDUSTRIES Ltd",
				"GOA CARBON Ltd",
				"HINDUSTAN DORR-OLIVER Ltd",
				"HEG Ltd",
				"HINDUSTAN COMPOSITES Ltd",
				"HINDUSTAN HOUSING CO.Ltd",
				"HIL Ltd",
				"INDIAN CARD CLOTHING CO.Ltd",
				"JAY SHREE TEA & INDUSTRIES Ltd",
				"OSEASPRE CONSULTANTS Ltd",
				"Huhtamaki PPL Ltd",
				"R.J.SHAH & CO.Ltd",
				"SHAH CONSTRUCTION CO.Ltd",
				"SHALIMAR PAINTS Ltd",
				"SINNAR BIDI UDYOG Ltd",
				"SOUTHERN GAS Ltd",
				"TECHNOJET CONSULTANTS Ltd",
				"SUPREME INDUSTRIES Ltd",
				"THACKER & CO.Ltd",
				"TRADE WINGS Ltd",
				"VST INDUSTRIES Ltd",
				"MADHUSUDAN SECURITIES Ltd",
				"YAMINI INVESTMENTS COMPANY Ltd",
				"MILGRAY FINANCE & INVESTMENT Ltd",
				"SUBWAY FINANCE & INVESTMENT CO.Ltd",
				"JINDAL DRILLING & INDUSTRIES Ltd",
				"KUSAM ELECTRICAL INDUSTRIES Ltd",
				"JUMBO FINANCE Ltd",
				"DEWAN HOUSING FINANCE CORPORATION Ltd",
				"WEIZMANN FINCORP Ltd",
				"TIVOLI CONSTRUCTION Ltd",
				"FIRST CUSTODIAN FUND (INDIA) Ltd",
				"KOTHARI WORLD FINANCE Ltd",
				"BAJRANG FINANCE Ltd",
				"WALL STREET FINANCE Ltd",
				"REMI SECURITIES Ltd",
				"Anjani Foods Ltd",
				"HIMALCHULI FOOD PRODUCTS Ltd",
				"PARSHWANATH CORPORATION Ltd",
				"SURYAKRIPA FINANCE Ltd",
				"CAN FIN HOMES Ltd",
				"MUNOTH CAPITAL MARKET Ltd",
				"IL&FS INVESTMENT MANAGERS Ltd",
				"SHRIRAM TRANSPORT FINANCE CO.Ltd",
				"Cholamandalam Investment and Finance Company Ltd",
				"SAGAR SYSTECH Ltd",
				"GRUH FINANCE Ltd",
				"VLS FINANCE Ltd",
				"MEGLON INFRA-REAL (INDIA) Ltd",
				"MEHTA INTEGRATED FINANCE Ltd",
				"VIDEOCON INDUSTRIES Ltd",
				"INTER GLOBE FINANCE Ltd",
				"CREST VENTURES Ltd",
				"Vakrangee Ltd",
				"GUJARAT CREDIT CORPORATION Ltd",
				"DHARANI FINANCE Ltd",
				"INDBANK MERCHANT BANKING SERVICES Ltd",
				"VCK CAPITAL MARKET SERVICES Ltd",
				"CAPITAL TRUST Ltd",
				"USHAKIRAN FINANCE Ltd",
				"VIVO BIO TECH Ltd",
				"Supra Trends Ltd",
				"MORARKA FINANCE Ltd",
				"PRO FIN CAPITAL SERVICES Ltd",
				"TIMES GUARANTY Ltd",
				"SOM DATT FINANCE CORPORATION Ltd",
				"SAVANI FINANCIALS Ltd",
				"PALSOFT INFOSYSTEMS Ltd",
				"DCM FINANCIAL SERVICES Ltd",
				"SAMBHAAV MEDIA Ltd",
				"WISEC GLOBAL Ltd",
				"BGIL FILMS & TECHNOLOGIES Ltd",
				"Scan Steels Ltd",
				"GIC HOUSING FINANCE Ltd",
				"MATHEW EASOW RESEARCH SECURITIES Ltd",
				"STANDARD CAPITAL MARKETS Ltd",
				"VIPUL Ltd",
				"PASUPATI FINCAP Ltd",
				"USHDEV INTERNATIONAL Ltd",
				"MEHTA SECURITIES Ltd",
				"MEHTA HOUSING FINANCE Ltd",
				"MANSI FINANCE (CHENNAI) Ltd",
				"Seven Hill Industries Ltd",
				"UPASANA FINANCE Ltd",
				"MUTHOOT CAPITAL SERVICES Ltd",
				"AMANI TRADING & EXPORTS Ltd",
				"TEA TIME Ltd",
				"SOBHAGYA MERCHANTILE Ltd",
				"WINRO COMMERCIAL (INDIA) Ltd",
				"INERTIA STEEL Ltd",
				"PH TRADING Ltd",
				"KAPIL COTEX Ltd",
				"AASWA TRADING & EXPORTS Ltd",
				"SANMITRA COMMERCIAL Ltd",
				"AYOKI MERCANTILE Ltd",
				"VISHVPRABHA TRADING Ltd",
				"MRUGESH TRADING Ltd",
				"UPL Ltd",
				"ANSHUNI COMMERCIALS Ltd",
				"CRANES SOFTWARE INTERNATIONAL Ltd",
				"PUNIT COMMERCIALS Ltd",
				"TRIOCHEM PRODUCTS Ltd",
				"NIDHI GRANITES Ltd",
				"TWIN ROSES TRADES & AGENCIES Ltd",
				"Signet Industries Ltd",
				"SPECULAR MARKETING & FINANCING Ltd",
				"Terraform Realstate Ltd",
				"8K MILES SOFTWARE SERVICES Ltd",
				"ABans Enterprises Ltd",
				"MATRA REALTY Ltd",
				"CAPRICORN SYSTEMS GLOBAL SOLUTIONS Ltd",
				"VAMA INDUSTRIES Ltd",
				"SUNTECK REALTY Ltd",
				"BENTLEY COMMERCIAL ENTERPRISES Ltd",
				"SILVER OAK COMMERCIAL Ltd",
				"CLASSIC ELECTRICALS Ltd",
				"VORA CONSTRUCTIONS Ltd",
				"VERITAS (INDIA) Ltd",
				"JAYBHARAT TEXTILES & REAL ESTATE Ltd",
				"JAI CORP Ltd",
				"NIVI TRADING Ltd",
				"BAJAJ GLOBAL Ltd",
				"TASHI INDIA Ltd",
				"AUTORIDERS INTERNATIONAL Ltd",
				"N2N Technologies Ltd"
				};

		
		for (String comp : Companies) {

			LoginPageObj.SearchForCompany(comp);
			Thread.sleep(3000);
			try {
				if (LoginPageObj.Search_result.isDisplayed()) {
					LoginPageObj.Search_result.click();
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			try {
			if (LoginPageObj.No_companyfound.isDisplayed()){
					System.out.println(comp + " not found");
					LoginPageObj.Searchbar.clear();	
					continue;
				}
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			try {
				if (LoginPageObj.Finstar_Rating.isDisplayed()){
					rating = LoginPageObj.Finstar_Rating.getAttribute("aria-label");
					}
					
				} catch (Exception e) {
					continue;
				}
			
			String value = LoginPageObj.ValuationOfStock.getAttribute("aria-label");
			String Owner = LoginPageObj.OwnerShip.getAttribute("aria-label");
			String Effcient = LoginPageObj.Efficiency.getAttribute("aria-label");
			String finance = LoginPageObj.Finantials.getAttribute("aria-label");

			int Finstar_Rating = Integer.parseInt(String.valueOf(rating.charAt(20)));
			int Valuation = Integer.parseInt(String.valueOf(value.charAt(20)));
			int OwnerShip = Integer.parseInt(String.valueOf(Owner.charAt(20)));
			int Efficiency = Integer.parseInt(String.valueOf(Effcient.charAt(20)));
			int Finantials = Integer.parseInt(String.valueOf(finance.charAt(20)));

			/*
			 * System.out .println(Finstar_Rating + " " + Valuation + " " + OwnerShip + " "
			 * + Efficiency + " " + Finantials);
			 */
			System.out.println(comp + "--------------------------------------");
			
			if (Finstar_Rating > 4) {
				System.out.println(comp + " current price " + LoginPageObj.CurrentPrice.getText() + " has " + Finstar_Rating + " " + Valuation + " " + OwnerShip + " "
						+ Efficiency + " " + Finantials);
				continue;
			}
			
			if (Finstar_Rating >= 4) {
				if (Valuation >= 3 && Finantials >=3) {
					System.out.println(comp + " current price " + LoginPageObj.CurrentPrice.getText() + " has " + Finstar_Rating + " " + Valuation + " " + OwnerShip + " "
							+ Efficiency + " " + Finantials);
				}
			}
			
			Thread.sleep(3000);
		}

	}

	
	
	

}
