package de.seven.fate.liquidbase.model;

import de.seven.fate.liquidbase.dao.IdAble;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import java.util.Objects;

/**
 * Created by Mario on 26.03.2016.
 */
@Entity
public class Article implements IdAble<Long> {

    @Id
    private Long id;

    private String name;

    @Enumerated
    private Saison saison;

    @Enumerated
    private Size size;

    private String urn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Saison getSaison() {
        return saison;
    }

    public void setSaison(Saison saison) {
        this.saison = saison;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getUrn() {
        return urn;
    }

    public void setUrn(String urn) {
        this.urn = urn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Article article = (Article) o;
        return Objects.equals(name, article.name) &&
                saison == article.saison &&
                size == article.size &&
                Objects.equals(urn, article.urn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, saison, size, urn);
    }
}
