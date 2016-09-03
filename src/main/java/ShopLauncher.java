public class ShopLauncher {

    private String shopName ;

    public ShopLauncher() {
    }

    public ShopLauncher(String shopName) {
        this.shopName = shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopName() {

        return shopName;
    }

    public void main (){
        System.out.println("Hello from ShopLauncher -> " + shopName);
    }
}
