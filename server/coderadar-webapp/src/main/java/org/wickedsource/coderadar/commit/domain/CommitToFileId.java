package org.wickedsource.coderadar.commit.domain;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.wickedsource.coderadar.file.domain.File;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class CommitToFileId implements Serializable {

    @ManyToOne
    private Commit commit;

    @ManyToOne
    private File file;

    public CommitToFileId() {
    }

    public CommitToFileId(Commit commit, File file) {
        this.commit = commit;
        this.file = file;
    }

    public Commit getCommit() {
        return commit;
    }

    public void setCommit(Commit commit) {
        this.commit = commit;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof CommitToFileId)) {
            return false;
        }
        CommitToFileId that = (CommitToFileId) obj;
        return this.commit.getId().equals(that.commit.getId()) && this.file.getId().equals(that.file.getId());
    }

    @Override
    public int hashCode() {
        return 17 + commit.getId().hashCode() + file.getId().hashCode();
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
