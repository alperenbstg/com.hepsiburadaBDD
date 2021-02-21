Feature:
  @hepsiburada
  Scenario:

    Given  Hepsiburada sitesi acilacak ve anasayfanin acildigini onaylayacak
    And Login ekranini acip, bir kullanici ile login olacak
    And Ekranin ustundeki Search alanina samsung yazip Ara butonuna tiklayacak
    Then Sol menuden Telefon sonrasinda Cep Telefonu tiklayacak
    And Gelen sayfada samsung icin sonuc bulundugunu onaylayacak
    And Arama sonuclarindan ikinci sayfaya tiklayacak ve acilan sayfada ikinci sayfanin su an gosterimde oldugunu onaylayacak
    When  Ustten besinci urunu tiklayacak
    Then  Urun detayinda Begen butonuna tiklayacak
    And Urun listenize eklendi.' popup kontrolu yapacak
    And Ekranin en ustundeki hesabim alaninda Begendiklerim tiklayacak
    And  Acilan sayfada bir onceki sayfada begendiklerime alinmis urunun bulundugunu onaylayacak
    Then Begendiklerime alinmis urun bulunup secilecek ve sepete eklenecek
    And Urun sepete eklendi' popup kontrolu yapacak
    And Sepetim sayfasina gidecek
    Then Sepete eklenen bu urunun icine girilip kaldir butonuna basilacak, sepetimden cikarilacak
    And Bu urunun artik sepette olmadigini onaylayacak


