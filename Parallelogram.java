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
	
	public boolean isRhombus() {
		return W.distance(X) == X.distance(Y) && X.distance(Y) == Y.distance(Z) && Y.distance(Z) == Z.distance(W);
	}
}