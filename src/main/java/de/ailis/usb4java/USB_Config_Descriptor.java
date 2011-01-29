/*
 * Copyright (C) 2011 Klaus Reimer <k@ailis.de>
 * See LICENSE.txt for licensing information.
 */

package de.ailis.usb4java;

import java.nio.ByteBuffer;


/**
 * The USB configuration descriptor describes information about a specific USB
 * device configuration.
 *
 * @author Klaus Reimer (k@ailis.de)
 */

public final class USB_Config_Descriptor extends USB_Descriptor_Header
{
    /**
     * Constructor.
     *
     * @param data
     *            The descriptor data
     */

    public USB_Config_Descriptor(final ByteBuffer data)
    {
        super(data);
    }


    /**
     * Returns the total size of the data returned for this configuration
     * including the length of all descriptors returned for this configuration.
     *
     * @return The total length of all configuration data (unsigned short).
     */

    public native int wTotalLength();


    /**
     * Returns the number of supported interfaces.
     *
     * @return The number of supported interfaces (unsigned byte).
     */

    public native int bNumInterfaces();


    /**
     * The value to be used for usb_set_configuration() to select this
     * configuration.
     *
     * @return The configuration value (unsigned byte).
     */

    public native int bConfigurationValue();


    /**
     * Returns the index of the string descriptor describing this configuation.
     *
     * @return The index of the string descriptor describing this configuation
     *         (unsigned byte).
     */

    public native int iConfiguration();


    /**
     * Returns a bitmap with configuration attributes.
     * <ul>
     * <li>Bit 7: Reserved.</li>
     * <li>Bit 6: Self-powered.</li>
     * <li>Bit 5: Remote wakeup.</li>
     * <li>Bit 4: Reserved.</li>
     * <li>Bit 3: Reserved.</li>
     * <li>Bit 2: Reserved.</li>
     * <li>Bit 1: Reserved.</li>
     * <li>Bit 0: Reserved.</li>
     * </ul>
     *
     * @return A bitmap with configuration attributes (unsigned byte).
     */

    public native int bmAttributes();


    /**
     * Returns the maximum power consumption of the device when this
     * configuration is active and the device is fully operational. The power
     * is expressed in 2 maA units (50 means 100mA for example).
     *
     * @return The maximum power consumption in 2mA units (unsigned byte).
     */

    public native int MaxPower();


    /**
     * Returns the length of the extra data block in bytes.
     *
     * @return The length of the extra data block in bytes.
     */

    public native int extralen();


    /**
     * Returns the extra data block.
     *
     * @return The extra data block.
     */

    public native ByteBuffer extra();


    /**
     * Returns the interfaces of this USB configuration. The original method
     * is named "interface" but this can't be used in Java because it is a
     * reserved word.
     *
     * @return The interfaces of this USB configuration.
     */

    public native USB_Interface[] iface();
}