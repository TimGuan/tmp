package tim.blog.api.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created with IntelliJ IDEA.
 * User: kaiqiang.guan
 * Date: 14-2-14
 * Time: 下午2:21
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Tag {
    private int id;
    private String tagName;
    private String tagAlias;

    @javax.persistence.Column(name = "id")
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @javax.persistence.Column(name = "tag_name")
    @Basic
    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    @javax.persistence.Column(name = "tag_alias")
    @Basic
    public String getTagAlias() {
        return tagAlias;
    }

    public void setTagAlias(String tagAlias) {
        this.tagAlias = tagAlias;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tag tag = (Tag) o;

        if (id != tag.id) return false;
        if (tagAlias != null ? !tagAlias.equals(tag.tagAlias) : tag.tagAlias != null) return false;
        if (tagName != null ? !tagName.equals(tag.tagName) : tag.tagName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (tagName != null ? tagName.hashCode() : 0);
        result = 31 * result + (tagAlias != null ? tagAlias.hashCode() : 0);
        return result;
    }
}
