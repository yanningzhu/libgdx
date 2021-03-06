/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btCompoundShapeChildData extends BulletBase {
	private long swigCPtr;
	
	protected btCompoundShapeChildData(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	protected btCompoundShapeChildData(long cPtr, boolean cMemoryOwn) {
		this("btCompoundShapeChildData", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btCompoundShapeChildData obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				gdxBulletJNI.delete_btCompoundShapeChildData(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setTransform(btTransformFloatData value) {
    gdxBulletJNI.btCompoundShapeChildData_transform_set(swigCPtr, this, btTransformFloatData.getCPtr(value), value);
  }

  public btTransformFloatData getTransform() {
    long cPtr = gdxBulletJNI.btCompoundShapeChildData_transform_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btTransformFloatData(cPtr, false);
  }

  public void setChildShape(btCollisionShapeData value) {
    gdxBulletJNI.btCompoundShapeChildData_childShape_set(swigCPtr, this, btCollisionShapeData.getCPtr(value), value);
  }

  public btCollisionShapeData getChildShape() {
    long cPtr = gdxBulletJNI.btCompoundShapeChildData_childShape_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btCollisionShapeData(cPtr, false);
  }

  public void setChildShapeType(int value) {
    gdxBulletJNI.btCompoundShapeChildData_childShapeType_set(swigCPtr, this, value);
  }

  public int getChildShapeType() {
    return gdxBulletJNI.btCompoundShapeChildData_childShapeType_get(swigCPtr, this);
  }

  public void setChildMargin(float value) {
    gdxBulletJNI.btCompoundShapeChildData_childMargin_set(swigCPtr, this, value);
  }

  public float getChildMargin() {
    return gdxBulletJNI.btCompoundShapeChildData_childMargin_get(swigCPtr, this);
  }

  public btCompoundShapeChildData() {
    this(gdxBulletJNI.new_btCompoundShapeChildData(), true);
  }

}
