/*
MobileRobots Advanced Robotics Interface for Applications (ARIA)
Copyright (C) 2004, 2005 ActivMedia Robotics LLC
Copyright (C) 2006, 2007, 2008, 2009, 2010 MobileRobots Inc.
Copyright (C) 2011, 2012 Adept Technology

     This program is free software; you can redistribute it and/or modify
     it under the terms of the GNU General Public License as published by
     the Free Software Foundation; either version 2 of the License, or
     (at your option) any later version.

     This program is distributed in the hope that it will be useful,
     but WITHOUT ANY WARRANTY; without even the implied warranty of
     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
     GNU General Public License for more details.

     You should have received a copy of the GNU General Public License
     along with this program; if not, write to the Free Software
     Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA

If you wish to redistribute ARIA under different terms, contact 
MobileRobots for information about a commercial version of ARIA at 
robots@mobilerobots.com or 
MobileRobots Inc, 10 Columbia Drive, Amherst, NH 03031; 800-639-9481
*/
/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.36
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mobilerobots.Aria;

public class ArRatioInputKeydrive {
  /* (begin code from javabody typemap) */

  private long swigCPtr;
  protected boolean swigCMemOwn;

  /* for internal use by swig only */
  public ArRatioInputKeydrive(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArRatioInputKeydrive obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  /* (end code from javabody typemap) */

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      AriaJavaJNI.delete_ArRatioInputKeydrive(swigCPtr);
    }
    swigCPtr = 0;
  }

  public ArRatioInputKeydrive(ArRobot robot, ArActionRatioInput input, int priority, double velIncrement) {
    this(AriaJavaJNI.new_ArRatioInputKeydrive__SWIG_0(ArRobot.getCPtr(robot), robot, ArActionRatioInput.getCPtr(input), input, priority, velIncrement), true);
  }

  public ArRatioInputKeydrive(ArRobot robot, ArActionRatioInput input, int priority) {
    this(AriaJavaJNI.new_ArRatioInputKeydrive__SWIG_1(ArRobot.getCPtr(robot), robot, ArActionRatioInput.getCPtr(input), input, priority), true);
  }

  public ArRatioInputKeydrive(ArRobot robot, ArActionRatioInput input) {
    this(AriaJavaJNI.new_ArRatioInputKeydrive__SWIG_2(ArRobot.getCPtr(robot), robot, ArActionRatioInput.getCPtr(input), input), true);
  }

  public void takeKeys() {
    AriaJavaJNI.ArRatioInputKeydrive_takeKeys(swigCPtr, this);
  }

  public void giveUpKeys() {
    AriaJavaJNI.ArRatioInputKeydrive_giveUpKeys(swigCPtr, this);
  }

  public void up() {
    AriaJavaJNI.ArRatioInputKeydrive_up(swigCPtr, this);
  }

  public void down() {
    AriaJavaJNI.ArRatioInputKeydrive_down(swigCPtr, this);
  }

  public void z() {
    AriaJavaJNI.ArRatioInputKeydrive_z(swigCPtr, this);
  }

  public void x() {
    AriaJavaJNI.ArRatioInputKeydrive_x(swigCPtr, this);
  }

  public void left() {
    AriaJavaJNI.ArRatioInputKeydrive_left(swigCPtr, this);
  }

  public void right() {
    AriaJavaJNI.ArRatioInputKeydrive_right(swigCPtr, this);
  }

  public void space() {
    AriaJavaJNI.ArRatioInputKeydrive_space(swigCPtr, this);
  }

  public ArFunctor getFireCB() {
    long cPtr = AriaJavaJNI.ArRatioInputKeydrive_getFireCB(swigCPtr, this);
    return (cPtr == 0) ? null : new ArFunctor(cPtr, false);
  }

}