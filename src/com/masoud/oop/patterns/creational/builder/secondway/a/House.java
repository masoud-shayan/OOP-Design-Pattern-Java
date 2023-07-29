package com.masoud.oop.patterns.creational.builder.secondway.a;

public class House {

    private String walls;
    private String windows;
    private String rooms;
    private String kitchen;
    private String swimmingPool;
    private String parking;

//
//    public House(HouseBuilder builder) {
//        this.walls = builder.walls;
//        this.windows = builder.windows;
//        this.rooms = builder.rooms;
//        this.kitchen = builder.kitchen;
//        this.swimmingPool = builder.swimmingPool;
//        this.parking = builder.parking;
//    }


    public String getWalls() {
        return walls;
    }

    public String getWindows() {
        return windows;
    }

    public String getRooms() {
        return rooms;
    }

    public String getKitchen() {
        return kitchen;
    }

    public String getSwimmingPool() {
        return swimmingPool;
    }

    public String getParking() {
        return parking;
    }

    public void setWalls(String walls) {
        this.walls = walls;
    }

    public void setWindows(String windows) {
        this.windows = windows;
    }

    public void setRooms(String rooms) {
        this.rooms = rooms;
    }

    public void setKitchen(String kitchen) {
        this.kitchen = kitchen;
    }

    public void setSwimmingPool(String swimmingPool) {
        this.swimmingPool = swimmingPool;
    }

    public void setParking(String parking) {
        this.parking = parking;
    }

    @Override
    public String toString() {
        return "House{" +
                "walls='" + walls + '\'' +
                ", windows='" + windows + '\'' +
                ", rooms='" + rooms + '\'' +
                ", kitchen='" + kitchen + '\'' +
                ", swimmingPool='" + swimmingPool + '\'' +
                ", parking='" + parking + '\'' +
                '}';
    }

//    public static class HouseBuilder {
//
//        private String walls;
//        private String windows;
//        private String rooms;
//        private String kitchen;
//        private String swimmingPool;
//        private String parking;
//
//
//        public HouseBuilder walls(String walls) {
//            this.walls = walls;
//            return this;
//        }
//
//        public HouseBuilder windows(String windows) {
//            this.windows = windows;
//            return this;
//        }
//
//        public HouseBuilder rooms(String rooms) {
//            this.rooms = rooms;
//            return this;
//        }
//
//        public HouseBuilder kitchen(String kitchen) {
//            this.kitchen = kitchen;
//            return this;
//        }
//
//        public HouseBuilder swimmingPool(String swimmingPool) {
//            this.swimmingPool = swimmingPool;
//            return this;
//        }
//
//        public HouseBuilder parking(String parking) {
//            this.parking = parking;
//            return this;
//        }
//
//        public House build() {
//            return new House(this);
//        }
//    }
}
