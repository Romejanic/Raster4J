package com.romejanic.raster4j.math;

public class Vec3 {

	public float x, y, z;
	
	public Vec3() {
		this(0f);
	}
	
	public Vec3(float l) {
		this(l, l, l);
	}
	
	public Vec3(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
}