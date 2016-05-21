package np.com.axhixh.app1;

import np.com.axhixh.services.MessagingService;
import np.com.axhixh.services.PersistenceService;

import java.util.ServiceLoader;


public class App {
    public static void main(String[] args) {
        MessagingService messagingService = ServiceLoader.load(MessagingService.class).iterator().next();
        messagingService.sendMessage("Hello from App 1");
        PersistenceService persistenceService = ServiceLoader.load(PersistenceService.class).iterator().next();
        persistenceService.save("Document for App 1");
    }
}
