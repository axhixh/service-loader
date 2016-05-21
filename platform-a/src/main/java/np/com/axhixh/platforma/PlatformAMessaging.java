package np.com.axhixh.platforma;

import np.com.axhixh.services.MessagingService;

/**
 * Created by axhixh on 5/20/16.
 */
public class PlatformAMessaging implements MessagingService {
    public void sendMessage(String message) {
        System.out.println("Platform A Messaging: " + message);
    }
}
