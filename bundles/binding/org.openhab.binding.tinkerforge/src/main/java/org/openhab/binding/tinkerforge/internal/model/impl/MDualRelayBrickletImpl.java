/**
 * Copyright (c) 2010-2016, openHAB.org and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.tinkerforge.internal.model.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicBoolean;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openhab.binding.tinkerforge.internal.model.MBrickd;
import org.openhab.binding.tinkerforge.internal.model.MDualRelay;
import org.openhab.binding.tinkerforge.internal.model.MDualRelayBricklet;
import org.openhab.binding.tinkerforge.internal.model.MSubDevice;
import org.openhab.binding.tinkerforge.internal.model.MSubDeviceHolder;
import org.openhab.binding.tinkerforge.internal.model.ModelFactory;
import org.openhab.binding.tinkerforge.internal.model.ModelPackage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tinkerforge.BrickletDualRelay;
import com.tinkerforge.IPConnection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MDual Relay Bricklet</b></em>'.
 *
 * @author Theo Weiss
 * @since 1.3.0
 *        <!-- end-user-doc -->
 *        <p>
 *        The following features are implemented:
 *        <ul>
 *        <li>{@link org.openhab.binding.tinkerforge.internal.model.impl.MDualRelayBrickletImpl#getLogger
 *        <em>Logger</em>}</li>
 *        <li>{@link org.openhab.binding.tinkerforge.internal.model.impl.MDualRelayBrickletImpl#getUid <em>Uid</em>}
 *        </li>
 *        <li>{@link org.openhab.binding.tinkerforge.internal.model.impl.MDualRelayBrickletImpl#isPoll <em>Poll</em>}
 *        </li>
 *        <li>{@link org.openhab.binding.tinkerforge.internal.model.impl.MDualRelayBrickletImpl#getEnabledA
 *        <em>Enabled A</em>}</li>
 *        <li>{@link org.openhab.binding.tinkerforge.internal.model.impl.MDualRelayBrickletImpl#getTinkerforgeDevice
 *        <em>Tinkerforge Device</em>}</li>
 *        <li>{@link org.openhab.binding.tinkerforge.internal.model.impl.MDualRelayBrickletImpl#getIpConnection
 *        <em>Ip Connection</em>}</li>
 *        <li>{@link org.openhab.binding.tinkerforge.internal.model.impl.MDualRelayBrickletImpl#getConnectedUid
 *        <em>Connected Uid</em>}</li>
 *        <li>{@link org.openhab.binding.tinkerforge.internal.model.impl.MDualRelayBrickletImpl#getPosition
 *        <em>Position</em>}</li>
 *        <li>{@link org.openhab.binding.tinkerforge.internal.model.impl.MDualRelayBrickletImpl#getDeviceIdentifier
 *        <em>Device Identifier</em>}</li>
 *        <li>{@link org.openhab.binding.tinkerforge.internal.model.impl.MDualRelayBrickletImpl#getName <em>Name</em>}
 *        </li>
 *        <li>{@link org.openhab.binding.tinkerforge.internal.model.impl.MDualRelayBrickletImpl#getBrickd
 *        <em>Brickd</em>}</li>
 *        <li>{@link org.openhab.binding.tinkerforge.internal.model.impl.MDualRelayBrickletImpl#getMsubdevices
 *        <em>Msubdevices</em>}</li>
 *        <li>{@link org.openhab.binding.tinkerforge.internal.model.impl.MDualRelayBrickletImpl#getDeviceType
 *        <em>Device Type</em>}</li>
 *        </ul>
 *        </p>
 *
 * @generated
 */
public class MDualRelayBrickletImpl extends MinimalEObjectImpl.Container implements MDualRelayBricklet {
    /**
     * The default value of the '{@link #getLogger() <em>Logger</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getLogger()
     * @generated
     * @ordered
     */
    protected static final Logger LOGGER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLogger() <em>Logger</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getLogger()
     * @generated
     * @ordered
     */
    protected Logger logger = LOGGER_EDEFAULT;

    /**
     * The default value of the '{@link #getUid() <em>Uid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getUid()
     * @generated
     * @ordered
     */
    protected static final String UID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUid() <em>Uid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getUid()
     * @generated
     * @ordered
     */
    protected String uid = UID_EDEFAULT;

    /**
     * The default value of the '{@link #isPoll() <em>Poll</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #isPoll()
     * @generated
     * @ordered
     */
    protected static final boolean POLL_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isPoll() <em>Poll</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #isPoll()
     * @generated
     * @ordered
     */
    protected boolean poll = POLL_EDEFAULT;

    /**
     * The default value of the '{@link #getEnabledA() <em>Enabled A</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getEnabledA()
     * @generated
     * @ordered
     */
    protected static final AtomicBoolean ENABLED_A_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEnabledA() <em>Enabled A</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getEnabledA()
     * @generated
     * @ordered
     */
    protected AtomicBoolean enabledA = ENABLED_A_EDEFAULT;

    /**
     * The cached value of the '{@link #getTinkerforgeDevice() <em>Tinkerforge Device</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getTinkerforgeDevice()
     * @generated
     * @ordered
     */
    protected BrickletDualRelay tinkerforgeDevice;

    /**
     * The default value of the '{@link #getIpConnection() <em>Ip Connection</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getIpConnection()
     * @generated
     * @ordered
     */
    protected static final IPConnection IP_CONNECTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIpConnection() <em>Ip Connection</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getIpConnection()
     * @generated
     * @ordered
     */
    protected IPConnection ipConnection = IP_CONNECTION_EDEFAULT;

    /**
     * The default value of the '{@link #getConnectedUid() <em>Connected Uid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getConnectedUid()
     * @generated
     * @ordered
     */
    protected static final String CONNECTED_UID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getConnectedUid() <em>Connected Uid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getConnectedUid()
     * @generated
     * @ordered
     */
    protected String connectedUid = CONNECTED_UID_EDEFAULT;

    /**
     * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getPosition()
     * @generated
     * @ordered
     */
    protected static final char POSITION_EDEFAULT = '\u0000';

    /**
     * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getPosition()
     * @generated
     * @ordered
     */
    protected char position = POSITION_EDEFAULT;

    /**
     * The default value of the '{@link #getDeviceIdentifier() <em>Device Identifier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getDeviceIdentifier()
     * @generated
     * @ordered
     */
    protected static final int DEVICE_IDENTIFIER_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getDeviceIdentifier() <em>Device Identifier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getDeviceIdentifier()
     * @generated
     * @ordered
     */
    protected int deviceIdentifier = DEVICE_IDENTIFIER_EDEFAULT;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The cached value of the '{@link #getMsubdevices() <em>Msubdevices</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getMsubdevices()
     * @generated
     * @ordered
     */
    protected EList<MDualRelay> msubdevices;
    /**
     * The default value of the '{@link #getDeviceType() <em>Device Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getDeviceType()
     * @generated
     * @ordered
     */
    protected static final String DEVICE_TYPE_EDEFAULT = "bricklet_dual_relay";

    /**
     * The cached value of the '{@link #getDeviceType() <em>Device Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getDeviceType()
     * @generated
     * @ordered
     */
    protected String deviceType = DEVICE_TYPE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected MDualRelayBrickletImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ModelPackage.Literals.MDUAL_RELAY_BRICKLET;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Logger getLogger() {
        return logger;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setLogger(Logger newLogger) {
        Logger oldLogger = logger;
        logger = newLogger;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MDUAL_RELAY_BRICKLET__LOGGER, oldLogger,
                    logger));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getUid() {
        return uid;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setUid(String newUid) {
        String oldUid = uid;
        uid = newUid;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MDUAL_RELAY_BRICKLET__UID, oldUid, uid));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean isPoll() {
        return poll;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setPoll(boolean newPoll) {
        boolean oldPoll = poll;
        poll = newPoll;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MDUAL_RELAY_BRICKLET__POLL, oldPoll,
                    poll));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public AtomicBoolean getEnabledA() {
        return enabledA;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setEnabledA(AtomicBoolean newEnabledA) {
        AtomicBoolean oldEnabledA = enabledA;
        enabledA = newEnabledA;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MDUAL_RELAY_BRICKLET__ENABLED_A,
                    oldEnabledA, enabledA));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public BrickletDualRelay getTinkerforgeDevice() {
        return tinkerforgeDevice;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setTinkerforgeDevice(BrickletDualRelay newTinkerforgeDevice) {
        BrickletDualRelay oldTinkerforgeDevice = tinkerforgeDevice;
        tinkerforgeDevice = newTinkerforgeDevice;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MDUAL_RELAY_BRICKLET__TINKERFORGE_DEVICE,
                    oldTinkerforgeDevice, tinkerforgeDevice));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public IPConnection getIpConnection() {
        return ipConnection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setIpConnection(IPConnection newIpConnection) {
        IPConnection oldIpConnection = ipConnection;
        ipConnection = newIpConnection;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MDUAL_RELAY_BRICKLET__IP_CONNECTION,
                    oldIpConnection, ipConnection));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getConnectedUid() {
        return connectedUid;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setConnectedUid(String newConnectedUid) {
        String oldConnectedUid = connectedUid;
        connectedUid = newConnectedUid;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MDUAL_RELAY_BRICKLET__CONNECTED_UID,
                    oldConnectedUid, connectedUid));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public char getPosition() {
        return position;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setPosition(char newPosition) {
        char oldPosition = position;
        position = newPosition;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MDUAL_RELAY_BRICKLET__POSITION,
                    oldPosition, position));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public int getDeviceIdentifier() {
        return deviceIdentifier;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setDeviceIdentifier(int newDeviceIdentifier) {
        int oldDeviceIdentifier = deviceIdentifier;
        deviceIdentifier = newDeviceIdentifier;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MDUAL_RELAY_BRICKLET__DEVICE_IDENTIFIER,
                    oldDeviceIdentifier, deviceIdentifier));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MDUAL_RELAY_BRICKLET__NAME, oldName,
                    name));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public MBrickd getBrickd() {
        if (eContainerFeatureID() != ModelPackage.MDUAL_RELAY_BRICKLET__BRICKD) {
            return null;
        }
        return (MBrickd) eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetBrickd(MBrickd newBrickd, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject) newBrickd, ModelPackage.MDUAL_RELAY_BRICKLET__BRICKD, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setBrickd(MBrickd newBrickd) {
        if (newBrickd != eInternalContainer()
                || (eContainerFeatureID() != ModelPackage.MDUAL_RELAY_BRICKLET__BRICKD && newBrickd != null)) {
            if (EcoreUtil.isAncestor(this, newBrickd)) {
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            }
            NotificationChain msgs = null;
            if (eInternalContainer() != null) {
                msgs = eBasicRemoveFromContainer(msgs);
            }
            if (newBrickd != null) {
                msgs = ((InternalEObject) newBrickd).eInverseAdd(this, ModelPackage.MBRICKD__MDEVICES, MBrickd.class,
                        msgs);
            }
            msgs = basicSetBrickd(newBrickd, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MDUAL_RELAY_BRICKLET__BRICKD, newBrickd,
                    newBrickd));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EList<MDualRelay> getMsubdevices() {
        if (msubdevices == null) {
            msubdevices = new EObjectContainmentWithInverseEList<MDualRelay>(MSubDevice.class, this,
                    ModelPackage.MDUAL_RELAY_BRICKLET__MSUBDEVICES, ModelPackage.MSUB_DEVICE__MBRICK);
        }
        return msubdevices;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    @Override
    public void initSubDevices() {
        ModelFactory factory = ModelFactory.eINSTANCE;
        for (int i = 1; i < 3; i++) {
            MDualRelay mrelay = factory.createMDualRelay();
            mrelay.setUid(uid);
            String subId = "relay" + String.valueOf(i);
            logger.debug("addSubDevice: {}", subId);
            mrelay.setSubId(subId);
            mrelay.init();
            mrelay.setMbrick(this);
            getMsubdevices().add(mrelay);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ModelPackage.MDUAL_RELAY_BRICKLET__BRICKD:
                if (eInternalContainer() != null) {
                    msgs = eBasicRemoveFromContainer(msgs);
                }
                return basicSetBrickd((MBrickd) otherEnd, msgs);
            case ModelPackage.MDUAL_RELAY_BRICKLET__MSUBDEVICES:
                return ((InternalEList<InternalEObject>) (InternalEList<?>) getMsubdevices()).basicAdd(otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ModelPackage.MDUAL_RELAY_BRICKLET__BRICKD:
                return basicSetBrickd(null, msgs);
            case ModelPackage.MDUAL_RELAY_BRICKLET__MSUBDEVICES:
                return ((InternalEList<?>) getMsubdevices()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
            case ModelPackage.MDUAL_RELAY_BRICKLET__BRICKD:
                return eInternalContainer().eInverseRemove(this, ModelPackage.MBRICKD__MDEVICES, MBrickd.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ModelPackage.MDUAL_RELAY_BRICKLET__LOGGER:
                return getLogger();
            case ModelPackage.MDUAL_RELAY_BRICKLET__UID:
                return getUid();
            case ModelPackage.MDUAL_RELAY_BRICKLET__POLL:
                return isPoll();
            case ModelPackage.MDUAL_RELAY_BRICKLET__ENABLED_A:
                return getEnabledA();
            case ModelPackage.MDUAL_RELAY_BRICKLET__TINKERFORGE_DEVICE:
                return getTinkerforgeDevice();
            case ModelPackage.MDUAL_RELAY_BRICKLET__IP_CONNECTION:
                return getIpConnection();
            case ModelPackage.MDUAL_RELAY_BRICKLET__CONNECTED_UID:
                return getConnectedUid();
            case ModelPackage.MDUAL_RELAY_BRICKLET__POSITION:
                return getPosition();
            case ModelPackage.MDUAL_RELAY_BRICKLET__DEVICE_IDENTIFIER:
                return getDeviceIdentifier();
            case ModelPackage.MDUAL_RELAY_BRICKLET__NAME:
                return getName();
            case ModelPackage.MDUAL_RELAY_BRICKLET__BRICKD:
                return getBrickd();
            case ModelPackage.MDUAL_RELAY_BRICKLET__MSUBDEVICES:
                return getMsubdevices();
            case ModelPackage.MDUAL_RELAY_BRICKLET__DEVICE_TYPE:
                return getDeviceType();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case ModelPackage.MDUAL_RELAY_BRICKLET__LOGGER:
                setLogger((Logger) newValue);
                return;
            case ModelPackage.MDUAL_RELAY_BRICKLET__UID:
                setUid((String) newValue);
                return;
            case ModelPackage.MDUAL_RELAY_BRICKLET__POLL:
                setPoll((Boolean) newValue);
                return;
            case ModelPackage.MDUAL_RELAY_BRICKLET__ENABLED_A:
                setEnabledA((AtomicBoolean) newValue);
                return;
            case ModelPackage.MDUAL_RELAY_BRICKLET__TINKERFORGE_DEVICE:
                setTinkerforgeDevice((BrickletDualRelay) newValue);
                return;
            case ModelPackage.MDUAL_RELAY_BRICKLET__IP_CONNECTION:
                setIpConnection((IPConnection) newValue);
                return;
            case ModelPackage.MDUAL_RELAY_BRICKLET__CONNECTED_UID:
                setConnectedUid((String) newValue);
                return;
            case ModelPackage.MDUAL_RELAY_BRICKLET__POSITION:
                setPosition((Character) newValue);
                return;
            case ModelPackage.MDUAL_RELAY_BRICKLET__DEVICE_IDENTIFIER:
                setDeviceIdentifier((Integer) newValue);
                return;
            case ModelPackage.MDUAL_RELAY_BRICKLET__NAME:
                setName((String) newValue);
                return;
            case ModelPackage.MDUAL_RELAY_BRICKLET__BRICKD:
                setBrickd((MBrickd) newValue);
                return;
            case ModelPackage.MDUAL_RELAY_BRICKLET__MSUBDEVICES:
                getMsubdevices().clear();
                getMsubdevices().addAll((Collection<? extends MDualRelay>) newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case ModelPackage.MDUAL_RELAY_BRICKLET__LOGGER:
                setLogger(LOGGER_EDEFAULT);
                return;
            case ModelPackage.MDUAL_RELAY_BRICKLET__UID:
                setUid(UID_EDEFAULT);
                return;
            case ModelPackage.MDUAL_RELAY_BRICKLET__POLL:
                setPoll(POLL_EDEFAULT);
                return;
            case ModelPackage.MDUAL_RELAY_BRICKLET__ENABLED_A:
                setEnabledA(ENABLED_A_EDEFAULT);
                return;
            case ModelPackage.MDUAL_RELAY_BRICKLET__TINKERFORGE_DEVICE:
                setTinkerforgeDevice((BrickletDualRelay) null);
                return;
            case ModelPackage.MDUAL_RELAY_BRICKLET__IP_CONNECTION:
                setIpConnection(IP_CONNECTION_EDEFAULT);
                return;
            case ModelPackage.MDUAL_RELAY_BRICKLET__CONNECTED_UID:
                setConnectedUid(CONNECTED_UID_EDEFAULT);
                return;
            case ModelPackage.MDUAL_RELAY_BRICKLET__POSITION:
                setPosition(POSITION_EDEFAULT);
                return;
            case ModelPackage.MDUAL_RELAY_BRICKLET__DEVICE_IDENTIFIER:
                setDeviceIdentifier(DEVICE_IDENTIFIER_EDEFAULT);
                return;
            case ModelPackage.MDUAL_RELAY_BRICKLET__NAME:
                setName(NAME_EDEFAULT);
                return;
            case ModelPackage.MDUAL_RELAY_BRICKLET__BRICKD:
                setBrickd((MBrickd) null);
                return;
            case ModelPackage.MDUAL_RELAY_BRICKLET__MSUBDEVICES:
                getMsubdevices().clear();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case ModelPackage.MDUAL_RELAY_BRICKLET__LOGGER:
                return LOGGER_EDEFAULT == null ? logger != null : !LOGGER_EDEFAULT.equals(logger);
            case ModelPackage.MDUAL_RELAY_BRICKLET__UID:
                return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
            case ModelPackage.MDUAL_RELAY_BRICKLET__POLL:
                return poll != POLL_EDEFAULT;
            case ModelPackage.MDUAL_RELAY_BRICKLET__ENABLED_A:
                return ENABLED_A_EDEFAULT == null ? enabledA != null : !ENABLED_A_EDEFAULT.equals(enabledA);
            case ModelPackage.MDUAL_RELAY_BRICKLET__TINKERFORGE_DEVICE:
                return tinkerforgeDevice != null;
            case ModelPackage.MDUAL_RELAY_BRICKLET__IP_CONNECTION:
                return IP_CONNECTION_EDEFAULT == null ? ipConnection != null
                        : !IP_CONNECTION_EDEFAULT.equals(ipConnection);
            case ModelPackage.MDUAL_RELAY_BRICKLET__CONNECTED_UID:
                return CONNECTED_UID_EDEFAULT == null ? connectedUid != null
                        : !CONNECTED_UID_EDEFAULT.equals(connectedUid);
            case ModelPackage.MDUAL_RELAY_BRICKLET__POSITION:
                return position != POSITION_EDEFAULT;
            case ModelPackage.MDUAL_RELAY_BRICKLET__DEVICE_IDENTIFIER:
                return deviceIdentifier != DEVICE_IDENTIFIER_EDEFAULT;
            case ModelPackage.MDUAL_RELAY_BRICKLET__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case ModelPackage.MDUAL_RELAY_BRICKLET__BRICKD:
                return getBrickd() != null;
            case ModelPackage.MDUAL_RELAY_BRICKLET__MSUBDEVICES:
                return msubdevices != null && !msubdevices.isEmpty();
            case ModelPackage.MDUAL_RELAY_BRICKLET__DEVICE_TYPE:
                return DEVICE_TYPE_EDEFAULT == null ? deviceType != null : !DEVICE_TYPE_EDEFAULT.equals(deviceType);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == MSubDeviceHolder.class) {
            switch (derivedFeatureID) {
                case ModelPackage.MDUAL_RELAY_BRICKLET__MSUBDEVICES:
                    return ModelPackage.MSUB_DEVICE_HOLDER__MSUBDEVICES;
                default:
                    return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == MSubDeviceHolder.class) {
            switch (baseFeatureID) {
                case ModelPackage.MSUB_DEVICE_HOLDER__MSUBDEVICES:
                    return ModelPackage.MDUAL_RELAY_BRICKLET__MSUBDEVICES;
                default:
                    return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
        if (baseClass == MSubDeviceHolder.class) {
            switch (baseOperationID) {
                case ModelPackage.MSUB_DEVICE_HOLDER___INIT_SUB_DEVICES:
                    return ModelPackage.MDUAL_RELAY_BRICKLET___INIT_SUB_DEVICES;
                default:
                    return -1;
            }
        }
        return super.eDerivedOperationID(baseOperationID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
            case ModelPackage.MDUAL_RELAY_BRICKLET___INIT_SUB_DEVICES:
                initSubDevices();
                return null;
            case ModelPackage.MDUAL_RELAY_BRICKLET___INIT:
                init();
                return null;
            case ModelPackage.MDUAL_RELAY_BRICKLET___ENABLE:
                enable();
                return null;
            case ModelPackage.MDUAL_RELAY_BRICKLET___DISABLE:
                disable();
                return null;
        }
        return super.eInvoke(operationID, arguments);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) {
            return super.toString();
        }

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (logger: ");
        result.append(logger);
        result.append(", uid: ");
        result.append(uid);
        result.append(", poll: ");
        result.append(poll);
        result.append(", enabledA: ");
        result.append(enabledA);
        result.append(", tinkerforgeDevice: ");
        result.append(tinkerforgeDevice);
        result.append(", ipConnection: ");
        result.append(ipConnection);
        result.append(", connectedUid: ");
        result.append(connectedUid);
        result.append(", position: ");
        result.append(position);
        result.append(", deviceIdentifier: ");
        result.append(deviceIdentifier);
        result.append(", name: ");
        result.append(name);
        result.append(", deviceType: ");
        result.append(deviceType);
        result.append(')');
        return result.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    @Override
    public void init() {
        setEnabledA(new AtomicBoolean());
        logger = LoggerFactory.getLogger(MDualRelayBrickletImpl.class);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    @Override
    public void enable() {
        logger.debug("enable called on MDualRelayBricklet");
        tinkerforgeDevice = new BrickletDualRelay(getUid(), getIpConnection());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    @Override
    public void disable() {
        tinkerforgeDevice = null;
    }

} // MDualRelayBrickletImpl
