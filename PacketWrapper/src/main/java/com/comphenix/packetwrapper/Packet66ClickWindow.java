package com.comphenix.packetwrapper;

import org.bukkit.inventory.ItemStack;

import com.comphenix.protocol.events.PacketContainer;

public class Packet66ClickWindow extends AbstractPacket {
    public static final int ID = 102;
    
    public Packet66ClickWindow() {
        super(new PacketContainer(ID));
        handle.getModifier().writeDefaults();
    }
    
    public Packet66ClickWindow(PacketContainer packet) {
        super(packet);
    }
    
    /**
     * Retrieve the id of the window which was clicked. 
     * <p>
     * Use 0 for the player inventory.
     * @return The current Window id
    */
    public byte getWindowId() {
        return handle.getIntegers().read(0).byteValue();
    }
    
    /**
     * Set the id of the window which was clicked. 
     * <p>
     * Use 0 for the player inventory.
     * @param value - new value.
    */
    public void setWindowId(byte value) {
        handle.getIntegers().write(0, (int) value);
    }
    
    /**
     * Retrieve the clicked slot index.
     * @return The current Slot
    */
    public short getSlot() {
        return handle.getIntegers().read(1).shortValue();
    }
    
    /**
     * Set the clicked slot index.
     * @param value - new value.
    */
    public void setSlot(short value) {
        handle.getIntegers().write(1, (int) value);
    }
    
    /**
     * Retrieve the mouse button that was clicked.
     * <p>
     * Here zero is left click, one is right click and three is middle click.
     * @return The current Mouse button
    */
    public byte getMouseButton() {
        return handle.getIntegers().read(2).byteValue();
    }
    
    /**
     * Set the mouse button that was clicked.
     * <p>
     * Here zero is left click, one is right click and three is middle click.
     * @param value - new value.
    */
    public void setMouseButton(byte value) {
        handle.getIntegers().write(2, (int) value);
    }
    
    /**
     * Retrieve a unique number for the action, used for transaction handling (See the Transaction packet)..
     * @return The current Action number
    */
    public short getActionNumber() {
        return handle.getShorts().read(0);
    }
    
    /**
     * Set a unique number for the action, used for transaction handling (See the Transaction packet)..
     * @param value - new value.
    */
    public void setActionNumber(short value) {
        handle.getShorts().write(0, value);
    }
    
    /**
     * Retrieve whether or not the user was holding keyboard shift when they clicked..
     * @return The current Shift
    */
    public boolean getShift() {
        return handle.getIntegers().read(3) != 0;
    }
    
    /**
     * Set whether or not the user was holding keyboard shift when they clicked.
     * @param value - new value.
    */
    public void setShift(boolean value) {
        handle.getIntegers().write(3, value ? 1 : 0);
    }
    
    /**
     * Retrieve the item that was clicked in the inventory.
     * @return The current Clicked item
    */
    public ItemStack getClickedItem() {
        return handle.getItemModifier().read(0);
    }
    
    /**
     * Set the item that was clicked in the inventory.
     * @param value - new value.
    */
    public void setClickedItem(ItemStack value) {
        handle.getItemModifier().write(0, value);
    }
}


