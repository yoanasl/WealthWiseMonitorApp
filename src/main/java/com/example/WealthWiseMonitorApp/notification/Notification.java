package com.example.WealthWiseMonitorApp.notification;

import com.example.WealthWiseMonitorApp.wallet.Wallet;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "notifications")
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "notificationId")
    private Long notificationID;

    @ManyToOne
    @JoinColumn(name = "walletId")
    private Wallet wallet;

    @Column(name = "notificationType")
    private String notificationType;

    @Column(name = "description")
    private String description;

    @Column(name = "date")
    private Date date;

    // Constructors, getters, and setters
}
