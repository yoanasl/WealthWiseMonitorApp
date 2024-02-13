package com.example.WealthWiseMonitorApp.savingGoal;

import com.example.WealthWiseMonitorApp.wallet.Wallet;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "savingGoals")
public class SavingGoal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "goalId")
    private Long goalID;

    @ManyToOne
    @JoinColumn(name = "walletId")
    private Wallet wallet;

    @Column(name = "goalName")
    private String goalName;

    @Column(name = "description")
    private String description;

    @Column(name = "targetAmount")
    private double targetAmount;

    @Column(name = "currentAmount")
    private double currentAmount;

    @Column(name = "deadline")
    private Date deadline;

    // Constructors, getters, and setters
}
