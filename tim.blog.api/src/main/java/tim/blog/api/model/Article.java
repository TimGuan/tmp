package tim.blog.api.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created with IntelliJ IDEA.
 * User: kaiqiang.guan
 * Date: 14-2-17
 * Time: 下午6:01
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Article {
    private int articleId;

    @Column(name = "article_id")
    @Id
    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    private String articleName;

    @Column(name = "article_name")
    @Basic
    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    private Timestamp createTime;

    @Column(name = "create_time")
    @Basic
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    private Integer isPublish;

    @Column(name = "is_publish")
    @Basic
    public Integer getPublish() {
        return isPublish;
    }

    public void setPublish(Integer publish) {
        isPublish = publish;
    }

    private int categoryId;

    private String tagIds;



    @Column(name = "category_id")
    @Basic
    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }    private String author;

    @Column(name = "tag_ids")
    @Basic
    public String getTagIds() {
        return tagIds;
    }

    public void setTagIds(String tagIds) {
        this.tagIds = tagIds;
    }

    @Column(name = "author")
    @Basic
    public String getAuthor() {
        return author;
    }    private Integer heat;

    public void setAuthor(String author) {
        this.author = author;
    }

    @Column(name = "heat")
    @Basic
    public Integer getHeat() {
        return heat;
    }

    public void setHeat(Integer heat) {
        this.heat = heat;
    }    private String desc;

    @Column(name = "desc")
    @Basic
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Article article = (Article) o;

        if (articleId != article.articleId) return false;
        if (categoryId != article.categoryId) return false;
        if (articleName != null ? !articleName.equals(article.articleName) : article.articleName != null) return false;
        if (author != null ? !author.equals(article.author) : article.author != null) return false;
        if (createTime != null ? !createTime.equals(article.createTime) : article.createTime != null) return false;
        if (desc != null ? !desc.equals(article.desc) : article.desc != null) return false;
        if (heat != null ? !heat.equals(article.heat) : article.heat != null) return false;
        if (isPublish != null ? !isPublish.equals(article.isPublish) : article.isPublish != null) return false;
        if (tagIds != null ? !tagIds.equals(article.tagIds) : article.tagIds != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = articleId;
        result = 31 * result + (articleName != null ? articleName.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (isPublish != null ? isPublish.hashCode() : 0);
        result = 31 * result + categoryId;
        result = 31 * result + (tagIds != null ? tagIds.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (heat != null ? heat.hashCode() : 0);
        result = 31 * result + (desc != null ? desc.hashCode() : 0);
        return result;
    }
}
