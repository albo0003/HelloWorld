public class Points {
    int x;
    int y;
    int z;
    Points(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
     double findDistance2D(Points b){
        return Math.sqrt(Math.pow(b.x - x, 2) + Math.pow(b.y - y, 2));
    }
    static double findDistance3D(Points a, Points b){
        //b.x -= a.x; b.y -= a.y;
        return   Math.sqrt(Math.pow((b.x - a.x),2) + Math.pow((b.y - a.y), 2) +Math.pow((b.z - a.z), 2));
    }
    public static void main(String[] args) {
        Points A = new Points(2, 5, 5);
        Points B = new Points(25, -6, 100);
        Points C = new Points(1, -3, 2);
        System.out.println(A.findDistance2D(B));
        System.out.println(Points.findDistance3D(A,B));
    }

}

