package np.com.axhixh.platforma;

import np.com.axhixh.services.PersistenceService;

/**
 * Created by axhixh on 5/20/16.
 */
public class PlatformAPersistence implements PersistenceService {
    public void save(String document) {
        System.out.println("Platform A Persistence: " + document);
    }
}
