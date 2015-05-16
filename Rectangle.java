public class Rectangle{
	int RectangleLong;
	int RectangleWidth;
	Rectangle(){
		RectangleLong = 0;
		RectangleWidth = 0;
	}
	
	int RecArea(int RecLong , int RecWidth){
		return RecLong * RecWidth;
	}
	
	int RecPar(int RecLong , int RecWidth){
		return (RecLong + RecWidth) * 2;
	}
}
