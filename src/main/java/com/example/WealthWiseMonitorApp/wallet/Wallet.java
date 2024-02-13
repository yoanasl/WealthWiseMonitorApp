package com.example.WealthWiseMonitorApp.wallet;

import com.example.WealthWiseMonitorApp.user.User;
import jakarta.persistence.*;
import lombok.Data;


import java.math.BigDecimal;

@Entity
@Data
public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long walletID;
    private String walletName;
    private String description;
    private BigDecimal totalBalance;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    // Other annotations, constructors, getters, setters
}