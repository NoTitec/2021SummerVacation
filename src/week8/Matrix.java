package week8;

public class Matrix {
public int [][]mat = new int[2][2];
	
	public Matrix() {
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				mat[i][j] = 0;
			}
		}
	}
	public Matrix(int a, int b, int c, int d) {
		mat[0][0] = a;		
		mat[0][1] = b;
		mat[1][0] = c;	
		mat[1][1] = d;
	}
	public void print() {
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println("");
		}
	}
	public int get(int i, int j) {
		return mat[i][j];
	}
	public void set(int i, int j, int n) {
		mat[i][j] = n;
	}
	public void set(int a, int b, int c, int d) {
		mat[0][0] = a;		mat[0][1] = b;
		mat[1][0] = c;		mat[1][1] = d;
	}
	public Matrix Add(Matrix iMat) {
		Matrix rMat = new Matrix();

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				rMat.mat[i][j] = mat[i][j] + iMat.mat[i][j];
			}
		}

		return rMat;
	}
	public Matrix Sub(Matrix iMat) {
		Matrix rMat = new Matrix();

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				// set 함수 사용 예
				rMat.set(i, j, mat[i][j] - iMat.get(i, j));
			}
		}
		return rMat;
	}

	Matrix Mul(Matrix iMat) {
		Matrix rMat = new Matrix();
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				int sum = 0;
				for (int k = 0; k < 2; k++) {
					sum = sum + mat[i][k] * iMat.mat[k][j];
				}
				rMat.mat[i][j] = sum;
			}
		}
		return rMat;
	}
		}
