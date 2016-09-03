
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
        ShopLauncher s1 = (ShopLauncher)context.getBean("shopLauncher");
        ShopLauncher s2 = (ShopLauncher)context.getBean(ShopLauncher.class);
        ShopLauncher s3 = (ShopLauncher)context.getBean("shopLauncher",ShopLauncher.class );
        ShopLauncher s4 = (ShopLauncher)context.getBean("my-alias");

        s1.setShopName("123");
        s1.main();
        s2.setShopName("456");
        s2.main();
        s3.setShopName("789");
        s3.main();
        s4.setShopName("10.11.12");
        s4.main();

        System.out.println(s1.getShopName());
        System.out.println(s2.getShopName());
        System.out.println(s3.getShopName());
        System.out.println(s4.getShopName());}
}
