package EXERCISES.LABO11.zad4;


import EXERCISES.LABO11.zad2.Kontener;

public class MagazynListowy {

    private ListElement head;

    public void przyjmijKontener(Kontener kontener) {
        ListElement tmp = new ListElement();
        tmp.kontener = kontener;
        tmp.nextElement = this.head;
        this.head = tmp;
    }

    public void przyjmijKontenerWagowo(Kontener kontener) {
        System.out.println("Zawartosc magazynu listowego:");
        ListElement tmp = this.head;
        ListElement poprzedni = null;

        ListElement nowy = new ListElement();
        nowy.kontener = kontener;

        while (tmp != null) {
            if (tmp.kontener.getMasaLadunku() < kontener.getMasaLadunku()) {
                ListElement tmp2 = new ListElement();
                tmp2.kontener = kontener;
                tmp2.nextElement = tmp;

                if (poprzedni == null) {
                    this.head = tmp2;
                } else {
                    poprzedni.nextElement = tmp2;
                }
                return;
            }
            System.out.println(tmp.kontener);
            poprzedni = tmp;
            tmp = tmp.nextElement;
        }

        if (poprzedni == null) {
            this.head = nowy;
        } else {
            poprzedni.nextElement = nowy;
        }
    }

    public Kontener wydajKontener() {
        ListElement tmp = this.head;
        this.head = tmp.nextElement;
        return tmp.kontener;
    }

    public void show() {
        System.out.println("Zawartosc magazynu listowego:");
        ListElement tmp = this.head;
        while (tmp != null) {
            System.out.println(tmp.kontener);
            tmp = tmp.nextElement;
        }
    }
}
