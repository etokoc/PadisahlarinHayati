package com.ertugrulkoc.padisahlarinhayati;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
   ListView listView;
   static Bitmap secilmisResim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listview);

        //Padisah İsimleri

        final ArrayList<String>padisahIsımler = new ArrayList<>();
        padisahIsımler.add("Osman Gazi (1299-1326)");
        padisahIsımler.add("Orhan Gazi (1326 – 1359)");
        padisahIsımler.add("I. Murad (1359 – 1389)");
        padisahIsımler.add("I. Bayezid – Yıldırım Bayezid (1389 – 1402)");
        padisahIsımler.add("I. Mehmed (1413 – 1421)");
        padisahIsımler.add("II. Murad (1421 – 1451)");
        padisahIsımler.add("Fatih Sultan Mehmed (1451 – 1481)");
        padisahIsımler.add("II. Bayezid (1481 – 1512)");
        padisahIsımler.add("Yavuz Sultan Selim (1512 – 1520)");
        padisahIsımler.add("Kanunî Sultan Süleyman (1520 – 1566)");
        padisahIsımler.add("II. Selim (1566 – 1574)");
        padisahIsımler.add("III. Murad (1574 – 1595)");
        padisahIsımler.add("III. Mehmed (1595 – 1603)");
        padisahIsımler.add("I. Ahmed (1603 – 1617)");
        padisahIsımler.add("I. Mustafa (1617 – 1618 / 1622 – 1623)");
        padisahIsımler.add("Genç Osman (1618 – 1622)");
        padisahIsımler.add("IV. Murad (1623 – 1640)");
        padisahIsımler.add("İbrahim (1640 – 1648)");
        padisahIsımler.add("IV. Mehmed (1648 – 1687)");
        padisahIsımler.add("II. Süleyman (1687 – 1691)");
        padisahIsımler.add("II. Ahmed (1691 – 1695)");
        padisahIsımler.add("II. Mustafa (1695 – 1703)");
        padisahIsımler.add("III. Ahmed (1703 – 1730)");
        padisahIsımler.add("I. Mahmud (1730 – 1754)");
        padisahIsımler.add("III. Osman (1754 – 1757)");
        padisahIsımler.add("III. Mustafa (1757 – 1774)");
        padisahIsımler.add("I. Abdülhamid (1774 – 1789)");
        padisahIsımler.add("III. Selim (1789 – 1807)");
        padisahIsımler.add("IV. Mustafa (1807 – 1808)");
        padisahIsımler.add("II. Mahmud (1808 – 1839)");
        padisahIsımler.add("Abdülmecid (1839 – 1861)");
        padisahIsımler.add("Abdülaziz (1861 – 1876)");
        padisahIsımler.add("V. Murad (30 Mayıs 1876 – 31 Ağustos 1876)");
        padisahIsımler.add("II. Abdülhamid (1876 – 1909)");
        padisahIsımler.add("Mehmed Reşad (1909 – 1918)");
        padisahIsımler.add("Mehmed Vahdeddin (1918 – 1922)");

        final ArrayList<String>padisahHayatlari = new ArrayList<>();
        padisahHayatlari.add("Osmanlı Devleti’nin kurucusu olan Osman Gazi, 1258’de, Söğüt’te doğdu. Babası Ertuğrul Gazi, Annesi Halime Hatun’dur. Osman Gazi, uzun boylu, yuvarlak yüzlü, esmer tenli, ela gözlü ve kalın kaslıydı. Omuzları arası oldukça geniş, vücudunun belden yukarı kısmı, aşağı kısmına oranla daha uzundu. Başına kırmızı çuhadan yapılmış Çağatay tarzında Horasan tacı giyerdi. İç ve dış elbiseleri geniş yenliydi.\n" +
                "Osman Gazi değerli bir devlet adamıydı. Dürüst, tedbirli, cesur, cömert ve adalet sahibiydi. Fakirlere yedirip, onları giydirmeyi çok severdi. Üzerindeki elbiseye kim biraz dikkatlice baksa, hemen çıkartıp ona hediye ederdi. Her ikindi vakti, evinde kim varsa onlara ziyafet verirdi.\n" +
                "Osman Gazi, 1281 yılında Sögüt’te, Kayı Boyu’nun yönetimine geçtiğinde henüz 23 yaşındaydı. Ata binmekte, kılıç kullanmakta ve savaşmakta çok ustaydı. Aşiretin ileri gelenlerinden, Ömer Bey’in kızı Mal Hatun ile evlendi ve bu evlilikten ileride Osmanlı Devleti’nin başına geçecek olan oğlu Orhan Gazi doğdu.\n" +
                "Sögüt’te temelleri atılan, altı yüzyıllık bir tarih diliminde ve üç kıtada hüküm sürecek olan Osmanlı Devleti’nin kurucusu Osman Gazi, 1326’da Bursa’da Nikris (goutte) hastalığından öldü.");

        padisahHayatlari.add("Orhan Gazi, 1281 yılında doğdu. Babası Osman Gazi, annesi Kayı aşiretinin ileri gelenlerinden Ömer Bey’in kızı Mal Hatun’du. Orhan Gazi, sarı sakallı, uzunca boylu, mavi gözlüydü. Yumuşak huylu, merhametli, fakir halkı seven, ûlemaya hürmetli, dindar, adalet sahibi, hesabını bilen ve hiçbir zaman telaşa kapılmayan, halka kendisini sevdirmiş bir beydi. Sık sık halkın arasına karışır, onları ziyaret etmekten çok hoşlanırdı.\n" +
                "Orhan Gazi, Babası Osman Gazi’nin 1326’da vefatı üzerine beyliğin başına geçti. Orhan Gazi, 1346’da Bizans İmparatoru VI. Yoannis Kantakuzenos’un kızı Teodora ile evlendi. Ayrıca, Yarhisar Tekfur’unun kızı Holofira, Bilecik tekfuruyla evlendirilirken, düğün basılıp Holofira esir alındı ve Orhan Gazi ile evlendirildi. Müslüman olduktan sonra adı Nilüfer Hatun olarak değiştirildi; bu evlilikten, ileride Osmanlı Devleti’nin üçüncü hükümdarı olacak Murad Hüdavendigâr doğdu.");

        padisahHayatlari.add("Sultan Birinci Murad, 1326’da, Bursa’da doğdu. Babası Orhan Gazi, annesi Bizans tekfurlarından Yar Hisar Tekfuru’nun kızı olan Nilüfer Hatun’dur (Holofira). Sultan Birinci Murad, uzun boylu, değirmi yüzlü ve iri burunluydu. Kalın ve adaleli bir vücuda sahipti.\n" +
                "Başına mevlevî sikkesi üzerine destar sarılı bir başlık giyerdi. Çok sade giyinir ve kırmızı zeminli beyaz elbiseden hoşlanırdı. İlk eğitimini, annesi Nilüfer Hatun’dan aldı. Daha sonra tahsilini tamamlamak için Bursa’ya gitti. Buradaki Medreselerde ilim ve sanat adamları ile beraber çalıştı.\n" +
                "Sultan Birinci Murad, gayet nazik, sevimli ve çok halim selim bir insandı. Âlim ve sanatkârlara hürmet gösterir, fakirlere ve kimsesizlere şefkatli davranırdı. Dahî bir asker ve devlet adamıydı. “Derviş Gazilerin, Şeyhlerinin, Kralı Murad Gazi” diye anılan Sultan Birinci Murad, bütün hayatı boyunca plânlı ve programlı hareket etti.\n" +
                "Sultan Birinci Murad, Bizans Kilisesi’ne göre bir kâfir ve İsa düşmanı olarak görülse de, fethettiği yerlerde yaşayan Hristiyan halka iyi davrandığı için onların sevgisini kazanmıştı. 1382 yılından itibaren “Murad Hüdavendigâr” diye anılan Sultan Birinci Murad, Birinci Kosova Savaşı’ndan sonra savaş alanını gezerken, Sırp Asilzâdesi Milos Obraviç (Sırp Kralı Lazar’ın damadı) tarafından hançerlenerek şehit oldu (1389).");

        padisahHayatlari.add("Yıldırım Bayezid 1360 yılında Edirne’de doğdu. Babası Murad Hüdavendigâr, annesi Gülçiçek Hatun’dur. Yıldırım Bayezid yuvarlak yüzlü, beyaz tenli, koç burunlu, elâ gözlü, kumral saçlı, sık sakallı ve geniş omuzluydu. Girdiği savaşlarda gösterdiği cesaretten ve hızlı hareket etmesinden dolayı ona ‘Yıldırım’ lakabı takılmıştı.\n" +
                "Çocukluğunu Bursa Sarayı’nda kardeşleriyle birlikte geçirdi. İyi bir eğitim gördü. Devrin en büyük âlimlerinden dersler aldı. Gençliğinde Kütahya sancağında valilik yaptı. Sultan Murad Hüdavendigâr’ın vasiyeti gereği 1389 yılında padişahlığa getirildi. Tahta çıktığında 29 yaşındaydı.\n" +
                "Sırbistan’ın başında, Kosova Savaşında ölen Kral Lazar’ın oğlu Stefan Lazareviç vardı. Barış antlaşması için geldiği Edirne’de kız kardeşi Maria’yı Bayezid’e verdi. Bu evlenme sayesinde Osmanlı-Sırp dostluğu kuruldu. Yıldırım Bayezid, Timur’la yaptığı Ankara Savaşı’nda yenildi ve esir düştü. 13 yıl süren saltanatı sonunda esaretinin başlamasından 7 ay 12 gün sonra vefat etti.\n" +
                "Yıldırım Bayezid şiirlerinde “Yıldırım” mahlasını kullanırdı:\n" +
                "“Ehl-i hicran fitne-i agyar\n" +
                "Ortada bir bahanedir sandım.”");

        padisahHayatlari.add("Sultan Çelebi Mehmed , 1389 yılında Edirne’de doğdu. Babası Yıldırım Bayezid, annesi de Germiyanoğulları’ndan Devlet Hatun’dur. Orta boylu, yuvarlak yüzlü, beyaz tenli, kırmızı yanaklı ve geniş göğüslüydü. Kuvvetli bir vücuda sahipti. Gayet hareketli ve cesurdu. Güreş yapar ve çok kuvvetli yay kirişlerini bile çekebilirdi. Padişahlığı süresince bizzat yirmi dört savaşa katılan Çelebi Mehmed, bu savaşlarda kırka yakın yara aldı. Başında kullanmış olduğu sarık, altın işlemeli kavuğu ile gayet güzel görünürdü. İçi kürklü ve yakası dik olan bir kaftan giyinirdi.\n" +
                "Sultan Çelebi Mehmed Müslümanlara karşı göstermiş olduğu adaleti, aynı zamanda Hristiyan topluluklara karşı da gösterdi. İyi bir idareci ve politikacıydı. Tahsilini Bursa Sarayı’nda tamamladı. Daha sonra babası tarafından Amasya sancak beyliğine tayin edildi ve bu sırada devlet işlerini öğrendi.\n" +
                "\n" +
                "Fetret Devri’nden sonra Anadolu’daki beylikleri tekrar bir araya toplamayı başaran Sultan Çelebi Mehmed’e Osmanlı Devleti’nin ikinci kurucusu gözüyle de bakılabilir.\n" +
                "\n" +
                "Sultan Çelebi Mehmed 26 Mayıs 1421 de Edirne’de vefat etti. Ölüm haberi gizlendi. Osmanlı padişahları arasında ölümü gizlenen ilk padişah o oldu. Cenazesi Bursa’ya\n" +
                "getirilerek Yeşil Türbe’ye defnedildi.");

        padisahHayatlari.add("Sultan İkinci Murad 1402 yılında doğdu. Babası Çelebi Mehmed, annesi Dulkadiroğulları’ndan Süli Bey’in kızı Emine Hatun’dur. Uzun boylu, beyaz tenli, doğan burunlu ve güzel yüzlü bir Padişahtı. Çok güzel konuşurdu. Kendisinin en büyük mutluluğu, Fatih Sultan Mehmed gibi eşine az rastlanacak bir insanın Babası olmaktı.\n" +
                "Sultan İkinci Murad, sakin ve huzurlu bir hayat yaşamayı arzu eden, fakat gerektiği takdirde çok hareketli, cesur ve hiçbir şeyden yılmayan bir kişiliğe sahipti. Avrupalılar, Onun, istediği takdirde bütün Avrupa’yı fethedebilecek bir kimse olduğunu kabul etmişlerdir. Otuz yıllık saltanatı süresince, ülkesini çok büyük bir şan ve şerefle idare ederek, emri altında bulunan herkesin sevgisini kazandı. Dindar, âdil ve lütufkâr bir padişahtı. Çocukluğu Amasya’da geçen Sultan İkinci Murad, tahta çıktığında on dokuz yaşındaydı.");

        padisahHayatlari.add("Fatih Sultan Mehmed, 29 Mart 1432’de, Edirne’de doğdu. Babası Sultan İkinci Murad, annesi Humâ Hatun’dur. Fatih Sultan Mehmed, uzun boylu, dolgun yanaklı, kıvrık burunlu, adaleli ve kuvvetli bir yapıya sahipti. Devrinin en büyük âlimlerinden çok iyi eğitim görmüştü; yedi yabancı dil bildiği söylenir. Âlim, şâir ve sanatkârları sık sık toplar ve onlarla sohbet etmekten çok hoşlanırdı. İlginç ve bilinmedik konular hakkında makaleler yazdırır ve bunları incelerdi. Hocalığını da yapmış olan Akşemseddin, Fatih Sultan Mehmed’in en çok değer verdigi âlimlerden biridir. Fatih Sultan Mehmed, gayet soğukkanlı ve cesurdu. Eşsiz bir komutan ve idareciydi. Yapacağı işlerle ilgili olarak en yakınlarına bile hiçbir şey söylemezdi.\n" +
                "Fatih Sultan Mehmed, okumayı çok severdi. Farsça ve Arapça’ya çevrilmiş olan felsefî eserler okurdu. 1466 yılında Batlamyos Haritası’nı yeniden tercüme ettirip, haritadaki adları Arap harfleriyle yazdırdı. Bilimsel sorunlarda, hangi din ve mezhebe mensup olursa olsun bilginleri korur onlara eserler yazdırırdı. Bilime büyük önem veren Fatih Sultan Mehmed, yabancı ülkelerdeki büyük bilginleri İstanbul’a getirtti. Nitekim astronomi bilgini Ali Kuşçu, kendi döneminde İstanbul’a geldi. Ünlü ressam Bellini’yi de İstanbul’a davet ederek kendi resmini yaptırdı.\n" +
                "Fatih Sultan Mehmed, 1481 yılına kadar hükümdarlık yaptı ve bizzat yirmi beş sefere katıldı. Azim ve irade sahibiydi. Temkinli ve verdiği kararları kesinlikle uygulayan bir kişiliği vardı. Devlet yönetiminde oldukça sertti. Savaşlarda çok cesur olur, bozgunu önlemek için ileri atılarak askerleri savaşa teşvik ederdi.\n" +
                "20 yaşında Osmanlı padişahı olan Sultan İkinci Mehmed, İstanbul’u fethedip 1100 yıllık Doğu Roma İmparatorluğu’nu ortadan kaldırarak ‘Fatih’ unvanını aldı. Hz. Muhammed’in Hadis-i Şerifinde müjdelediği İstanbul’un fethini gerçekleştiren büyük komutan olmayı da başaran Fatih Sultan Mehmed, yüksek yeteneği ve dehasıyla dost ve düşmanlarına gücünü kabul ettirmiş bir Türk hükümdarıydı. Ortaçağ’ı kapatıp, Yeniçağ’ı açan cihan hükümdarı Fatih Sultan Mehmed, nikris hastalığından dolayı 3 Mayıs 1481 günü, Maltepe’de vefat etti ve Fatih Camii’nin yanındaki Fatih Türbesi’ne defnedildi. O’nun Roma’yı fethedeceği düşüncesiyle zehirlendiği de kaynaklarda yer almaktadır.");

        padisahHayatlari.add("Sultan İkinci Bayezid, 3 Aralık 1448’de, Dimetoka’da doğdu. Babası Fatih Sultan Mehmed, annesi Mükrime Hatun adında bir Türk kızıdır. Uzun boylu, geniş göğüslü ve kuvvetli bir vücuda sahipti. Yüzü yuvarlak ve gözleri elâydı. Cesur ve atılgandı.\n" +
                "Aynı zamanda çok hâlim-selim, dindar, hoşgörülü bir padişahtı. Babası Fatih Sultan Mehmed ilme ilgi duyduğu için, oğlu Şehzade Bayezid’e iyi bir eğitim verdi. Ona devrin en meşhur âlimlerinden ders okutturdu, bütün İslâm ilimlerini en iyi şekilde öğrenmesini sağladı.\n" +
                "Sultan İkinci Bayezid, yedi yaşında iken, Hadim Ali Paşa nezaretinde Amasya valiliğine tayin edildi. Amasya, Selçuklular devrinden beri önemli bir ilim ve kültür merkeziydi. Padişah olacak şehzadelerin yetişmesi için, bu vilayette bütün imkânlar vardı.\n" +
                "Sultan İkinci Bayezid, dindar bir kimse olduğu için kendisine Bayezid-i Velî denildi. Sultan İkinci Bayezid, şairleri saraya toplar, onlarla sohbet ederdi. Merhametli bir padişah olan Sultan İkinci Bayezid, sık sık fakirlere sadaka dağıtırdı.\n" +
                "Arapça ve Farsça’yı gayet iyi biliyordu. Çağatay lehçesi ve Uygur alfabesini de öğrendi. İslâm ilimlerinin yanı sıra, matematik ve felsefe tahsili de yaptı. 24 Nisan 1512’de padişahlıktan ayrılmak zorunda kalan Sultan İkinci Bayezid, bir ay kadar daha yaşadı ve 26 Mayıs 1512’de vefat etti.");

        padisahHayatlari.add("Yavuz Sultan Selim, 10 Ekim 1470’de doğdu. Babası Sultan İkinci Bayezid, annesi Gülbahar Hatun’dur. Gülbahar Hatun, Dulkadiroğulları Beyliği’ndendir. Yavuz Sultan Selim, uzun boylu, geniş omuzlu, kalın kemikli, Omuzlarının arası geniş, yuvarlak başlı, kırmızı yüzlü, uzun bıyıklı ve yiğit bir padişahtı. Sert tabiatlı ve cesurdu. İyi bir eğitim gördü.\n" +
                "Babası Sultan İkinci Bayezid, padişah olduktan sonra, askeri sevk ve devlet idareciliğini öğrenmesi için, Şehzade Selim’i Trabzon Sancağına vali olarak tayin etti.\n" +
                "Şehzade Selim, Trabzon’da devlet işlerinin yanında, ilimle uğraşır ve büyük âlim Mevlâna Abdülhalim Efendi’nin derslerini takip ederdi. Trabzon’u çok güzel idare eden Şehzade Selim bu arada komşu devletlerle de ilgilendi.\n" +
                "Valiliği sırasında Trabzon halkını rahat bırakmayan Gürcüler üzerine üç sefer yaptı. En önemlisi olan Kütayis Seferinde Kars, Erzurum ve Artvin illeri ile birçok yeri fethederek Osmanlı topraklarına kattı (1508). Buralarda yaşayan Gürcülerin hepsi Müslüman oldular.\n" +
                "Çok güzel ata biner, devrin en meşhur silahşörlerini alt edecek kadar iyi kılıç kullanırdı. Güreşmekte, ok atmada ve yay çekmede ustaydı. Savaştan hoşlanmakla beraber çok ince bir ruha da sahipti. Mütevazi bir kişiliği olan Yavuz Sultan Selim, her öğün yemekte tek çeşit yemek yerdi ve ağaçtan tabaklar kullanırdı.\n" +
                "Gösterişten hoşlanmaz, devlet malını israf etmezdi. Babasından devraldığı tatminkâr hazineyi ağzına kadar doldurdu. Hazinenin kapısını mühürledikten sonra, şöyle vasiyet etti:\n" +
                "“Benim altınla doldurduğum hazineyi, torunlarımdan her kim doldurabilirse kendi mührü ile mühürlesin, aksi halde Hazine-i Hümayûn benim mührümle mühürlensin“.\n" +
                "Bu vasiyet tutuldu. O tarihten sonra gelen padişahların hiçbiri hazineyi dolduramadığından, hazinenin kapısı daima Yavuz’un mührüyle mühürlendi.\n" +
                "Yavuz Sultan Selim, ataları hep sakal uzattıkları halde sakalını keserdi. Bunun sebebini soranlara “Sakalımı ele vermemek için kesiyorum” dediği rivayet edilir. 22 Eylül 1520’de, “Aslan Pençesi” denilen bir çıban yüzünden henüz elli yaşında iken vefat etti.\n" +
                "Hayatının son dakikalarında Yasin-i Şerif okuyordu. Kanûnî Sultan Süleyman, Fatih Camii’nde babasının cenaze namazını kıldıktan sonra, onu Sultan Selim Camii avlusundaki türbeye defnettirdi. Tarihçiler, Yavuz Sultan Selim’i, sekiz yıla seksen yıllık iş sığdırmış büyük bir padişah olarak değerlendirdiler.");
        padisahHayatlari.add("Kanûnî Sultan Süleyman, 27 Nisan 1495 Pazartesi günü, Trabzon’da doğdu. Babası Yavuz Sultan Selim, annesi Hafsa Hatun’dur. Hafsa Hatun Türk ya da Çerkezdir. Kanûnî Sultan Süleyman, yuvarlak yüzlü, elâ gözlü, geniş alınlı, uzun boylu ve seyrek sakallıydı.\n" +
                "Kanûnî Sultan Süleyman devri, Türk hakimiyetinin doruk noktasına ulaştığı bir devir olmuştur. Babası Yavuz Sultan Selim, onu küçük yaşlardan itibaren çok titiz bir şekilde yetiştirmeye başladı. Benzeri görülmemiş bir terbiye ve tahsil gördü. İlk eğitimini annesinden ve ninesi Gülbahar Hatun’dan (Yavuz Sultan Selim’in annesi) aldı. Yedi yaşına gelince tahsil için İstanbul’a, dedesi Sultan İkinci Bayezid’in yanına gönderildi; Şehzade Süleyman, burada Kara Kızoğlu Hayreddin Hızır Efendi’den tarih, fen, edebiyat ve din dersleri alırken, savaş teknikleri konusunda da öğrenim görüyordu. On beş yaşına kadar babası Yavuz Sultan Selim’in yanında kalan Şehzade Süleyman, kanunlar gereği sancak istemesi üzerine, önce Şarkî Karahisar’a oradan da Bolu, kısa bir süre sonra da Kefe sancak beyliğine tayin edildi (1509).\n" +
                "Yavuz Sultan Selim’in, 1512 de tahta geçmesi üzerine İstanbul’a çağırılan Şehzade Süleyman, babasının kardeşleriyle mücadeleleri sırasında İstanbul’da kalarak babasına vekâlet etti. Bu sırada Saruhan sancakbeyliğinde de bulundu. Babası Yavuz Sultan Selim’in ölümü üzerine, 30 Eylül 1520’de, yirmi beş yaşındayken Osmanlı tahtına geçti. Kendisinden başka erkek kardeşi olmadığı için tahta geçişi kolay ve çatışmasız oldu. Çok ciddi ve kendinden emin bir padişah olan Kanûnî Sultan Süleyman, azim ve irade sahibiydi. Yapacağı işlerde hiç acele etmez, gayet geniş düşünür ve verdiği emirden asla geri dönmezdi. İş başına getireceği adamlara, kabiliyet derecelerine göre görev verirdi. Sigetvar kuşatmasını idare ederken, 7 Eylül 1566 yılında yetmiş bir yaşında vefat etti.\n" +
                "Kendisine “Kanûnî” denmesi, yeni kanunlar icad etmesinden değil, mevcut kanunları yazdırtıp çok sıkı bir şekilde tatbik etmesinden dolayıdır. Kanûnî Sultan Süleyman, adaleti seven bir padişahtı. Mısır’dan gelen vergiyi haddinden fazla bulup, yaptırdığı araştırma sonunda halkın zulme uğradığını düşünmesi ve Mısır Valisini değiştirmesi bunun açık kanıtıdır.\n" +
                "Kanûnî Sultan Süleyman, tahta çıktığı sırada Osmanlı Devleti dünyanın en zengin ve en güçlü devleti konumundaydı. Babasının ölümü ve kendisinin padişah olması, “Arslan öldü, yerine kuzu geçti” diye düşünen Avrupalıları sevindiriyordu. Ancak Avrupalılar, çok geçmeden hayal kırıklığına uğradılar.\n" +
                "Büyük bir devlet adamı olan Kanûnî Sultan Süleyman aynı zamanda ünlü bir şairdi. Meşhur şiirlerinden birisi şudur:\n" +
                "“Halk içinde muteber bir nesne yok devlet gibi,\n" +
                "Olmaya devlet cihanda, bir nefes sıhhat gibi.\n" +
                "Saltanat dedikleri bir cihan kavgasıdır,\n" +
                "Olmaya baht ü saadet dünyada vahdet gibi”.");

        padisahHayatlari.add("Sultan İkinci Selim, 28 Mayıs 1524’de, İstanbul’da doğdu. Babası Kanûnî Sultan Süleyman, annesi Hürrem Sultan’dır.\n" +
                "Hürrem Sultan, Slav kökenlidir. Sultan İkinci Selim, orta boylu, açık alınlı, mavi gözlü, ince kaslı ve sarışındı. Şehzadeliğinde mükemmel bir tahsil ve terbiye ile yetiştirildi. Devlet idaresini iyice öğrenmek için de Anadolu’nun çeşitli yerlerinde sancakbeyliği yaptı. Bu sırada tahsiline devam ederek, ilim ve tecrübesini arttırdı.\n" +
                "Sarı Selim olarak da anılan İkinci Selim, Kütahya sancakbeyi iken babası Cihan Padişahı Kanûnî Sultan Süleyman’ın ölüm haberi üzerine İstanbul’a gelerek 30 Eylül 1566 günü kırk iki yaşında tahta geçti. Sarı Selim, daha önceki Osmanlı sultanlarına göre silik ve zayıf bir hükümdar olarak tanınır.\n" +
                "Babasının saltanatı sırasında diğer kardeşleri Şehzade Bayezid ve Şehzade Mustafa’nın bertaraf edilmesiyle kolayca tahta geçen Sultan İkinci Selim, adını aldığı dedesi Yavuz Sultan Selim ve Babası Kanûnî’ye göre oldukça silik bir idare sergilemiştir. Devrin büyük devlet adamları sayesinde Osmanlı Devleti ihtişamını sürdürmüş, Sokullu Mehmed Paşa gibi dirayetli ve tecrübeli vezirler hükûmeti ayakta tutmuşlardır. Sultan İkinci Selim’in kendisi hiç sefere çıkmamış ve liyakatlı olmayan Ali Paşa’nın Kaptan-ı Deryalığında İnebahtı faciası yaşanmıştır. Sekiz yıl padişahlık yaptıktan sonra 15 Aralık 1574 günü vefat etti. Ayasofya’ya defnedildi. Sultan İkinci Selim İstanbul’da ölen ilk Osmanlı padişahıdır.\n" +
                "Sultan İkinci Selim’in tahta çıktığı ilk yıllarda, bazı siyasî çekişmeler yaşandı. Sokullu Mehmed Paşa bu çekişmelerden galip olarak ayrıldı ve on beş yıl sadrazamlık yaptı. Sadrazamlık yaptığı bu dönemde devlet yönetimine ağırlığını koydu.\n" +
                "Sultan İkinci Selim, babası Kanûnî Sultan Süleyman’dan 14. 892.000 km2 olarak devraldığı devlet topraklarını, oğlu Sultan Üçüncü Murad’a 15.162.000 km2 olarak bırakmıştır.\n" +
                "İkinci Selim de şair hükümdarlardandı. Şaheser beyitlerinden biri şudur:\n" +
                "“Biz bülbül-i muhrik-i dem-i sekvayi fira Kız\n" +
                "Ateş kesilir geçse saba gülşenimizden”");

        padisahHayatlari.add("Sultan Üçüncü Murad, 4 Temmuz 1546 günü, Manisa’nın Bozdağ Yaylası’nda dünyaya geldi. Babası, Sultan İkinci Selim, annesi Afife Nur Banu Sultan’dır. Annesi Venedikli’dir. Sultan Üçüncü Murad orta boylu, değirmi yüzlü, kumral sakallı, elâ gözlü ve beyaz tenli bir padişahtı. Çok cömertti ve insanlara yardım etmeyi çok severdi.\n" +
                "Merhametli bir kişiliğe sahip olan Sultan Üçüncü Murad, Arapça ve Farsça’yı çok iyi derecede öğrenmişti. Babasının 1558 yılında, Manisa sancak beyliğinden Karaman valiliğine tayin edilmesi üzerine, dedesi Kanûnî Sultan Süleyman tarafından Alaşehir sancak beyliğine tayin edildi. Babası Sultan İkinci Selim, padişah olduktan sonra da tekrar Manisa sancak beyliğine atandı.\n" +
                "Şehzadeliği sırasında bulunduğu Manisa’da devrin en değerli ulemâsından dersler aldı. Osmanlı Padişahları içinde en âlim padişahlardan birisidir. Babası Sultan İkinci Selim’in vefatı üzerine Manisa’dan İstanbul’a gelerek, 22 Aralık 1574 tarihinde tahta geçti. Ancak o da babası Sultan İkinci Selim gibi devlet işlerine fazla müdahil olmadı. Bürokrasi ve hükûmet daha ziyade Sokullu Mehmed Paşa tarafından idare edildi. Bunda Sokullu’nun tecrübe ve dirayeti ile Sultan Üçüncü Murad’ın idare tarzı büyük rol oynamıştır.\n" +
                "Sultan Üçüncü Murad, saltanatı boyunca İstanbul’dan hiç çıkmadı ve saraydaki kadınların etkisinde kaldı. Daha sonraki yıllarda Osmanlı Devleti’nin bir devrini etkileyecek olan kadınlar saltanatı onun devrinde başladı. 29 yaşında çıktığı tahtta yirmi yıl kalan Sultan Üçüncü Murad 16 Ocak 1595 tarihinde felç geçirdi ve vefat etti. Ayasofya Camii’nin avlusuna defnedildi.\n" +
                "Sokullu Mehmed Paşa’nın ağırlığını hissettirdiği III. Murad döneminde, Osmanlı toprakları en geniş sınırlarına ulaştı. Babası İkinci Selim’den devraldığı 15. 162.151 km2 ülke toprağını, 19.902.000 km2’ye çıkardı. İngilizlerle de dostâne ilişkiler geliştirildi.\n" +
                "İlk İngiliz daimî elçisi onun zamanında gönderildi. Papa’nın Katolik Avrupa’da kurabileceği haçlı ittifakına karşı Protestan İngiltere ile ilişkiler geliştirildi. Daha sonra bu ittifaka, Hollanda da dahil edildi. Devlet işlerini Sokullu’ya devreden Sultan Üçüncü Murad zamanında sarayda kadınlar devlet işlerine çokça karışmaya başladılar bu durum, Sokullu’nun ölümünden sonra daha da artarak devam etti.");


        padisahHayatlari.add("Sultan Üçüncü Mehmed, 26 Mayıs 1566’da, Manisa’da doğdu. Babası Sultan Üçüncü Murad, annesi Safiye Sultan’dır. İsmini, Fatih Sultan Mehmed’e benzemesi için, büyük dedesi Kanûnî Sultan Süleyman koydu. Orta boylu, kumral saçlı ve güzel yüzlüydü. İyi bir ilim tahsili yaptı ve Tâcü’t-Tevârih yazarı Hoca Sadeddin Efendi’den dersler aldı. Sultan Üçüncü Mehmed, 1583’te Manisa sancak beyliğine tayin edildi. 1595 yılının Ocak ayına kadar görev yaptığı Manisa’dan, Babasının ölüm haberi üzerine hareket ederek, 27 Ocak 1595 tarihinde geldiği İstanbul’da, Osmanlı tahtına geçti.\n" +
                "Sultan Üçüncü Mehmed, annesini çok sever, sayar ve dinlerdi. Bundan yararlanan annesi Safiye Sultan, Osmanlı sarayında hâkimiyet kurdu. Bazı konularda Padişahı zorlayıp istediğini yaptırıyor, bu da devlet işlerinde karışıklıklara sebep oluyordu. Dindar olup, tasavvufa da son derece meraklıydı. Hz. Muhammed’in ismi anılınca, saygısından derhal ayağa kalkardı. Üçüncü Mehmed devri, duraklama dönemine rastlar. Sultan Üçüncü Mehmed, kolayca üzüntüye kapılır, yemekten, içmekten kesilirdi. Celâlî isyanları ve İran savaşlarının çok uzun sürmesi onu büyük üzüntü içinde bıraktı. İçkiyi sıkı bir şekilde yasaklayıp, bütün gizli meyhaneleri kapattırdı.");

        padisahHayatlari.add("Sultan Birinci Ahmed, 18 Nisan 1590 günü, Manisa’da doğdu. Babası Sultan Üçüncü Mehmed, annesi Handan Sultan’dır. İyi bir tahsil gördü. Arapça ve Farsça’yı mükemmel derecede öğrenmişti. Ok atmak, kılıç kullanmak, ata binmek gibi savaş ve askerlik alanlarında çok usta olan Sultan Birinci Ahmed, ava ve cirit oyununa çok düşkündü. Çok sade giyinirdi. Babası Sultan Üçüncü Mehmed’in vefati üzerine 21 Aralık 1603’te, Eyüb Sultan’da kılıç kuşanarak tahta geçti.\n" +
                "\n" +
                "Sultan Birinci Ahmed, Kanûnî Sultan Süleyman’dan sonraki padişahlar içinde devlet işleriyle yoğun şekilde uğraşan ilk padişahtı. Çocuk denecek yaşlarda bile mükemmel kararlar alırdı. Daima ilim ve irfan sahibi büyük kişilerle birlikte olur ve onlara akıl danışırdı.\n" +
                "\n" +
                "Sultan Birinci Ahmed’in hayatında on dört sayısının önemli bir yeri vardır. Çünkü, on dört yaşında Padişah olmuş, on dört yıl saltanat sürmüş ve Osmanlı padişahlarının on dördüncüsüdür. Dindar bir padişah olan Sultan Birinci Ahmed’in Hz.Muhammed’e olan bağlılığı o kadar ilerledi ki, onun ayak izlerinin resmi içine bir şiir yazmış ve o şiiri kavuğunda ölünceye kadar taşımıştır. O şiir şudur:\n" +
                "“N’ola tâcim gibi başımda götürsem dâim\n" +
                "Kadem-i resmini ol Hazreti Sâh-i Resûlün\n" +
                "Gül-i gülzâri nübüvvet, o kadem sahibidir\n" +
                "Ahmeda durma yüzün sür kademine ol gülün”\n" +
                "Sultan Birinci Ahmed, yakalandığı tifüs hastalığından kurtulamayarak 21 Kasım’ı 22 Kasım’a bağlayan gece 1617 yılında yirmi sekiz yaşında vefat etti.");

        padisahHayatlari.add("Sultan Birinci Mustafa, 1592 yılında, Manisa’da doğdu. Babası Sultan Üçüncü Mehmed, annesi Handan Sultan’dır. Sultan Birinci Mustafa güzel yüzlü, seyrek sakallı, sarı benizli ve iri gözlü bir padişahtı. İki defa padişahlık yaptı. Sinirli bir yapıya sahipti.\n" +
                "Sultan Birinci Mustafa, ağabeyi Sultan Birinci Ahmed’in padişahlığı süresince, on dört yıl sarayın bir odasında hapis hayatı yaşadı. O devirde bu gerekli görülüyordu. Aksi halde şehzadeler devlet yönetimine karışıyor, hatta padişahı devirmek için harekete bile geçebiliyor ve devlet birliği tehlikeye düşüyordu. Buna meydan vermemek için şehzadeler “izale” olunur veya bir odaya kapatılırdı. Sultan Birinci Ahmed, tahta geçtiğinde kardeşini öldürtmemiş, ancak sarayda mahpus tutmuştur. Kafes hayatı denilen bu süre sonunda Sultan Birinci Mustafa, Osmanlı hanedanının en büyük erkek evlâdı olması dolayısıyla tahta çıkarılmış fakat kısa sürede dengesiz hareketleri görüldüğünden ulemâ, asker ve devlet erkânının ittifakı ile hal (tahttan indirme) edilmiştir. Sultan Genç Osman’ın tahttan indirilip katlinden sonra bir kez daha cülûs etmişse de bir buçuk yıl sonra aklî dengesizliği nedeniyle tekrar tahttan indirilmesi icab etmiştir.\n" +
                "Sultan Birinci Mustafa ile birlikte kardeş katli nadiren görülmüş, artık şehzadeler sarayda kafes ardında tahta geçecekleri günü beklemeye başlamışlardır. Tabii vâlide sultanlar, şehzade anaları arasında rekabetler başlamış, her biri bir vezire ve diğer gruplara dayanarak entrikalarla padişah değiştirmeye çalışmışlardır.\n" +
                "Sultan Birinci Mustafa, dindar bir insandı. Sadaka vermeyi çok severdi. Hattâ sarayın havuzuna hizmetçilerin toplaması için para atardı. Saraydaki hayatını ibadet ederek, dinî eserler okuyarak geçiriyordu. Tahta geçmesi için ikinci kez davet edildiği zaman, odasında Kuran-ı Kerim okuduğunu ve padişahlık istemediğini bildirmişti.\n" +
                "Sultan Birinci Mustafa, ikinci padişahlığının başlamasından bir buçuk yıl sonra 10 Eylül 1623 tarihinde şeyhülislâm fetvası ile tekrar tahttan indirildi. Fetvanın gerekçesi olarak da “Aklî dengesi tam olmayan birisinin halife olamayacağı” gösterildi. Sultan Birinci Mustafa tahttan indirildikten on altı yıl sonra, 20 Ocak 1639 günü sinir hastalığından Topkapı Sarayı’nda vefat etti.");

        padisahHayatlari.add("Sultan Genç Osman, 3 Kasım 1604 tarihinde, İstanbul’da dünyaya geldi. Babası Birinci Ahmed, annesi Mahfirûz Haseki Sultandır. Mahfirûz Haseki Sultan aslen Rum’dur. Sultan Genç Osman, on dört yaşında iken, amcası Sultan Birinci Mustafa’nın tahttan indirilmesi üzerine Osmanlı tahtına oturdu. Annesi onun yetişmesi için çok titiz davrandı. Sultan Genç Osman, iyi bir terbiye ve tahsil gördü. Arapça, Farsça, Latince, Yunanca ve İtalyanca gibi doğu ve batı dillerini klâsiklerinden tercüme yapabilecek kadar güzel öğrendi. Çok güzel bir yüzü olan Genç Osman zekî, enerjik, atılgan, cesur ve gözü pek bir padişahtı.\n" +
                "Sultan Genç Osman, Fatih Sultan Mehmed devrine kadar yapıldığı gibi saray dışından, Şeyhülislam Es’ad Efendi’nin ve Pertev Paşa’nın kızları ile evlendi. Yavuz Sultan Selim devrinden itibaren padişah saray dışından evlenmediği için bu davranış önemli bir değişiklik oldu.\n" +
                "Kendisine plânlarını uygulayacak bir sadrazam bulamadı. Tarihte eşine az rastlanır bir şekilde tahttan indirilerek, Yedikule zindanlarında boğularak şehit edilen Sultan Genç Osman, babası Sultan Birinci Ahmed’in Sultanahmed Camii’nin yanındaki türbesine defnedildi.\n" +
                "Tahta çıkar çıkmaz devlet erkânı içindeki üst düzey yetkilileri değiştiren, müderris ve kadıların atanma yetkilerini şeyhülislâmdan alan Sultan Genç Osman çok yenilikçi bir padişahtı.");

        padisahHayatlari.add("Sultan Dördüncü Murad, 26 Temmuz 1612 tarihinde, İstanbul’da doğdu. Babası Sultan Birinci Ahmed, annesi Mahpeyker Kösem Sultan’dır. Sultan Dördüncü Murad, uzun boylu, iri cüsseli, yuvarlak yüzlü ve heybetli bir padişahtı. Osmanlı Sultanlarının en kudretlilerinden biri olarak tarihe geçti. Son derece zeki, gözü pek, cesur, kuvvetli ve enerjik bir insandı.\n" +
                "Sultan Dördüncü Murad, çok iyi cirit ve ok atardı. Bu gücünü katıldığı savaşlarda da gösterdi. Din büyüklerine hürmet eder Şeyhülislâm Yahya Efendi’ye “Baba” diye hitap ederdi. İçki ve tütünü yasakladı. Gece sokağa çıkma yasağı koydu. Arapça’yı ve Batı dillerini çok iyi bilirdi. İlmi ve ilim adamlarını çok sever, fırsat buldukça ilim meclislerine gider, onları yeni çalışmalar yapmaları için teşvik ederdi. Sultan Dördüncü Murad döneminin önemli olaylarından biri de Hezarfen Ahmed Çelebi’nin kanat takarak, Galata Kulesi’nden Üsküdar’a uçmasıydı.\n" +
                "Sultan Dördüncü Murad, çevresinde olup bitenleri dikkatle takip eder inisiyatifini kullanmakta asla tereddüt etmezdi. Hükümdarlığının ilk yıllarında annesinin etkisinde kaldıysa da daha sonra kadınların saltanatına son verdi; hain ve hilekâr sadrazamları şiddetle cezalandırdı. Memleket meselelerini yakından takip edip, çözümler üretmeye çalıştı. On yedi yıl hükümdarlık yaptıktan sonra, henüz 28 yaşında vefat etti.\n" +
                "Sultan Dördüncü Murad’ın saltanatını iki devreye ayırmak mümkündür. Henüz on bir yaşında iken tahta geçtiğinden devlet işleri büyük ölçüde annesi Kösem Sultan’ın elinde yürümekteydi. Onunla birlikte olan vezirler, gözünün önünde Hafız Ahmed Paşa’yı askere parçalatmışlar, genç padişahı da korkuyla dehşete düşürmüşlerdir. Osmanlı memleketlerinde asayiş ve huzur kalmamış, zorbalar şehirleri ele geçirmişlerdi. Delikanlılık çağında idareyi bizzat ele aldıktan sonradır ki Sultan Dördüncü Murad biraz da şiddet yolu ile bütün zorbaları sindirmiş, tekrar devlet hakimiyetini kurmuştur. Tütün yasağı bahanesiyle kahvehanelerde toplanan işsiz, güçsüz, zorba takımını kontrol altında tutmuş, şiddetli ceza ve hattâ idamlarla tekrar idarî ve adlî nizamı kurabilmiştir.");

        padisahHayatlari.add("Sultan Birinci İbrahim, 5 Kasım 1615 tarihinde, İstanbul’da doğdu. Babası Sultan Birinci Ahmed, annesi Mahpeyker Kösem Sultan’dır. Sultan Birinci İbrahim, uzun boylu, kuvvetli vücutlu ve kumral sakallıydı. Annesi onun yetiştirilmesi için çok gayret göstermişti. Ağabeyi Sultan Dördüncü Murad’ın âni vefatı, zaten ölüm düşünceleriyle harap olmuş Şehzade İbrahim’i çok sarstı ve padişah olduğuna inanmak bile istemedi. Annesinin ve devlet erkânın ısrarlarından ve ağabeyi Sultan Dördüncü Murad’ın cenazesini gördükten sonra ağabeyinin vefatına kesin olarak inandı. Sadrazam Kara Mustafa Paşa, Taht Odası’na geçen Sultan Birinci İbrahim’in başına Hırka-i Saadet Dairesi’nden getirilen, Hz. Ömer’in Sarığı’nı yerleştirdi. Sultan Birinci İbrahim tahta oturdu ve ellerini açarak dua etti:\n" +
                "“Elhamdülillah. Ya Rabbi! Benim gibi zaif bir kulunu bu makama lâyık gördün. Saltanat günlerimde milletimi hoş-hâl eyle ve birbirimizden hoşnûd eyle”.\n" +
                "Sultan Birinci İbrahim, tahta geçtiği ilk yıllarda sinir hastalığı yüzünden sık sık kriz geçiriyordu. Ancak, daha sonraki yıllarda devlet işleriyle bizzat ilgilenmeye başladı. Sultan Birinci İbrahim, tahta çıktığında soyunun tek şehzadesi o kalmıştı. Bu yüzden ilk oğlu Şehzade Mehmed (Sultan Dördüncü Mehmed) doğduğunda ülkede şenlikler düzenlendi (2 Ocak 1642). Sultan Birinci İbrahim, çok cömert ve lütufkâr bir padişahtı. Fakirlere ve kimsesizlere yardım etmeyi çok severdi. Çıkardığı fermanlarla açlık ve kıtlığın önlenmesine çalıştı. Saltanatı sırasında, annesi Kösem Sultan’ın etkisinde çok kaldı. Sekiz yıl dokuz ay padişahlık yaptıktan sonra, 18 Ağustos 1648 tarihinde, boğularak öldürüldü.\n" +
                "Sultan Birinci İbrahim hakkında, kendi devrine kadar uzanan Osmanlı kaynaklarında, aklî dengesinin bozuk olduğuna dair hiçbir bilgi yoktur. Bu kaynaklar, Sultan Birinci İbrahim’in özelliklerinden ve yaptığı işlerden övgüyle bahsetmektedir. Sadece son zamanlarda bazı yazarlar, onun için “Deli” demektedirler. Sultan Birinci İbrahim’e “Deli” ve “Gaddar” diyen ve adının öyle yayılması için çalışanlardan bazılarının, Sultan Birinci İbrahim tarafından idam ettirilen İranlı Şii Emirgûneoğlu’nun adamları olduğu söylenmektedir.\n" +
                "Sultan Birinci İbrahim, tahta geçtiğinde yirmi beş yaşındaydı. Şehzadeliği sırasında öldürüleceği endişesi ile sinirleri son derece bozulmuştu. Bu sırada sadrazamlık koltuğunda bulunan Kemankeş Kara Mustafa Paşa devlet işlerini en iyi şekilde yürüttü. Kemankeş Kara Mustafa Paşa, Safeviler’le Kasr-ı Şirin Antlaşmasını imzalayıp, İstanbul’a geldikten sonra, giriştiği malî işlerde de başarılı oldu. Ocaklı sayısını indirip maaşlarının düzenli olarak verilmesini sağladı. Bu olumlu faaliyetler sonunda devlet bütçesi denkleşmiş oldu. Donanma işleriyle de ilgilenen Kemankeş Mustafa Paşa, her yıl belirli miktarlarda Kadırgalar yapılıp donatılmalarını sağladı.");

        padisahHayatlari.add("Sultan Dördüncü Mehmed, 2 Ocak 1642’de, İstanbul’da doğdu. Babası Sultan Birinci İbrahim, annesi Rus asıllı Turhan Hatice Sultan’dır. Sultan Dördüncü Mehmed, orta boylu, beyaz tenli ve yanık çehreliydi. Ata çok bindiği için vücudu öne eğikti. Annesi onu çok iyi yetiştirdi. İyi bir tahsil gördü. Babası Sultan İbrahim’in öldürülmesi üzerine 8 Ağustos 1648 günü, henüz yedi yaşında iken padişah oldu. Ava ve edebiyata çok meraklıydı. Ava olan merakı yüzünden tarihte “Avcı Mehmed” olarak anılır.\n" +
                "İçkiyi yasaklayıp, içki imalâthanelerini kapattırdı. Sadrazamlığı, Köprülü ailesine vermekle çok isabetli bir karar aldı.\n" +
                "Hayatının büyük bir kısmı saray entrikalarıyla geçti. İkinci Viyana bozgunundan sonra, ordunun ve devlet erkânının oy birliği ile, 8 Kasım 1687 günü tahttan indirildi. Bundan sonraki ömrü, saraydaki bir odada yanına konulan iki cariye ile tam bir hapis hayatı şeklinde sürdü. 6 Aralık 1693’de Edirne’de vefat etti. Cenazesi İstanbul’a gönderildi ve Yeni Cami’deki türbesine, annesi Turhan Sultan’ın yanına defnedildi.");

        padisahHayatlari.add("Sultan İkinci Süleyman, 15 Nisan 1642’de, İstanbul’da doğdu. Babası Sultan Birinci İbrahim, annesi Saliha Dilaşub Sultan’dır. Orta boylu, kır sakallı, şişman ve halim selim bir padişahtı. Dindar, dürüst ve akıllı bir insan olan annesi Saliha Dilaşub Sultan tarafından titizlikle yetiştirildi. Oğluna, gerekli bilgileri bir yandan kendi veriyor, bir yandan da hocalar tutuyordu.\n" +
                "Hayatının kırk yılını bir dairede hapis geçiren Sultan İkinci Süleyman cesur, dindar, vatansever, merhametli ve nazik bir insandı. Rüşvet ve sefahata son derece düşmandı. Padişah olduğu sırada askerî zorbaların ortalığı karıştırması üzerine onlarla mücadeleye girişti ve kısmen de olsa asayişi sağladı.\n" +
                "Sultan İkinci Süleyman, dört yıl gibi kısa bir süre padişahlık yaptı. Bunun son iki yılını yatak hastası olarak geçirdi. Gün geçtikçe zayıflıyordu. 22 Haziran 1691 günü, Edirne’de vefat etti. Cenazesi İstanbul’a getirilerek Süleymaniye Camii yanında Kanûnî Sultan Süleyman Türbesine gömüldü.");

        padisahHayatlari.add("Sultan İkinci Ahmed, 25 Şubat 1643 günü, İstanbul’da doğdu. Babası Sultan Birinci İbrahim, annesi Hatice Muazzez Sultan’dır. Terbiyesi ve tahsili ile annesi meşgul oldu. Arapça ve Farsça biliyordu. Orta derecede bir tahsil gördü. Devlet işlerini çok yakından takip eder, hasta bile olsa divan toplantılarına katılırdı.\n" +
                "Sultan İkinci Ahmed, hat sanatında çok ustaydı. Yazı yazma kabiliyeti çok üstün olan Sultan İkinci Ahmed, birçok Kuran-ı Kerim yazdı. Şairlere ve şiire çok düşkündü. Üç yıl yedi ay ondört gün saltanat sürdükten sonra, yakalandığı siroz hastalığından kurtulamayarak 6 Şubat 1695 günü Edirne’de vefat etti. Cenazesi İstanbul’a getirilerek Kanûnî Sultan Süleyman Türbesine defnedildi.");

        padisahHayatlari.add("Sultan İkinci Mustafa, 6 Şubat 1664 günü, İstanbul’da dünyaya geldi. Babası Sultan Dördüncü Mehmed, annesi Emetullah Rabia Gülnuş Sultan’dır. Annesi Girit asıllıdır. Kuvvetli bir ilim tahsili yaptı. Tahta geçtiğinin üçüncü günü yapacağı işleri anlatan bir hatt-ı hümâyûn yayınladı. Yazısında: “Zevk, sefa ve rahatı kendimize haram eylemişizdir” diyordu. Yine vezirlerinden birine yazmış olduğu yazı şöyledir: “Bana ağırlık ve hazine lâzım değil. Yerine göre kuru ekmek yerim. Vücudumu din uğruna harcarım. Sıkıntının her çeşidine sabrederim. Milletime hizmet tamam olmadıkça, seferden dönmem. Elbette sefere bizzat kendim giderim”.");


        padisahHayatlari.add("Sultan Üçüncü Ahmed, 30 Aralık 1673 günü doğdu. Babası Sultan Dördüncü Mehmed, annesi Emetullah Rabia Gülnuş Sultan’dır. Annesi Girit asıllıdır. Sultan İkinci Mustafa’nın öz kardeşi olan Sultan Üçüncü Ahmed, uzun boylu, kara gözlü, doğan burunlu ve buğday tenli idi. Son derece zekî, hassas ve zarif bir insandı. İyi bir tahsil ve terbiye görmüş olan Sultan Üçüncü Ahmed ünlü hocalardan dersler almıştı.\n" +
                "Sultan Üçüncü Ahmed, ağabeyi Sultan İkinci Mustafa’nın vefatı üzerine 22 Ağustos 1703 tarihinde otuz yaşında iken Edirne’de tahta geçti. Osmanlı Devleti açısından önemli bir yere sahip olan Lâle Devri boyunca padişahlık yapan Sultan Üçüncü Ahmed, hattat ve şâirdi. “Necib” mahlasıyla şiirler yazdı. Ayrıca musiki ile de yakından ilgileniyordu. Divan şairlerinden Urfalı Nabi Efendi’nin hem kendisini hem de şiirlerini çok severdi.\n" +
                "Gençliği diğer Osmanlı şehzadelerine göre bir hayli serbest geçti. Şehzadelerin öldürülmesi geleneği kalktığından, rahat bir hayat sürdü. İstediği her şeyle ilgilendiği için bilgisi de, görgüsü de arttı. Avrupa’daki gelişmeleri inceleme fırsatı buldu ve matbaanın Osmanlı Devleti’ne gelmesi için çok çaba sarfetti. Yirmi yedi yıl gibi uzun bir süre tahtta\n" +
                "kalan Sultan Üçüncü Ahmed, çıkan Patrona Halil İsyanı sonunda, 1 Ekim 1730 tarihinde\n" +
                "padişahlıktan çekildi.\n" +
                "Sultan Üçüncü Ahmed’in padişahlığının ilk günleri, tamamen disiplinden çıkmış yeniçerileri yatıştırma gayretleri ile geçti. Ancak kendisini padişah yapan yeniçerilere karşı etkili olamadı. Sultan Üçüncü Ahmed’in sadrazamlığa getirdiği Çorlulu Ali Paşa, ona idarî konularda yardımcı olmaya çalıştı, hazine için yeni düzenlemelerde bulundu ve Sultan Üçüncü Ahmed’e rakipleriyle mücadelesinde destek oldu.\n" +
                "Sultan Üçüncü Ahmed zamanında, Rusya ile olan ilişkilerde gerginlik yaşandı. Bunun sebebi Rusya’nın Orta Asya üzerinde yayılma siyaseti izlemesi, Balkanlar’daki toplumları slavlaştırmaya çalışması, açık ve sıcak denizlere inmek istemesiydi.");


        padisahHayatlari.add("Sultan Birinci Mahmud, 2 Ağustos 1696 günü, İstanbul’da doğdu. Babası Sultan İkinci Mustafa, annesi Saliha Valide Sultan’dır. Büyükannesi Gülnuş Sultan’ın sevgi ve ilgisiyle büyüdü. Sekiz yaşından beri kafes hayatı yaşadığı halde zekâsı, iyi niyeti ve kuvvetli karakteri sayesinde kendini harap etmekten kurtardı. Küçük yaşlardan itibaren çeşitli hocalardan dersler aldı. Tarih, edebiyat ve şiirle meşgul oldu. Özellikle musıkî ile uğraştı.\n" +
                "Sultan Birinci Mahmud, 1 Ekim 1730 tarihinde otuz beş yaşında iken padişah oldu. Devrindeki en değerli kimseleri seçip iş başına getirdi. Karakter sahibi, azimli, müşfik, merhametli, dikkatli ve sabırlı bir insandı. Kendi zevkinden çok milletin refahını düşünerek hareket etti. Bu sayede babası ve amcasının düştüğü hatalara düşmedi. Hayatının son iki yılını hasta geçiren Sultan Birinci Mahmud, 13 Aralık 1754 tarihinde elli dokuz yaşında iken vefat etti. Sultan İkinci Mustafa’nın Yeni Cami’deki türbesine defnedildi.");


        padisahHayatlari.add("Sultan Üçüncü Osman, 2 Ocak 1699 günü, İstanbul’da doğdu. Babası Sultan İkinci Mustafa, annesi Şehsuvar Valide Sultan’dır. Şehsuvar Valide Sultan Rus asıllıdır. Tahta çıktığı elli altı yaşına kadar sarayda hapis hayatı yaşadığı için sinirli bir yapıya sahipti. Ancak yine de şefkat ve merhamet sahibi, özellikle yalanı ve rüşveti sevmeyen bir insandı.\n" +
                "Sultan Üçüncü Osman musıkîden nefret ettiği için bütün müzisyenleri saraydan uzaklaştırdı. Sarayda dolaşırken cariyelerle karşılaşmak istemediği için ayakkabılarına demir ökçeler taktırmıştı. Ökçelerden çıkan sesi duyan cariyeler padişahın geldiğini öğrenip yoldan çekiliyorlardı. İki yıl, on ay, on sekiz gün saltanat sürmüş bu süre içinde yedi tane veziriazam değiştirmiş, dönemi boyunca içte ve dışta barış ve huzur yaşanmıştır.\n" +
                "Sultan Üçüncü Osman’ın zaman zaman kıyafet değiştirerek halkın arasına karıştığı bilinmektedir. 30 Ekim 1757’de vücudunda çıkan bir çıbanın verdiği hastalıkla vefat etti. Cenazesi, Yeni Cami’de Sultan Birinci Mahmud’un yanına defnedildi");



        padisahHayatlari.add("Sultan Üçüncü Mustafa, 28 Ocak 1717 günü, İstanbul’da dünyaya geldi. Babası Sultan Üçüncü Ahmed, annesi Mihrişah Sultan’dır. Sultan Üçüncü Mustafa orta boylu, iri gözlü, yassı burunlu ve siyah sakallı idi. Heybetli ve kuvvetli bir vücuda sahipti. Çok iyi bir tahsil yaptı. Astroloji ile meşgul oldu. İslâm ve Osmanlı tarihlerini inceledi.\n" +
                "Sultan Üçüncü Mustafa, son derece dindar, tutumlu, müşfik, çalışkan ve cömert bir insandı. İki dakika süren ve İstanbul’un hemen hemen yarıdan fazlasını yıkan büyük depremde evlerini, yakınlarını kaybeden halka kendi kesesinden yardım etti. Adaletle hükmeder, haksızlıklara asla göz yummazdı. Yalandan, riyadan ve rüşvetten nefret ederdi. Asla gurura kapılmaz, büyüklük taslamaz, yapamayacağı işleri vaad etmezdi.\n" +
                "Sultan Üçüncü Mustafa, yenileşmenin gerektiği fikrindeydi ve ıslahat yapmak istiyordu. Prusya Kralı İkinci Frederik’in ıslahat hareketlerini duymuş, Ahmed Resmî Efendi’yi ona göndermişti. Prusya Kralı İkinci Frederik, Sultan Üçüncü Mustafa’ya Ahmed Resmî Efendi aracılığı ile başarısının üç altın anahtarı dediği öğütlerini gönderdi.\n" +
                "– Bol bol tarih okuyun, eski tecrübelerden faydalanın.\n" +
                "– Güçlü bir orduya sahip olmaya çalışın ve barış zamanında askerlerinizi sürekli eğitime tâbi tutun.\n" +
                "– Hazineniz daima parayla dolu bulunsun, ekonomiye önem verin.\n" +
                "Sultan Üçüncü Mustafa, bu öğütleri dinledikten sonra acı acı güldü. Sonra da “Biz de bunları yapmak niyetindeyiz, lâkin yolu nedir?” diye mırıldandı. Memleketine en büyük felâketin Rusya’dan geleceğini düşünüyordu. Müdafaa için geceli gündüzlü çalışarak her türlü hazırlığı yaptı. Savaşlarda kullanılmak üzere hazineyi altınla doldurdu.\n" +
                "Süveyş Kanalını bile açtırmayı düşünüyordu. Fakat iş başına getireceği yetenekli devlet adamlarının olmaması onu üzüyordu. Rus Savaşı sırasında üzüntüsünden hastalandı ve kalp yetmezliğinden dolayı 21 Ocak 1774 günü vefat etti.\n" +
                "Sultan Üçüncü Mustafa, orduda bir yenileşme gerektiği fikriyle hareket ediyordu. Askerlere eğitim kuralları getirdi. İtirazlara aldırmadan tüfeklere süngü taktırdı. Yeni bir tophane kurdurup güçlü toplar döktürdü. Bahriye, istihkâm ve topçu okulları açtı. Yaşlı subaylara bile eğitim mecburiyeti getirdi. Ordudaki ıslahat konusunda Baron de Tott adlı Macar uyruklu Fransız’dan çok yararlandı. Baron de Tott, Osmanlı topçu sınıfını yeniden ele alıp modernize etti ve askere Avrupa usûlü eğitim yaptırdı.\n" +
                "Sultan Üçüncü Mustafa şair bir padişahtı. Cihangir mahlasıyla yazdığı şiirleri çok meşhurdur. Şiirlere “el-fakir Mustafa Han-ı Sâlis” şeklinde imza atardı. Şiirlerinden birisinde şöyle der:\n" +
                "Yıkılupdur bu cihan sanmaki bizde düzele\n" +
                "Devlet-i çerh-i denî verdi kamu müptezele\n" +
                "Şimdi ebvâb-ı saadetle gezen hep hezele\n" +
                "İşimiz kaldı heman merhamet-i Lem Yezel’e.");


        padisahHayatlari.add("Sultan Birinci Abdülhamid, 20 Mart 1725 tarihinde, İstanbul’da doğdu. Babası Üçüncü Ahmed, annesi Rabia Şermi Sultan’dır. Annesi ona kuvvetli bir tahsil yaptırdı. Zamanındaki mevcut tarihlerin hepsini gözden geçirdi. Hat sanatı ile de meşgul oldu. Merhametli, nazik ve saf bir insan olarak tanınıyordu. Saltanatı süresince birçok ıslahat ve imar hareketlerinde bulundu. Devlet işleriyle daima yakından ilgilendi. Her sorun hakkında fikir ve görüşlerini vezirlerine bildirirdi. Yetenekli vezirler atamaya çalıştı. Halka karşı daima şefkatli ve ılımlı davrandı.\n" +
                "Sultan Birinci Abdülhamid henüz tahta geçmişti ki, kendisinden cülûs bahşişi istendiğini duydu. Kaşlarını çatıp sertleşen Sultan Birinci Abdülhamid şöyle dedi: “Hazinede bahşiş yoktur, bundan böyle cülus bahşişi verilmeye! Asker evlâtlarımıza fermanımız duyurula!”. Askerler bir parça söylendilerse de, işi daha fazla ileriye götürmeden dağıldılar.\n" +
                "Sultan Birinci Abdülhamid, siyasî ve askerî ıslahatlara girişti. Avrupaî tarzda mektepler açtı. Yeniçeri ocağına ve donanmaya yeni bir çehre kazandırmaya çalıştı. Sürat Topçuları Ocağı’nı kurdurdu, Yeniçerilerin sayımını yaptırdı ve gereksiz yere fazla para alanları tespit ettirdi. Bu faaliyetleri yürüten Sadrazam Halil Hamid Paşa, menfaatleri bozulanlar tarafından padişaha şikâyet edildi. Halil Hamid Paşa, yaptığı tüm olumlu çalışmalara rağmen, bu konuda yanıltılan Sultan Birinci Abdülhamid’in emriyle idam edildi.\n" +
                "Sultan Birinci Abdülhamid, bütün başarısızlıklara rağmen Osmanlı padişahları arasında iyi niyeti ve gayreti ile anıldı. 1782 yılı yazında İstanbul’da çıkan yangında itfaiye işlerini bizzat kendisi yürütmesi sonucu halkın sevgi ve takdirini de kazanmıştı.\n" +
                "Dindarlığı ve iyiliği sebebiyle halkın “velî” olarak gördüğü Sultan Birinci Abdülhamid, on beş yıl iki ay on yedi gün süren saltanattan sonra, 1789 yılı Nisan ayında 64 yaşında vefat etti. Cenazesi Bahçekapı’da kendi yaptırdığı türbesine defnedildi.");

        padisahHayatlari.add("Sultan Üçüncü Selim, 24 Aralık 1761 tarihinde, İstanbul’da doğdu. Babası Sultan Üçüncü Mustafa, annesi Mihrişah Sultan’dır. Annesi Gürcü asıllıdır. Kâhinlere inanan babası Sultan Üçüncü Mustafa, onların yeni doğan oğlu Selim’in eşsiz bir cihangir olacağını söylemeleri üzerine, büyük bir sevince kapılmış, yedi gün yedi gece bayram yapılmasını emretmiştir.\n" +
                "Sultan Üçüncü Selim, doğum günündeki bu hava içinde büyüdü. Sarayda çok güzel bir şekilde yetiştirildi. Sultan Üçüncü Mustafa, kendisinden sonra oğlu Sultan Üçüncü Selim’in padişah olmasını istemişti. Ancak, babasından sonra padişahlığa amcası Sultan Birinci Abdülhamid getirildi. Sultan Birinci Abdülhamid, Sultan Üçüncü Selim’i sarayda göz önünde bulunduruyor, ancak yine de onun eğitimine önem veriyordu. Amcası Sultan Birinci Abdülhamid’in ölümü üzerine, Sultan Üçüncü Selim 7 Nisan 1789 günü, 28 yaşındayken Osmanlı tahtına oturdu.\n" +
                "Sultan Üçüncü Selim, edebiyata ve güzel yazı yazmaya çok meraklıydı. Yazmış olduğu hat ve levhalardan bazıları cami ve türbelere asılmıştır. Arapça ve Farsçayı çok iyi konuşuyordu. Merhametli bir insan olan Sultan Üçüncü Selim ciddi bir eğitim görerek yetişti. İyi bir şâir, tamburî, neyzen ve hânende idi. Bestekâr da olan Sultan Üçüncü Selim, güzel sanatlara düşkün ve açık fikirliydi, ancak zaafa varacak kadar yumuşak karakterliydi ve Osmanlı Devleti’nde batıcılığın yerleşmesini istiyordu.\n" +
                "Sultan Üçüncü Selim tahta çıktığı zaman, halk ona büyük ümitler bağladı. Halk genç hükümdarın, Osmanlı Devleti’ni o eski güçlü ve ihtişamlı devirlerine geri döndüreceğini düşünüyordu.\n" +
                "Sultan Üçüncü Selim, 29 Mayıs 1807 tarihinde Osmanlı padişahlığını Şehzade Mustafa’ya terk ettikten sonra bir yıl iki ay daha yaşadı. Alemdar Mustafa Paşa Olayı sırasında yeni padişahın adamları tarafından, 28 Temmuz 1808 tarihinde öldürüldü. Cenazesi, Lâleli Camii avlusunda babası Sultan Üçüncü Mustafa’nın yanına defnedildi.");
        padisahHayatlari.add("Sultan Dördüncü Mustafa, 8 Eylül 1779 günü, İstanbul’da doğdu. Babası Sultan Birinci Abdülhamid, annesi Nüketseza Kadın Sultan’dır. Annesi Nüketseza Kadın Sultan, Sultan Dördüncü Mustafa’nın iyi bir tahsil yapması için çok çaba harcadı. Ancak hırslı, kurnaz ve asabî bir insan olan Sultan Dördüncü Mustafa, eğitim ve öğrenimden çok zevk ve sefa içinde yaşamaya önem verdi.\n" +
                "Kabakçı Mustafa İsyanı sonunda, tahttan indirilen amcazâdesi Sultan Üçüncü Selim’in yerine, 29 Mayıs 1807 günü tahta çıktığında yirmi sekiz yaşındaydı. Sultan Dördüncü Mustafa’nın şehzadeliği boyunca, kendisine bir evlât gibi davranan Sultan Üçüncü Selim aleyhinde isyancılarla iş birliğine girmesi ve onun öldürülmesi için emir vermesi, karakteri hakkında fikir vermektedir.\n" +
                "Tahta çıktığında devletin merkezî otorite ve hakimiyeti gittikçe zayıflıyor, Sultan Üçüncü Selim ve Nizam-ı Cedid yandaşları yakalandıkları yerde öldürülüyordu. Sultan Dördüncü Mustafa’nın tahta çıkmasını sağlayan Kabakçı Mustafa ve yandaşları devlet yönetiminde etkin rol oynuyor, kendi adamlarını önemli mevkilere getiriyorlardı.\n" +
                "Osmanlı Devleti, bu isyandan sonra yeniçerilere çok büyük tavizler verdi. Ancak yeniçerilerin istekleri hiçbir zaman bitmedi. Hatta Osmanlı tarihinde hiç görülmemiş bir antlaşma yapıldı. Kabakçı Mustafa isyanında baş rol oynayan yeniçeri ağalarının, kendilerini sağlama almak için yaptıkları bu antlaşmaya göre, yeniçeriler devlet işlerine karışmayacak ve Osmanlı Devleti bu isyandan dolayı Yeniçeri ocağını sorumlu tutmayacaktı.\n" +
                "Sultan Üçüncü Selim taraftarları, bu karışık ortam içinde Rusçuk âyânı Alemdar Mustafa Paşa’ya sığınmışlardı. Alemdar Mustafa Paşa Osmanlı-Rus savaşları sırasında büyük başarılar göstermiş ve ordu mensuplarının sempatisini kazanmıştı.\n" +
                "Sultan Dördüncü Mustafa hat sanatıyla uğraştı. Gayet güzel yazıları vardır. Osmanlı hanedanından Sultan Beşinci Murad’dan sonra en az padişahlık yapanlardan birisidir.");


        padisahHayatlari.add("Sultan İkinci Mahmud, 20 Temmuz 1785 tarihinde, İstanbul’da doğdu. Babası Sultan Birinci Abdülhamid, annesi Nakşidil Valide Sultan’dır. Orta boylu, geniş omuzlu, beyaz sakallı, zarif ve sevimli yüzlüydü. Diğer Osmanlı padişahları gibi kuvvetli bir tahsil gördü. Öğrenimi ile, Sultan Üçüncü Selim, padişahlığı sırasında bizzat meşgul olmuştu.\n" +
                "Cesur, temkinli, sabırlı ve azimli bir kişiliğe sahip olan Sultan İkinci Mahmud, Alemdar Mustafa Olayı sonrasında, 28 Temmuz 1808 tarihinde tahta çıktığında yirmi üç yaşındaydı. Zekî ve bilgili bir insan olan Sultan İkinci Mahmud, Avrupa’daki yenileşme hareketlerini benimsemişti. Adalet işlerine gereken önemi verdi, yeni kanun ve tüzükler hazırlattı ve bu sebeple kendisine “Adlî” ünvanı verildi.\n" +
                "Şiiri, edebiyatı ve bilimi seven, halk arasında dolaşmayı ve onların dertlerini dinlemeyi gerekli gören Sultan İkinci Mahmud, Osmanlı Devleti’ni gerek sosyal bakımdan, gerekse uygarlık açısından ileri bir ülke yapmaya çalıştı. Sultan İkinci Mahmud, yakalandığı verem hastalığından kurtulamayarak, 1 Temmuz 1839 günü, dinlenmek için gittiği kardeşi Esma Sultan’ın Çamlıca’daki köşkünde, elli dört yaşında vefat etti. Büyük bir cenaze töreni ile halkın gözyaşları arasında Divan Yolu’ndaki türbesine defnedildi.");


            padisahHayatlari.add("Sultan Abdülmecid, 25 Nisan 1823 günü doğdu. Babası Sultan İkinci Mahmud, annesi Bezm-i Âlem Valide Sultan’dır. Sultan Abdülmecid, babasının arzusu yönünde bir eğitim ve terbiye gördüğü için ıslahatçı fikirlere sahipti. Batı âlemine karşı hayranlık besliyordu. Babasının vefatı üzerine, henüz 17 yaşında iken Osmanlı tahtına oturdu. Devletin ilerleyişi için Avrupaî hayat tarzının ülke çapında yaygınlaştırılmasını istedi. Saltanatının henüz dördüncü ayında ilân ettiği Gülhane Hatt-ı Hümâyûnu sebebiyle Tanzimat Dönemi padişahı olarak şöhret bulmuştur.\n" +
                "Sultan Abdülmecid, batılı yazarların takdir ve sevgiyle andıkları bir padişahtı. Âdil, merhametli, ıslahatçı, yenilikçi bir insan olan Sultan Abdülmecid, 25 Haziran 1861 tarihinde, 39 yaşında iken İstanbul’da veremden dolayı vefat eden Sultan Abdülmecid, Yavuz Sultan Selim’in türbesi yanındaki mezarına defnedildi.\n" +
                "Sultan İkinci Mahmud, ölüm döşeğinde iken, Osmanlı Devleti’ne karşı ayaklanmış olan Kavalalı Mehmed Ali Paşa, Osmanlı kuvvetlerini Nizip’te yenilgiye uğratmıştı. Sultan Abdülmecid böyle karmaşık bir ortamda tahta çıktı. Mısır Sorunu, Rus donanmasının Hünkâr İskelesi Antlaşmasına uyarak İstanbul’a gelmesi üzerine bir Avrupa sorunu haline geldi.\n" +
                "Başta İngiltere, Avusturya, Prusya ve Rusya olmak üzere Avrupalı devletler Osmanlı Devleti ile Mısır Valisi Kavalalı Mehmed Ali Paşa arasındaki Mısır sorununu çözmek için bir konferans düzenlediler. Avrupa Devletleri, Mısır’da güçlü bir yönetim istemiyorlardı. Kavalalı Mehmed Ali Paşa’ya karşı Osmanlı Devleti’nin tarafını tuttular ve bu ortamda Londra Sözleşmesi imzalandı (1840).\n" +
                "Buna göre; Mısır Osmanlı Devleti’ne bağlı kalacak, ancak yönetimi Mehmed Ali Paşa ve oğulları yürütmeye devam edecekti. Mısır seksen bin altın vergi ödeyecekti. Suriye, Adana ve Girit tekrar Osmanlı yönetimine bırakılıyordu.\n" +
                "Hünkâr İskelesi Antlaşmasının süresi bitince, Londra’da yeniden bir konferans düzenlendi (1841). Toplantıya Osmanlı Devleti’nden başka Rusya, Fransa, İngiltere, Prusya ve Avusturya katıldı. Konferansta alınan kararlara göre, Boğazlar’da egemenlik hakkı Osmanlı Devleti’ne ait olacak, ancak barış döneminde hiçbir savaş gemisi Boğazlar’dan geçmeyecekti.\n" +
                "Bu antlaşma ile Fransa ve İngiltere Akdeniz’deki güvenliklerini sağlamış oluyorlar, Osmanlı Devleti’nin Boğazlar üzerindeki kayıtsız şartsız haklarına kısıtlama geliyordu. Rusya ise Hünkâr İskelesi Antlaşması ile Boğazlar üzerinde sağladığı üstünlüğü kaybetmiş oluyordu.");


            padisahHayatlari.add("Sultan Abdülaziz 8 Şubat 1830 tarihinde İstanbul’da doğdu. Babası Sultan İkinci Mahmud, annesi Pertevniyal Valide Sultan’dır. Elâ gözlü, beyaza yakın kumral tenli, sert bakışlı ve top sakallıydı. Ağabeyi Sultan Abdülmecid’in vefatı üzerine 25 Haziran 1861 günü tahta çıktığında 31 yaşındaydı. Müsrif bir padişah olarak tanınmasına rağmen, çok sade giyinir, sarayda terlik ve entari ile dolaşırdı. Babası öldüğü zaman dokuz yaşlarındaydı. Ancak ağabeyi Sultan Abdülmecid, onun eğitimine gerektiği gibi dikkat etti. Şehzadeliği sırasında rahat ve korkusuz bir hayat sürdü. Çok iyi Fransızca konuşurdu. Şiire ve müziğe de ilgisi vardı. Kendine ait besteleri vardır. Resim yapma kabiliyeti de çok üstün olan Sultan Abdülaziz, Osmanlı donanmasına ısmarlayacağı gemilerin plânını bizzat kendisi çizmişti. Ok atmayı, ata binmeyi, avlanmayı ve özellikle güreşmeyi çok severdi. Güçlü, kuvvetli ve pehlivan yapılıydı. En iyi pehlivanlarla güreşir ve sırtlarını yere getirirdi.");



            padisahHayatlari.add("Sultan Beşinci Murad 21 Eylül 1840 tarihinde İstanbul’da doğdu. Babası Sultan Abdülmecid, annesi Şevk-Efza Kadın Efendi’dir. Annesi Çerkezdir. Sultan Beşinci Murad, çocukluğunda ve gençliğinde iyi bir eğitim gördü ve Fransızca öğrendi. Okumaya çok meraklı olduğundan dolayı, Fransa’dan kitaplar getirtir ve sürekli olarak okurdu. Edebiyata karşı çok ilgiliydi. Aralarında Ziya Paşa ve Namık Kemal’in de olduğu devrin bir çok şairi ile yakın dostluk kurmuştu. Yabancı kültürlerin etkisi altında kalan Sultan Beşinci Murad, piyano çalardı. Batı müziği stilinde besteler bile yapmıştır. Avrupalı prenslerle dost olmuş, onlarla mektuplaşmış olan Sultan Beşinci Murad, yerli ve yabancı gazeteleri yanından eksik etmezdi.\n" +
                    "Sultan Abdülaziz ile beraber çıktığı Avrupa seyahati sırasında Avrupa’yı yakından görüp hayran kalmış olan Sultan Beşinci Murad, bu gezi sırasında İngiltere’de tanıştığı Gal Prensi (sonradan İngiltere Kralı olan VII. Edward) ile yakın bir dostluk kurdu. Gal Prensinin tesiri altında kalıp mason olan Sultan Beşinci Murad, çok müsrif ve ihtiras sahibi bir insandı. Padişah olmak için amcasının ölümünü beklediğini açıkça söylerdi.\n" +
                    "Sultan Beşinci Murad, tahttan indirilen Sultan Abdülaziz’in yerine 30 Mayıs 1876’da padişah oldu. Ancak, Osmanlı Devleti’ni kurtarmak için meşrutiyetin kurulmasını isteyen, bu düşünce ile tahta güvendikleri bir hükümdar getiren aydınların umudu yine kırılmıştı. 93 gün kaldığı Osmanlı tahtından 31 Ağustos 1876 günü indirildi. 28 yıl daha sarayda yaşayan Sultan Beşinci Murad, 29 Ağustos 1904 tarihinde vefat etti ve annesi Şevk-Efza Kadın Efendi’nin Yeni Cami’deki türbesine defnedildi.");

            padisahHayatlari.add("Sultan İkinci Abdülhamid, 21 Eylül 1842 tarihinde İstanbul’da doğdu. Babası Sultan Abdülmecid, annesi Tir-i Müjgan Kadın Efendi’dir. Annesi Çerkezdir. Sultan İkinci Abdülhamid çok küçük yaşta iken annesini kaybettiği için öksüz büyüdü ve onu üvey annesi Piristu Kadın yetiştirdi. Çocukluğunda çok zayıf bir bünyeye sahip olan Sultan İkinci Abdülhamid sık sık hasta olurdu. Babasının padişahlığı sırasında bu durumu yüzünden özel ilgi gördü. Çok hoşgörülü bir ortamda büyüdü. Kültür derslerinin yanında musiki dersleri aldı ve piyano çalmayı öğrendi.\n" +
                    "Bekârlığı sırasında çok serbest bir hayat yaşayan Sultan İkinci Abdülhamid, evlendikten sonra tüm boş zamanını ailesiyle, çocuklarıyla geçirmeye başladı. Sultan İkinci Abdülhamid, yıkılmak üzere olan Osmanlı Devleti’ni uyguladığı politikalarla 33 yıl ayakta tutmayı başarmış bir padişahtır.\n" +
                    "Hayırsever ve cömert bir insan olan Sultan İkinci Abdülhamid, sıradan bir vatandaş gibi yaşardı. Yunan seferi sırasında, kendisine hazinede yeterli para bulunmadığı söylenince, atalarından kalma şahsî servetinden masrafları karşılamış, bunu devletten geri almamıştı.\n" +
                    "Boş vakitlerini marangozhanede geçirir, harika eşyalar yapar, bunları sattırır ve parasını fakire fukaraya dağıttırırdı. Son derece şefkatli bir insan olan Sultan İkinci Abdülhamid’in kendisini öldürmek isteyenleri bağışlaması, dünya siyaset tarihinde ender rastlanan bir olaydır. Sultan İkinci Abdülhamid, kültüre önem vermiş ve eğitim konusunda hizmet verecek birçok mekân yaptırmıştır.\n" +
                    "Güzel Sanatlar Akademisi, Ticaret ve Ziraat Okulları kuran Sultan İkinci Abdülhamid, ilk ve orta dereceli okullar, dilsiz ve kör okulları, kız meslek okulları da yaptırmıştır. Vilâyetlere liseler, kazalara ortaokullar kurmuş, ilkokulları köylere kadar ulaştırmıştır.\n" +
                    "İstanbul’da Şişli Etfal Hastahanesi’ni ve Dârülaceze’yi kendi şahsi parasıyla yaptırdı. Hamidiye adı verilen içme suyunu borularla İstanbul’a getirtti. Karayollarını Anadolu içlerine kadar uzatan Sultan İkinci Abdülhamid, Bağdat’a ve Medine’ye kadar da demiryolları döşetmiştir. Büyük şehirlere atlı tramvay hatları yaptırmıştır.");


            padisahHayatlari.add("Sultan Mehmed Reşad 2 Kasım 1844 tarihinde İstanbul’da doğdu. Babası Sultan Abdülmecid, annesi Gülcemal Kadın Efendi’dir. Annesi Çerkezdir. Çocukluğu, padişah olan babasının yanında geçti. Eğitim ve öğrenimine gereken önem gösterildi.\n" +
                    "Sultan Mehmed Reşad, amcası Sultan Abdülaziz zamanında rahat bir şehzadelik yapmasına rağmen ağabeyi Sultan İkinci Abdülhamid zamanında sarayda hapis hayatı yaşadı. Veliaht olduğu için devamlı kontrol altında tutuluyordu. Sultan Mehmed Reşad günlerini haremde geçirir, şiir ve kitap okurdu.\n" +
                    "Sultan Beşinci Mehmed Reşad, İttihat ve Terakki partisinin desteğiyle tahta çıktığında 65 yaşındaydı. Sultan İkinci Abdülhamid’in padişahlığı sırasında devlet işleriyle yeterince ilgilenmemişti. Padişahlığı sırasında yönetim daha çok İttihat ve Terakki partisinin ileri gelenlerinden Enver Paşa, Talat Paşa ve Cemal Paşa’nın eline geçmişti.");


            padisahHayatlari.add("Sultan Mehmed Vahdeddin otuz altıncı ve son Osmanlı padişahıdır. Babası Sultan Abdülmecid, annesi Gülistu Kadın Efendi’dir. 2 Şubat 1861 tarihinde İstanbul’da doğdu. Babası Sultan Abdülmecid, Sultan Mehmed Vahdeddin doğduğu yıl, annesi Gülistu Kadın Efendi de, o henüz çok küçükken vefat etmişlerdi. Çocuk denecek yaşlarda hem öksüz, hem yetim kalan Sultan Mehmed Vahdeddin, babası Sultan Abdülmecid’in kadınlarından Şayeste Kadın tarafından büyütüldü.\n" +
                    "Sultan Abdülaziz’in saltanatı sırasında henüz bir çocuk olduğu için serbest yetişti. Eğitim ve öğrenimi ile ağabeyi Sultan İkinci Abdülhamid henüz padişah değilken bile yakından ilgilendi. Sultan İkinci Abdülhamid, saltanat yıllarında da bu tutumunu değiştirmedi, ona hep değer verdi ve onu korudu. Bu yüzden ağabeyinin saltanat yıllarında rahat bir hayat yaşadı.\n" +
                    "Sultan Mehmed Vahdeddin, çok okurdu, okuduğunu iyi anlardı. Özellikle fıkha ait eserler ilgisini çekmişti. Kitabeti ve imlâsı düzgündü. Zekî bir insandı, fikirlerini kâğıt üstüne aktarmakta zorluk çekmezdi. Çok nazik bir insan olan Sultan Mehmed Vahdeddin, Viyana seyahati sırasında hem yanındakileri hem de yabancıları nezaketine hayran bırakmıştı. Az konuşur, daha çok dinlemeyi sever ve birisini dinlerken pür dikkat kesilirdi.\n" +
                    "Sultan Mehmed Reşad, padişah olduğu zaman, yaş bakımından Sultan Mehmed Vahdeddin’den daha büyük olan Sultan Abdülaziz’in oğlu Yusuf İzzeddin veliaht idi. Yusuf İzzeddin’in ölümü üzerine veliahtlığa Sultan Mehmed Vahdeddin getirildi.\n" +
                    "Veliaht olarak bulunduğu yıllarda, Birinci Dünya Savaşı çıktı. Savaş sırasında Osmanlı Devleti’nin veliahtı olarak Almanya’ya resmî bir gezi yaptı. Bu seyahatinde yanında Mustafa Kemal de bulundu. Sultan Mehmed Reşad’ın ölümü üzerine, Sultan Altıncı Mehmed Vahdeddin sanı ile padişah oldu.");

//Hayat Kaydı Bitti

        //Resimler

        Bitmap p0 = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.p0);
        Bitmap p1 = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.p1);
        Bitmap p2 = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.p2);
        Bitmap p3 = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.p3);
        Bitmap p4 = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.p4);
        Bitmap p5 = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.p5);
        Bitmap p6 = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.p6);
        Bitmap p7 = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.p7);
        Bitmap p8 = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.p8);
        Bitmap p9 = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.p9);
        Bitmap p10 = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.p10);
       /* Bitmap p11 = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.p11);
        Bitmap p12 = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.p12);
        Bitmap p13 = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.p13);
        Bitmap p14 = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.p14);
        Bitmap p15 = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.p15);
        Bitmap p16 = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.p16);
        Bitmap p17 = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.p17);
        Bitmap p18 = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.p18);
        Bitmap p19 = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.p19);
        Bitmap p20 = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.p20);
        Bitmap p21 = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.p21);
        Bitmap p22 = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.p22);
        Bitmap p23 = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.p23);
        Bitmap p24 = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.p24);
        Bitmap p25 = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.p25);
        Bitmap p26 = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.p26);
        Bitmap p27 = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.p27);
        Bitmap p28 = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.p28);
        Bitmap p29 = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.p29);
        Bitmap p30 = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.p30);
        Bitmap p31 = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.p31);
        Bitmap p32 = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.p32);
        Bitmap p33 = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.p33);*/

        final ArrayList<Bitmap>padisahFoto = new ArrayList<>();
        padisahFoto.add(p0);
        padisahFoto.add(p1);
        padisahFoto.add(p2);
        padisahFoto.add(p3);
        padisahFoto.add(p4);
        padisahFoto.add(p5);
        padisahFoto.add(p6);
        padisahFoto.add(p7);
        padisahFoto.add(p8);
        padisahFoto.add(p9);
        padisahFoto.add(p10);
       /* padisahFoto.add(p11);
        padisahFoto.add(p12);
        padisahFoto.add(p13);
        padisahFoto.add(p14);
        padisahFoto.add(p15);
        padisahFoto.add(p16);
        padisahFoto.add(p17);
        padisahFoto.add(p18);
        padisahFoto.add(p19);
        padisahFoto.add(p20);
        padisahFoto.add(p21);
        padisahFoto.add(p22);
        padisahFoto.add(p23);
        padisahFoto.add(p24);
        padisahFoto.add(p25);
        padisahFoto.add(p26);
        padisahFoto.add(p27);
        padisahFoto.add(p28);
        padisahFoto.add(p29);
        padisahFoto.add(p30);
        padisahFoto.add(p31);
        padisahFoto.add(p32);
        padisahFoto.add(p33);
*/






        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,padisahIsımler);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this,DetailActivity.class);
                intent.putExtra("PadisahAd",padisahIsımler.get(position));
                intent.putExtra("PadisahHayat",padisahHayatlari.get(position));
                secilmisResim= padisahFoto.get((int) id);
                startActivity(intent);

                Toast.makeText(MainActivity.this,padisahIsımler.get(position),Toast.LENGTH_SHORT).show();
            }
        });


    }

}