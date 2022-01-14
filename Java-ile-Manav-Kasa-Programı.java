//Java-ile-Manav-Kasa-Programı

     //Kilogram Fiyat Listesi

     armutFiyati = 2.14;
     
     ElmaFiyati = 3.67;
     
     DomatesFiyati = 1.11;
     
     muzFiyati = 0.95;
     
     PatlicanFiyati = 5.00;
     
     Scanner input = new Scanner(System.in);
     
     System.out.print("Kaç kilo armut alacaksınız? : ");
     armutkilo = input.nextDouble();
     
     System.out.print("Kaç kilo Elma alacaksınız? : ");
     elmakilo = input.nextDouble();
     
     System.out.print("Kaç kilo Domates alacaksınız? : ");
     domateskilo = input.nextDouble();
     
     System.out.print("Kaç kilo Muz alacaksınız? : ");
     muzkilo = input.nextDouble();     
     
     System.out.print("Kaç kilo Patlican alacaksınız? : ");
     patlicankilo = input.nextDouble();     
     
     armutTotalFiyat = armutkilo * armutFiyati;
     
     elmaTotalFiyat = elmakilo * elmaFiyati;
     
     domatesTotalFiyat = domateskilo * domatesFiyati;
     
     muzTotalFiyat = muzkilo * muzFiyati;
     
     patlicanTotalFiyat = patlicankilo * patlicanFiyati;
     
     toplamTutar = armutTotalFiyat + elmaTotalFiyat + domatesTotalFiyat + muzTotalFiyat + patlicanTotalFiyat;
     
     System.out.println("Armut Fiyat : " + armutFiyati);
     System.out.println("Elma Fiyat : " + ElmaFiyati);
     System.out.println("Domates Fiyat : " + DomatesFiyati);
     System.out.println("Muz Fiyat" + muzFiyati);
     System.out.println("Patlican Fiyat : " + PatlicanFiyati);
     System.out.println("Alınan Armut miktari (kg) : " + armutkilo);
     System.out.println("Alınan Elma miktari (kg) : " + elmakilo);
     System.out.println("Alınan Domates miktari (kg) : " + domateskilo);
     System.out.println("Alınan Muz miktari (kg) : " + muzkilo);
     System.out.println("Alınan Patlican miktari (kg) : " + patlicankilo);
     System.out.println("Armutun Tutari : " + armutTotalFiyat);
     System.out.println("Elmanın Tutari : " + elmaTotalFiyat);
     System.out.println("Domatesin Tutari : " + domatesTotalFiyat);
     System.out.println("Muzun Tutari : " + muzTotalFiyat);
     System.out.println("Patlicanin Tutari : " + patlicanTotalFiyat);
     System.out.println("TOPLAM TUTAR : " + toplamTutar);
    
    }
}
