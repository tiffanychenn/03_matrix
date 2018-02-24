import java.util.*;

public class Main {

	public static void main(String[] args){

		System.out.println("Matrix stuff:");

		Matrix m0 = new Matrix(3, 3);
		m0.addPoint(new double[] {11, 8, 2});
		m0.addPoint(new double[] {1, 58, 22});
		m0.addEdge(new double[] {10, 9, 4}, new double[] {12, 90, 3});
		System.out.println("Matrix 0:");
		System.out.println(m0.toString());

		Matrix m1 = new Matrix(4, 4);
		m1.ident();
		System.out.println("Matrix 1:");
		System.out.println(m1.toString());

		Matrix m2 = new Matrix(4, 5);
		m2.addEdge(new double[] {10, 9, 4, 1}, new double[] {12, 9, 6, 2});
		m2.addEdge(new double[] {10, 9, 4, 4}, new double[] {12, 9, 5, 1});
		m2.addPoint(new double[] {5, 6, 1, 9});
		System.out.println("Matrix 2:");
		System.out.println(m2.toString());

		System.out.println(Matrix.multi(m0, m1));
		System.out.println(Matrix.multi(m0, m2));

		System.out.println("Image creation:");

		Image i = new Image();
		Random rand = new Random();
		for (int j = 0; j < 5; j ++){
			for (int k = 0; k < 5; k ++){
				int r = rand.nextInt(255);
				int g = rand.nextInt(255);
				int b = rand.nextInt(255);
				Matrix m = new Matrix(4, 8);
				for (int l = 0; l < 100; l ++){
					m.addEdge(new double[] {j * 100 + 1, k * 100 + l + 1, 0, 0}, new double[] {(j + 1) * 100, k * 100 + l + 1, 0, 0});
				}
				Drawing.drawlines(m, i, new int[] {r,g,b});
			}
		}
		i.draw();
	}

}