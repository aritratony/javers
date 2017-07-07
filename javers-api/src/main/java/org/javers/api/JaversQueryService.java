package org.javers.api;

import org.javers.core.Javers;
import org.javers.core.diff.Change;
import org.javers.core.metamodel.object.CdoSnapshot;
import org.javers.repository.jql.JqlQuery;
import org.javers.shadow.Shadow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author pawel szymczyk
 */
@Component
class JaversQueryService {

    private final Javers javers;

    @Autowired
    public JaversQueryService(Javers javers) {
        this.javers = javers;
    }

    public List<CdoSnapshot> findSnapshots(JqlQuery jqlQuery) {
        return javers.findSnapshots(jqlQuery);
    }


    public List<Change> findChanges(JqlQuery jqlQuery) {
        return javers.findChanges(jqlQuery);
    }

    public List<Shadow<Object>> findShadows(JqlQuery jqlQuery) {
        return javers.findShadows(jqlQuery);
    }
}
