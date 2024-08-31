[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/3FTHkTjO)
# Sosyal Medya Platformu

Bu proje, Java dilinde çeşitli veri yapıları ve interfaceleri kullanarak basit bir sosyal medya platformu simülasyonu geliştirmeyi amaçlamaktadır. Bu proje ile aşağıdaki beceriler geliştirilmiştir:

- Veri yapılarının etkin kullanımı (ArrayList, LinkedList, HashSet, TreeSet, HashMap, TreeMap, LinkedHashMap)
- Iterator ve Iterable arayüzlerinin etkin kullanımı
- Nesne yönelimli programlama (OOP) prensiplerinin uygulanması

## Özellikler

### Kullanıcı Yönetimi
- Kullanıcı oluşturma
- Kullanıcıları takip etme

### Gönderi Yönetimi
- Gönderi oluşturma
- Gönderilere yorum yapma
- Gönderi ve yorumların uygun veri yapıları ile saklanması

### Takip Sistemi
- Takip edilen kullanıcıların gönderilerini gösteren bir akış (feed)

### Favoriler
- Beğenilen gönderileri favorilere ekleme

## Teknik Gereksinimler

- **Veri Yapıları**: ArrayList, LinkedList, HashSet, TreeSet, HashMap, TreeMap, LinkedHashMap
- **Arayüzler**: Iterator, Iterable

## Proje Yapısı

### Sınıflar

- **Comment**: Gönderilere yapılan yorumları temsil eder.
- **Feed**: Kullanıcının takip ettiği kişilerin gönderilerini gösterir.
- **Post**: Kullanıcı tarafından oluşturulan gönderileri temsil eder.
- **User**: Kullanıcı profili ve ilgili işlevleri içerir (örneğin, gönderi oluşturma, yorum yapma, favorilere ekleme).
- **UserManager**: Kullanıcıların yönetimi ve etkileşimleri için işlevleri içerir.
- **SocialMediaPlatform**: Ana sınıf, uygulamanın başlatıldığı ve çalıştırıldığı yerdir.

### Kurulum
- Projeyi klonlayın veya indirin.
- IDE'nizde veya komut satırında projeyi açın.
- SocialMediaPlatform sınıfını çalıştırarak projeyi test edin.
