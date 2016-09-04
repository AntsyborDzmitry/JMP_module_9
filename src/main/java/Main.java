
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");

        // instantiate bean by name
        ShopLauncher s1 = (ShopLauncher)context.getBean("shopLauncher");

        // instantiate bean by type
        ShopLauncher s2 = (ShopLauncher)context.getBean(ShopLauncher.class);
        s2.setShopName("Amazon");

        // instantiate bean by name and type
        ShopLauncher s3 = (ShopLauncher)context.getBean("shopLauncher",ShopLauncher.class );
        s3.setShopName("Ebay");

        // instantiate bean by alias
        ShopLauncher s4 = (ShopLauncher)context.getBean("my-alias");
        s4.setShopName("Walmart");


        s1.main();

        s2.main();

        s3.main();

        s4.main();
    }
}
