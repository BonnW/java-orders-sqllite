package com.burahan.sqlliteorders.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Orders
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private long ordnum;

    private double ordamount;

    private double advanceamount;

    @ManyToOne
    @JoinColumn(name="custcode", nullable = false)
    @JsonIgnore
    private Customers customer;

    @ManyToOne
    @JoinColumn(name="agentcode", nullable = false)
    @JsonIgnore
    private Agents agent;

    public Orders()
    {
    }

    public long getOrdnum()
    {
        return ordnum;
    }

    public Customers getCustomer()
    {
        return customer;
    }

    public Agents getAgent()
    {
        return agent;
    }

    public double getOrdamount()
    {
        return ordamount;
    }

    public void setOrdamount(double ordamount)
    {
        this.ordamount = ordamount;
    }

    public double getAdvanceamount()
    {
        return advanceamount;
    }

    public void setAdvanceamount(double advanceamount)
    {
        this.advanceamount = advanceamount;
    }
}
