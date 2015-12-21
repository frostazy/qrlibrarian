package entity;
import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by ZY on 2015/12/17.
 */

@NamedQueries({
        @NamedQuery(name = "findItemByBorrowUser", query = "from Item where borrowUserId = ?1"),
        @NamedQuery(name = "findAvailableItem", query = "select id, itemName from Item where availability = 1"),
        @NamedQuery(name = "findNotAvailableItem", query = "select id, itemName from Item where availability = 0")
})
@Entity
@Table(name = "item")
public class Item implements Serializable {

    private Integer id;      //
    private String itemName;
    private String owner;
    private String description;
    private Integer availability;
    private Integer borrowUserId;
    private String borrowUserName;
    private Timestamp borrowTime;
    private String url;

    @Id
    @GeneratedValue
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "ITEMNAME", length = 45)
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Column(name = "OWNER", length = 45)
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Column(name = "DESCRIPTION", length = 450)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "AVAILABILITY")
    public Integer getAvailability() {
        return availability;
    }

    public void setAvailability(Integer availability) {
        this.availability = availability;
    }

    @Column(name = "BORROW_USER_ID")
    public Integer getBorrowUserId() {
        return borrowUserId;
    }

    public void setBorrowUserId(Integer borrowUserId) {
        this.borrowUserId = borrowUserId;
    }


    @Column(name = "BORROW_USER_NAME", length = 45)
    public String getBorrowUserName() { return borrowUserName; }

    public void setBorrowUserName(String borrowUserName) { this.borrowUserName = borrowUserName; }

    @Column(name = "BORROW_TIME")
    public Timestamp getBorrowTime() {
        return borrowTime;
    }

    public void setBorrowTime(Timestamp borrowTime) {
        this.borrowTime = borrowTime;
    }

    @Column(name = "URL", length = 45)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


}
