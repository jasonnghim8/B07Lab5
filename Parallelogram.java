package lab4;

public class Parallelogram {
	Point W;
	Point X;
	Point Y;
	Point Z;
	
	public Parallelogram(Point W, Point X, Point Y, Point Z) {
		this.W = W;
		this.X = X;
		this.Y = Y;
		this.Z = Z;
	}
	
	public double perimeter() {
		return W.distance(X) + X.distance(Y) + Y.distance(Z) + Z.distance(W);
	}
	

	public double area(){
		double vector1_x = X.x - W.x; 
		double vector1_y = X.y - W.y; 
		double vector2_x = Z.x - Y.x; 
		double vector2_y = Z.y - Y.y; 
		double area = vector1_x * vector2_y - vector1_y * vector2_x;
		return Math.abs(area);
	}
	
	public boolean isRhombus() {
		return W.distance(X) == X.distance(Y) && X.distance(Y) == Y.distance(Z) && Y.distance(Z) == Z.distance(W);
	}
}