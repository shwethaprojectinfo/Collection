package relations;

 class Quadrilateral implements Shapes{
	String shapes;
	Double length;
	Double width;
	
	public Quadrilateral() {}
	public Quadrilateral(String shapes,double d, double e) {
		this.shapes=shapes;
		this.length=length;
		this.width=width;
	}

	/**
	 * 
	 * @return
	 */
	@Override
	public Double calculatedArea() {
		return length*width;
	}
	public String getShapes() {
		return shapes;
	}
	public void setShapes(String shapes) {
		this.shapes = shapes;
	}
	public Double getLength() {
		return length;
	}
	public void setLength(Double length) {
		this.length = length;
	}
	public Double getWidth() {
		return width;
	}
	public void setWidth(Double width) {
		this.width = width;
	}
	
}
 
 
