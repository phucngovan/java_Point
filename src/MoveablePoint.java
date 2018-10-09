public class MoveablePoint extends Point {
    private float xSpeed=0f;
    private float ySpeed=0f;
    public MoveablePoint(){

    }
    public MoveablePoint(float x,float y,float xSpeed,float ySpeed){
        super(x, y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;

    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(float xSpeed,float ySpeed) {
        float arr1[]=new float[2];
        return arr1;
    }
    public  MoveablePoint move() {
        this.setX(this.getX() + xSpeed);
        this.setY(this.getY() + ySpeed);
        return this;
    };

    @Override
    public String toString() {
        return super.toString() +
                "MoveablePoint{" +" "+
                "xSpeed=" + xSpeed + ""+
                ", ySpeed=" + ySpeed +
                '}';
    }
}
