package com.comphenix.packetwrapper;

import java.security.PublicKey;

import com.comphenix.protocol.events.PacketContainer;

public class PacketFDEncryptionKeyRequest extends AbstractPacket {
    public static final int ID = 253;
    
    public PacketFDEncryptionKeyRequest() {
        super(new PacketContainer(ID));
        handle.getModifier().writeDefaults();
    }
    
    public PacketFDEncryptionKeyRequest(PacketContainer packet) {
        super(packet);
    }
    
    /**
     * Retrieve the server ID.
     * @return The current Server id
    */
    public String getServerId() {
        return handle.getStrings().read(0);
    }
    
    /**
     * Set the server ID.
     * @param value - new value.
    */
    public void setServerId(String value) {
        handle.getStrings().write(0, value);
    }
    
    /**
     * Retrieve the public key instance.
     * @return The current Public key length
    */
    public PublicKey getPublicKey() {
        return handle.getSpecificModifier(PublicKey.class).read(0);
    }
    
    /**
     * Set the public key instance.
     * @param value - new value.
    */
    public void setPublicKeyLength(PublicKey value) {
        handle.getSpecificModifier(PublicKey.class).write(0, value);
    }
    
    /**
     * Retrieve the verify token.
     * @return The current Public key
    */
    public byte[] getVerifyToken() {
        return handle.getByteArrays().read(0);
    }
    
    /**
     * Set the verify token.
     * @param value - new value.
    */
    public void getVerifyToken(byte[] value) {
        handle.getByteArrays().write(0, value);
    }
}

