package ru.ifmo.rain.ivanova.bank;

import java.rmi.*;

public interface Account extends Remote {
    /** Returns account identifier. */
    String getId() throws RemoteException;

    /** Returns amount of money at the account. */
    long getAmount() throws RemoteException;

    /** Sets amount of money at the account. */
    void addAmount(final long amount) throws RemoteException;
}