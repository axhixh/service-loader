package np.com.axhixh.platformb;

import np.com.axhixh.services.MessagingService;

/**
 * Created by axhixh on 5/20/16.
 */
public class PlatformBMessaging implements MessagingService {
    public void sendMessage(String message) {
        System.out.println("Platform B Messaging: " + message);
    }
}
