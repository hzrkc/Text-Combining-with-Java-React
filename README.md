# Yazılım Laboratuvarı II 1. PROJE

# I.ÖZET

Bu projede, kitap, dergi vb. gibi metinlerden elde edilen cümleler/kelimeler arasındaki benzerlik, frekans gibi özelliklerin bulunması, metinlerin birleştirip birleştirilmeyeceğine karar verilmesi ve elde edilen verilerden karakter tabanlı cümlelerin/kelimelerin birleştirilmesi işlemleri gerçekleştirilmektedir. Bu işlemlerin yapılması için gerekli algoritma geliştirilmiş ve projede sunulmaktadır. Amaç: Bu projede iki veya daha fazla metnin uygun bir şekilde birleştirilmesi problemi için yeni algoritmalar geliştirmek amaçlanmaktadır. Devamında bunları görsel bir arayüzle sunmaktayız. Geliştirdiğiniz algoritmanın performans özelliklerini ve çalışma sürelerini farklı girdilerde karşılaştırıyoruz. Metin birleştirme işlemleri için JAVA dili, veri tabanı MongoDB (NoSQL), Web arayüzü için ise React kullanılmaktadır.

# II.İçerik

## A.Proje Tanımı ![](RackMultipart20230328-1-oo5tib_html_c738ee6fe05c6fa6.png) 

## B.Kullanılan Yöntemlerin Açıklamaları

## C.Proje Algoritması

## D.Proje Sonuçları

## E.Yalancı Kod

## F.Kaynakça

# III.GİRİŞ

Projede kullanıcıdan en az 2 olmak üzere istediği kadar sayıda metin, paragraf veya kelime girişi alınmaktadır. Alınan bu girişler React ile arayüzde gösterilir ve API'ler aracılığı ile React – Java arasında haberleşme sağlanır. Backend'e aktarılan kullanıcı girişleri geliştirdiğimiz algoritmadan geçerek tek bir çıkış metnine dönüşür ve arayüzde gösterilir.

Kullanıcı, isteğe bağlı olarak geçmiş kayıtları listeyelebilir ve mevcut birleşmiş metni kaydedebilir.

# IV.Kullanılan Yöntemler

Projeyi geliştirirken kullandığımız yöntemler ve açıklamaları:

## A.listTexts

M ![](RackMultipart20230328-1-oo5tib_html_80f5de25122c8e95.png) ongoDB üzerinde bulunan tüm kayıtları listelemek için kullandığımız yöntem.

##


## B.addTexts

Birleştirilmiş olan yani yeni oluşturulmuş metni MongoDB'ye kaydetmek için kullandığımız yöntem.

## C.combineTexts

K ![](RackMultipart20230328-1-oo5tib_html_c1f44ef90c15e88c.png) ullanıcıdan "x" sayıda alınan girişi anlamlı bir şekilde birleştirecek olan algoritmadan geçirir ve geri döndürür.

##### V. Proje Algoritması

Proje için geliştirdiğimiz algoritmada, Post request ile gelen Mapteki değerleri String Array'e çevirip, Array'in ilk elemanını result adındaki String değişkenine ekleyip, bu işlemden sonra dizinin diğer elemanlarını her seferinde bir index ekleyerek, bu elemanların "result" değişkeni içerisinde olup olmadığını kontrol ettik. Bu işlemin sonucunda, result değişkeni içerisinde bulunmayan elemanları result değişkeni içerisine ekleyerek birleşmiş metin elde ettik.

##### VI. Proje Sonuçları

Projemizin sonuçlarına bakacak olursak:

1. Kullanıcıdan birden fazla metin girişi alınabilir.
2. Alınan metin girişleri birleştirilebilir.
3. Birleştirilen metin ön yüzde gösterilir.
4. Birleştirilen metnin çalışma süresi Ön yüzde gösterilir.
5. Birleştirilen metin ve çalışma süresi veri tabanına kaydedilebilir.
6. V ![](RackMultipart20230328-1-oo5tib_html_4807b8aea4cc551a.png) ![](RackMultipart20230328-1-oo5tib_html_3009585f8f4e014d.png) eri tabanındaki kayıtlar listelenebilir.

##### ![](RackMultipart20230328-1-oo5tib_html_1221621a65ece814.png)


#####


##### ![](RackMultipart20230328-1-oo5tib_html_4b0000284a9a225a.png)


##### VIII. Kaynakça

1. https://www.youtube.com/watch?v=5PdEmeopJVQ
2. https://www.w3schools.com/java/java\_encapsulation.asp
3. https://www.appsdeveloperblog.com/postmapping-requestbody-spring-mvc/
4. https://spring.io/guides/gs/rest-service-cors/
5. https://gelecegiyazanlar.turkcell.com.tr/konu/egitim/android-101/javada-string-metodlari
6. https://www.javatpoint.com/java-get-current-date
7. https://jenkov.com/tutorials/java-date-time/system-currenttimemillis.html
8. https://axios-http.com/docs/example
9. https://17.reactjs.org/docs/hooks-effect.html
10. https://17.reactjs.org/docs/hooks-state.html
