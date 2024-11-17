package com.cryptoclient.application.views.dashboard.components;

import javax.swing.*;
import java.awt.*;

public class MenuPanel extends JPanel {

    private CryptoSubmenu cryptoSubmenu;
    private ProfileSubmenu profileSubmenu;

    public MenuPanel() {
        this.setLayout(new BorderLayout());

        // Set submenus
        this.setCryptoSubmenu(new CryptoSubmenu(new DefaultListModel<>()));
        this.setProfileSubmenu(new ProfileSubmenu());

        // Add them to the main menu
        this.add(this.getCryptoSubmenu(), BorderLayout.CENTER);
        this.add(this.getProfileSubmenu(), BorderLayout.SOUTH);
    }

    public CryptoSubmenu getCryptoSubmenu() {
        return cryptoSubmenu;
    }

    public void setCryptoSubmenu(CryptoSubmenu cryptoSubmenu) {
        this.cryptoSubmenu = cryptoSubmenu;
    }

    public ProfileSubmenu getProfileSubmenu() {
        return profileSubmenu;
    }

    public void setProfileSubmenu(ProfileSubmenu profileSubmenu) {
        this.profileSubmenu = profileSubmenu;
    }
}
