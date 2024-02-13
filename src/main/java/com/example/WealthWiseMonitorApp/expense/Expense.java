package com.example.WealthWiseMonitorApp.expense;

import com.example.WealthWiseMonitorApp.wallet.Wallet;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "expenses")
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "expenseId")
    private Long expenseID;

    @ManyToOne
    @JoinColumn(name = "walletId")
    private Wallet wallet;

    @Column(name = "expenseDate")
    private Date expenseDate;

    @Column(name = "description")
    private String description;

    @Column(name = "amount")
    private double amount;

    @Column(name = "category")
    private String category;

    // Constructors, getters, and setters
}

