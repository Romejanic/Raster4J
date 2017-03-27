package com.romejanic.raster4j;

import java.awt.Color;
import java.awt.image.BufferedImage;

public final class RasterContext {

	private BufferedImage colorBuffer = null;
	private float[] depthBuffer = null;

	private Color clearColor = Color.black;
	private float clearDepth = 1000f;

	private int width, height;

	public RasterContext(int width, int height) {
		this.width = width;
		this.height = height;

		this.colorBuffer = new BufferedImage(this.width, this.height, BufferedImage.TYPE_INT_RGB);
		this.depthBuffer = new float[width*height];
	}

	public void draw() {
		
	}

	public void clearColor() {
		for(int x = 0; x < width; x++) {
			for(int y = 0; y < height; y++) {
				this.colorBuffer.setRGB(x, y, this.clearColor.getRGB());
			}
		}
	}
	
	public void clearDepth() {
		for(int i = 0; i < this.depthBuffer.length; i++) {
			this.depthBuffer[i] = this.clearDepth;
		}
	}
	
	public void clearAll() {
		clearColor();
		clearDepth();
	}

	public int getPixel(int x, int y) {
		if(x < 0 || x > width || y < 0 || y > height) {
			return 0;
		}
		return this.colorBuffer.getRGB(x, y);
	}

	public BufferedImage getColorBuffer() {
		return this.colorBuffer;
	}

}