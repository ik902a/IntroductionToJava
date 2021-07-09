package by.epam.with_classes.aggregation_and_composition.travel_agency;

// Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного типа
// (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать возможность выбора транспорта,
// питания и числа дней. Реализовать выбор и сортировку путевок.

public class TravelArray {
    TravelVoucher[] travelVoucher = new TravelVoucher[7];

    public static void main(String[] args) {
        TravelArray array = new TravelArray();
        array.travelVoucher[0] = new TravelVoucher("отдых", "самолет", true, 6);
        array.travelVoucher[1] = new TravelVoucher("лечение", "поезд", true, 7);
        array.travelVoucher[2] = new TravelVoucher("круиз", "автобус", true, 3);
        array.travelVoucher[3] = new TravelVoucher("отдых", "самолет", true, 10);
        array.travelVoucher[4] = new TravelVoucher("шопинг", "автобус", false, 3);
        array.travelVoucher[5] = new TravelVoucher("отдых", "поезд", true, 15);
        array.travelVoucher[6] = new TravelVoucher("шопинг", "поезд", false, 5);

        array.selection("отдых лечение", "самолет поезд", true, 5, 10);

    }

    public void selection(String kind, String transport, boolean nutrition, int minDay, int maxDay) {
        for (TravelVoucher elem : travelVoucher) {
            if (kind.contains(elem.kind) &&
                    transport.contains(elem.transport) &&
                    (elem.nutrition == nutrition) &&
                    elem.day >= minDay &&
                    elem.day <= maxDay) {
                System.out.println(elem.toString());
            }
        }
    }

}
