package de.toolisticon.storage.o365;

import org.jboss.logging.Logger;
import org.keycloak.component.ComponentModel;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.KeycloakSessionFactory;
import org.keycloak.storage.UserStorageProviderFactory;
import org.keycloak.storage.UserStorageProviderModel;
import org.keycloak.storage.user.ImportSynchronization;
import org.keycloak.storage.user.SynchronizationResult;

import java.util.Date;

public class Office365StorageProviderFactory implements UserStorageProviderFactory<Office365StorageProvider>, ImportSynchronization {

    private static final Logger logger = Logger.getLogger(Office365StorageProviderFactory.class);

    @Override
    public Office365StorageProvider create(KeycloakSession session, ComponentModel model) {
        return null;
    }

    @Override
    public String getId() {
        return null;
    }

    @Override
    public SynchronizationResult sync(KeycloakSessionFactory sessionFactory, String realmId, UserStorageProviderModel model) {
        return null;
    }

    @Override
    public SynchronizationResult syncSince(Date lastSync, KeycloakSessionFactory sessionFactory, String realmId, UserStorageProviderModel model) {
        return null;
    }


}
