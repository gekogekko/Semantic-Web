package lesson;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Property;

public class FinalAssignment {
	public static void main(String[] args) {
		// RDFモデルを作成
		Model model = ModelFactory.createDefaultModel();
		
		// 名前空間を定義
		String rdf = "http://www.w3.org/1999/02/22-rdf-syntax-ns#";
		String rdfs = "http://www.w3.org/2000/01/rdf-schema#";
		String cc = "http://creativecommons.org/ns#";
		String xsd = "http://www.w3.org/2001/XMLSchema#";
		String owl = "http://www.w3.org/2002/07/owl#";
		model.setNsPrefix("rdf", rdf);
		model.setNsPrefix("rdfs", rdfs);
		model.setNsPrefix("cc", cc);
		model.setNsPrefix("xsd", xsd);
		model.setNsPrefix("owl", owl);
		
		// プロパティを作成
		Property attributionName = model.createProperty(cc + "attributionName");
		Property attributionURL = model.createProperty(cc + "attributionURL");
		Property license = model.createProperty(cc + "license");
		
		// リソースにプロパティを追加
		model.createResource("")
		.addProperty(attributionName, "gekko", "en")
		.addProperty(attributionURL, model.createResource("http://user.linkdata.org/user/gekko/work"))
		.addProperty(license, model.createResource("http://creativecommons.org/publicdomain/zero/1.0/deed.ja"));
		
		// リソースを作成
		createResource(model, "1", "1", "2GE", "James Goopio", "Philippines", "Rex Regum Qeon", "N/A", "N/A", "5648", "rrq2ge");
		createResource(model, "2", "2", "aimDLL", "Hüseyin Kabişteke", "Turkey", "BBL Esports", "May 1", "2001", "20563", "aimDLLfps");
		createResource(model, "3", "3", "Alfajer", "Emir Ali Beder", "Turkey", "Fnatic", "June 10", "2005", "138875", "Alfajervl");
		createResource(model, "4", "4", "ANGE1", "Kyrylo Karasov", "Ukraine", "Natus Vincere", "September 10", "1999", "107995", "OfficialANGE1");
		createResource(model, "5", "5", "Anthem", "Yoshitaka Enomoto", "Japan", "DetonatioN FocusMe", "March 16", "2002", "1105", "AnthemFps");
		createResource(model, "6", "6", "Apotheon", "Vincent Le", "Canada / Vietnam", "Evil Geniuses", "January 15", "2003", "6778", "Apothval");
		createResource(model, "7", "7", "ardiis", "Ardis Svarenieks", "Latvia / United Kingdom", "NRG", "May 1", "1998", "134713", "ardiis");
		createResource(model, "8", "8", "AsLanM4shadoW", "Ali Osman Balta", "Turkey", "BBL Esports", "April 21", "1994", "23205", "AsLanM4shadoW");
		createResource(model, "9", "9", "aspas", "Erick Santos", "Brazil", "LOUD", "June 15", "2003", "135849", "loud_aspas");
		createResource(model, "10", "10", "Asuna", "Peter Mazuryk", "United States / Ukraine", "100 Thieves", "July 26", "2003", "71235", "Asunaa");
		createResource(model, "11", "11", "ATA KAPTAN", "Ata Tan", "Turkey", "FUT Esports", "July 6", "2001", "15830", "AtaKaptanVL");
		createResource(model, "12", "12", "AvovA", "Auni Chahade", "Denmark", "Team Heretics", "November 5", "1998", "64937", "AvovAFPS");
		createResource(model, "13", "13", "axeddy", "Carlos Alberto Machado Galvão", "Brazil", "KRÜ Esports", "June 11", "2003", "4512", "axeddy1");
		createResource(model, "14", "14", "AYRIN", "Jordan He", "Canada", "Global Esports", "April 4", "1996", "57550", "AYRINval");
		createResource(model, "15", "15", "ban", "Joseph Seungmin Oh", "United States", "T1", "January 27", "2000", "21453", "ban_val");
		createResource(model, "16", "16", "bang", "Sean Bezerra", "United States", "100 Thieves", "March 13", "2004", "36327", "bangzerra");
		createResource(model, "17", "17", "barce", "Ryo Takebayashi", "Japan", "ZETA DIVISION", "August 22", "1996", "27095", "barcefps");
		createResource(model, "18", "18", "Bazzi", "Park Jun-ki", "South Korea", "Global Esports", "March 24", "1999", "16250", "bazzivlrt");
		createResource(model, "19", "19", "BcJ", "Brendan Jensen", "United States", "Evil Geniuses", "July 4", "2000", "61857", "BcJFPS");
		createResource(model, "20", "20", "benjyfishy", "Benjy David Fish", "United Kingdom", "Team Heretics", "April 2", "2004", "2777", "benjyfishy");
		createResource(model, "21", "21", "BeYN", "Kang Ha-bin", "South Korea", "DRX", "September 5", "2003", "4025", "BeYNvlrt");
		createResource(model, "22", "22", "Boaster", "Jake Howlett", "United Kingdom", "Fnatic", "May 25", "1995", "186643", "OfficialBoaster");
		createResource(model, "23", "23", "Boo", "Ričardas Lukaševičius", "Lithuania", "Team Heretics", "December 2", "1997", "15970", "BooVAL1");
		createResource(model, "24", "24", "Boostio", "Kelden Pupello", "United States", "Evil Geniuses", "November 14", "2000", "55267", "Boostio");
		createResource(model, "25", "25", "BORKUM", "Jim Albert Timbreza", "Philippines", "Team Secret", "April 18", "1996", "30628", "Secret_BORKUM");
		createResource(model, "26", "26", "Brave", "Eren Kasırga", "Turkey", "BBL Esports", "June 28", "2003", "12693", "erenbrave");
		createResource(model, "27", "27", "BuZz", "Yu Byung-chul", "South Korea", "DRX", "January 13", "2003", "94113", "Buzz_kr");
		createResource(model, "28", "28", "C0M", "Corbin Lee", "United States / South Korea", "Evil Geniuses", "May 10", "2000", "56825", "C0Mtweets");
		createResource(model, "29", "29", "Carpe", "Lee Jae-hyeok", "South Korea", "T1", "October 14", "1998", "12667", "carpe_ow");
		createResource(model, "30", "30", "cauanzin", "Cauan Pereira", "Brazil", "LOUD", "August 2", "2005", "48937", "cauanzinvlr");
		createResource(model, "31", "31", "ceNder", "Jokūbas Labutis", "Lithuania", "Team Vitality", "October 30", "2001", "19858", "ceNder1337");
		createResource(model, "32", "32", "Chronicle", "Timofey Khromov", "Russia", "Fnatic", "August 16", "2002", "210724", "chronicleEZ");
		createResource(model, "33", "33", "CigaretteS", "Patiphan Posri", "Thailand", "Paper Rex", "N/A", "N/A", "39357", "CigaretteS_Kla");
		createResource(model, "34", "34", "Cloud", "Kirill Nehozhin", "Russia", "Giants", "October 10", "2003", "18408", "cloudezeee");
		createResource(model, "35", "35", "cNed", "Mehmet Yağız İpek", "Turkey", "Natus Vincere", "January 18", "2002", "132511", "cNedf0r");
		createResource(model, "36", "36", "crashies", "Austin Roberts", "United States", "NRG", "December 20", "1997", "186650", "Crashies");
		createResource(model, "37", "37", "crow", "Tomoaki Maruoka", "Japan", "ZETA DIVISION", "November 28", "1997", "54929", "no960fps");
		createResource(model, "38", "38", "Crws", "Thanamethk Mahatthananuyut", "Thailand", "Talon Esports", "November 15", "1996", "48467", "crws_vlrt");
		createResource(model, "39", "39", "Cryocells", "Matthew Panganiban", "United States", "100 Thieves", "December 22", "2002", "56000", "Cryocells_");
		createResource(model, "40", "40", "d4v41", "Ahmad Khalish Rusyaidee bin Nordin", "Malaysia", "Paper Rex", "October 14", "1998", "117334", "d4v41vlr");
		createResource(model, "41", "41", "Daveeys", "Santiago Galvis Ruiz", "Colombia", "KRÜ Esports", "September 2", "2000", "15656", "Daveeys21");
		createResource(model, "42", "42", "Demon1", "Max Mazanov", "United States", "Evil Geniuses", "September 7", "2002", "48067", "Demon1___");
		createResource(model, "43", "43", "Dep", "Yuma Hashimoto", "Japan", "ZETA DIVISION", "December 4", "2000", "31894", "Dep_ow");
		createResource(model, "44", "44", "Derke", "Nikita Sirmitev", "Finland / Russia", "Fnatic", "February 6", "2003", "183070", "Derke");
		createResource(model, "45", "45", "Derrek", "Derrek Ha", "United States", "100 Thieves", "September 16", "1997", "35215", "DerrekOW");
		createResource(model, "46", "46", "Destrian", "Tomas Linikas", "Lithuania", "Team Vitality", "May 28", "N/A", "14772", "DestrianVAL");
		createResource(model, "47", "47", "dgzin", "Douglas Silva", "Brazil", "FURIA Esports", "July 6", "2000", "13097", "dgzinh99");
		createResource(model, "48", "48", "dimasick", "Dmitriy Matvienko", "Kazakhstan", "Team Liquid", "July 6", "1996", "23890", "dimasickCSGO");
		createResource(model, "49", "49", "DubsteP", "Jayvee Paguirigan", "Philippines", "Team Secret", "September 21", "1992", "30443", "Secret_DubsteP");
		createResource(model, "50", "50", "EJAY", "Eroll Jule R. Delfin", "Philippines", "Rex Regum Qeon", "N/A", "N/A", "2731", "rrq_ejay");
		createResource(model, "51", "51", "eKo", "Yeom Wang-ryong", "South Korea", "Gen.G Esports", "February 12", "N/A", "16627", "eKoVLRT");
		createResource(model, "52", "52", "Emman", "Emmanuel Morales", "Philippines", "Rex Regum Qeon", "N/A", "N/A", "6142", "rrq_emmanfps");
		createResource(model, "53", "53", "Ethan", "Ethan Arnold", "United States", "Evil Geniuses", "March 2", "2000", "88224", "ethanarnold");
		createResource(model, "54", "54", "ethos", "Alan Ruan", "United States", "NRG", "May 2", "1999", "8339", "ethoz");
		createResource(model, "55", "55", "f0rsakeN", "Jason Susanto", "Indonesia", "Paper Rex", "March 25", "2004", "117401", "jasonsusantoo");
		createResource(model, "56", "56", "Fit1nho", "Adolfo Gallego", "Spain", "Giants", "February 8", "2000", "17282", "fit1nho");
		createResource(model, "57", "57", "fl1pzjder", "Saibani Rahmad", "Indonesia", "Rex Regum Qeon", "July 27", "1999", "18314", "fl1pzjder");
		createResource(model, "58", "58", "FNS", "Pujan Mehta", "Canada", "NRG", "March 19", "1992", "184520", "fns");
		createResource(model, "59", "59", "Foxy9", "Jung Jae-sung", "South Korea", "DRX", "November 20", "2004", "19550", "Foxy9fps");
		createResource(model, "60", "60", "foxz", "Itthirit Ngamsaard", "Thailand", "Talon Esports", "April 8", "1999", "48304", "foxzfoxzfoxz");
		createResource(model, "61", "61", "frz", "Leandro Gomes", "Brazil", "MIBR", "N/A", "2000", "26329", "frzgod");
		createResource(model, "62", "62", "garnetS", "Apiwat Apiraksukumal", "Thailand", "Talon Esports", "July 7", "2004", "6231", "garnetssssssS");
		createResource(model, "63", "63", "GodDead", "Kim Sung-sin", "South Korea", "Gen.G Esports", "January 9", "1998", "13052", "GodDead_twit");
		createResource(model, "64", "64", "Harmii", "Nico Harms", "Germany", "Team Liquid", "May 5", "N/A", "19367", "Harmii_");
		createResource(model, "65", "65", "hoody", "Aaro Peltokangas", "Finland", "Giants", "September 17", "1998", "30671", "hoodyVAL");
		createResource(model, "66", "66", "icy", "Jacob Lange", "United States", "Evil Geniuses", "April 30", "2003", "5445", "icyjl");
		createResource(model, "67", "67", "iNTRO", "Kang Seung-gyun", "South Korea", "T1", "February 2", "2002", "15348", "intr0w0w");
		createResource(model, "68", "68", "invy", "Adrian Reyes", "Philippines", "Team Secret", "N/A", "N/A", "9300", "Secret_invy");
		createResource(model, "69", "69", "jakee", "Jake Anderson", "United States", "Cloud9", "February 21", "2003", "6787", "jakeeVAL");
		createResource(model, "70", "70", "Jamppi", "Elias Olkkonen", "Finland", "Team Liquid", "July 22", "2001", "97856", "Jamppicsgo");
		createResource(model, "71", "71", "jawgemo", "Alexander Mor", "Cambodia", "Evil Geniuses", "June 24", "1999", "60897", "jawgemo");
		createResource(model, "72", "72", "JessieVash", "Jessie Cristy Cuyco", "Philippines", "Team Secret", "February 21", "1990", "30676", "Secret_JcVash");
		createResource(model, "73", "73", "Jinggg", "Wang Jing Jie", "Singapore", "Paper Rex", "july 29", "2003", "110521", "Jingggxd");
		createResource(model, "74", "74", "JitboyS", "Jittana Nokngam", "Thailand", "Talon Esports", "N/A", "N/A", "7930", "jitboyy_");
		createResource(model, "75", "75", "Jremy", "Jeremy Cabrera", "Philippines", "Team Secret", "N/A", "N/A", "10204", "Secret_Jremy");
		createResource(model, "76", "76", "jzz", "João Pedro", "Brazil", "MIBR", "N/A", "N/A", "3208", "jzzvlr");
		createResource(model, "77", "77", "k1Ng", "Lee Seung-won", "South Korea", "Gen.G Esports", "November 3", "2001", "53004", "k1Ngvlrt");
		createResource(model, "78", "78", "kamyk", "Maks Rychlewski", "Poland", "Fnatic", "July 2", "2003", "13771", "kamykvalo");
		createResource(model, "79", "79", "keloqz", "Wassim Cista", "France / Algeria", "Team Heretics", "March 26", "2003", "34412", "keloqz");
		createResource(model, "80", "80", "keznit", "Angelo Mori", "Chile", "KRÜ Esports", "August 14", "2001", "52529", "keznitdeuS");
		createResource(model, "81", "81", "Khalil", "Khalil Schmidt", "Brazil", "FURIA Esports", "June 11", "2004", "24329", "khalilfps");
		createResource(model, "82", "82", "kiNgg", "Francisco Aravena", "Chile", "Leviatán", "October 23", "2001", "43018", "kiNggfps");
		createResource(model, "83", "83", "Klaus", "Nicolas Ferrari", "Argentina", "KRÜ Esports", "April 4", "2001", "56353", "KlaussOW");
		createResource(model, "84", "84", "koldamenta", "Jose Luis Aranguren Herrero", "Spain", "KOI", "May 24", "1993", "53147", "koldamenta");
		createResource(model, "85", "85", "kon4n", "Vitor Hugo", "Brazil", "FURIA Esports", "N/A", "N/A", "8478", "kon4n");
		createResource(model, "86", "86", "Laz", "Koji Ushida", "Japan", "ZETA DIVISION", "November 26", "1995", "64042", "lazvell");
		createResource(model, "87", "87", "leaf", "Nathan Orf", "United States", "Cloud9", "November 24", "2003", "47060", "leaf_cs");
		createResource(model, "88", "88", "lenne", "Lionel Lim You Xiang", "Singapore", "Team Secret", "N/A", "N/A", "10024", "Secret_lenne");
		createResource(model, "89", "89", "Leo", "Leo Jannesson", "Sweden", "Fnatic", "December 15", "2003", "130585", "leojannesson");
		createResource(model, "90", "90", "Less", "Felipe Basso", "Brazil", "LOUD", "February 24", "2005", "134446", "loud_less");
		createResource(model, "91", "91", "Lightningfast", "Abhirup Choudhury", "India", "Global Esports", "December 7", "2000", "22771", "LightningFast07");
		createResource(model, "92", "92", "Lmemore", "Hagai Kristen Yesyurun Tewuh", "Indonesia", "Rex Regum Qeon", "N/A", "N/A", "11845", "Lmemore_");
		createResource(model, "93", "93", "MaKo", "Kim Myeong-kwan", "South Korea", "DRX", "January 15", "2002", "88990", "MakoVlrt");
		createResource(model, "94", "94", "Marved", "Jimmy Nguyen", "Canada", "Sentinels", "February 24", "2000", "150550", "Marved6");
		createResource(model, "95", "95", "mazin", "Matheus Araújo", "Brazil", "FURIA Esports", "July 27", "1999", "21286", "mazinfps");
		createResource(model, "96", "96", "Mazino", "Roberto Francisco Rivas Bugueño", "Chile", "Leviatán", "June 29", "2001", "62929", "Mazinofps");
		createResource(model, "97", "97", "Melser", "Marco Eliot Machuca Amaro", "Chile", "KRÜ Esports", "May 12", "1995", "35484", "Melserlol");
		createResource(model, "98", "98", "Meteor", "Kim Tae-O", "South Korea", "Gen.G Esports", "December 19", "1999", "14684", "Meteorvlrt");
		createResource(model, "99", "99", "mindfreak", "Aaron Leonhart", "Indonesia", "Paper Rex", "October 4", "1999", "117401", "aaronleonhart4");
		createResource(model, "100", "100", "mixwell", "Óscar Cañellas Colocho", "Spain", "Team Heretics", "October 10", "1995", "78582", "Mixwell");
		createResource(model, "101", "101", "mojj", "Buğra Kiraz", "Turkey", "FUT Esports", "May 21", "1997", "42814", "MOJJvl");
		createResource(model, "102", "102", "MOLSI", "Michał Łącki", "Poland", "Team Vitality", "January 26", "1997", "15886", "molsiVAL");
		createResource(model, "103", "103", "Monyet", "Cahya Nugraha", "Indonesia", "Global Esports", "June 5", "2005", "9814", "cahyanug_");
		createResource(model, "104", "104", "MrFaliN", "Furkan Yeğen", "Turkey", "FUT Esports", "September 27", "2000", "27128", "MrFaliN");
		createResource(model, "105", "105", "Muj", "Serhat Yüksel", "Turkey", "FUT Esports", "October 24", "2001", "24858", "MujsOfficial");
		createResource(model, "106", "106", "Munchkin", "Byeon Sang-beom", "South Korea", "T1", "March 27", "1998", "35009", "MUNCHKING_");
		createResource(model, "107", "107", "murizzz", "Murillo Tuchtenhagen", "Brazil", "MIBR", "September 16", "1999", "20065", "murizzzzz");
		createResource(model, "108", "108", "mwzera", "Leonardo Serrati", "Brazil", "FURIA Esports", "June 30", "2001", "24367", "mwzera");
		createResource(model, "109", "109", "NagZ", "Juan Pablo Lopez Miranda", "Chile", "KRÜ Esports", "December 11", "1996", "61133", "Nagzet");
		createResource(model, "110", "110", "nAts", "Ayaz Akhmetshin", "Russia", "Team Liquid", "July 1", "2002", "137795", "nAts__ss");
		createResource(model, "111", "111", "Nivera", "Nabil Benrlitom", "Belgium / Morocco", "Karmine Corp", "June 10", "2001", "44170", "Nivera__");
		createResource(model, "112", "112", "Nozwerr", "Agustin Ibarra", "Argentina", "Leviatán", "May 8", "1998", "35025", "Nozwer");
		createResource(model, "113", "113", "nukkye", "Žygimantas Chmieliauskas", "Lithuania", "Giants", "November 5", "1997", "63191", "nukkye");
		createResource(model, "114", "114", "pANcada", "Bryan Luna", "Brazil", "Sentinels", "October 31", "1999", "102584", "pANcada");
		createResource(model, "115", "115", "patt", "Patiphan Chaiwong", "Thailand", "Talon Esports", "September 3", "2003", "18494", "ItsPatiphan");
		createResource(model, "116", "116", "qck", "Gabriel Lima", "Brazil", "FURIA Esports", "July 18", "2003", "24834", "qckvlr");
		createResource(model, "117", "117", "qpert", "Mateja Mijović", "Serbia", "Cloud9", "January 5", "2003", "3461", "qpert999");
		createResource(model, "118", "118", "qRaxs", "Doğukan Balaban", "Turkey", "FUT Esports", "May 2", "2000", "37899", "qRaxs_");
		createResource(model, "119", "119", "QutionerX", "Doğukan Dural", "Turkey", "BBL Esports", "June 3", "2001", "8338", "QutionerX");
		createResource(model, "120", "120", "qw1", "Konur Alp Şahin", "Turkey", "FUT Esports", "June 10", "2002", "29336", "qw1vl");
		createResource(model, "121", "121", "Rb", "Goo Sang-min", "South Korea", "DRX", "December 7", "2001", "123675", "Rbvlrt");
		createResource(model, "122", "122", "Redgar", "Igor Vlasov", "Russia", "Team Liquid", "October 17", "1997", "135083", "IRedgarI");
		createResource(model, "123", "123", "Reformed", "Jeffrey Lu", "Canada", "Evil Geniuses", "July 30", "2003", "8210", "ReformedVal");
		createResource(model, "124", "124", "Reita", "Ryumon Oshiro", "Japan", "DetonatioN FocusMe", "December 11", "1994", "33476", "ReitathefpS");
		createResource(model, "125", "125", "RgLM", "Matheus Rodigoli", "Brazil", "MIBR", "N/A", "N/A", "6262", "RgLM7");
		createResource(model, "126", "126", "rhyme", "Emir Muminovic", "Norway / Bosnia and Herzegovina", "Giants", "January 12", "1999", "19469", "rhymeVAL");
		createResource(model, "127", "127", "runi", "Dylan Cade", "United States", "Cloud9", "N/A", "N/A", "9442", "runiVL");
		createResource(model, "128", "128", "s0m", "Sam Oh", "United States", "NRG", "June 7", "2002", "50775", "s0mcs");
		createResource(model, "129", "129", "saadhak", "Matias Delipetro", "Argentina", "LOUD", "March 8", "1997", "159434", "loud_saadhak");
		createResource(model, "130", "130", "Sacy", "Gustavo Rossi", "Brazil", "Sentinels", "December 2", "1997", "117892", "sen_sacy");
		createResource(model, "131", "131", "Sayaplayer", "Ha Jung-woo", "South Korea", "T1", "July 29", "1998", "31217", "Sayaplayer");
		createResource(model, "132", "132", "Sayf", "Saif Jibraeel", "Sweden", "Team Liquid", "January 1", "2001", "55893", "DSajoof");
		createResource(model, "133", "133", "ScreaM", "Adil Benrlitom", "Belgium / Morocco", "Karmine Corp", "July 2", "1994", "88004", "ScreaM_");
		createResource(model, "134", "134", "ScrewFace", "Kyle Jensen", "United States", "Evil Geniuses", "March 20", "2000", "5534", "ScrewFaceVAL");
		createResource(model, "135", "135", "Seoldam", "Park Sang-min", "South Korea", "DetonatioN FocusMe", "March 2", "2001", "3703", "SeoldamTwit");
		createResource(model, "136", "136", "Shao", "Andrey Kiprsky", "Non-representing / Russia", "Natus Vincere", "January 27", "2000", "108005", "Shaolele");
		createResource(model, "137", "137", "Sheydos", "Bogdan Naumov", "Russia", "KOI", "October 10", "2001", "109927", "Sheydosk1ng");
		createResource(model, "138", "138", "Shin", "Ryad Ensaad", "France", "Karmine Corp", "September 3", "2002", "7682", "shinVALORANT");
		createResource(model, "139", "139", "Shyy", "Fabian Usnayo", "Chile", "Leviatán", "September 22", "2004", "30409", "ShyyFab");
		createResource(model, "140", "140", "SkRossi", "Ganesh Gangadhar", "India", "Global Esports", "October 12", "1997", "26839", "skrossigg");
		createResource(model, "141", "141", "something", "Ilya Petrov", "Russia", "Paper Rex", "February 11", "2002", "15638", "smthlikeyou11");
		createResource(model, "142", "142", "SouhcNi", "İbrahim Sağır", "Turkey", "BBL Esports", "November 23", "1999", "6026", "souhcni");
		createResource(model, "143", "143", "soulcas", "Dom Sulcas", "United Kingdom / Lithuania", "Team Liquid", "January 2", "2000", "112041", "soulcas_");
		createResource(model, "144", "144", "starxo", "Patryk Kopczyński", "Poland", "KOI", "August 28", "2001", "110612", "starxo5");
		createResource(model, "145", "145", "stax", "Kim Gu-taek", "South Korea", "DRX", "February 16", "2000", "118528", "staxVLRT");
		createResource(model, "146", "146", "stellar", "Brenden McGrath", "United States", "100 Thieves", "July 29", "1996", "37155", "st9llar");
		createResource(model, "147", "147", "SugarZ3ro", "Shota Watanabe", "Japan", "ZETA DIVISION", "March 18", "2003", "28308", "SugarZ3roVL");
		createResource(model, "148", "148", "Suggest", "Seo Jae-young", "South Korea", "DetonatioN FocusMe", "September 30", "2002", "27952", "Suggest5811");
		createResource(model, "149", "149", "sushiboys", "Panyawat Subsiriroj", "Thailand", "Talon Esports", "November 6", "2000", "48452", "ImSushiboys");
		createResource(model, "150", "150", "SUYGETSU", "Dmitry Ilyushin", "Non-representing / Russia", "Natus Vincere", "July 16", "2002", "102293", "suygetsu");
		createResource(model, "151", "151", "Sylvan", "Ko Young-sub", "South Korea", "Gen.G Esports", "October 4", "2021", "11887", "Sylvan_4");
		createResource(model, "152", "152", "t3xture", "Kim Na-ra", "South Korea", "Global Esports", "July 20", "1999", "13678", "t3xture_kr");
		createResource(model, "153", "153", "Tacolilla", "Vicente Compagnon", "Chile", "Leviatán", "October 3", "2000", "43404", "tacolillalzh");
		createResource(model, "154", "154", "takej", "Shogo Takemori", "Japan", "DetonatioN FocusMe", "December 17", "2000", "28139", "takejfps");
		createResource(model, "155", "155", "TENNN", "Tenta Asai", "Japan", "ZETA DIVISION", "October 19", "2001", "29817", "tenhakyou");
		createResource(model, "156", "156", "TenZ", "Tyson Ngo", "Canada", "Sentinels", "May 5", "2001", "95750", "TenZOfficial");
		createResource(model, "157", "157", "thwifo", "Zander Kim", "United States", "100 Thieves", "August 30", "2002", "11200", "thwifo");
		createResource(model, "158", "158", "trexx", "Nikita Cherednichenko", "Russia", "KOI", "April 24", "2004", "18878", "trexxfps");
		createResource(model, "159", "159", "TS", "Yu Tae-seok", "South Korea", "Gen.G Esports", "February 25", "N/A", "21874", "TS_vlrt");
		createResource(model, "160", "160", "Turko", "Mehmet Özen", "Turkey", "BBL Esports", "January 15", "1999", "25282", "Turkovalorant");
		createResource(model, "161", "161", "tuyz", "Arthur Vieira", "Brazil", "LOUD", "August 3", "2003", "44878", "loud_tuyz");
		createResource(model, "162", "162", "Txozin", "André Saidel", "Brazil", "MIBR", "N/A", "N/A", "2640", "TxozinOW");
		createResource(model, "163", "163", "Victor", "Victor Wong", "United States", "NRG", "September 14", "1996", "185650", "victorwong");
		createResource(model, "164", "164", "Wolfen", "Berkant Joshkun", "Bulgaria", "KOI", "N/A", "2003", "5545", "WolfenVAL");
		createResource(model, "165", "165", "Xeppaa", "Erick Bach", "United States", "Cloud9", "July 19", "2000", "39034", "Xeppaaa");
		createResource(model, "166", "166", "xeta", "Son Seon-ho", "South Korea", "T1", "June 3", "1997", "49815", "OfficialXETA");
		createResource(model, "167", "167", "xffero", "David Monangin", "Indonesia", "Rex Regum Qeon", "August 4", "2001", "18390", "davidmichs");
		createResource(model, "168", "168", "xms", "Alexandre Forté", "France", "Karmine Corp", "May 24", "1997", "4853", "xms51");
		createResource(model, "169", "169", "xnfri", "Tomoki Moriya", "Japan", "DetonatioN FocusMe", "March 9", "1999", "6177", "xnfri_");
		createResource(model, "170", "170", "zekken", "Zachary Patrone", "United States / Philippines", "Sentinels", "March 19", "2005", "51664", "zekkenVAL");
		createResource(model, "171", "171", "Zellsis", "Jordan Montemurro", "United States", "Cloud9", "March 2", "1998", "32935", "zellsis");
		createResource(model, "172", "172", "Zest", "Kim Gi-seok", "South Korea", "DRX", "December 27", "2000", "105344", "Zestvlrt");
		createResource(model, "173", "173", "Zyppan", "Pontus Eek", "Sweden", "Natus Vincere", "July 17", "2002", "107623", "Zyppaan");
		
		// RDFデータ(Turtle形式)を出力
		model.write(System.out, "Turtle");
	}
	
	// リソースを作成する関数
	private static void createResource(Model model, String id, String... values) {
		// プロパティの作成
		Property label = model.createProperty("http://www.w3.org/2000/01/rdf-schema#label");
		Property name = model.createProperty("http://dbpedia.org/ontology/name");
		Property nationality = model.createProperty("http://dbpedia.org/ontology/nationality");
		Property memberOf = model.createProperty("http://purl.obolibrary.org/obo/member_of");
		Property birthday = model.createProperty("http://xmlns.com/foaf/0.1/birthday");
		Property birthYear = model.createProperty("http://dbpedia.org/ontology/birthYear");
		Property careerPrizeMoney = model.createProperty("http://dbpedia.org/ontology/careerPrizeMoney");
		Property twitterId = model.createProperty("http://open.vocab.org/terms/twitter-id");
		
		// リソースにプロパティを追加
		model.createResource("http://linkdata.org/resource/rdf1s9994i#" + id)
		.addProperty(label, values[0], "en")
		.addProperty(label, values[1], "en")
		.addProperty(name, values[2], "en")
		.addProperty(nationality, values[3], "en")
		.addProperty(memberOf, values[4], "en")
		.addProperty(birthday, values[5], "en")
		.addProperty(birthYear, values[6], "en")
		.addProperty(careerPrizeMoney, values[7], "en")
		.addProperty(twitterId, values[8], "en");
    }
}
