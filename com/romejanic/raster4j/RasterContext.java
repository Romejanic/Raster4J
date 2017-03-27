package com.romejanic.raster4j;

import java.awt.image.BufferedImage;

public class RasterContext {

	private BufferedImage colorBuffer = null;
	private float[] depthBuffer = null;
	
	private int width, height;
	
	public RasterContext(int width, int height) {
		this.width = width;
		this.height = height;
		
		this.colorBuffer = new BufferedImage(this.width, this.height, BufferedImage.TYPE_INT_RGB);
		this.depthBuffer = new float[width*height];
	}
	
}