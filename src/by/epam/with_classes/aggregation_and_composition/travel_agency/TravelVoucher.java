package by.epam.with_classes.aggregation_and_composition.travel_agency;

// Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного типа
// (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать возможность выбора транспорта,
// питания и числа дней. Реализовать выбор и сортировку путевок.

public class TravelVoucher {
    String kind;
    String transport;
    boolean nutrition;
    int day;

    public TravelVoucher(String kind, String transport, boolean nutrition, int day) {
        this.kind = kind;
        this.transport = transport;
        this.nutrition = nutrition;
        this.day = day;
    }

    public String getKind() {
        return kind;
    }

    public String getTransport() {
        return transport;
    }

    public int getDay() {
        return day;
    }

    @Override
    public String toString() {
        return getKind() + "| " + getTransport() + " на " + getDay() + " дней";
    }
}
