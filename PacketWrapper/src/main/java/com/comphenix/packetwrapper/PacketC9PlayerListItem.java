package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketContainer;

public class PacketC9PlayerListItem extends AbstractPacket {
    public static final int ID = 201;
    
    public PacketC9PlayerListItem() {
        super(new PacketContainer(ID));
        handle.getModifier().writeDefaults();
    }
    
    public PacketC9PlayerListItem(PacketContainer packet) {
        super(packet);
    }
    
    /**
     * Retrieve the player name.
     * <p>
     * Supports chat colouring. limited to 16 characters.
     * @return The current Player name
    */
    public String getPlayerName() {
        return handle.getStrings().read(0);
    }
    
    /**
     * Set the player name.
     * <p>
     * Supports chat colouring. Limited to 16 characters.
     * @param value - new value.
    */
    public void setPlayerName(String value) {
        handle.getStrings().write(0, value);
    }
    
    /**
     * Retrieve whether or not to remove the given player from the list of online players.
     * @return The current Online
    */
    public boolean getOnline() {
        return handle.getSpecificModifier(boolean.class).read(0);
    }
    
    /**
     * Set whether or not to remove the given player from the list of online players.
     * @param value - new value.
    */
    public void setOnline(boolean value) {
        handle.getSpecificModifier(boolean.class).write(0, value);
    }
    
    /**
     * Retrieve ping in milliseconds.
     * @return The current Ping
    */
    public short getPing() {
        return handle.getIntegers().read(0).shortValue();
    }
    
    /**
     * Set ping in milliseconds.
     * @param value - new value.
    */
    public void setPing(short value) {
        handle.getIntegers().write(0, (int) value);
    }
}


