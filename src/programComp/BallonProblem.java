/**
 * 
 */
package programComp;

/**
 * @author AM
 *
 */
public class BallonProblem {
	
	public boolean CheckIfLineCut(Point centerOfBalloon, Point locusOfBarrel, Point headOfDart, double radius)
	{
		return checkIntersection(centerOfBalloon, locusOfBarrel, headOfDart, radius);
	}
	//private methods
	private double findShortestDistance(Point p1, Point p2)
	{
		double shortestDistance=Math.pow(p2.z-p1.z,2) +Math.pow(p2.y-p1.y,2)+Math.pow(p2.x-p1.x,2);
		shortestDistance=Math.sqrt(shortestDistance);
		return shortestDistance;
	}
	//point p1 is first point, p2 is second point that is point of intersection
	//point p3 is third point. p2 is corner point.
	//tanx=slope of one line/slope of other line.
	private double findDegreeAngle(Point p1, Point p2, Point p3)
	{
		//slope =rise/run
		
		Point tempp3=new Point(p3.x,p3.y,0.0);
		Point tempp2=new Point(p2.x,p2.y,0.0);
		Point tempp1=new Point(p1.x,p1.y,0.0);
		
		double slope1=(p2.z-p3.z)/(findShortestDistance(tempp3,tempp2));
		double slope2=(p2.z-p1.z)/(findShortestDistance(tempp1,tempp2));
		return Math.atan(slope1-slope2)/(1+slope1*slope2);
	}
	private boolean checkIntersection(Point p1, Point p2, Point p3, double radius)
	{
		double distanceBetweenCenters=findShortestDistance(p1,p2);
		double degreeAngle=findDegreeAngle(p1,p2,p3);
		if(radius>= (Math.tan(degreeAngle)*distanceBetweenCenters))
				return true;
		else
		return false;
	}

}
final class Point
{
	public Point(double _x, double _y, double _z)
	{
		x=_x;
		y=_y;
		z=_z;
	}
	public double x;
	public double y;
	public double z;
	
}
