import java.util.ArrayList;
import java.util.List;

public class Solution {
	int[] visit;

	public List<Integer> findSubstring(String s, String[] words) {
		List<Integer> list = new ArrayList<Integer>();
		int length = words[0].length();
		visit = new int[words.length];
		String subString;

		if (words.length == 0)
			return list;
		for (int i = 0; i < s.length() - length; i++) {
			for (int k = 0; k < visit.length; k++)
				visit[k] = 0;
			int k = i;
			while (k < s.length()) {
				if (k + length >= s.length())
					break;
				subString = s.substring(k, k + length);
				if (contains(words, subString))
					k = k + length;
				else
					break;
				}
			if (visitAll()) {
				list.add(i);
			}

		}
		return list;
	}

	private boolean visitAll() {
		// TODO Auto-generated method stub
		for (int i = 0; i < visit.length; i++)
			if (visit[i] == 0)
				return false;
		return true;
	}

	private boolean contains(String[] words, String subString) {
		// TODO Auto-generated method stub
		for (int i = 0; i < words.length; i++)
			if (words[i].equals(subString)) {
				visit[i] = 1;
				return true;
			}

		return false;
	}

	public static void main(String[] args) {
		String s = "aratdgpfsookqyxiptwjllwirwmfdmafdayignqadektejbvcaepnbyezmlcalkfnkovaeydkixqsalwaqmptmwsajwaxifktvitbgwlqvdiwphyhtochmwhvujsdofymptnvpzlnewjtfhcaxghjeqhzzzepgebvxpqoqebuckqhuuhtbqdfgmghlmwuqypppiefofbqsrzooihpymwgyfnmrlgkjxzaffftnjlfamvoucfurecpjpdcblomjqnovukidvpgikwepebgidxttdxwomkzczqxuaizxxhfkembinjsqglllijcwubytryptgrrfyypekqmxzeqirbvclxyhbxcuxuodlfilfaqqsepulfecjzgwzfdaehubbkeorocxqunjycflkjqtkwpjbsjfbggdqmtibvhtpucqyjbisrbfosopmaxogdryqmitkpmzlrrkatuvmyaaqosdqpryukxkwhfgzuiklzwnurkhpkjfbbirsbqnlpzkyfsxbcimeebyxmhmyruzsctlglytaxfyeyyfcgtgmxfkjowjfqjyveldplwricppcnwevsnkpuuaisjoluoiyzlnkjeulwlpliujahtrdntlhczsxncxonlyxrvkngabowkqffjiuctbhvweiybxmoxlisvvzxyptkiyprijwcndxjjhhmgvbeijwegvdhnxrvxjoiskmfnloysylzvmfexbifznmmmgjkpxujkgpzrfyjfjkbxpfwtpbscqgpwrbnovwadlautyfahqbehiccxdwctcrrvuekrbkuokojktkrlnxvwzxtfuvayosuiygzzstqfjzpfljszinvilqphopfejzpihqjamzfvbuamftloiiyvbncrekvolkytbhtnjakkulwagkqquomvbomhykvkuvdxdykoyvyuiwwqgmgdasydjnlhxitreyrjwbxwyxritnacahfcbdgksrupzpjfoaomdnjekamepngpwlsxqakjrgasvjyjlowpcftohhuwwaounisgiepbkpthbtrmipbmuwcdgxzczpxnxrthxkijbeqcxhphysvuryxzxzbwoalmtgvsqedsiuwhdlrcgmwzmuyjvbijetxzatsszvmjrjqvwhzeuvdirbumdcyhxvizqaspygyprrmoyluuhyfabzpgbnpykyadasuyavosmaimocjxcoxgnooqdeqqeqtekpflktfyvnllruiwigexwsnaydqcwljgaotljyjgnwshsafaijzfdmfcsvgogruifovqohxcdrjwroyazyfcmmgejpsrgnzodvercdtfuedoueotcvyqhgvsvnjeciuhfazheupabuovycrczptixoatdlziutpbtqjzlaamuojvtaxsrsdpidkmplulejmzcxznzbbupkrinqdgjgvrlhdcsznylcynbzcbadxppoaeedlplihwqmzkoojbqjouksvkvubmidtoiegtonqgbrrrfcsynisxanjxhkmrqfhylnszckigbbxgdqeqawpblyyukmlarvzcitelfmtgnqosivkjtzmfxmzjznkqilvsgzflnytcpjwzegkyfwfejgnivzadkvyswdflcyptilsmrdmybrckasuvrxzeszyrceeecuxmfsbxxnvyhalhuhcnedrzcsqfwulyqlnwdovcbsaksnrmvwczztyelqljnwkdhxzmlwooprzheqwzoyzotzuhsfqfbailzkzkgobxfaflsdlhdmxylrhdwykzavkchkmpannhpuskxdrcrocfhkkdkvemqrozddodsbmivesuklybbbgintnxorjgiafldvqxxcfujzptmnwnqfxdymcoemwoobcrwuovxwqgxfbmuzznezselvsrhoivrmoqgeldcdlakomfonuuomzahttqkdndpdvwihzkknmxbaeroymcmneuiamudaytftpncqapdmmhnqadomhcbmwkmlgrneksazicqitvwfelxfontyqvkohyznrmuchubpytxsrvzvhxaxmuvcrhryhsnzfhbmdedcacwrxxmeupejjzlcjeaqxprexssazvezxaquyebuthdegrgrviisybwxuozvleuiemfeqizmpeqxvzprjzljakguagrmmlwszdxqlyeacuyavnrfmeomqxjrfcfrqbjpfihsgltlitldiekwibkzavsfyxyoajdhsnaayvliqyoycyunbgobcggcfgqhqvpkirkjmytcwhcbiyojeelimtkracysypcigotuopynwaoeyeqfibnuwynwcnqcdsnljggxxemuhaafgskovaksyzqcnhfsbsdkalkyswuzzugfnrwiricritvvaandssoveatwynxxjdfywbjpllitgeoiedmzwcwccpyaexapafqzizotmxntddbjhnifrghtxhwdewtgblfjkwcyvrravvjeiujaasvyzrbfnwlqhtbrrgqoxjouexyprjrsdmscgtjvqxoxsprjvjzvunpzkqqebhyfvqjdjtzbspbkeuvcduxxhoytgoxkvvptnawxvxanmbzrvuvaouavkyprpobkmsfzucyqzzfoafhyzcaoyalizczorcafuiepkdhlcmberietmfhkhutgxuwqxzvthbktergieipxqvqfazpiuiqrdphcqevzfgsmzaudildbhtgjvvtpgmglbpptvksasmosmlxvwawfweprbkghwouzfjsawmcqyrilcggaieggkxzlhhvgvrfcbaczmhpnayyeggeqmkzwjyjrgezdwegzgkytrpgtpgxxmcoaopwynhrtmqzkwfjdrjylageqocncgdcusaughnbtfcfchqhbbhmcpssduhfaljxdjtlqhpmmrrqbkzcliqnxihcfpjhcsehdatwhkivbboennizwyovjwyonhvpccyfctbldlghpulckwdgusbfobtdlruntsuvmyiplowalkfvgibcaeiqgdvrupgnickwasnmjkouwvpegsgiwqbeuwxoofeyiquijhwutnorkfvqxezvuaaoyzfmfjknzgxkowgjlubvzwoycnuxpwnnvsccdorfvprlnyuyuvvuujswyovpkjdidhkjveoqvfbifyiatfuproopflfpukzarmjmqxfleivkgdkckgrbwhtbtytpkspdeyruxwhefcqlhcnsihvgookjodzyxodcpvyorisykimukboukjdbankosjppastpnufhcyhoivivxwphisiihvwzenregkvvebcgbmxlhfggewomqywatsbagsgodcjjfosiaptjwcqaagoseksafuanoibrmmdtavbcmxmizcjzizrokmqrgseubhontrhwokyahmiiqthyvbpfnfwvycrzjhmeyvaogboppzyguhgpkvwxbuuzwmahtomukoksrbhhafnwptozpkzshttdhtndhzztpjlhkvomadlrwzrnlsfsnayxtladmbybkmixhyjjbwbavunjmvbzvbwrmywyzwcmikjplszmrammwcvizzjwagpngnngkpsscbinvjbmjqbfsyptxyraghpnueveupxyshlpqoebehiyfxtfxlfeswtoaqtwhsuzzhqrwuscbabjxuqwfxaztvotnjqubmtcuktsgnuknxvmulkbilbbirwwaoqdbmhxycrgpnqellshycigpjjycgwcumhxaowysnfhbxnolhvjkdqbpzbthxycmfbmwynonsyqpleatbmfhcgydkrlhpnvxqktoxjerhugvzjqcvxjzfhcpbnzqcupteijdunudkdyjmqnjnxkvgmkhcjaegpzmalquakxknyvbojmeiwzollynvytdpvrpghlgulthjolzxxdfwewhquwnupslmjbsroblzuuikhkkfnrbunkmjgzfxrrkcuctifgibdqmkcwrsnumdeyokzukqlushyopgwxhzqtmsrdkhyykewyrvubnhxiovwebudjwveioynafnzrsxrltmmitjqkgooiltthpzrdzefeuexocpzxbnhwyageowozqjihjzmigrpaymqcdpzgcidailgxkvyaejjpivaqmpskdimhznnbwsdegmdqheqnnzfxwfqiwivbthksxawvsbbynhowlgmahrzdypouajvtsilpihkajobwvrviyhihyjnwbbsbmpuexhufpgiaujyratzachkctzauasvmkrsjaoprxzrrislklknqszsnythaneoxxghxvypsxilhawtohiebhyqhrxhhdvgaepzbnqvmzgtbfppoxvrfuhongwujtblxqmygdtsecofjdxxasqhoxwcfuyqnbbnuplashuyjiesnbrqvhzkgxmlrmbhoeuithiooeoznstcvmsttsdbrrojdrsrvmbrtlhkqvlfqfhnrcgnulqlcfwiwobucdnyowketvjlctzuvhjrtzexedfdrhzwkmuakghdbsrelsaibjzukeuphzuaityuhuvtaeyewpiihkqjtsfdybufbqhlliiucdndjmhfdrpnbgwwadzyfwfimovawduziierwlxzemmfukbuocsvyzfnoankejjmrnepadpepdjkomgepbzpageogtzkdizwydmyiddxgojubqystzhtfmiofhykrzhpevomytkehvbknbcgdmakyiyfrzsiybadwqpwjzcsxdfkhhrkvtuvbtdssvcqwcvuslqdmsyjydufmnrigldjggdadftzkotezlimeixeltjxgahonlxwtcwxkpyuguaffktlsrpdmydtakjqxjmtliqxaqrgkunqejbxctcorhjustkrewkpgcngtgodcevhpzgrskhlsrfmmrdqpqhwswelfvrhzoqonyhhjotbhaptusljivfbrmoyhhigwywlxdtirojzoyuisiuddbgwnuxwefccdapcdkkxyvyptszoctrfvxektbhzilblororbyqcworpjqflmwtjvztpacqkqsvellvommqiajzlafxodqxbpqsrviblaypnkmeyyugbehmgolwsbtvslnjgvkrylinvvrvvmbwsilazwwraroscbejyqcwblkygdtbrualfnleljxlclgfokqmaslefxclawpssrdzerdrccffplkdxaszuddaainaeeswvywbpbvtgayvnkbkmtlhwrjyzyyddtbatzcidxbjzcgmmjyzejicarabpbeuuivphxxkwavvcejrnhqusawvrxwiyddulyjuxifvkcspgbgwkyqeamzrlyblbghogsifapansscavkwfkokkdldojgcmnjavclbeabrswvvrhtzrildlwgbindwcpzxrkyvkcpfykarutslbdpocxskkxgomfmfrmbcoshmehgyaymecbueamqlmybygnexahzobidfplgsjsynvstvhlitkktszzpzirqjbvptgxlrplhkfahmoqhaadszcjblctweonxwkkpzxwlcztrnjynldhmiqnvvgrzwfyurkkthgejhzawkbjxeskolxjggbheihzzrjsarzjbymxlpjivbskostuaudeckfedowdivplwbihqtpnxixlcricllgqymubcsfmowxkzirrbieaqcmstuwgffwdrshvlokbkjnjtgaxogxhijbbfyildgqwbzrondpznckiimfytdfbmhfsfpfkvxgyxzmmddosfyaplgqelvhzemtjbatzybxxbmlgpzyxyaoliertcytgnosoplppppmqbzwszwpzygmhkdcmdxtqmlhbywqpnefqddjebadagpjtulhyjaovnxyowodjulaxolcsnhsuzbptowtxziuohscdiinctpcjagbnnvjoyaknxdkynfmvzryiznmscodewfumafazgmodsydhfpcfgdpfsdzxudbqkvcmbdnjrbmjarrhgvonafut";
		String[] words = { "vkyprpobkmsfzucyqzzfoafhyzca",
				"gdvrupgnickwasnmjkouwvpegsgi", "jzukeuphzuaityuhuvtaeyewpiih",
				"syzqcnhfsbsdkalkyswuzzugfnrw", "kygdtbrualfnleljxlclgfokqmas",
				"pqoqebuckqhuuhtbqdfgmghlmwuq", "ycrgpnqellshycigpjjycgwcumhx",
				"vgogruifovqohxcdrjwroyazyfcm", "lefxclawpssrdzerdrccffplkdxa",
				"vyqhgvsvnjeciuhfazheupabuovy", "fexbifznmmmgjkpxujkgpzrfyjfj",
				"qthyvbpfnfwvycrzjhmeyvaogbop", "rvvmbwsilazwwraroscbejyqcwbl",
				"jzlafxodqxbpqsrviblaypnkmeyy", "vrhzoqonyhhjotbhaptusljivfbr",
				"trfvxektbhzilblororbyqcworpj", "sybwxuozvleuiemfeqizmpeqxvzp",
				"bxgdqeqawpblyyukmlarvzcitelf", "tjxgahonlxwtcwxkpyuguaffktls",
				"ebhyfvqjdjtzbspbkeuvcduxxhoy", "rplhkfahmoqhaadszcjblctweonx",
				"obxfaflsdlhdmxylrhdwykzavkch", "hykrzhpevomytkehvbknbcgdmaky",
				"tuvbtdssvcqwcvuslqdmsyjydufm", "bkmtlhwrjyzyyddtbatzcidxbjzc",
				"nrigldjggdadftzkotezlimeixel", "tjqkgooiltthpzrdzefeuexocpzx",
				"astpnufhcyhoivivxwphisiihvwz", "plashuyjiesnbrqvhzkgxmlrmbho",
				"ieaqcmstuwgffwdrshvlokbkjnjt", "dewtgblfjkwcyvrravvjeiujaasv",
				"hzeuvdirbumdcyhxvizqaspygypr", "bbupkrinqdgjgvrlhdcsznylcynb",
				"mwzmuyjvbijetxzatsszvmjrjqvw", "lsxqakjrgasvjyjlowpcftohhuww",
				"datwhkivbboennizwyovjwyonhvp", "stuaudeckfedowdivplwbihqtpnx",
				"chkctzauasvmkrsjaoprxzrrislk", "sypcigotuopynwaoeyeqfibnuwyn",
				"izwydmyiddxgojubqystzhtfmiof", "rsrvmbrtlhkqvlfqfhnrcgnulqlc",
				"tmfhkhutgxuwqxzvthbktergieip", "kmpannhpuskxdrcrocfhkkdkvemq",
				"pvyorisykimukboukjdbankosjpp", "fahqbehiccxdwctcrrvuekrbkuok",
				"nuuomzahttqkdndpdvwihzkknmxb", "agpngnngkpsscbinvjbmjqbfsypt",
				"zcbadxppoaeedlplihwqmzkoojbq", "bgwnuxwefccdapcdkkxyvyptszoc",
				"xzeszyrceeecuxmfsbxxnvyhalhu", "evhpzgrskhlsrfmmrdqpqhwswelf",
				"euithiooeoznstcvmsttsdbrrojd", "ibdqmkcwrsnumdeyokzukqlushyo",
				"babjxuqwfxaztvotnjqubmtcukts", "kqjtsfdybufbqhlliiucdndjmhfd",
				"csynisxanjxhkmrqfhylnszckigb", "dtsecofjdxxasqhoxwcfuyqnbbnu",
				"owkqffjiuctbhvweiybxmoxlisvv", "kbxpfwtpbscqgpwrbnovwadlauty",
				"nepadpepdjkomgepbzpageogtzkd", "mmhnqadomhcbmwkmlgrneksazicq",
				"rjgiafldvqxxcfujzptmnwnqfxdy", "tgoxkvvptnawxvxanmbzrvuvaoua",
				"oyalizczorcafuiepkdhlcmberie", "wcnqcdsnljggxxemuhaafgskovak",
				"tfcfchqhbbhmcpssduhfaljxdjtl", "gdryqmitkpmzlrrkatuvmyaaqosd",
				"zmhpnayyeggeqmkzwjyjrgezdweg", "qflmwtjvztpacqkqsvellvommqia",
				"rbhhafnwptozpkzshttdhtndhzzt", "kqmxzeqirbvclxyhbxcuxuodlfil",
				"epnbyezmlcalkfnkovaeydkixqsa", "crczptixoatdlziutpbtqjzlaamu",
				"avclbeabrswvvrhtzrildlwgbind", "jbxctcorhjustkrewkpgcngtgodc",
				"xwhefcqlhcnsihvgookjodzyxodc", "vgmkhcjaegpzmalquakxknyvbojm",
				"pjlhkvomadlrwzrnlsfsnayxtlad", "rzheqwzoyzotzuhsfqfbailzkzkg",
				"pbnzqcupteijdunudkdyjmqnjnxk", "zxxdfwewhquwnupslmjbsroblzuu",
				"zselvsrhoivrmoqgeldcdlakomfo", "qjamzfvbuamftloiiyvbncrekvol",
				"xyowodjulaxolcsnhsuzbptowtxz", "puuaisjoluoiyzlnkjeulwlpliuj",
				"dpzgcidailgxkvyaejjpivaqmpsk", "mfbmwynonsyqpleatbmfhcgydkrl",
				"qhpmmrrqbkzcliqnxihcfpjhcseh", "pflktfyvnllruiwigexwsnaydqcw",
				"mdedcacwrxxmeupejjzlcjeaqxpr", "bnhwyageowozqjihjzmigrpaymqc",
				"njsqglllijcwubytryptgrrfyype", "moyhhigwywlxdtirojzoyuisiudd",
				"gaxogxhijbbfyildgqwbzrondpzn", "qpryukxkwhfgzuiklzwnurkhpkjf",
				"rjzljakguagrmmlwszdxqlyeacuy", "eivkgdkckgrbwhtbtytpkspdeyru",
				"ikhkkfnrbunkmjgzfxrrkcuctifg", "sdmscgtjvqxoxsprjvjzvunpzkqq",
				"mywyzwcmikjplszmrammwcvizzjw", "ixlcricllgqymubcsfmowxkzirrb",
				"ahtrdntlhczsxncxonlyxrvkngab", "lruntsuvmyiplowalkfvgibcaeiq",
				"wqpnefqddjebadagpjtulhyjaovn", "eiwzollynvytdpvrpghlgulthjol",
				"tqfjzpfljszinvilqphopfejzpih", "gnuknxvmulkbilbbirwwaoqdbmhx",
				"ypouajvtsilpihkajobwvrviyhih", "smlxvwawfweprbkghwouzfjsawmc",
				"uvvuujswyovpkjdidhkjveoqvfbi", "vyswdflcyptilsmrdmybrckasuvr",
				"avnrfmeomqxjrfcfrqbjpfihsglt", "rpdmydtakjqxjmtliqxaqrgkunqe",
				"pmqbzwszwpzygmhkdcmdxtqmlhby", "vvcejrnhqusawvrxwiyddulyjuxi",
				"aounisgiepbkpthbtrmipbmuwcdg", "nlhxitreyrjwbxwyxritnacahfcb",
				"wivbthksxawvsbbynhowlgmahrzd", "zxyptkiyprijwcndxjjhhmgvbeij",
				"zgkytrpgtpgxxmcoaopwynhrtmqz", "zgtbfppoxvrfuhongwujtblxqmyg",
				"kvkuvdxdykoyvyuiwwqgmgdasydj", "jouksvkvubmidtoiegtonqgbrrrf",
				"yjnwbbsbmpuexhufpgiaujyratza", "zflnytcpjwzegkyfwfejgnivzadk",
				"eksafuanoibrmmdtavbcmxmizcjz", "qyrilcggaieggkxzlhhvgvrfcbac",
				"ayvliqyoycyunbgobcggcfgqhqvp", "wqbeuwxoofeyiquijhwutnorkfvq",
				"lgkjxzaffftnjlfamvoucfurecpj", "yxzxzbwoalmtgvsqedsiuwhdlrcg",
				"pdcblomjqnovukidvpgikwepebgi", "lwaqmptmwsajwaxifktvitbgwlqv",
				"zlnewjtfhcaxghjeqhzzzepgebvx", "jowjfqjyveldplwricppcnwevsnk",
				"hcnedrzcsqfwulyqlnwdovcbsaks", "kwfjdrjylageqocncgdcusaughnb",
				"mlgpzyxyaoliertcytgnosoplppp", "nvstvhlitkktszzpzirqjbvptgxl",
				"ccyfctbldlghpulckwdgusbfobtd", "faqqsepulfecjzgwzfdaehubbkeo",
				"dgksrupzpjfoaomdnjekamepngpw", "dosfyaplgqelvhzemtjbatzybxxb",
				"bbirsbqnlpzkyfsxbcimeebyxmhm", "kirkjmytcwhcbiyojeelimtkracy",
				"yruzsctlglytaxfyeyyfcgtgmxfk", "fxtfxlfeswtoaqtwhsuzzhqrwusc",
				"xzczpxnxrthxkijbeqcxhphysvur", "itvwfelxfontyqvkohyznrmuchub",
				"fwiwobucdnyowketvjlctzuvhjrt", "awtohiebhyqhrxhhdvgaepzbnqvm",
				"mbybkmixhyjjbwbavunjmvbzvbwr", "ywbjpllitgeoiedmzwcwccpyaexa",
				"pgwxhzqtmsrdkhyykewyrvubnhxi", "iricritvvaandssoveatwynxxjdf",
				"zexedfdrhzwkmuakghdbsrelsaib", "ypppiefofbqsrzooihpymwgyfnmr",
				"lknqszsnythaneoxxghxvypsxilh", "rocxqunjycflkjqtkwpjbsjfbggd",
				"qmtibvhtpucqyjbisrbfosopmaxo", "nrmvwczztyelqljnwkdhxzmlwoop",
				"vosmaimocjxcoxgnooqdeqqeqtek", "exssazvezxaquyebuthdegrgrvii",
				"yzrbfnwlqhtbrrgqoxjouexyprjr", "hpnvxqktoxjerhugvzjqcvxjzfhc",
				"ifapansscavkwfkokkdldojgcmnj", "gmmjyzejicarabpbeuuivphxxkwa",
				"mtgnqosivkjtzmfxmzjznkqilvsg", "aeroymcmneuiamudaytftpncqapd",
				"ovwebudjwveioynafnzrsxrltmmi", "litldiekwibkzavsfyxyoajdhsna",
				"wkkpzxwlcztrnjynldhmiqnvvgrz", "szuddaainaeeswvywbpbvtgayvnk",
				"kkxgomfmfrmbcoshmehgyaymecbu", "dimhznnbwsdegmdqheqnnzfxwfqi",
				"xqvqfazpiuiqrdphcqevzfgsmzau", "eamqlmybygnexahzobidfplgsjsy",
				"pytxsrvzvhxaxmuvcrhryhsnzfhb", "wegvdhnxrvxjoiskmfnloysylzvm",
				"xezvuaaoyzfmfjknzgxkowgjlubv", "pafqzizotmxntddbjhnifrghtxhw",
				"lxzemmfukbuocsvyzfnoankejjmr", "rpnbgwwadzyfwfimovawduziierw",
				"rozddodsbmivesuklybbbgintnxo", "izrokmqrgseubhontrhwokyahmii",
				"ojvtaxsrsdpidkmplulejmzcxznz", "diwphyhtochmwhvujsdofymptnvp",
				"dildbhtgjvvtpgmglbpptvksasmo", "rmoyluuhyfabzpgbnpykyadasuya",
				"ojktkrlnxvwzxtfuvayosuiygzzs", "ugbehmgolwsbtvslnjgvkrylinvv",
				"mcoemwoobcrwuovxwqgxfbmuzzne", "aowysnfhbxnolhvjkdqbpzbthxyc",
				"mgejpsrgnzodvercdtfuedoueotc", "fyiatfuproopflfpukzarmjmqxfl",
				"zwoycnuxpwnnvsccdorfvprlnyuy", "ckiimfytdfbmhfsfpfkvxgyxzmmd",
				"kytbhtnjakkulwagkqquomvbomhy", "dxttdxwomkzczqxuaizxxhfkembi",
				"fvkcspgbgwkyqeamzrlyblbghogs", "wcpzxrkyvkcpfykarutslbdpocxs",
				"enregkvvebcgbmxlhfggewomqywa", "iyfrzsiybadwqpwjzcsxdfkhhrkv",
				"wfyurkkthgejhzawkbjxeskolxjg", "xyraghpnueveupxyshlpqoebehiy",
				"gbheihzzrjsarzjbymxlpjivbsko", "pzyguhgpkvwxbuuzwmahtomukoks",
				"tsbagsgodcjjfosiaptjwcqaagos", "ljgaotljyjgnwshsafaijzfdmfcs" };

		long time = System.currentTimeMillis();
		System.out.println(new Solution().findSubstring(s, words));
		System.out.println(System.currentTimeMillis() - time);
	}
}
