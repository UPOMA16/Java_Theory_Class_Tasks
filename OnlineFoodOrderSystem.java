class Restaurant {
    double foodPrice;

    void setFoodPrice(double price) {
        foodPrice = price;
    }

    double calculateTotalBill() {
        return foodPrice + (foodPrice * 0.10);
    }

    int estimateDeliveryTime() {
        return 40;
    }
}

class FastFoodRestaurant extends Restaurant {
    double calculateTotalBill() {
        return foodPrice + (foodPrice * 0.15);
    }

    int estimateDeliveryTime() {
        return 20;
    }
}

class FineDiningRestaurant extends Restaurant {
    int estimateDeliveryTime() {
        return 60;
    }
}

public class OnlineFoodOrderSystem {
    public static void main(String[] args) {
        Restaurant r = new Restaurant();
        r.setFoodPrice(100);
        System.out.println("Restaurant Bill: " + r.calculateTotalBill());
        System.out.println("Delivery Time: " + r.estimateDeliveryTime() + " mins");

        FastFoodRestaurant f = new FastFoodRestaurant();
        f.setFoodPrice(100);
        System.out.println("FastFood Bill: " + f.calculateTotalBill());
        System.out.println("Delivery Time: " + f.estimateDeliveryTime() + " mins");

        FineDiningRestaurant d = new FineDiningRestaurant();
        d.setFoodPrice(100);
        System.out.println("FineDining Bill: " + d.calculateTotalBill());
        System.out.println("Delivery Time: " + d.estimateDeliveryTime() + " mins");
    }
}
