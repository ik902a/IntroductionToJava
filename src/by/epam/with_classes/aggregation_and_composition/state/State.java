package by.epam.with_classes.aggregation_and_composition.state;

// Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль столицу,
// количество областей, площадь, областные центры.

public class State {
    Region[] region = new Region[3];

    public State() {
        region[0] = new Region(0);
        region[1] = new Region(1);
        region[2] = new Region(2);
    }

    public static void main(String[] args) {
        State state = new State();

        state.capital();
        state.numRegion();
        state.area();
        state.regionalCenter();
    }

    public void capital() {
        for (Region elemA : region) {
            for (Region.District elemB : elemA.district) {
                if (elemB.city.type == 1) {
                    out("Столица: " + elemB.city.name);
                    return;
                }
            }
        }
    }

    public void numRegion() {
        out("Количество областей: " + region.length);
    }

    public void area() {
        for (Region elem: region) {
            out(elem.name + ", площадь: " + elem.area);
        }
    }

    public void regionalCenter() {
        for (Region elemA : region) {
            for (Region.District elemB : elemA.district) {
                if (elemB.city.type == 1 || elemB.city.type == 2) {
                    out(elemA.name + ", областной центр: " + elemB.city.name);
                }
            }
        }
    }

    public void out(String str) {
        System.out.println(str);
    }

    public class Region {
        District[] district;
        String name;
        String area;

        public Region(int i) {
            switch (i){
                case 0:
                    addRegion1();
                    break;
                case 1:
                    addRegion2();
                    break;
                case 2:
                    addRegion3();
                    break;
            }
        }

        public void addRegion1() {
            name = "Могилевская область";
            area = "16";
            district = new District[3];
            district [0] = new District(0);
            district [1] = new District(1);
            district [2] = new District(2);
        }

        public void addRegion2() {
            name = "Минская область";
            area = "20";
            district = new District[3];
            district [0] = new District(3);
            district [1] = new District(4);
            district [2] = new District(5);
        }

        public void addRegion3() {
            name = "Гродненская область";
            area = "14";
            district = new District[2];
            district [0] = new District(6);
            district [1] = new District(7);
        }

        public class District {
            String name;
            City city;

            public District(int i) {
                switch (i){
                    case 0:
                        addDistrict1(0);
                        break;
                    case 1:
                        addDistrict2(1);
                        break;
                    case 2:
                        addDistrict3(2);
                        break;
                    case 3:
                        addDistrict4(3);
                        break;
                    case 4:
                        addDistrict5(4);
                        break;
                    case 5:
                        addDistrict6(5);
                        break;
                    case 6:
                        addDistrict7(6);
                        break;
                    case 7:
                        addDistrict8(7);
                        break;
                }
            }

            public void addDistrict1 (int i) {
                name = "Могилевский район";
                city = new City(i);
            }

            public void addDistrict2 (int i) {
                name = "Чауский район";
                city = new City(i);
            }

            public void addDistrict3 (int i) {
                name = "Бобруйский район";
                city = new City(i);
            }

            public void addDistrict4 (int i) {
                name = "Минский район";
                city = new City(i);
            }

            public void addDistrict5 (int i) {
                name = "Дзержинский район";
                city = new City(i);
            }

            public void addDistrict6 (int i) {
                name = "Молодечненский район";
                city = new City(i);
            }

            public void addDistrict7 (int i) {
                name = "Гродненский район";
                city = new City(i);
            }

            public void addDistrict8 (int i) {
                name = "Лидский район";
                city = new City(i);
            }

            public class City {
                String name;
                int type;

                public City(int i) {
                    switch (i){
                        case 0:
                            addCity1(0);
                            break;
                        case 1:
                            addCity2(1);
                            break;
                        case 2:
                            addCity3(2);
                            break;
                        case 3:
                            addCity4(3);
                            break;
                        case 4:
                            addCity5(4);
                            break;
                        case 5:
                            addCity6(5);
                            break;
                        case 6:
                            addCity7(6);
                            break;
                        case 7:
                            addCity8(7);
                            break;
                    }
                }

                public void addCity1 (int i) {
                    name = "Могилев";
                    type = 2;
                }

                public void addCity2 (int i) {
                    name = "Чаусы";
                    type = 0;
                }

                public void addCity3 (int i) {
                    name = "Бобруйск";
                    type = 0;
                }

                public void addCity4 (int i) {
                    name = "Минск";
                    type = 1;
                }

                public void addCity5 (int i) {
                    name = "Дзержинск";
                    type = 0;
                }

                public void addCity6 (int i) {
                    name = "Молодечно";
                    type = 0;
                }

                public void addCity7 (int i) {
                    name = "Гродно";
                    type = 2;
                }

                public void addCity8 (int i) {
                    name = "Лида";
                    type = 0;
                }
            }
        }
    }
}
