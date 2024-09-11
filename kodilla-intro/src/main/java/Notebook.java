public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("The notebook is very cheap");
        } else if (this.price >= 600 && this.price <= 1000) {
            System.out.println("The price is good");
        } else if (this.price > 1000) {
            System.out.println("This notebook is expensive");
        }
    }
    public void checkWeight() {
        if (this.weight < 600) {
            System.out.print("It is pretty light");
        } else if (this.weight >= 1200 && this.weight < 2000) {
            System.out.println("It feels okay");
        } else if (this.weight >= 2000) ;
        {
            System.out.println("It is pretty heavy");
        }
    }
    public void checkWeightAndPrice() {
        if (this.price > 1000 && this.year > 2023) {
            System.out.println("Op laptop with high price");
        } else if (this.price <= 1000 && this.year > 2023) {
            System.out.println("pretty good laptop, go ahead to buy it.");
        } else if (this.price > 1000 && this.year <= 2023 && this.year >= 2010) {
            System.out.println("it will do, but it is pretty old.");
        } else if (this.price <= 1000 && this.year <= 2023 && this.year >= 2010) {
            System.out.println("cheap piece of junk");
        } else if (this.year < 2010) {
            System.out.println("Stone slab");
        }
        }
    }
