package np.com.axhixh.platformb;

import np.com.axhixh.services.PersistenceService;

/**
 * Created by axhixh on 5/20/16.
 */
public class PlatformBPersistence implements PersistenceService {
    public void save(String document) {
        System.out.println("Platform B Persistence: " + document);
    }
}
