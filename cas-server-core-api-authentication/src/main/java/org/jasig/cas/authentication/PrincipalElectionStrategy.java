package org.jasig.cas.authentication;

import org.jasig.cas.authentication.principal.Principal;

import java.util.Collection;
import java.util.Map;

/**
 * This is {@link PrincipalElectionStrategy} that attempts to nominate a given principal
 * as the primary principal object amongst many authentication events.
 *
 * @author Misagh Moayyed
 * @since 4.2.0
 */
public interface PrincipalElectionStrategy {

    /**
     * Elect the principal.
     *
     * @param authentications     the authentications
     * @param principalAttributes the principal attributes
     * @return the principal
     */
    Principal nominate(Collection<Authentication> authentications, Map<String, Object> principalAttributes);
}
