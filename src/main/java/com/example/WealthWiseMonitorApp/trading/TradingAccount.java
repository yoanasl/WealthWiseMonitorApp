package com.example.WealthWiseMonitorApp.trading;

import com.example.WealthWiseMonitorApp.wallet.Wallet;
import jakarta.persistence.*;

@Entity
@Table(name = "tradingAccounts")
public class TradingAccount {

    @Id
    @GeneratedValue
    @Column(name = "accountId")
    private Long accountID;

    @ManyToOne
    @JoinColumn(name = "walletId")
    private Wallet wallet;
    @Column(name = "accountName")
    private String accountName;

    @Column(name = "accountType")
    private String accountType;

    @Column(name = "balance")
    private double balance;

    // Constructors, getters, and setters
}
