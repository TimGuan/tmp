package tim.blog.api.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created with IntelliJ IDEA.
 * User: kaiqiang.guan
 * Date: 14-2-14
 * Time: 下午5:30
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Page {
    private int pageId;
    private String pageTitle;
    private String pageLink;

    @javax.persistence.Column(name = "page_id")
    @Id
    public int getPageId() {
        return pageId;
    }

    public void setPageId(int pageId) {
        this.pageId = pageId;
    }

    @javax.persistence.Column(name = "page_title")
    @Basic
    public String getPageTitle() {
        return pageTitle;
    }

    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
    }

    @javax.persistence.Column(name = "page_link")
    @Basic
    public String getPageLink() {
        return pageLink;
    }

    public void setPageLink(String pageLink) {
        this.pageLink = pageLink;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Page page = (Page) o;

        if (pageId != page.pageId) return false;
        if (pageLink != null ? !pageLink.equals(page.pageLink) : page.pageLink != null) return false;
        if (pageTitle != null ? !pageTitle.equals(page.pageTitle) : page.pageTitle != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pageId;
        result = 31 * result + (pageTitle != null ? pageTitle.hashCode() : 0);
        result = 31 * result + (pageLink != null ? pageLink.hashCode() : 0);
        return result;
    }
}
