package com.princesekuo.snakeoff.bll.wall;

import com.princesekuo.snakeoff.bll.Coordinate;

import java.util.ArrayList;
import java.util.List;

public class WallInfo {
    private EnumWallType wallType;

    public static List<WallInfo> GenWalls(int width, int height) {
        List<WallInfo> result = new ArrayList<WallInfo>();
        for (int x = 0; x < width; x++) {
            WallInfo obj = new WallInfo();
            obj.setCoordinate(new Coordinate(x, 0));
            obj.wallType = EnumWallType.Top;
            result.add(obj);

            obj = new WallInfo();
            //底部固定y軸為高-1
            obj.setCoordinate(new Coordinate(x, height - 1));
            obj.wallType = EnumWallType.Bottom;
            result.add(obj);
        }
        for (int y = 0; y < height; y++) {
            WallInfo obj = new WallInfo();
            obj.setCoordinate(new Coordinate(y, 0));
            obj.wallType = EnumWallType.Left;
            result.add(obj);

            obj = new WallInfo();
            //右邊固定為寬減一
            obj.setCoordinate(new Coordinate(y, width-1));
            obj.wallType = EnumWallType.Right;
            result.add(obj);
        }
        return result;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    private Coordinate coordinate;
}
