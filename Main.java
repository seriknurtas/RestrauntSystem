import controllers.OrderController;
import controllers.UserController;
import models.BillingService;
import models.BillingServiceProxy;
import models.Menu;
import models.User;
import models.CreditCardPayment;  //стратегия оплаты картой
import models.PaymentStrategy;
import views.ConsoleView;

public class Main {
    public static void main(String[] args) {
        // Создаем представление (view), сервисы и контроллеры
        ConsoleView view = new ConsoleView();
        
        // Создаем реальный объект BillingService и оборачиваем его в Proxy
        BillingServiceProxy billingServiceProxy = new BillingServiceProxy();
        
        // Создаем меню
        Menu menu = new Menu();
        
        // Создаем контроллеры для заказов и пользователей
        OrderController orderController = new OrderController(view, billingServiceProxy, menu);
        UserController userController = new UserController(view);
        
        // Создаем пользователя
        User user = new User("Arman Jumashev", "231284@astanait.edu.kz");
        
        // Отображаем информацию о пользователе
        userController.displayUserDetails(user);
        
        // Показываем меню
        orderController.showMenu();
        
        // Выбираем стратегию оплаты (например, через кредитную карту)
        PaymentStrategy paymentStrategy = new CreditCardPayment();
        
        // Создаем и размещаем заказ с использованием выбранной стратегии оплаты
        orderController.createAndPlaceOrder("Lagman", 12.99, paymentStrategy);
    }
}
