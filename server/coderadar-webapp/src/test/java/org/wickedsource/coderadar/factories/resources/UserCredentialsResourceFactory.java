package org.wickedsource.coderadar.factories.resources;

import org.wickedsource.coderadar.user.domain.UserRegistrationDataResource;

public class UserCredentialsResourceFactory {

    public UserRegistrationDataResource userCredentialsResource() {
        return new UserRegistrationDataResource("user", "password");
    }
}
