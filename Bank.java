public class Bank{

 

    private int kundenanzahl;

    private int geld;

    private Kunde[1000] kunden;  

    private konten[2000] Konto;

    private int anzahlKonten;

   

    public Bank(int kundenanzahl, int anzahlKonten, int geld, konten[2000] Konto){

      this.kundenanzahl = kundenanzahl;

      this.anzahlKonten = anzahlKonten;

      this.geld = geld;

      this.konten[2000] Konto = konten[2000] Konto;

    }

 

    public int getKundeanzahl(){return kundenanzahl;}

    public int getAnzahlKonten(){return kontenanzahl;}

    public int getGeld(){return geld;}

    public void setKundeanzahl(int kundenanzahl){this.kundenanzahl = kundenanzahl;}

    public void setAnzahlKonten(int anzahlKonten){this.anzahlKonten = anzahlKonten;}

    public void setGeld(int geld){this.geld = geld;}

 

    public void neuerKunde(String name, int gebDat, String adresse){

      anzahlKonten = kundenanzahl + 1;

     

    }

    public void neuesKonto(char art, int kundennummer, kunden[]){
      boolean gefunden = false; 
      for(int i = 1; i<kunden.length+1; i++){

        if(kunden[i].getKundennr() ==  kundennummer){
          gefunden = true; 
          break; 
        
        }

      }

      if(gefunden==true){

        if(art == 'S'){

          konten[anzahlKonten] = new Sparkonto(kontonr, 0, zinssatz, inhaber);
          int kontonr = anzahlKonten+300000;
          inhaber.setSpar(konten[anzahlKonten]);
          anzahlKonten++;

        else if(art == 'G'){

          konten[anzahlKonten] = new Girokonto(kontonr, 0, dispo, inhaber);
          int kontonr = anzahlKonten+200000;
          inhaber.setGiro(konten[anzahlKonten]);
          anzahlKonten++;

        }
      }

     

    }
    else{

      System.out.print("System error, 'kundennr' not found.");

    }


    public void einzahlen(kundennr, saldo, int eingezahlt){

      boolean gefunden = false; 
      for(int i = 1; i<kunden.length+1; i++){

        if(kunden[i].getKundennr() ==  kundennr){
          gefunden = true; 
          break; 
        
        }

      }

      if(gefunden==true){

        setGeld(saldo + eingezahlt);

      }

    }

   

  }