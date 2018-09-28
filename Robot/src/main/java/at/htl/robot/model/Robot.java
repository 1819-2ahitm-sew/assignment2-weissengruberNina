package at.htl.robot.model;

public class Robot {

    //region Getter und Setter
    private int y = 0;
    private int x = 0;
    private Direction direction = Direction.SOUTH;

    public int getX(){
        return x;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getY(){
        return y;
    }

    public void setY(int y){
        this.y = y;
    }

    public Direction getDirection(){
        return direction;
    }

    public void setDirection(Direction direction){
        this.direction = direction;
    }
    //endregion

    public void rotateLeft(){
        if (this.direction == Direction.SOUTH){
            this.direction = Direction.EAST;
        }else if (this.direction == Direction.EAST){
            this.direction = Direction.NORTH;
        }else if(this.direction == Direction.NORTH){
            this.direction = Direction.WEST;
        }else {
            this.direction = Direction.SOUTH;
        }
    }
    public void stepForward(){
        if (this.direction == Direction.SOUTH){
            this.y++;
        }else if (this.direction == Direction.EAST){
            this.x++;
        }else if (this.direction == Direction.NORTH){
            this.y--;
        }else {
            this.x--;
        }
    }
}