import java.util.Scanner;

public class _13_Durts {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int centerX = sc.nextInt();
		int centerY = sc.nextInt();
		int radius = sc.nextInt();
		int count = sc.nextInt();

		int leftHorizontalFigureSide = centerX - radius;
		int rightHorizontalFigureSide = centerX + radius;
		int topHorizontalFigureSide = centerY + radius / 2;
		int bottomHorizontalFigureSide = centerY - radius / 2;

		int leftVerticalFigureSide = centerX - radius / 2;
		int rightVerticalFigureSide = centerX + radius / 2;
		int topVerticalFigureSide = centerY + radius;
		int bottomVerticalFigureSide = centerY - radius;

		for (int i = 0; i < count; i++) {
			int currentInputX = sc.nextInt();
			int currentInputY = sc.nextInt();
			if (IsInsideFigure(currentInputX, currentInputY,
					leftHorizontalFigureSide, rightHorizontalFigureSide,
					topHorizontalFigureSide, bottomHorizontalFigureSide)
					|| IsInsideFigure(currentInputX, currentInputY,
							leftVerticalFigureSide, rightVerticalFigureSide,
							topVerticalFigureSide, bottomVerticalFigureSide)) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}

	public static boolean IsInsideFigure(int x, int y, int leftSide,
			int rightSide, int topSide, int bottomSide) {
		if (x >= leftSide && x <= rightSide && y >= bottomSide && y <= topSide) {
			return true;
		} else {
			return false;
		}
	}
}
