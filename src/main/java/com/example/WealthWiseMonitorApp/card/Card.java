package com.example.WealthWiseMonitorApp.card;

import com.example.WealthWiseMonitorApp.user.User;
import com.example.WealthWiseMonitorApp.wallet.Wallet;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "cards")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cardId")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    @ManyToOne
    @JoinColumn(name = "walletId")
    private Wallet wallet;

    @Column(name = "cardType")
    private String cardType;

    @Column(name = "cardNumber")
    private String cardNumber;

    @Column(name = "expiryDate")
    private Date expiryDate;

    @Column(name = "cvv")
    private int cvv;

    @Column(name = "issuer")
    private String issuer;

    @Column(name = "currentBalance")
    private double currentBalance;

    // Constructors, getters, and setters
}
