package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketContainer;

public class Packet69UpdateWindowProperty extends AbstractPacket {
    public static final int ID = 105;
    
    public Packet69UpdateWindowProperty() {
        super(new PacketContainer(ID));
        handle.getModifier().writeDefaults();
    }
    
    /**
     * List of properties for furnaces.
     * 
     * @author Kristian
     */
    public static class FurnaceProperties {
    	/**
    	 * The value is then in the range 0 - 180.
    	 */
    	public static final int PROGRESS_ARROW = 0;
    	
    	/**
    	 * The value is in the range 0 - 250.
    	 */
    	public static final int PROGRESS_FIRE_ICON = 1;
    	
    	private static FurnaceProperties INSTANCE = new FurnaceProperties();
    	
    	public static FurnaceProperties getInstace() {
    		return INSTANCE;
    	}
    }
    
    public Packet69UpdateWindowProperty(PacketContainer packet) {
        super(packet);
    }
    
    /**
     * Retrieve the id of the window to update.
     * @return The current Window id
    */
    public byte getWindowId() {
        return handle.getIntegers().read(0).byteValue();
    }
    
    /**
     * Set the id of the window to update.
     * @param value - new value.
    */
    public void setWindowId(byte value) {
        handle.getIntegers().write(0, (int) value);
    }
    
    /**
     * Retrieve which property should be updated.
     * <p>
     * For the enchantment table, this is the slot ID.
     * @see {@link FurnaceProperties}
     * @return The current Property
    */
    public short getProperty() {
        return handle.getIntegers().read(1).shortValue();
    }
    
    /**
     * Set which property should be updated.
     * <p>
     * For the enchantment table, this is the slot ID.
     * @see {@link FurnaceProperties}
     * @param value - new value.
    */
    public void setProperty(short value) {
        handle.getIntegers().write(1, (int) value);
    }
    
    /**
     * Retrieve the new value for the property.
     * <p>
     * For the enchantment table, this is the enchanting level in the given slot.
     * @return The current Value
    */
    public short getValue() {
        return handle.getIntegers().read(2).shortValue();
    }
    
    /**
     * Set the new value for the property.
     * <p>
     * For the enchantment table, this is the enchanting level in the given slot.
     * @param value - new value.
    */
    public void setValue(short value) {
        handle.getIntegers().write(2, (int) value);
    }
}

