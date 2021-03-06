package org.wickedsource.coderadar.factories.entities;

import org.springframework.data.domain.*;
import org.wickedsource.coderadar.commit.domain.Commit;

import java.util.Arrays;
import java.util.Date;

public class CommitFactory {

    public Commit unprocessedCommit() {
        Commit commit = new Commit();
        commit.setParentCommitName("123");
        commit.setName("345");
        commit.setTimestamp(new Date());
        commit.setAuthor("max");
        return commit;
    }

    public Commit validCommit() {
        Commit commit = new Commit();
        commit.setParentCommitName("123");
        commit.setName("345");
        commit.setTimestamp(new Date());
        commit.setAuthor("max");
        commit.setSequenceNumber(1);
        return commit;
    }

    public Page<Commit> commitPage() {
        Pageable pageRequest = new PageRequest(1, 10, Sort.Direction.ASC, "name");
        Page page = new PageImpl(Arrays.asList(unprocessedCommit(), unprocessedCommit()), pageRequest, 100);
        return page;
    }
}
