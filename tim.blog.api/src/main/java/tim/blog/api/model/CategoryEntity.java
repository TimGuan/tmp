package tim.blog.api.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created with IntelliJ IDEA.
 * User: guankaiqiang
 * Date: 14-2-13
 * Time: 下午11:56
 * To change this template use File | Settings | File Templates.
 */
@javax.persistence.Table(name = "category", schema = "", catalog = "blog")
@Entity
public class CategoryEntity {
    private int id;
    private Integer isNav;
    private String categoryName;

    @javax.persistence.Column(name = "id")
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @javax.persistence.Column(name = "is_nav")
    @Basic
    public Integer getNav() {
        return isNav;
    }

    public void setNav(Integer nav) {
        isNav = nav;
    }

    @javax.persistence.Column(name = "category_name")
    @Basic
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CategoryEntity that = (CategoryEntity) o;

        if (id != that.id) return false;
        if (categoryName != null ? !categoryName.equals(that.categoryName) : that.categoryName != null) return false;
        if (isNav != null ? !isNav.equals(that.isNav) : that.isNav != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (isNav != null ? isNav.hashCode() : 0);
        result = 31 * result + (categoryName != null ? categoryName.hashCode() : 0);
        return result;
    }
}
