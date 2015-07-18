/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.asdfa.developingspace.taskbarlib;

import java.util.logging.Logger;

/**
 *
 * @author austin
 */
public class JniTest {
    private static final Logger LOG = Logger.getLogger(JniTest.class.getName());
	public static void main(String[] args){
		helloWorld();
	}
	static native void helloWorld();
}
