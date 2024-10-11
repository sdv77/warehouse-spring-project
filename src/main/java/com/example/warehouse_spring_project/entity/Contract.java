package com.example.warehouse_spring_project.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date startDate;
    private Date endDate;
    private Date archiveDate;

    @ManyToOne
    @JoinColumn(name = "cell_item_id")
    private CellItem cellItem;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getArchiveDate() {
        return archiveDate;
    }

    public void setArchiveDate(Date archiveDate) {
        this.archiveDate = archiveDate;
    }

    public CellItem getCellItem() {
        return cellItem;
    }

    public void setCellItem(CellItem cellItem) {
        this.cellItem = cellItem;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
