public class Triangle{
	int TriangleTall;
	int TriangleEnd;
	Triangle(){
		TriangleEnd = 0;
		TriangleTall = 0;
	}
	
	Triangle(int End , int Tall){
		TriangleEnd = End;
		TriangleTall = Tall;
	}
	
	int TriArea(int End , int Tall){
		return End * Tall / 2;
	}
	
	double TriPar(int End , int Tall){
		return Math.sqrt(TriangleTall * TriangleTall + TriangleEnd * TriangleEnd) + TriangleTall + TriangleEnd;
	}
} 
