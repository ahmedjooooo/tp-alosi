/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package rmi;

import java.rmi.*;
import java.rmi.server.ServerNotActiveException;

/**
 *
 * @author PC
 */

public interface servinterface extends Remote {
public String inter (String a,String b) throws RemoteException,ServerNotActiveException;
public String somme (String c) throws RemoteException,ServerNotActiveException;

}
