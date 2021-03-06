package se.ctescape.bsgenerator

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch
import se.ctescape.bsgenerator.data.BSphrases
import se.ctescape.bsgenerator.data.BSphrasesDatabase
import se.ctescape.bsgenerator.data.BSphrasesRepository
import se.ctescape.bsgenerator.data.BSphrasesViewModel

class FilldataBase(val context: Context) {
    private val repository : BSphrasesRepository
    var finished = false

    init {
        val bSphrasesDAO = BSphrasesDatabase.getDatabase(context).BSphrasesDAO()
        repository = BSphrasesRepository(bSphrasesDAO)
        println("AIK!! Filling Database")
        CoroutineScope(IO).launch {
//            repository.deleteAllBS()
            var tempInt = repository.getCount()
            println("AIK!! getCount() = ${tempInt}")
            if (tempInt == 0){
                var tempBS = BSphrases(0, "Refererande till ", "likalydande  ", "teori ", "kanaliseras ", "globala ", "krav ", "relaterande till ", "samordningen.")
                repository.addBS(tempBS)
                tempBS = BSphrases(0, "I termer av ", "destruktiv  ", "nedgång ", "uppspaltas ", "marginella ", "segment ", "vid sidan av ", "konjunkturen.")
                repository.addBS(tempBS)
                tempBS = BSphrases(0, "Oberoende av ", "beprövad  ", "behandling ", "sprides ", "interna ", "målgrupper ", "skilda från  ", "processen.")
                repository.addBS(tempBS)
                tempBS = BSphrases(0, "Med anledning av ", "experimentell  ", "beredning ", "initieras ", "facetterade ", "fördelar ", "liktydiga med ", "tillverkningnen.")
                repository.addBS(tempBS)
                tempBS = BSphrases(0, "Vad gäller ", "konstruktiv  ", "information ", "generaliseras ", "principiella ", "rutiner ", "kopplade till ", "initialskedet.")
                repository.addBS(tempBS)
                tempBS = BSphrases(0, "Beträffande ", "konsekvent  ", "rationalisering ", "verifieras ", "reella ", "förrättningar ", "med hänsyn till ", "kontinuiteten.")
                repository.addBS(tempBS)
                tempBS = BSphrases(0, "Mot bakgrund av ", "objektiv  ", "retardation ", "utvecklas ", "fundamentala ", "tendenser ", "inberäknat ", "huvudmannen.")
                repository.addBS(tempBS)
                tempBS = BSphrases(0, "Rörande ", "seriös  ", "samordning ", "påkallas ", "latenta ", "hypoteser ", "baserade på ", "åtagandena.")
                repository.addBS(tempBS)
                tempBS = BSphrases(0, "Vid orerande om ", "automatisk  ", "hårdbevakning ", "punkteras ", "manuella  ", "nyckeltal ", "i nivå med ", "kärnområdet.")
                repository.addBS(tempBS)
                tempBS = BSphrases(0, "Åberopande ", "subjektiv  ", "instruktion ", "komprimeras ", "godtyckliga ", "strategier ", "anbelangande ", "intressenterna.")
                repository.addBS(tempBS)
                tempBS = BSphrases(0, "Påverkade av ", "konventionell  ", "uppgång ", "modifieras ", "konventionella ", "konklusioner ", "riktade mot ", "resurserna.")
                repository.addBS(tempBS)
                tempBS = BSphrases(0, "Parallellt med ", "dynamisk  ", "analys ", "realiseras ", "partiella ", "restriktioner ", "gällande ", "utfallet.")
                repository.addBS(tempBS)
                tempBS = BSphrases(0, "Avseende ", "systematiserad  ", "fördelning ", "utkristalliseras ", "produktiva ", "innovationer ", "behjälpliga ", "resultatet.")
                repository.addBS(tempBS)
                tempBS = BSphrases(0, "Vidmakthållande ", "bestående  ", "distribution ", "åskådliggörs ", "avgörande ", "dispositioner ", "avhängiga ", "avvecklingen.")
                repository.addBS(tempBS)
                tempBS = BSphrases(0, "Vid överordnad ", "uträknad  ", "koncentration ", "poängteras ", "beräknade ", "sidoeffekter ", "jämförbara med ", "slutmålet.")
                repository.addBS(tempBS)
                tempBS = BSphrases(0, "Åsidosättande ", "holistisk  ", "utjämning ", "medbringas ", "estimerade ", "nackdelar ", "typiska för ", "marknaden.")
                repository.addBS(tempBS)
                tempBS = BSphrases(0, "Inom ramen för ", "målinriktad  ", "validering ", "avskiljes ", "oberäknade ", "svagheter ", "riktade mot ", "verksamheten.")
                repository.addBS(tempBS)
                tempBS = BSphrases(0, "Via all ", "transfererad  ", "budgetering ", "slimmas ", "personella ", "enheter ", "kompatibla med ", "kassaflödet.")
                repository.addBS(tempBS)
                tempBS = BSphrases(0, "Utövande ", "optimal  ", "förflackning ", "kasseras ", "isolerade ", "anbud ", "i höjd med ", "kalkylen.")
                repository.addBS(tempBS)
                tempBS = BSphrases(0, "Ovidkommande av ", "offensiv  ", "preferens ", "administreras ", "potentiella ", "nischer ", "synliggjorda av ", "flexibiliteten.")
                repository.addBS(tempBS)
                tempBS = BSphrases(0, "Tack vare ", "stigande  ", "teknik  ", "förbättras ", "vidlyftiga ", "affärsidéer ", "inbegripet ", "entreprenörskapet.")
                repository.addBS(tempBS)
                tempBS = BSphrases(0, "Vid positionering av ", "förträngd  ", "avveckling ", "styckas  ", "tillkortakomna ", "insolvenser ", "implimenterade av ", "substansvärdet.")
                repository.addBS(tempBS)
                tempBS = BSphrases(0, "Endast med ", "småskalig  ", "målstyrning ", "erhålles ", "varaktiga  ", "driftsfördelar ", "markerade av ", "bokslutet.")
                repository.addBS(tempBS)
                tempBS = BSphrases(0, "Beaktande ", "harmoniserande  ", "tillväxt ", "schatteras ", "presumtiva ", "aktioner ", "medräknat ", "förädlingen.")
                repository.addBS(tempBS)
                tempBS = BSphrases(0, "Frigjorda från  ", "ordinär  ", "handel ", "förvaltas ", "avlagda ", "inkomster ", "omfattande ", "slutdokumentet.")
                repository.addBS(tempBS)
                tempBS = BSphrases(0, "Frånräknat ", "irrationell  ", "förlust ", "kvantifieras ", "negativa ", "trender ", "försämrade av ", "IT-sektorn.")
                repository.addBS(tempBS)
                tempBS = BSphrases(0, "Vid normal ", "förbigången  ", "granskning ", "öronmärkes  ", "berättigade ", "regleringar ", "avgångna från ", "kostnaderna.")
                repository.addBS(tempBS)
                tempBS = BSphrases(0, "Genom drivning av ", "kontrollerande  ", "planering ", "avtappas ", "knapphändiga ", "åtgärder ", "angående ", "börsuppgången.")
                repository.addBS(tempBS)
                tempBS = BSphrases(0, "Ickeproduktivt mot ", "dränerande  ", "förbrukning ", "emaneras ", "detaljerade ", "bedömningar ", "underlydande ", "konkursen.")
                repository.addBS(tempBS)
                tempBS = BSphrases(0, "Uppföljande ", "total  ", "prognos ", "sjösätts ", "svårtolkade ", "element ", "komna från ", "kontexten.")
                repository.addBS(tempBS)
                tempBS = BSphrases(0, "Förordande ", "positiv  ", "framförhållning ", "understrykes ", "externa ", "återgångar ", "utsprungna ur ", "revisionen.")
                repository.addBS(tempBS)
                tempBS = BSphrases(0, "Uppbringande av ", "generös  ", "expansion ", "nedbringas ", "nivellerande ", "friställningar ", "bistående ", "likvidationen.")
                repository.addBS(tempBS)
                tempBS = BSphrases(0, "Förankrade i ", "överskjutande  ", "underskott ", "värderas ", "uppkomna ", "vinster ", "i förhållande till ", "branschen.")
                repository.addBS(tempBS)
                tempBS = BSphrases(0, "Vid brukandet av ", "elementär  ", "projektering ", "försvåras ", "konstgjorda ", "teknikaliteter ", "direkt från ", "kartellbildningen.")
                repository.addBS(tempBS)
                tempBS = BSphrases(0, "Underordnad ", "övergripande  ", "storskalighet ", "divergeras ", "åsidosatta ", "svackor ", "genererande ur ", "helheten.")
                repository.addBS(tempBS)
                tempBS = BSphrases(0, "Vid befattning med ", "fragmenterad  ", "kapacitet ", "utföres ", "oklara ", "direktiv ", "bundna till ", "uppdraget.")
                repository.addBS(tempBS)
                tempBS = BSphrases(0, "I samband med ", "cyberorienterad  ", "förrättning ", "förtydligas ", "urskiljbara ", "vinstandelar ", "enbart för ", "organisationen.")
                repository.addBS(tempBS)
                tempBS = BSphrases(0, "I kölvattnet av ", "utesluten  ", "redovisning ", "expanderas ", "diffusa ", "skiktningar ", "gentemot ", "kursutvecklingen.")
                repository.addBS(tempBS)
                tempBS = BSphrases(0, "Kummulativt av ", "progressiv  ", "interaktivitet ", "digitaliseras ", "interpunkterade ", "utgifter ", "avstötta från ", "avansen.")
                repository.addBS(tempBS)
                tempBS = BSphrases(0, "Komparaivt med ", "långsiktig  ", "soliditet ", "ackumuleras ", "adekvata ", "motsatser ", "fabricerade av ", "avkastningen.")
                repository.addBS(tempBS)
                tempBS = BSphrases(0, "Integrerade med ", "medioker  ", "variation ", "involveras ", "strukturella ", "avläggare ", "förminskade av ", "översynen.")
                repository.addBS(tempBS)
                tempBS = BSphrases(0, "Upplyfta av ", "krympande  ", "tillgång ", "fallerar ", "kvarhängande ", "överskott ", "splittrade av ", "utökningen.")
                repository.addBS(tempBS)
                tempBS = BSphrases(0, "Framlyfta genom ", "påtaglig  ", "småaktighet ", "förstoras ", "bakomliggande ", "nyttigheter ", "i förhållande till ", "presentationen.")
                repository.addBS(tempBS)
                tempBS = BSphrases(0, "Uppmärksammat av ", "substansiell  ", "medgörlighet ", "påskyndas ", "kvoterade ", "tillvägagångssätt ", "vidtagna genom ", "begagnandet.")
                repository.addBS(tempBS)
                tempBS = BSphrases(0, "Vid användandet av ", "tvetydig  ", "hantering ", "accelereras ", "utgående ", "kontrollmoment ", "makulerade p.g.a. ", "handhavandet.")
                repository.addBS(tempBS)
                tempBS = BSphrases(0, "Identifierande av ", "grannlaga  ", "ohägn ", "allokeras ", "prudentliga ", "omdömen ", "i paritet med ", "utfasningen.")
                repository.addBS(tempBS)
                tempBS = BSphrases(0, "Anhängiga ", "transparent  ", "prudentlighet ", "skadas ", "grava ", "kriterier ", "kontra ", "utrymmet.")
                repository.addBS(tempBS)
                tempBS = BSphrases(0, "Styrande ", "upphöjd  ", "kvalitet ", "värdesäkras ", "imposanta ", "incitament ", "befryntade med ", "utfasningen.")
                repository.addBS(tempBS)
            }
            tempInt = repository.getCount()
            println("AIK!! getCount() = ${tempInt} - After")
            finished = true
        }
    }
}